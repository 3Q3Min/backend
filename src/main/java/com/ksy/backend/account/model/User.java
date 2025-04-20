package com.ksy.backend.account.model;

import com.ksy.backend.account.enums.LoginType;
import jakarta.persistence.*;

@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public LoginType loginType;
}
