package com.example.demo.work2.test01;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
@Data
public class CustomProperties {

    public static String appid;
    public static String appkey;
    public static String secretkey;

    @Value("${app.appid}")
    public void setAppid(String appid) {
        CustomProperties.appid = appid;
    }
    @Value("${app.appkey}")
    public void setAppkey(String appkey) {
        CustomProperties.appkey = appkey;
    }
    @Value("${app.secretkey}")
    public void setSecretkey(String secretkey) {
        CustomProperties.secretkey = secretkey;
    }

}



