package com.marketingapp.service;

import com.marketingapp.entity.Lead;

import java.util.List;

public interface LeadService {
public void savelead(Lead lead);
public List<Lead> listAll();
public void deleteById(long id);
public Lead updateOneLeadById(long id);
}
