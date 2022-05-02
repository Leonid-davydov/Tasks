package task_16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        System.out.println(collection.stream().filter("a1"::equals).count());
        System.out.println(collection.stream().findFirst().orElse("0"));
        System.out.println(collection.stream().skip(2).findFirst().get());
        System.out.println(collection.stream().skip(1).limit(2).collect(Collectors.toList()));
        System.out.println(Arrays.toString(collection.stream().filter("a1"::equals).toArray()));
        System.out.println(collection.stream().anyMatch("a1"::equals));
        System.out.println(collection.stream().noneMatch("a7"::equals));
        System.out.println(Arrays.toString(collection.stream().mapToInt((s) -> Integer.parseInt(s.substring(1))).toArray()));
        collection.stream().forEach((p) -> System.out.print(p));
        System.out.println();
        System.out.println(collection.stream().sorted().collect(Collectors.toList()));

        List<People> peoples = Arrays.asList( new People("Basil", 16, Sex.MAN),
                new People("Peter", 23, Sex.MAN), new People("Helen", 42, Sex.WOMEN),
                new People("Ivan", 69, Sex.MAN));

        peoples.stream().filter((p)-> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == Sex.MAN).forEach((p) -> System.out.println(p));
        System.out.println(peoples.stream().filter((p) -> p.getSex() == Sex.MAN).
                            mapToInt(People::getAge).average().getAsDouble());
        System.out.println(peoples.stream().filter((p) -> p.getAge() >= 18).filter(
                            (p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55) ||
                            (p.getSex() == Sex.MAN && p.getAge() < 60)).count());
        System.out.println(peoples.stream().min(Comparator.comparingInt(People::getAge)).get());
        System.out.println(peoples.stream().sorted((o1, o2) -> o1.getSex() != o2.getSex() ? o1.getSex().
                compareTo(o2.getSex()) : Integer.compare(o1.getAge(), o2.getAge())).collect(Collectors.toList()));
    }
}
