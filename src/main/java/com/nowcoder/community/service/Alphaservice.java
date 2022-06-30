package com.nowcoder.community.service;

import com.nowcoder.community.dao.Alphadap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
//可以多实例
public class Alphaservice {
    @Autowired
    private Alphadap alphaDao;

    public Alphaservice(){
        System.out.println("实例化AlphaService");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService");
    }

    @PreDestroy
    public void Destroyservice(){
        System.out.println("销毁AlphaService");
    }

    public String find() {
        return alphaDao.select();
    }
}
