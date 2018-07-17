/**
 * FileName: HelloConfigServerController.java
 * Author:   shenke
 * Date:     2018/7/13 下午2:01
 * Descriptor:
 */
package net.zdsoft.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenke
 * @since 2018/7/13 下午2:01
 */
@RestController
@RequestMapping(value = "hello")
public class HelloConfigServerController {

    @GetMapping(value = "")
    public String hello() {
        return "hi im config git server";
    }

}
