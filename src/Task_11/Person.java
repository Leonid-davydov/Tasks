package Task_11;

public class Person implements Comparable<Person>{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

    public String toString() {
        return name + ", " + age;
    }
}
