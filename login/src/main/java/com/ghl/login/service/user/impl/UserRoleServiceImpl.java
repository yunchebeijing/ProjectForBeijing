package com.ghl.login.service.user.impl;

import com.ghl.login.entity.user.UserRole;
import com.ghl.login.entity.user.UserRoleExample;
import com.ghl.login.dao.user.UserRoleMapper;
import com.ghl.login.service.user.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @version V1.0
 * @Description: 用户角色实现类
 * @author: 张琪
 * @date: 2018/4/19
 * @Copyright:
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
    UserRoleMapper userRoleMapper;

    /**
     * 保存用户角色信息
     */
    @Override
	public void saveUserRole(UserRole userRole) {
        userRoleMapper.insert(userRole);
	}

    /**
     * 用户角色更新
     */
    @Override
    public void updateUserRole(UserRole userRole) {
        userRoleMapper.updateByPrimaryKeySelective(userRole);
    }

	/**
	 * 根据roleId删除用户的部门角色信息
	 */
    @Override
	public void deleteUserRole(Integer userRoleId){
		userRoleMapper.deleteByPrimaryKey(userRoleId);
	}

    /**
     * 查询用户角色信息表
     */
    @Override
    public List<UserRole> selectUserRole(UserRoleExample example) {
        return userRoleMapper.selectByExample(example);
    }

    /**
     * 根据条件删除用户的部门角色信息
     */
    @Override
    public void deleteUserRoleByExample(UserRoleExample example){
        userRoleMapper.deleteByExample(example);
    }

}
