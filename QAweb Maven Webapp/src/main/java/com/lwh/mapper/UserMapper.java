package com.lwh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.lwh.entitis.User;

@Mapper
public interface UserMapper {

	
	public List<User> likeName(@Param(value = "name") String name);
	
//	@Select("select *from user where id = #{id}")
//	public User getById(long id);
//	
//	@Select("select name from user id = #{id}")
//	public String getNameById(long id);
}
