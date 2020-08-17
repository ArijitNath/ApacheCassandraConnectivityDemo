package com.example.cassandra.connectivity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cassandra.connectivity.models.CassandraLoginResponse;
import com.example.cassandra.connectivity.models.LoginDetails;
import com.example.cassandra.connectivity.services.CassandraLoginControllerService;

@RestController("CassandraLoginController")
@RequestMapping(value = "/cassandra")
public class CassandraLoginController implements CassandraLoginControllerService {
	
	@Autowired
	@Qualifier("CassandraLoginControllerServiceImpl")
	private CassandraLoginControllerService cassandraLoginControllerService ;
	
	@GetMapping(produces = "application/json")
	public CassandraLoginResponse getAlluser() {
		return cassandraLoginControllerService.getAlluser();
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public CassandraLoginResponse getUserByID( @PathVariable("id") String id ) {
		return cassandraLoginControllerService.getUserByID(id);
	}
	
	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public CassandraLoginResponse addUser(@RequestBody LoginDetails loginDetails) {
		return cassandraLoginControllerService.addUser(loginDetails);
	}
	
	@DeleteMapping(value = "/delete")
	public CassandraLoginResponse deleteUser(@RequestBody LoginDetails loginDetails) {
		return cassandraLoginControllerService.deleteUser(loginDetails);
	}
}