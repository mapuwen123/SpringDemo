package cn.marvin.springdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        context.start();
//        事件
//        testEvent(context);
//        自定义事件
        testCustomEvent(context);
        context.stop();
    }

    private static void testEvent(ConfigurableApplicationContext context) {
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
    }

    private static void testCustomEvent(ConfigurableApplicationContext context) {
        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");
        customEventPublisher.publish();
    }
}
