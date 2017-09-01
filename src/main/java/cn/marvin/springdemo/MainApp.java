package cn.marvin.springdemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        创建bean测试
//        testBean(context);
//        依赖注入测试
//        testInject(context);
//        注入集合测试
//        testCollection(context);
//        注解测试
        testAnnotation(context);
        context.registerShutdownHook();
    }

    private static void testBean(AbstractApplicationContext context) {
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("Hello Super Marvin!");
        obj.getMessage();
        obj.getMessage2();

        NewHello obj2 = (NewHello) context.getBean("newHello");
        obj2.getMessage();
        obj2.getMessage2();
        obj2.getMessage3();
    }

    private static void testInject(AbstractApplicationContext context) {
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();

        InjectDemo injectDemo = (InjectDemo) context.getBean("injectDemo");
        injectDemo.show();

        TextEditor2 textEditor2 = (TextEditor2) context.getBean("textEditor2");
        textEditor2.spellCheck();

        InjectDemo2 injectDemo2 = (InjectDemo2) context.getBean("injectDemo2");
        injectDemo2.show();
    }

    private static void testCollection(AbstractApplicationContext context) {
        JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollection");
        javaCollection.getAddressList();
        javaCollection.getAddressSet();
        javaCollection.getAddressMap();
        javaCollection.getAddressProperties();
    }

    private static void testAnnotation(AbstractApplicationContext context) {
        Profile profile = (Profile) context.getBean("profile");
        profile.printName();
        profile.printAge();

        TextEditor3 textEditor3 = (TextEditor3) context.getBean("textEditor3");
        textEditor3.spellCheck();
    }
}
