package com.zohocrmapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.services.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/viewAllContacts")
	public String viewAllContacts(Model model) {
		List<Contact> contacts = contactService.listAllContacts();
		model.addAttribute("contacts", contacts);
		return "view_all_contacts";
	}
	
	@GetMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id, Model model) {
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}

}
