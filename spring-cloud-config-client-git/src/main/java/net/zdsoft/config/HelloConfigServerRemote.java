/**
 * FileName: HelloConfigServerRemote.java
 * Author:   shenke
 * Date:     2018/7/13 下午2:05
 * Descriptor:
 */
package net.zdsoft.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shenke
 * @since 2018/7/13 下午2:05
 */
@FeignClient(name = "config-git-server")
public interface HelloConfigServerRemote {

    @RequestMapping("hello")
    String hello();
}