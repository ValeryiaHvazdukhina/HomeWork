public class Drum implements Instrument {
    private String size;

    Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играют барабаны размером " + size);
    }
}