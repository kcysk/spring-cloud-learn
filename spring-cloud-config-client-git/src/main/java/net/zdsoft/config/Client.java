/**
 * FileName: Client.java
 * Author:   shenke
 * Date:     2018/7/13 上午10:26
 * Descriptor:
 */
package net.zdsoft.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author shenke
 * @since 2018/7/13 上午10:26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
@EnableFeignClients
public class Client {

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }

}
