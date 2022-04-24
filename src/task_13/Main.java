package task_13;

public class Main {
    public static void main(String[] args) {
        System.out.println(theLast(100, 2));
        System.out.println(theLastLinked(100, 2));
    }

    public static int theLast (int number, int m) {
        if (number < 1)
            throw new IllegalArgumentException("Number: " + number + " < 1");
        if (m < 1)
            throw new IllegalArgumentException("m: " + m + " < 1");
        if (m == 1)
            return number;

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= number; i++){
            al.add(i);
        }

        int toDelete = m;

        while (al.size() > 1) {
            while (toDelete <= al.size()){
                al.remove(toDelete);
                toDelete += (m - 1);
            }
            toDelete -= (m - 1);
            toDelete = m - (al.size() + 1 - toDelete);
        }
        return (int) al.get(1);
    }

    public static int theLastLinked (int number, int m) {
        if (number < 1)
            throw new IllegalArgumentException("Number: " + number + " < 1");
        if (m < 1)
            throw new IllegalArgumentException("m: " + m + " < 1");
        if (m == 1)
            return number;

        LinkedList ll = new LinkedList();
        for (int i = 1; i <= number; i++){
            ll.add(i);
        }

        int toDelete = m;

        while (ll.size() > 1) {
            while (toDelete <= ll.size()){
                ll.remove(toDelete);
                toDelete += (m - 1);
            }
            toDelete -= (m - 1);
            toDelete = m - (ll.size() + 1 - toDelete);
        }

        return ll.get(1);
    }
}
