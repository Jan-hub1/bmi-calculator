package pl.janmikolajczak.repository;

import pl.janmikolajczak.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonsRepository {
    private static List<Person> personsList = new ArrayList<>();

    static {
        Person p1 = new Person(1, 70, 1.75, "male", 20);
    }
}
