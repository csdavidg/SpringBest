package co.com.david.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass() + " : add Account Method ");
	}
	
	public boolean addTestMemmber() {
		System.out.println(getClass() + " : add Account Method ");
		return true;
	}

}
