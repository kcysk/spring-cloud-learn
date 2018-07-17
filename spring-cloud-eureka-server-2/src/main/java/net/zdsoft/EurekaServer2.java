/**
 * FileName: EurekaServer2.java
 * Author:   shenke
 * Date:     2018/7/13 下午1:51
 * Descriptor:
 */
package net.zdsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shenke
 * @since 2018/7/13 下午1:51
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer2.class, args);
    }
}
