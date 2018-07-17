/**
 * FileName: ConsumberApplication.java
 * Author:   shenke
 * Date:     2018/7/13 下午5:07
 * Descriptor:
 */
package net.zdsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author shenke
 * @since 2018/7/13 下午5:07
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumberApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
