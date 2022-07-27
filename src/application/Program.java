package application;

import java.util.ArrayList;
import java.util.List;

import domain.Person;

public class Program {

	public static void main(String[] args) {
	
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Matheus", "matheus@email.com"));
		persons.add(new Person(2, "Suetham", "suetham@email.com"));
		persons.add(new Person(3, "Emeath", "emeath@email.com"));
		
		for (Person person : persons) {
			System.out.println(person);
		}

	}

}
