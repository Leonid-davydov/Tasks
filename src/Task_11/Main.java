package Task_11;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person Leonid = new Person("Leonid", 20);
        Person Kirill = new Person("Kirill", 22);
        Person Vlad = new Person("Vlad", 21);

        Person[] arr = new Person[] {Leonid, Kirill, Vlad};

        for (Person p : arr)
            System.out.println(p);

        System.out.println();
        Arrays.sort(arr);

        for (Person p : arr)
            System.out.println(p);

        System.out.println();
        Arrays.sort(arr, new MyComparator());

        for (Person p : arr)
            System.out.println(p);

        Comparator comparator = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.name.length(), o2.name.length());
            }
        };

        System.out.println();
        Arrays.sort(arr, comparator);

        for (Person p : arr)
            System.out.println(p);
    }
}
