package co.com.david.aopdemo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.com.david.aopdemo.AopConfig;
import co.com.david.aopdemo.controller.AccountController;
import co.com.david.aopdemo.dao.AccountDAO;
import co.com.david.aopdemo.dao.MembershipDAO;
import co.com.david.aopdemo.entity.Account;

public class MainDemoBeforeApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		AccountController accountController = context.getBean("accountController", AccountController.class);
		Account account = new Account(1L, 1234L);
		
		/*System.out.println("====================================================");

		accountDAO.addAccount();
		accountDAO.addAccount("ABCDE");
		accountDAO.addAccount("ABCDE", "123456");

		System.out.println("");

		
		accountDAO.addAccount(account);
		accountDAO.addAccount(account, true);
		accountDAO.addAccount(account, true, 1233);

		System.out.println("");

		System.out.println("");
		System.out.println("====================================================");

		membershipDAO.addAccount();

		System.out.println("");
		System.out.println("====================================================");

		membershipDAO.addTestMemmber();*/

		System.out.println("");
		System.out.println("====================================================");

		accountController.addAccount();

		accountController.setServiceCode("00001");
		accountController.setName("ACCOUNT NAME");

		accountController.getName();
		accountController.getServiceCode();
		
		accountController.addAccount(account, true, 12233);

		context.close();

	}

}
