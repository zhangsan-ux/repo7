package com.itheima.spring.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring的aop 的AOP 注解开发
 * Create By cgc6868 on 2019/9/25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {
    @Resource(name="oderDao")
    private OderDao oderDao;
    @Test
    public void demo1(){
    oderDao.save();
    oderDao.delete();
    oderDao.find();
    oderDao.update();
    }
}
