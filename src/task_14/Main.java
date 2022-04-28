package task_14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> productsMap = initMap();

        System.out.println("The biggest amount of products is " + mostFrequent(productsMap));

        Set<String> productsSet = initSet(productsMap);

        displaySet(productsSet);
    }

    static HashMap<String, Integer> initMap() {
        HashMap<String, Integer> map = new HashMap<>();
        String[] products = new String[]{"Milk", "Bread", "Salad", "Broccoli", "Pears", "Pineapples", "Butter"};

        for (int i = 0; i < products.length; i++) {
            map.put(products[i], getRandomInteger(30, 70));
        }

        return map;
    }

    public static int getRandomInteger(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    public static int mostFrequent(HashMap<String, Integer> map) {
        int max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> node : map.entrySet()) {
            if (node.getValue() > max)
                max = node.getValue();
        }
        return max;
    }

    public static Set<String> initSet(Map<String, Integer> oldProducts) {
        Set<String> set = new HashSet(oldProducts.keySet());
        set.add("Sweets");
        set.add("Chocolate");
        set.add("Cookies");
        set.add("Marmalade");

        return set;
    }

    static void displaySet(Set<String> set){
        for (String s : set){
            System.out.println(s);
        }
    }
}

