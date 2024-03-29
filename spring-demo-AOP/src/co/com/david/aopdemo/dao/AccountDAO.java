package co.com.david.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import co.com.david.aopdemo.entity.Account;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println(getClass() + " : Add Account Method");
	}

	public void addAccount(String letters) {
		System.out.println(getClass() + " : Add Account Method with letters " + letters);
	}

	public void addAccount(String letters, String numbers) {
		System.out.println(getClass() + " : Add Account Method with letters " + letters + " And Numbers " + numbers);
	}

	public void addAccount(Account account) {
		System.out.println(getClass() + " : Add Account Method " + account.toString());
	}

	public void addAccount(Account account, boolean vip) {
		System.out.println(getClass() + " : Add Account Method " + account.toString() + " Is VIP " + vip);
	}

	public void addAccount(Account account, boolean vip, int passValue) {
		System.out.println(getClass() + " : Add Account Method " + account.toString() + " Is VIP " + vip
				+ " Pass Value " + passValue);
	}

	public List<Account> findAccounts(boolean throwException) throws Exception {
		List<Account> accounts = new ArrayList<>();
		LongStream.range(0, 11).forEach(i -> accounts.add(new Account(i, i * 10)));
		System.out.println("List is ready for return");

		if (throwException) {
			throw new RuntimeException("Error Processing de data");
		}

		return accounts;
	}

	public String getFortune() {
		return "Have a nice day!!";
	}
}
