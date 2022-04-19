package Task_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    private static final String FILE_PATH = "./input.txt";
    private static final String INCORRECT_FILE_PATH = "./input1.txt";

    private static void readFile(String path) throws EmptyFileException {
        File file = new File(path);
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                Scanner scanner = new Scanner(fileInputStream)
        ) {
            String fileLine = scanner.nextLine();
            System.out.printf("'%s' read from file '%s'%n", fileLine, path);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound exception '" + path + "'");
        } catch (IOException e) {
            throw new EmptyFileException("The empty file is located on ' ", e, path);
        } catch (NoSuchElementException e) {
            throw new EmptyFileException("The empty file is located on ' ", path);
        } finally {
            System.out.println("finally method for '" + path + "'");
        }
    }

    public static void main(String[] args) {

        try {
            readFile(INCORRECT_FILE_PATH);
           
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage() + e.filePath + " '");
        }

        try {
            readFile(FILE_PATH);
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage() + e.filePath + " '");
        }
    }
}
