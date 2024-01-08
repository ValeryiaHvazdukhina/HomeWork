public class Phone {
    protected String number;
    protected String model;
    protected double weight;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String number, String callerName) {
        System.out.println("Звонит " + callerName + ", number " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        for (String a : numbers) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }

}