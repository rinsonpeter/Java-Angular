/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.training.contacts.controller;

import com.innovaturelabs.training.contacts.form.ContactForm;
import com.innovaturelabs.training.contacts.form.ItemForm;
import com.innovaturelabs.training.contacts.service.ContactService;
import com.innovaturelabs.training.contacts.service.ItemService;
import com.innovaturelabs.training.contacts.view.ContactDetailView;
import com.innovaturelabs.training.contacts.view.ContactListView;
import com.innovaturelabs.training.contacts.view.ItemDetailView;
import com.innovaturelabs.training.contacts.view.ItemListView;

import java.security.Principal;
import java.util.Collection;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nirmal
 */
@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public Collection<ItemListView> list(Principal p) {
        return itemService.list();
    }

    @PostMapping
    public ItemDetailView add(@Valid @RequestBody ItemForm form) {
    	System.out.println("Testing....post.......");
        return itemService.add(form);
    }

    @GetMapping("/{itemId}")
    public ItemDetailView get(@PathVariable("itemId") Integer itemId) {
    	System.out.println("Testing....GET.......");
        return itemService.get(itemId);
    }

    @PutMapping("/{itemId}")
    public ItemDetailView update(
            @PathVariable("itemId") Integer itemId,
            @Valid @RequestBody ItemForm form
    ) {
        return itemService.update(itemId, form);
    }

    @DeleteMapping("/{itemId}")
    public void delete(@PathVariable("itemId") Integer itemId) {
    	itemService.delete(itemId);
    }
}
