package com.leqiang222.spring_study.demo1;

/**
 * @Author LeQiang Li
 * @Date Created in 15:47 2019/3/1
 * @Description:
 * @Modified By:
 */
public class UserDAOImpl implements UserDAO {
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void save() {
        System.out.print("------UserDAOImpl count: " + count);
    }
}
