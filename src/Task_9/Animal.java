package Task_9;

public abstract class Animal implements Voiceable, Movable, Starveble {
    private String name;
    private int footNumber;
    private boolean hasMustache;

    Animal() {}
    Animal(String name, int footNumber, boolean hasMustache) {
        this.name = name;
        this.footNumber = footNumber;
        this.hasMustache = hasMustache;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFootNumber() {
        return footNumber;
    }

    public void setFootNumber(int footNumber) {
        this.footNumber = footNumber;
    }

    public boolean getHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }
}
