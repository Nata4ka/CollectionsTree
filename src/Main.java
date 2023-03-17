import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Димидов", "Артем", 31));
        persons.add(new Person("Орейро - Кас", "Наталья", 38));
        persons.add(new Person("Феллини", "Федерико", 51));
        persons.add(new Person("Лаврова - Ушакова", "Светлана", 25));
        persons.add(new Person("Уварова - Оденцова", "Кристина", 15));
        persons.add(new Person("Ларина-Романова", "Любовь", 16));

        Predicate<Person> predicate = person -> person.getAge()<18;
        persons.removeIf(predicate);
        System.out.println(persons);

    }
}