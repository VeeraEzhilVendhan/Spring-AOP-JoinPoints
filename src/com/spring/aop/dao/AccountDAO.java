package com.spring.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount(Account a)
	{
		System.out.println(getClass()+" Doing DB work adding account");
	}
	
	String name;

	public String getName() {
		System.out.println("this is get method");
		return name;
	}

	public void setName(String name) {
		System.out.println("this is set method");
		this.name = name;
	}
	
	public List<Account> findAccount()
	{
		List<Account> list=new ArrayList<Account>();
		Account account1=new Account();
		return list;
	}

}
