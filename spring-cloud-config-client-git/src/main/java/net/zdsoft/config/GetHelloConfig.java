/**
 * FileName: GetHelloConfig.java
 * Author:   shenke
 * Date:     2018/7/13 上午10:33
 * Descriptor:
 */
package net.zdsoft.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author shenke
 * @since 2018/7/13 上午10:33
 */
@Configuration
@RefreshScope
public class GetHelloConfig {

    @Value("${hello}")
    private String hello;

    @PostConstruct
    public void run() {
        System.out.println("[Get Hello Config: ]" + hello);
    }
}
