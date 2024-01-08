
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Phone ph1 = new Phone();
        Phone ph2 = new Phone("+111", "aq", 33.4);
        Phone ph3 = new Phone("+222", "aw");

        System.out.println("Number " + ph1.getNumber() + ", Model " + ph1.model + ", Weight" + ph1.weight);
        System.out.println("Number " + ph2.getNumber() + ", Model " + ph2.model + ", Weight" + ph2.weight);
        System.out.println("Number " + ph3.getNumber() + ", Model " + ph3.model + ", Weight" + ph3.weight);

        ph1.sendMessage("111", "222");
        ph2.receiveCall("Ivan");
        ph3.receiveCall("111", "Vasiliy");
    }
}