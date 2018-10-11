package com.site.middleton.siteApi.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.site.middleton.siteApi.Entitiy.Contact;


@Repository
public class ContactDao {
	
	private static Map<Integer, Contact> contacts;
	
	static {
		
		contacts = new HashMap<Integer, Contact>(){
			
			{
				put(1, new Contact(1, "Anthony Fattman", "Dudes101@Gmail.com", "Yo kevin, biggest fan ever"));
				put(2, new Contact(2, "Jone Doe", "Killa101@Gmail.com", "Yo kevin, your website sucks"));
				put(3, new Contact(3, "Jim Wembleton", "JWembs@sbcglobal.com", "Can I get your autograph JWembs - <3"));
			}
		};
	}
	
	public Collection<Contact> getAllContacts(){
		return this.contacts.values();
	}
	
	public Contact getContactbyId(int id) {
		return this.contacts.get(id);
	}

	public void removeContactById(int id) {
		this.contacts.remove(id);	
	}
	public void updateContactById(Contact contact) {
		
		Contact c = contacts.get(contact.getId());
		c.setName(contact.getName());
		c.setEmail(contact.getEmail());
		c.setMessage(contact.getMessage());
		
	}

	public void insertContact(Contact contact) {
		this.contacts.put(contact.getId(), contact);
		System.out.println("YOOOOOOOOOOOOOOO");
		
	}

}
