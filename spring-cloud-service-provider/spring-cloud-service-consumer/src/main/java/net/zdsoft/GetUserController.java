/**
 * FileName: GetUserController.java
 * Author:   shenke
 * Date:     2018/7/13 下午5:06
 * Descriptor:
 */
package net.zdsoft;

import net.zdsoft.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author shenke
 * @since 2018/7/13 下午5:06
 */
@RestController
@RequestMapping("consumer")
public class GetUserController {

    @Resource
    private RestTemplate restTemplate;
    //@Autowired
    //RibbonClientHttpRequestFactory ribbonClientHttpRequestFactory;

    @RequestMapping("doGetUser")
    public User doGetUserFromProvider() {
        User user = restTemplate.getForObject("http://service-provider/user/userId", User.class);
        return user;
    }
}
