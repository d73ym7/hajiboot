package com.example.DB;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    
   /* public Customer(int newId, String newFirstName, String newLastName) {
    	id = newId;
    	firstName = newFirstName;
    	lastName = newLastName;
    } */
}
