package com.example.ebankmaibackend.repositories;

import com.example.ebankmaibackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountReposotory extends JpaRepository<BankAccount, String> {
}
