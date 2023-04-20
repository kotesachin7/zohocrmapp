package com.zohocrmapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.entities.Lead;
import com.zohocrmapp.services.ContactService;
import com.zohocrmapp.services.LeadService;

import com.zohocrmapp.entities.Contact;
@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/viewCreateLeadPage")
	public String viewCreateLeadPage() {
		return "create_new_lead";
		
	}
	
	@PostMapping("/createLead")
	public String createLead(@ModelAttribute ("l") Lead lead, Model model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@PostMapping("/convertLead")
	public String convertLead(@RequestParam ("id") long id, Model model) {
		Lead lead = leadService.findLeadById(id);
		
		Contact contact= new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.saveOneContact(contact);
		
		leadService.deleteLeadById(id);
		
		List<Contact> contacts = contactService.listAllContacts();
		model.addAttribute("contacts", contacts);
		return "view_all_contacts";
	}
	
	@GetMapping("/listAllLeads")
	public String listAllLeads(Model model) {
		List<Lead> leads = leadService.viewAllLeads();
		model.addAttribute("leads", leads);
		return"view_all_leads";
	}
	
	@GetMapping("/leadInfo")
	public String leadInfo(@RequestParam ("id") long id, Model model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}

}
