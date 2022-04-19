package Task_9;

public class Horse extends Animal {
    Horse (String name, int footNumber, boolean hasMustache) {
        super(name, footNumber, hasMustache);
    }

    @Override
    public void voice() {
        System.out.println("I-go-go");
    }

    @Override
    public void move() {
        System.out.println("top-top");
    }

    @Override
    public void isHungry() {
        System.out.println("I want hay");
    }
}
