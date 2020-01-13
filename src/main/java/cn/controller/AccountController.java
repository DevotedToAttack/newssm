package cn.controller;

import cn.domain.Account;
import cn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        System.out.println("表现层，查询所有账户...");
        ModelAndView mv=new ModelAndView();
        //调用service的方法
        List<Account> accounts=accountService.findAll();
        mv.addObject("accounts",accounts);
        mv.setViewName("account-list");
        return mv;
    }
    @RequestMapping("/save")
    public String save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层，保存账户...");
        accountService.saveAccount(account);
        return "redirect:findAll";
    }
}
