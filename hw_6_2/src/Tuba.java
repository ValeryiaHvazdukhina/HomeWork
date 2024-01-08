public class Tuba implements Instrument {
    private double diameter;

    Tuba(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + diameter);
    }
}