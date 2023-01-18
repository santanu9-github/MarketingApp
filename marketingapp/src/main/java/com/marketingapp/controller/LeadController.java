package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.dto.LeadData;
import com.marketingapp.entity.Lead;
import com.marketingapp.service.LeadService;
import com.marketingapp.util.EmailService;

@Controller
public class LeadController {
@RequestMapping("/createlead")
public String viewcreateleadpage() {
	return"create_new_lead";
}
@Autowired
private EmailService emailservice;	
	
@Autowired
private LeadService leadservice;

@RequestMapping("/savelead")
public String saveonelead(@ModelAttribute("lead")Lead lead, ModelMap model) {
	
	leadservice.savelead(lead);
	emailservice.sendSimpleMessage("santanutripathy140@gmail.com","test","welcome");
	model.addAttribute("saveMsg","save record");
	return"create_new_lead";
}
@RequestMapping("/listleads")
public String getAllLeads(ModelMap model) {
	List<Lead> leads = leadservice.listAll();
	model.addAttribute("leads", leads);
	return"search_result";
}
@RequestMapping("/delete")
public String deleteOneLead(@RequestParam("id")long id,ModelMap model ) {
	leadservice.deleteById(id);
	List<Lead> leads = leadservice.listAll();
	model.addAttribute("leads", leads);
	return"search_result";
}
@RequestMapping("/update")
public String updateOneLead(@RequestParam("id")long id,ModelMap model) {
	Lead lead=leadservice.updateOneLeadById(id);
	if(lead!=null) {
		model.addAttribute("lead", lead);
		return"update_lead";
	}else{
		model.addAttribute("error","no record");
		return"error_lead";
	}
}
@RequestMapping("/updatelead")
public String updateLead(LeadData data,ModelMap model) {
	Lead l=new Lead();
	l.setId(data.getId());
	l.setFirstName(data.getFirstName());
	l.setLastName(data.getLastName());
	l.setEmail(data.getEmail());
	l.setMobile(data.getMobile());
	leadservice.savelead(l);
	List<Lead> leads = leadservice.listAll();
	model.addAttribute("leads", leads);
	return"search_result";
}
}













