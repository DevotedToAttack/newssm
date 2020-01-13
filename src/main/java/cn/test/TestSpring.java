package cn.test;

import cn.domain.Account;
import cn.service.AccountService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    private ApplicationContext ac;
    @Before
    public void init(){
        ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
    @After
    public void closesql(){
    }

    @Test
    public void testFindAll(){
        AccountService as=(AccountService) ac.getBean("accountService");
        List<Account> accounts=as.findAll();
        for (Account account:accounts) {
            System.out.println(account);
        }
    }
}
