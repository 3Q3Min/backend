package com.ksy.backend.account.model;

import com.ksy.backend.account.enums.LoginType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LoginType loginType;

    public User(LoginType loginType) {
        this.loginType = loginType;
    }

}
