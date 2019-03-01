package com.leqiang222.spring_study.demo2;

/**
 * @Author LeQiang Li
 * @Date Created in 16:52 2019/3/1
 * @Description:
 * @Modified By:
 */
public class Bean1 {
    // 无参数构造方法
    public Bean1() {
        super();
        System.out.print("Bean1的无参数构造方法");
    }

    // 静态工厂
    public static Bean1 createBean1() {
        System.out.print("Bean1的静态工厂实例\n");
        return new Bean1();
    }

    // 实例工厂
    public Bean1 createBean2() {
        System.out.print("Bean1的实例工厂实例\n");
        return new Bean1();
    }
}
