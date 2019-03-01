package com.leqiang222.spring_study.demo2;

import com.leqiang222.spring_study.demo1.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LeQiang Li
 * @Date Created in 16:55 2019/3/1
 * @Description:
 * @Modified By:
 */
public class Test02 {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
    }


}
