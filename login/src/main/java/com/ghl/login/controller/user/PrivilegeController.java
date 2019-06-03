package com.ghl.login.controller.user;

import com.ghl.login.entity.common.Msg;
import com.ghl.login.entity.user.Privilege;
import com.ghl.login.service.user.PrivilegeService;
import com.ghl.login.service.user.RolePrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @version V1.0
 * @Description: 权限相关类
 * @author: 张琪
 * @date: 2018/4/8
 * @Copyright:
 */
@Controller
public class PrivilegeController {


    @Autowired
    PrivilegeService privilegeService;
    @Autowired
    RolePrivilegeService rolePrivilegeService;

    /**
     * 获取权限列表。
     *
     * @return
     */
    @RequestMapping("/privilege/getPrivileges")
    @ResponseBody
    public Msg getPrivileges() {
        List<Privilege> pros = privilegeService.getAll();
        return Msg.success().add("resultList", pros);
    }


}
