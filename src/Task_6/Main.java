package Task_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        console.nextLine();
        String lastname;
        String firstName;
        double grade = 4;
        double sum = 0.0d;
        double avr;
        Students[] students = new Students[size];

        for (int i = 0; i < size; i++) {
            lastname = console.nextLine();
            firstName = console.nextLine();
            grade = console.nextDouble();
            console.nextLine();
            students[i] = new Students(lastname, firstName, grade);
            sum += students[i].gradePoint;
        }

        avr = sum / size;
        System.out.println(String.format("%.2f",avr));

        for (int i = 0; i < size; i++) {
            if (students[i].gradePoint < avr)
                System.out.println(students[i].toString());
        }
    }
}
