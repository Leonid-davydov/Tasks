package Task_11;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.age, o1.age);
    }
}
