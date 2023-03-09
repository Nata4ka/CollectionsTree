import java.util.Comparator;

public class NoblePersonComparator implements Comparator<Person> {
    private int maxSurname;

    public NoblePersonComparator(int maxSurname) {
        this.maxSurname = maxSurname;
    }

    public int compare(Person o1, Person o2) {
        String[] text1 = o1.getSurname().split(" ");
        String[] text2 = o2.getSurname().split(" ");
        if (text1.length >= maxSurname && text2.length >= maxSurname) {
            return (o1.getAge() - o2.getAge());
        } else if (text1.length != text2.length) {
            return text1.length - text2.length;
        }else {
            return o1.getAge() - o2.getAge();
        }
    }
}

