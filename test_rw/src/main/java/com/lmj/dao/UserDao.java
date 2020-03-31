package com.lmj.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.lmj.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: UserDao
 * Description:
 * date: 2020/3/30 22:13
 *
 * @author MJ
 */
@Repository
public interface UserDao {

    @DS("master")
    @Select("select * from my_user")
    List<User> getUsers();

    @DS("slave")
    @Insert("insert into my_user (username,password) values(#{username},#{password})")
    int addUser(User user);

}
