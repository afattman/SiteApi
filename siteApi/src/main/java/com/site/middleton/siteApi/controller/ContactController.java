package com.site.middleton.siteApi.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.site.middleton.siteApi.Entitiy.Contact;
import com.site.middleton.siteApi.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Contact> getAllContacts(){
		return contactService.getAllContacts();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Contact getContactById(@PathVariable("id") int id) {
		return contactService.getContactbyId(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteContactById(@PathVariable("id") int id) {
		 contactService.removeContactById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT,  produces = {MediaType.APPLICATION_JSON_VALUE})
	public void deleteContactById(@RequestBody Map<String, Object> contact) {
		contactService.updateContactById((Contact) contact);
	}
	
	@RequestMapping(method = RequestMethod.POST,  produces = {MediaType.APPLICATION_JSON_VALUE})
	public void insertContact(@RequestParam(value = "id", required = true) int id,
								@RequestParam(value = "name", required = true) String name,
								@RequestParam(value = "email", required = true) String email,
								@RequestParam(value = "message", required = true) String message)
	{
		String duno = name + email + message;
		//contactService.insertContact(contact);
	}
	
}
