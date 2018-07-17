/**
 * FileName: EurekaServer.java
 * Author:   shenke
 * Date:     2018/7/12 下午7:30
 * Descriptor:
 */
package net.zdsoft.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import java.util.Map;

/**
 * @author shenke
 * @since 2018/7/12 下午7:30
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    private Logger logger = LoggerFactory.getLogger(EurekaServer.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }

    @Bean
    public CommandLineRunner doGetAllFilter(ServletContext servletContext) {
        return args -> {
            for (Map.Entry<String, ? extends FilterRegistration> entry : servletContext.getFilterRegistrations().entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue().getUrlPatternMappings());

            }
        };
    }
}
