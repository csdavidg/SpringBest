package co.com.david.aopdemo.controller;

import org.springframework.stereotype.Controller;

import co.com.david.aopdemo.entity.Account;

@Controller
public class AccountController {

	private String name;
	private String serviceCode;

	public void addAccount() {
		System.out.println(getClass() + " AddAccount Method");
	}

	public void addAccount(Account account, boolean vip, int passValue) {
		System.out.println(getClass() + " : Add Account Method " + account.toString() + " Is VIP " + vip
				+ " Pass Value " + passValue);
	}

	public String getName() {
		System.out.println(getClass() + " : getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + " : setName(Sting name)");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + " : getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " : setServiceCode(String serviceCode)");
		this.serviceCode = serviceCode;
	}

}
