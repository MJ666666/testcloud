package com.lmj.test.test_rw;

import com.lmj.dao.UserDao;
import com.lmj.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.*;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestRwApplication.class)
class TestRwApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserDao userDao;


    @Test
    public void test1() {
        List<User> users = userDao.getUsers();
        System.out.println(users);
    }
    @Test
    public void test3() {
        User user = new User();
        user.setUsername("mj55555");
        user.setPassword("mj12343");
        int i = userDao.addUser(user);
        System.out.println(i);
    }


    @Test
    public void test2() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://122.51.222.139:22222/mj?useUnicode=true&characterEncoding=utf-8", "", "");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from my_user");
        boolean execute = preparedStatement.execute();
        ResultSet resultSet = preparedStatement.getResultSet();
        while (resultSet.next()) {
            String string = resultSet.getString(1);
            System.out.println(string);
        }
    }

}
