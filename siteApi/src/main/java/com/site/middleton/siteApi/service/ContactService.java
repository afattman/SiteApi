package com.site.middleton.siteApi.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.middleton.siteApi.Entitiy.Contact;
import com.site.middleton.siteApi.dao.ContactDao;

@Service
public class ContactService {
	//This is the place to check if the contact exists or say hey this data isnt avail
	@Autowired
	private ContactDao contactsDao;
	
	public Collection<Contact> getAllContacts(){
		
		return this.contactsDao.getAllContacts();
	}
	
	public Contact getContactbyId(int id) {
		return this.contactsDao.getContactbyId(id);
	}

	public void removeContactById(int id) {
		contactsDao.removeContactById(id);

	}
	
	public void updateContactById(Contact contact) {
		this.contactsDao.updateContactById(contact);
	}

	public void insertContact(Contact contact) {
		contactsDao.insertContact(contact);
	}

}
