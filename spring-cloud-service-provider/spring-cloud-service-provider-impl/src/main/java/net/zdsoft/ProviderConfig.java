/**
 * FileName: ProviderConfig.java
 * Author:   shenke
 * Date:     2018/7/13 下午5:01
 * Descriptor:
 */
package net.zdsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author shenke
 * @since 2018/7/13 下午5:01
 */
@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
public class ProviderConfig {

    public static void main(String[] args) {
        SpringApplication.run(ProviderConfig.class, args);
    }
}
