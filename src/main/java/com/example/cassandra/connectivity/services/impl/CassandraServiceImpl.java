package com.example.cassandra.connectivity.services.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cassandra.connectivity.models.LoginDetails;
import com.example.cassandra.connectivity.repository.CassandraRepository;
import com.example.cassandra.connectivity.services.CassandraService;

@Service
public class CassandraServiceImpl implements CassandraService {
	
	private CassandraRepository cassandraRepository;
	
	@Autowired
	public CassandraServiceImpl(CassandraRepository cassandraRepository) {
		this.cassandraRepository = cassandraRepository;
	}
	

	@Override
	public LoginDetails getUserByID(String id) {
		return cassandraRepository.findById(id).get();
	}

	@Override
	public LoginDetails saveOrUpdate(LoginDetails loginDetails) {
		cassandraRepository.save(loginDetails);
		return loginDetails;
	}

	@Override
	public boolean delete(LoginDetails loginDetails) {
		cassandraRepository.delete(loginDetails);
		return true;
	}

	@Override
	public List<LoginDetails> getAllUser() {
		List<LoginDetails> allUser = new ArrayList<LoginDetails>();
		cassandraRepository.findAll().forEach(allUser :: add);
		
		return allUser;
	}

}
