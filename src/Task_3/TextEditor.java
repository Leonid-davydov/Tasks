package Task_3;

import java.util.Scanner;

public class TextEditor {
    String text;
    Scanner console = new Scanner(System.in);

    TextEditor(String text){
        this.text = text;
    }

    public void show(){
        System.out.println(text);
    }

    public void append(String word){
        text += word;
    }

    public void insert(String word, int index){
        text = text.substring(0, index) + word + text.substring(index);
    }

    public void delete(char ch){
        String symbol = "" + ch;
        text = text.replace(symbol, "");
    }

    public void replace(String oldWord, String newWord){
        text = text.replace(oldWord, newWord);
    }

    public void reverse(){
        String userText = console.nextLine();
        String reversedUserText = "";
        for (int i = userText.length() - 1; i >= 0; i--){
            reversedUserText += userText.charAt(i);
        }

        System.out.println(reversedUserText);
    }

    public void delSpaces(){
        String userText = console.nextLine();
        StringBuilder newText = new StringBuilder();
        char symbol;

        for (int i = 0; i < userText.length(); i++){
            symbol = userText.charAt(i);
            if (symbol != ' ') {
                newText.append(symbol);
            }
            if (symbol == '.'){
                break;
            }
        }

        System.out.println(newText);
    }

    public void uppercase(){
        String userText = console.nextLine();
        StringBuilder newText = new StringBuilder();
        char symbol;

        for (int i = 0; i < userText.length(); i++){
            symbol = userText.charAt(i);
            if (symbol <= 90 && symbol >= 65) {
                newText.append(symbol);
            }
        }

        System.out.println(newText);
    }

    public void evenLetters(){
        String userText = console.nextLine();
        StringBuilder newText = new StringBuilder();
        char symbol;

        for (int i = 1; i < userText.length(); i += 2){
            symbol = userText.charAt(i);
            if (symbol <= 122 && symbol >= 97) {
                symbol -= 32;
            }
            newText.append(symbol);
        }

        System.out.println(newText);
    }

    public void arrStrings() {
        int size = console.nextInt();
        console.nextLine();
        String[] arr = new String[size];

        for (int i = 0; i < size; i++){
            String input = console.nextLine();
            arr[i] = input.equals("") ? "String is empty" : input;
        }

        for (String string : arr) {
            System.out.println(string);
        }
    }
}
