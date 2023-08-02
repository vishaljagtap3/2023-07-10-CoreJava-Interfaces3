public class BankAccount implements Loggable{
    private int accNo;
    private String title;

    public BankAccount(int accNo, String title) {
        this.accNo = accNo;
        this.title = title;
    }

    public void display() {
        System.out.println(accNo + " " + title);
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void info() {
        System.out.println("BA info");
    }

    @Override
    public void log() {
        System.out.println("BA log");
    }
}
