package com.luv2code.hibernate.demo;

import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateCourseAndStudentsDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			Course tempCourse = new Course("Nintendo");
			session.save(tempCourse);

			Stream studentsStream = Stream.of(new Student("Cristian", "Sanchez", "csda@dakjdsa.com"),
					new Student("David", "Sanchez", "csda@dakjdsa.com"),
					new Student("Hermency", "Gonzalez", "csda@dakjdsa.com"),
					new Student("Maria", "Pachon", "csda@dakjdsa.com"));

			studentsStream.forEach(s -> {
				tempCourse.addStudent((Student) s);
				session.save(s);
			});

			// session.save(tempCourse);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			// add clean up code
			session.close();

			factory.close();
		}
	}

}
