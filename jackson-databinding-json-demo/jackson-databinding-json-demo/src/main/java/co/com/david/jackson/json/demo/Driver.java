package co.com.david.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();

			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);

			System.out.println("Firts Name:" + student.getFirstName());
			System.out.println("Last Name:" + student.getLastName());
			
			System.out.println("Parallel:");
			student.getLanguages().parallelStream().forEach(System.out::print);
			System.out.println("Stream:");
			student.getLanguages().stream().forEach(System.out::print);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
