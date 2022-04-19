package Task_3;

public class Main {
    public static void main(String[] args){
        TextEditor te = new TextEditor("Hello, user! How are you?");

/*        te.arrStrings();

        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "C#";
        String str4 = "Java";

        System.out.println(str1.equals(str2) + " " + str1.equals(str3) + " " +  str1.equals(str4)
                + " " + str2.equals(str3) + " " + str2.equals(str4) + " " + str3.equals(str4) );
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1 == str4);

        str1 = "JavaJava";

        System.out.println(str1.substring(4) == str4);
        System.out.println(str1 == null);

        str1 = null;

        System.out.println(str1 == null);
*/
        te.delSpaces();

    }
}

