/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.training.contacts.repository;

import com.innovaturelabs.training.contacts.entity.Contact;
import com.innovaturelabs.training.contacts.entity.Item;
import com.innovaturelabs.training.contacts.view.ContactListView;
import com.innovaturelabs.training.contacts.view.ItemListView;

import java.util.Collection;
import java.util.Optional;
import org.springframework.data.repository.Repository;

/**
 *
 * @author nirmal
 */
public interface ItemRepository extends Repository<Item, Integer> {

    Collection<ItemListView> findAllByUserUserId(Integer userId);

    Optional<Item> findByItemIdAndUserUserId(Integer itemId, Integer userId);

    Item save(Item item);

    void delete(Item item);
}
