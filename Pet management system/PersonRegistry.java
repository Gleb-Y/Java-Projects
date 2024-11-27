package OOP.oop_lab_2.problem5;

import java.util.HashSet;

public class PersonRegistry {
    private HashSet<Person> people;

    public PersonRegistry() {
        people = new HashSet<>();
    }

    public void addPerson(Person person) {
        people.add(person);
        //System.out.println(person.getOccupation() + " " + person + " added to registry.");
    }

    public void removePerson(Person person) {
        people.remove(person);
        //System.out.println(person.getOccupation() + " " + person + " removed from registry.");
    }

    public void printDetails() {
        System.out.println( '\n' + "Show info" );
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println('\n');
    }

    public void findPeopleWithPets() {
        System.out.println("People with pets:");
        for (Person person : people) {
            if (person.hasPet()) {
                System.out.println(person);
            }
        }
    }

    public void findPeopleWithoutPets() {
        System.out.println("People without pets:");
        for (Person person : people) {
            if (!person.hasPet()) {
                System.out.println(person);
            }
        }
    }
}
