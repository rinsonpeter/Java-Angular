/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.training.contacts.view;

import com.innovaturelabs.training.contacts.entity.Contact;
import com.innovaturelabs.training.contacts.entity.Item;

import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author nirmal
 */
public class ItemDetailView extends ItemListView {

    public ItemDetailView(Item item) {
        super(
        		item.getItemId(),
                item.getName(),
                item.getDescription(),
                item.getType()
        );
    }
    
    

}
