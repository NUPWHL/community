package com.nowcoder.community;

import com.nowcoder.community.dao.Alphadap;
import com.nowcoder.community.service.Alphaservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)

class CommunityApplicationTests implements ApplicationContextAware {
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Test
	public void testApplicationContextLoads() {
		System.out.println(applicationContext);
		Alphadap alphadap = applicationContext.getBean(Alphadap.class);
		System.out.println(alphadap.select());

		alphadap = applicationContext.getBean("AlphaHa",Alphadap.class);
		System.out.println(alphadap.select());
	}

	@Test
	public void testBeanmanagement(){
		Alphaservice alphaservice = applicationContext.getBean(Alphaservice.class);
		System.out.println(alphaservice);

		alphaservice = applicationContext.getBean(Alphaservice.class);
		System.out.println(alphaservice);
	}

	@Test
	public void testBeanConfig(){
		SimpleDateFormat simpleDateFormat = applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}

	@Autowired
	@Qualifier("AlphaHa")
	private Alphadap alphaDao;

	@Autowired
	private Alphaservice alphaService;

	@Autowired
	private SimpleDateFormat simpleDateFormat;
	//注入一个 类 就不需要getbean了
	@Test
	public void testDI() {
		System.out.println(alphaDao);
		System.out.println(alphaService);
		System.out.println(simpleDateFormat);
	}

}
