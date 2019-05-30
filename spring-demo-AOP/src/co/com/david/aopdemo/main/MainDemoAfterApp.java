package co.com.david.aopdemo.main;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.com.david.aopdemo.AopConfig;
import co.com.david.aopdemo.dao.AccountDAO;

public class MainDemoAfterApp {

	private static Logger logger = Logger.getLogger(MainDemoAfterApp.class.getName());

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		/*
		 * try {
		 * 
		 * System.out.println("Accounts: \n");
		 * accountDAO.findAccounts(false).forEach(System.out::println);
		 * 
		 * } catch (Exception e) { System.out.println("Exception has been throwing: " +
		 * e.getMessage()); }
		 */

		logger.info(accountDAO.getFortune());

		context.close();
	}

}
