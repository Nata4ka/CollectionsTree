import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Димидов", "Артем", 31));
        person.add(new Person("Орейро - Кас", "Наталья", 38));
        person.add(new Person("Феллини", "Федерико", 51));
        person.add(new Person("Лаврова - Ушакова", "Светлана", 25));


        person.sort((o1, o2) -> {
            if (o1.getSurname().length() >= 2 && o2.getSurname().length() >= 2) {
                return (o1.getAge() - o2.getAge());
            } else if (o1.getSurname().length() != o2.getSurname().length()) {
                return o1.getSurname().length() - o2.getSurname().length();
            } else {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(person);

    }

}