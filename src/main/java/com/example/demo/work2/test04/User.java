package com.example.demo.work2.test04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class User {
    private Long id;
    private String name;

    public static User createUser() {
        User user = new User();
        user.setId(1L);
        user.setName("静态装配");
        return user;
    }
}
