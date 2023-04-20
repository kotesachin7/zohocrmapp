package com.zohocrmapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.services.BillingService;
import com.zohocrmapp.services.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@GetMapping("/generateBill")
	public String generateBill(@RequestParam ("id") long id, Model model) {
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@PostMapping("/generateInvoice")
	public String generateInvoice(@ModelAttribute ("billing") Billing billing, Model model) {
		billingService.saveOneBill(billing);
		model.addAttribute("billing", billing);
		return "billing_info";
	}

}
