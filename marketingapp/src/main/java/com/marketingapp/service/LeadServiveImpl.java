package com.marketingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.dto.LeadData;
import com.marketingapp.entity.Lead;
import com.marketingapp.repositoty.LeadRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class LeadServiveImpl implements LeadService {
@Autowired
private LeadRepository leadRepo;
	@Override
	public void savelead(Lead lead) {
		// TODO Auto-generated method stub
		leadRepo.save(lead);
	}
	@Override
	public List<Lead> listAll() {
		// TODO Auto-generated method stub
		List<Lead> leads = leadRepo.findAll();
		List<LeadData> collect = leads.stream().map(l->mapToLeaddata(l)).collect(Collectors.toList());
		return leads;
	}
	LeadData mapToLeaddata(Lead data) {
		LeadData l=new LeadData();
		l.setId(data.getId());
		l.setFirstName(data.getFirstName());
		l.setLastName(data.getLastName());
		l.setEmail(data.getEmail());
		l.setMobile(data.getMobile());
		return l ;
		
	}
	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		leadRepo.deleteById(id);
	}
	@Override
	public Lead updateOneLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		if(findById.isPresent()) {
			Lead lead = findById.get();
			return lead;
		}else {
			return null;
		}
	}

}
