package lesson140526;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparableExample {
	
	public static void main(String[] args) {
		
		List<Person> persons = new LinkedList<>();
		
		persons.add(new Person("John", 30, 15000));
		persons.add(new Person("Ann", 25, 40000));
		persons.add(new Person("Paul", 35, 12000));
		persons.add(new Person("Pete", 32, 12000));
		persons.add(new Person("Mary", 27, 12000));

		print(persons);
		
		Collections.sort(persons);

		print(persons);

		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o2.capital - o1.capital;
			}
		});
		
		print(persons);
	}



	private static void print(List<Person> persons) {
		System.out.println("-----");
		for (Person person : persons) {
			System.out.println(person);
		}
	}
	

}



