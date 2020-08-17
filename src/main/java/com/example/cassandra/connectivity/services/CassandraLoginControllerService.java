package com.example.cassandra.connectivity.services;

import com.example.cassandra.connectivity.models.CassandraLoginResponse;
import com.example.cassandra.connectivity.models.LoginDetails;

public interface CassandraLoginControllerService {
	CassandraLoginResponse getAlluser();
	CassandraLoginResponse getUserByID( String id );
	CassandraLoginResponse addUser(LoginDetails loginDetails);
	CassandraLoginResponse deleteUser(LoginDetails loginDetails);
}