package cn.marvin.springdemo.jdbc;

import javax.sql.DataSource;

public interface UserDao {
    void setDataSource(DataSource ds);
    void createUser(String name, String password);
    User getUser(Integer id);
}
