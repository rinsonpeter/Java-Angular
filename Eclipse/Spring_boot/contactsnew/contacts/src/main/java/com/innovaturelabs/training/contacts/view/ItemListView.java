/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.training.contacts.view;

import com.innovaturelabs.training.contacts.json.Json;
import java.util.Date;

/**
 *
 * @author nirmal
 */
public class ItemListView {
	
	private final int itemId;
	 private String name;
	 private String description;
	 private Integer type;
	 
	
	
	public ItemListView(int itemId, String name, String description, Integer type) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.type = type;
	}
	
	public int getItemId() {
		return itemId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
}
