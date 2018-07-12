/**
 * FileName: GitServer.java
 * Author:   shenke
 * Date:     2018/7/12 下午7:37
 * Descriptor:
 */
package net.zdsoft.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author shenke
 * @since 2018/7/12 下午7:37
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class GitServer {

    public static void main(String[] args) {
        SpringApplication.run(GitServer.class, args);
    }

}
