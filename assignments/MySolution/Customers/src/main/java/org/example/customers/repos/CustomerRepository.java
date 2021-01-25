package org.example.customers.repos;

import org.example.customers.models.Customers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customers, String> {


}
