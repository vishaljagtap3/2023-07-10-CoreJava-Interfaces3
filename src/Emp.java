public class Emp implements Loggable{
    private int id;
    private String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " " + name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void log() {
        System.out.println(id  + " log");
    }

    @Override
    public void info() {
        System.out.println(id + " info");
    }
}
