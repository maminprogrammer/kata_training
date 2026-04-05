package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController //для создания контроллера, который будет принимать http-запросы и возвращать ответы
@RequestMapping("/api/users") //обработка URL с /api/users
@Validated //подключение валидации на уровне класса, для использования @Valid
public class UserController {

    @PostMapping("/register")//обработка POST-запросов на /api/users/register

    //метод для проверки соответствия входных данных в JSON-файле на соответствие требованиям через @Valid
    public String registerUser(@Valid @RequestBody UserDTO user) {
        return "Пользователь успешно зарегистрирован! Email: " + user.getEmail();
    }
}