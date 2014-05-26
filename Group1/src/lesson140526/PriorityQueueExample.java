package lesson140526;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueExample {
	
	private static final class CapitalComparator implements Comparator<Person> {
		@Override
		public int compare(Person o1, Person o2) {
			return o1.capital - o2.capital;
		}
	}

	public static void main(String[] args) {

		PriorityQueue<Person> personsQueue = new PriorityQueue<>(10, new CapitalComparator());
		
		List<Person> personsList = new LinkedList<>();
		
		for (int i = 0; i < 10000000; i++) {
			Person person = generatePerson();
			personsQueue.add(person);
			if (personsQueue.size() > 10) {
				personsQueue.remove();
			}
			personsList.add(person);
		}
		
		while (!personsQueue.isEmpty()) {
			System.out.println(personsQueue.poll());
		}
		
		System.out.println("---");
		
		Collections.sort(personsList, Collections.reverseOrder(new CapitalComparator()));
		
		for (int i = 0; i < 10; i++) {
			System.out.println(personsList.get(i));
		}
		
	}
	
	static Random random = new Random();
	
	static char[] vowels = {'a', 'o', 'e', 'u', 'i'};
	static char[] consonants = {'b', 'c', 'd', 'f', 'g', 'k', 'm', 'n', 'p'};
	
	static Person generatePerson() {
		char[] name = new char[4];
		name[0] = consonants[random.nextInt(consonants.length)];
		name[1] = vowels[random.nextInt(vowels.length)];
		name[2] = consonants[random.nextInt(consonants.length)];
		name[3] = vowels[random.nextInt(vowels.length)];
		int age = 10 + random.nextInt(80);
		int capital = random.nextInt(Integer.MAX_VALUE - 1);
		return new Person(new String(name), age, capital);
	}

}
