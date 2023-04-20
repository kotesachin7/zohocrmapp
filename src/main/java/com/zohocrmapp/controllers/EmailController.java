package com.zohocrmapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.dto.Email;
import com.zohocrmapp.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendEmail")
	public String sendEmail(@RequestParam ("email") String email, Model model) {
		model.addAttribute("email", email);
		return "compose_mail";
	}

	@PostMapping("/triggerEmail")
	public String triggerEmail(Email emailData, Model model) {
		emailService.sendSimpleMail(emailData.getEmailId(), emailData.getSubject(), emailData.getEmailBody());
		model.addAttribute("msg", "Email sent successfully!");
	return "compose_mail";
	}
}
