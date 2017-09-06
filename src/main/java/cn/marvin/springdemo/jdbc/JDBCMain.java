package cn.marvin.springdemo.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        UserJDBCTemplate userJDBCTemplate = (UserJDBCTemplate) context.getBean("userJDBCTemplate");
        userJDBCTemplate.createUser("mapuwen", "123");
        User user = userJDBCTemplate.getUser(3);
        System.out.println("id:" + user.getId() + "\nname:" + user.getName() + "\npassword:" + user.getPassword());
    }
}
