package com.example.mesadaCerta.user.records;

import jakarta.validation.constraints.NotBlank;

public record RegisterUserRequestDTO(
        @NotBlank
        String username,

        @NotBlank
        String firstName,

        @NotBlank
        String lastName,

        @NotBlank
        String email,

        @NotBlank
        String password,

        Boolean active
) {
}
