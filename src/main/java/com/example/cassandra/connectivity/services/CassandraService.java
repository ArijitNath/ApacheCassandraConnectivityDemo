package com.example.cassandra.connectivity.services;

import java.util.List;
import com.example.cassandra.connectivity.models.LoginDetails;

public interface CassandraService {
	List<LoginDetails> getAllUser();
	LoginDetails getUserByID(String id);
	LoginDetails saveOrUpdate(LoginDetails loginDetails);
	boolean delete(LoginDetails loginDetails);
}