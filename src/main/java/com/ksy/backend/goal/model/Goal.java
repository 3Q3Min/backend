package com.ksy.backend.goal.model;

import com.ksy.backend.account.model.User;
import jakarta.persistence.*;

@Entity
public class Goal {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;
}
