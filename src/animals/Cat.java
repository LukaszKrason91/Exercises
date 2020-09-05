package animals;

public class Cat {
    private String colour;
    private int weight;
    private String name;
    public static final String defaultName = "Not Assigned yet ";
    private boolean isAlive;

    public Cat(){
        this.isAlive = true;
    }
    public String getName() {
        if (name == null) {
            return defaultName;
        } else {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public void kill() {
        this.isAlive = false;
    }

    public boolean isAlive(){
        return this.isAlive;
    }


}
