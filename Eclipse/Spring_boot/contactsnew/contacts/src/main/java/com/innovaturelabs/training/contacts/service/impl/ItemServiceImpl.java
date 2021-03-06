/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.training.contacts.service.impl;

import com.innovaturelabs.training.contacts.entity.Contact;
import com.innovaturelabs.training.contacts.entity.Item;
import com.innovaturelabs.training.contacts.exception.NotFoundException;
import com.innovaturelabs.training.contacts.form.ContactForm;
import com.innovaturelabs.training.contacts.form.ItemForm;
import com.innovaturelabs.training.contacts.repository.ContactRepository;
import com.innovaturelabs.training.contacts.repository.ItemRepository;
import com.innovaturelabs.training.contacts.security.util.SecurityUtil;
import com.innovaturelabs.training.contacts.service.ContactService;
import com.innovaturelabs.training.contacts.service.ItemService;
import com.innovaturelabs.training.contacts.view.ContactDetailView;
import com.innovaturelabs.training.contacts.view.ContactListView;
import com.innovaturelabs.training.contacts.view.ItemDetailView;
import com.innovaturelabs.training.contacts.view.ItemListView;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nirmal
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Collection<ItemListView> list() {
        return itemRepository.findAllByUserUserId(SecurityUtil.getCurrentUserId());
    }

    @Override
    public ItemDetailView add(ItemForm form) {
        return new ItemDetailView(itemRepository.save(new Item(form, SecurityUtil.getCurrentUserId())));
    }

    @Override
    public ItemDetailView get(Integer itemId) throws NotFoundException {
        return itemRepository.findByItemIdAndUserUserId(itemId, SecurityUtil.getCurrentUserId())
                .map((item) -> {
                    return new ItemDetailView(item);
                }).orElseThrow(NotFoundException::new);
    }

    @Override
    @Transactional
    public ItemDetailView update(Integer itemId, ItemForm form) throws NotFoundException {
        return itemRepository.findByItemIdAndUserUserId(itemId, SecurityUtil.getCurrentUserId())
                .map((item) -> {
                    return new ItemDetailView(itemRepository.save(item.update(form)));
                }).orElseThrow(NotFoundException::new);
    }

    @Override
    @Transactional
    public void delete(Integer itemId) throws NotFoundException {
    	itemRepository.delete(
    			itemRepository.findByItemIdAndUserUserId(itemId, SecurityUtil.getCurrentUserId())
                        .orElseThrow(NotFoundException::new)
        );
    }
}
