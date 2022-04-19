package Task_6;

public class Students {
    private static int numberOfStud;
    public final String lastName;
    public final String firstName;
    double gradePoint;
    final static int schoolNumber = 1;

    Students(String lastName, String firstName, double gradePoint) {
        numberOfStud++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gradePoint = gradePoint;
        System.out.println("Default constructor execution - " + numberOfStud);
    }

    public static void getNumberOfStud() {
        System.out.println("Number of students = " + numberOfStud);
    }

    @Override
    public String toString(){
        return lastName + " " + firstName + " " + gradePoint;
    }
}
