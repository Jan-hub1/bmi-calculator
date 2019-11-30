package pl.janmikolajczak.repository;

import pl.janmikolajczak.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonsRepository {
    private static List<Person> personsList = new ArrayList<>();

    static {
//        Person p1 = new Person(1, 175, 70, "Male", 20);
//
//        personsList.add(p1);
    }

    public static Person getPersonById(int id) {
        Person result = new Person();
        for (Person person : personsList) {
            if (person.getId() == id) {
                result = person;
            }
        }
        return result;
    }

    public static boolean idCheck(int id) {
        for (Person person : personsList) {
            if (person.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public static void addPersonToList(Person person) {
        personsList.add(person);
    }
}
