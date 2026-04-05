package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("=========================================");
        System.out.println("✅ Сервер запущен!");
        System.out.println("📝 Адрес: http://localhost:8080");
        System.out.println("🔗 Эндпоинт: POST /api/users/register");
        System.out.println("=========================================");
    }
}