package com.innovaturelabs.training.contacts.form;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.innovaturelabs.training.contacts.json.Json;

public class ItemForm {
	 	@Size(max = 30)
	    @NotBlank
	    private String name;
	    @Size(max = 100)
	    private String description;
	   // @Size(max = 10)
	    private Integer type;
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
