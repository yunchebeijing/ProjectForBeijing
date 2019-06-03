package com.ghl.login.service.user;

import com.ghl.login.entity.user.Privilege;

import java.util.List;

/**
 * @version V1.0
 * @Description: 菜单权限接口类
 * @author: 张琪
 * @date: 2018/4/8
 * @Copyright:
 */
public interface PrivilegeService {

    /**
     * 查询所有权限信息
     *
     * @return
     */
    List<Privilege> getAll();


}
