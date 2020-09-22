package com.devin.test;

import com.devin.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * 容器中的对象是什么时候创建的？
 * 所以必须要有无参构造函数
 * </p>
 *
 * @author hkh
 * @since 2020/9/4
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * applicationContext 是IOC容器的入口，该类必须创建
         * 两个具体实现类读取配置文件
         * ClassPathXmlApplicationContext：从classpath读取数据
         * FileSystemXmlApplicationContext：从当前文件系统读取数据
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
//        Person person = (Person) context.getBean("person");
        Person bean = context.getBean("person", Person.class);
        context.getBean(Person.class);
        Class clazz = Person.class;
        clazz.newInstance();
        System.out.println(bean);
    }
}
