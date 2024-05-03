package com.example.ebankmaibackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private String email;
    @OneToMany(mappedBy = "customer") // quand c'est bidirectionnelle, je dit a JPA qui y a un attribut customer qui utilise ManyToOne et il s agit de la meme relation
    private List<BankAccount> bankAccounts;
}
