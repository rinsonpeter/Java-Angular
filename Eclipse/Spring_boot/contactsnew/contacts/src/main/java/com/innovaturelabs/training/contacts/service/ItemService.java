/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.training.contacts.service;

import com.innovaturelabs.training.contacts.exception.NotFoundException;
import com.innovaturelabs.training.contacts.form.ContactForm;
import com.innovaturelabs.training.contacts.form.ItemForm;
import com.innovaturelabs.training.contacts.view.ContactDetailView;
import com.innovaturelabs.training.contacts.view.ContactListView;
import com.innovaturelabs.training.contacts.view.ItemDetailView;
import com.innovaturelabs.training.contacts.view.ItemListView;

import java.util.Collection;

/**
 *
 * @author nirmal
 */
public interface ItemService {

    Collection<ItemListView> list();

    ItemDetailView add(ItemForm form);

    ItemDetailView get(Integer itemId) throws NotFoundException;

    ItemDetailView update(Integer itemId, ItemForm form) throws NotFoundException;

    void delete(Integer itemId) throws NotFoundException;
}
