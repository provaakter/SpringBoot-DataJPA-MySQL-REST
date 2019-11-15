package com.technardiot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.technardiot.model.Customer;
 
public interface CustomerRepository extends JpaRepository<Customer, Long> {
  List<Customer> findByAge(int age);
}