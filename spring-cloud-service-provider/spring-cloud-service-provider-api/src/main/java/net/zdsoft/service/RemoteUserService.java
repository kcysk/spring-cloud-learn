/**
 * FileName: RemoteUserService.java
 * Author:   shenke
 * Date:     2018/7/13 下午4:58
 * Descriptor:
 */
package net.zdsoft.service;

import net.zdsoft.entity.User;

/**
 * @author shenke
 * @since 2018/7/13 下午4:58
 */
public interface RemoteUserService {

    User getById(String id);

    void addUser(User user);
}
