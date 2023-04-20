package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.spring.aop.dao.Account;

@Aspect
@Component
@Order(2)
public class LogAspect {
	
	@Before("com.spring.aop.aspect.LoggingAspect.daoAccountExcludeSetterGetter()")
	public void addBeforeAdvice(JoinPoint joinPoint)
	{
		System.out.println("\n-----> executing before advice on addAccount() excluding gett"
				+ "er setter");
		
		//display method signature
		MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
		
		System.out.println(methodSignature);
		
		//display method args
		Object[] args=joinPoint.getArgs();
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println("method args"+args[i]);
			if(args[i] instanceof Account)
			{
				Account a=(Account) args[i];
				System.out.println(a.getNo()); 
				System.out.println(a.getName());
			}
		}
		
		
	}

}
