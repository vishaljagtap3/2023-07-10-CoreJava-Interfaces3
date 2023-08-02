public class Main {
    public static void main(String[] args) {

        Emp e1 = new Emp(101, "AA");
        Card c1 = new Card(1232, 1);
        BankAccount b1 = new BankAccount(4567, "BitCode");

        Testing.test(e1);
        Testing.test(c1);
        Testing.test(b1);

    }
}
