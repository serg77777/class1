package lesson140526;

class Person implements Comparable<Person> {

	String name;
	int age;
	int capital;
	
	public Person(String name, int age, int capital) {
		this.name = name;
		this.age = age;
		this.capital = capital;
	}

	@Override
	public int compareTo(Person o) {
		return age - o.age;
	}
	
	@Override
	public String toString() {
		return name + ": " + age + " $" + capital;
	}
	
	public int getCapital() {
		return capital;
	}
	
}