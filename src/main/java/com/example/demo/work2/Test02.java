package com.example.demo.work2;

import com.example.demo.req.test02Req;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Test02 {
    private Long id;
    private String name;

    public static test02Req createUser() {
        test02Req user = new test02Req();
        user.setId("111");
        user.setName("静态方法装配");
        return user;
    }
}
