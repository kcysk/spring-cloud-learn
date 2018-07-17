/**
 * FileName: InvokeConfigServerController.java
 * Author:   shenke
 * Date:     2018/7/13 下午2:02
 * Descriptor:
 */
package net.zdsoft.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shenke
 * @since 2018/7/13 下午2:02
 */
@RestController
@RequestMapping("hello")
public class InvokeConfigServerController {

    @Autowired
    private HelloConfigServerRemote helloConfigServerRemote;

    @GetMapping("")
    public String hello() {
        return helloConfigServerRemote.hello();
    }
}
