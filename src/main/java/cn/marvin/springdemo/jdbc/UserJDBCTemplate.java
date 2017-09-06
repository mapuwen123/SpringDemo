package cn.marvin.springdemo.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class UserJDBCTemplate implements UserDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(ds);
    }

    @Override
    public void createUser(String name, String password) {
        String SQL = "insert into user (name, password) values (?, ?)";
        int result = jdbcTemplateObject.update(SQL, name, password);
        System.out.println("创建用户结果：" + result);
    }

    @Override
    public User getUser(Integer id) {
        String SQL = "select * from user where id = ?";
        User user = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new UserMapper());
        return user;
    }

    @Override
    public void deleteUser(String name) {
        String SQL = "delete from user where name = ?";
        int result = jdbcTemplateObject.update(SQL, name);
        System.out.println("删除用户结果：" + result);
    }
}
