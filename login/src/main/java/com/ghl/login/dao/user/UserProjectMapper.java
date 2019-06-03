package com.ghl.login.dao.user;

import com.ghl.login.entity.user.UserProject;
import com.ghl.login.entity.user.UserProjectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserProjectMapper {
    int countByExample(UserProjectExample example);

    int deleteByExample(UserProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserProject record);

    int insertSelective(UserProject record);

    List<UserProject> selectByExample(UserProjectExample example);

    UserProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserProject record, @Param("example") UserProjectExample example);

    int updateByExample(@Param("record") UserProject record, @Param("example") UserProjectExample example);

    int updateByPrimaryKeySelective(UserProject record);

    int updateByPrimaryKey(UserProject record);
}