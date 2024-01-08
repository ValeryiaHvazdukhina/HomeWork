public class Main {
    public static void main(String[] args) {
        Instrument[] array = new Instrument[3];
        array[0] = new Guitar(6);
        array[1] = new Drum("big");
        array[2] = new Tuba(5.0);


        for (Instrument i : array) {
            i.play();
        }
    }
}