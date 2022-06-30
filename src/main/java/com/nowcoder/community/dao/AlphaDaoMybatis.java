package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
//更高优先级
public class AlphaDaoMybatis implements Alphadap{
    public String select(){{
        return "Hello MyBatis";
    }

    }
}
