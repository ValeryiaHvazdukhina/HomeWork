public class Guitar implements Instrument {
    private int amountString;

    public int getAmountString() {
        return amountString;
    }

    public void setAmountString(int amountString) {
        this.amountString = amountString;
    }

    Guitar(int amountString) {
        this.amountString = amountString;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн " + amountString + ", " + KEY);
    }
}