package com.leqiang222.spring_study.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LeQiang Li
 * @Date Created in 15:34 2019/3/1
 * @Description:
 * @Modified By:
 */

public class Test01 {
    @Test
    public void test1() {
        // 	ApplicationContext有两个实现类
            // 	ClassPathXmlApplicationContext	：加载类路径下的配置文件
            // 	FileSystemXmlApplicationContext	：加载文件系统下的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDao");

        userDAO.save();


    }
}
