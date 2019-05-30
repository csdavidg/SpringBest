package co.com.david.mvc.main;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import co.com.david.mvc.dto.Person;

public class Java8Test {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12), new Person("David", 17), new Person("David", 27));

		Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println("By Age");
		personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

		Map<String, List<Person>> personsByName = persons.stream().collect(Collectors.groupingBy(Person::getName));
		System.out.println("By Name");
		personsByName.forEach((name, p) -> System.out.format("age %s: %s\n", name,
				p.stream().map(Person::getAge).collect(Collectors.toList()).toString()));

		System.out.println("Average" + persons.stream().collect(Collectors.averagingInt(Person::getAge)));

		IntSummaryStatistics summary = persons.stream().collect(Collectors.summarizingInt(Person::getAge));

		System.out.println(summary);

		System.out.println(persons.stream().filter(p -> p.getAge() > 18).map(Person::getName)
				.collect(Collectors.joining(" AND ", "In Colombia ", " are of legal age")));

		System.out.println(
				persons.stream().collect(Collectors.toMap(Person::getName, Person::getAge, (n1, n2) -> n1 + n2)));

		StringJoiner sj = new StringJoiner(":", "[", "]");
		
		sj.add("George").add("Sally").add("Fred");
		System.out.println(sj.toString());
		
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		System.out.println(commonPool.getParallelism());  

		// Collector<Person, StringJoiner, String> personCollector = Collector.of()

	}

}
