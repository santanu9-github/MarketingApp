package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp.entity.Lead;
import com.marketingapp.service.LeadService;

@RestController
@RequestMapping("/leads")
public class LeadRestControlller {
	
@Autowired
private LeadService leadService;

@GetMapping
public List<Lead> getOneLead() {
	List<Lead> leads = leadService.listAll();
	return leads;
}
@PostMapping
public void saveLead(@RequestBody Lead lead) {
	leadService.savelead(lead);
}
@PutMapping
public void updateLead(@RequestBody Lead lead) {
leadService.savelead(lead);
}
@DeleteMapping("/delete/{id}")
public void deleteLead(@PathVariable("id")long id) {
	leadService.deleteById(id);
}
@GetMapping("/api/get/{id}")
public Lead getOneLead(@PathVariable("id")long id) {
	Lead lead = leadService.updateOneLeadById(id);
	return lead;
}
}
