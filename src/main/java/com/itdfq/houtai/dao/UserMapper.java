package com.itdfq.houtai.dao;

import com.itdfq.houtai.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
	
	@Insert("insert into admin_user(username,password,unit,realName,phone,address,role,remark,delFlag) values(#{username},#{password},#{unit},#{realName},#{phone},#{address},#{role},#{remark},#{delFlag})")
    void insertUser(User user);
    
    @Delete("delete from admin_user where id=#{id}")
    void deleteById(int id);
    
    @Update("update admin_user set username=#{username},password=#{password},unit=#{unit},realName=#{realName},phone=#{phone},address=#{address},role=#{role},remark=#{remark},delFlag=#{delFlag} where id=#{id}")
    void updateUser(User user);
    
    @Select("select * from admin_user where id=#{id}")
    User selectUserById(int id);
    
    @Select("select * from admin_user")
    List<User> selectAllUsers();
    
    @Select("select * from admin_user where username=#{username} and delFlag='0' order by username")
    User selectUserByUsername(String username);
    
    @Select("select * from admin_user where username like concat('%',#{username},'%') and delFlag='0'")
    List<User> selectUserByUsernameLike(String username);
    
    @Update("update admin_user set password=#{password} where id=#{id}")
    public void passwordReset(@Param("id") int id,@Param("password") String password);



}
