/**
 * FileName: UserController.java
 * Author:   shenke
 * Date:     2018/7/13 下午5:01
 * Descriptor:
 */
package net.zdsoft;

import net.zdsoft.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenke
 * @since 2018/7/13 下午5:01
 */
@RestController
@RequestMapping("user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("{id}")
    public User getById(@PathVariable("id") String id) {
        if (logger.isDebugEnabled()) {
            logger.debug("Get User By Id {}", id);
        }
        User user = new User();
        user.setUsername("Get By Id" + id);
        user.setPassword("user password");
        return user;
    }
}
