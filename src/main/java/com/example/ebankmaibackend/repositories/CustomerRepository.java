package com.example.ebankmaibackend.repositories;

import com.example.ebankmaibackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
