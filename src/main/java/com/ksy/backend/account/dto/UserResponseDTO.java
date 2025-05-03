package com.ksy.backend.account.dto;

import com.ksy.backend.account.enums.LoginType;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserResponseDTO {
    private Long userId;
    private LoginType loginType;
}
