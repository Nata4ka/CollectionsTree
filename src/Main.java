import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    private static List<Person> peopleList() {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Димидов", "Артем", 31));
        person.add(new Person("Орейро - Кас", "Наталья", 38));
        person.add(new Person("Феллини", "Федерико", 51));
        person.add(new Person("Лаврова - Ушакова", "Светлана", 25));
        return person;
    }

    public static void main(String[] args) {
        List<Person> person = peopleList();
        Collections.sort(person, new NoblePersonComparator(2));
        System.out.println(person);

    }
}