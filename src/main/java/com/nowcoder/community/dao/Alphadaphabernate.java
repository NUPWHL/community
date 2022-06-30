package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("AlphaHa")
public class Alphadaphabernate implements Alphadap{

    @Override
    public String select() {
        return "hello habernate!";
    }
}
