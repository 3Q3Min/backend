package com.ksy.backend.account.dto;

import com.ksy.backend.account.enums.LoginType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserRequestDTO {
    private LoginType loginType;
}
