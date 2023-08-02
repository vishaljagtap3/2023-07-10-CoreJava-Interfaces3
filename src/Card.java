public class Card implements Loggable{
    private int no;
    private int type;

    public Card(int no, int type) {
        this.no = no;
        this.type = type;
    }

    public void display() {
        System.out.println(no + " " + type);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public void info() {
        System.out.println("Card info");
    }

    @Override
    public void log() {
        System.out.println("card log");
    }
}
