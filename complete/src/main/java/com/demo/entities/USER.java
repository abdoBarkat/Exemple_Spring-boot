package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class USER {

   // public class User {
        @Id
        private Long id;
        private String username;

//    }
}
