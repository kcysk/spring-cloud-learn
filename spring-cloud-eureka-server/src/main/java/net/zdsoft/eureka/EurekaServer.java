/**
 * FileName: EurekaServer.java
 * Author:   shenke
 * Date:     2018/7/12 下午7:30
 * Descriptor:
 */
package net.zdsoft.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shenke
 * @since 2018/7/12 下午7:30
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }
}
