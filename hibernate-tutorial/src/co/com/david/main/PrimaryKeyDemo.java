package co.com.david.main;

import java.util.List;
import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.com.david.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {

			Stream<Student> studentsList = Stream.of(new Student("David", "Sanchez", "csdav@gmail.com"),
					new Student("Cristian", "Sanchez", "csdav@gmail.com"),
					new Student("Sebas", "Sanchez", "csdav@gmail.com"));

			session.beginTransaction();
			studentsList.forEach(s -> session.save(s));

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
