package com.example.demo;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


    class UserDTO {

        @NotNull(message = "Email не должен быть пустым")
        @Pattern(
                regexp = "^[A-Za-z0-9._-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",
                message = "Email должен быть валидного формата (например, user@example.com)"
        )
        private String email;

        @NotNull(message = "Пароль не должен быть пустым")
        @Size(min = 8, message = "Пароль должен содержать не менее 8 символов")
        @Pattern(
                regexp = "^(?=.*[0-9])(?=.*[!@#$%^&*()_+={};':>.<,]).+$",
                message = "Пароль должен содержать хотя бы одну цифру и один специальный символ"
        )
        private String password;

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

    }

