package com.example.cassandra.connectivity.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.cassandra.connectivity.models.LoginDetails;

public interface CassandraRepository extends CrudRepository<LoginDetails, String>{

}
