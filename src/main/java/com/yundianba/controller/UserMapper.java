package com.yundianba.controller;

import com.yundianba.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    /**根据id查询用户*/
    @Select("SELECT * FROM T_USER WHERE ID = #{id}")
    User findById(@Param("id") String id);
}
