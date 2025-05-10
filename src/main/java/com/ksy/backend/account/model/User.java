package com.ksy.backend.account.model;

import com.ksy.backend.account.enums.LoginType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LoginType loginType;

    @NotNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User(LoginType loginType, String email) {
        this.loginType = loginType;
        this.email = email;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

}
