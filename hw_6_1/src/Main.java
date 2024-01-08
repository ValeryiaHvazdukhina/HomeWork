public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мия", 3);
        Cat cat2 = new Cat("Майя", 3);
        Dog dog = new Dog("Ральф", 5);
        Rat rat = new Rat("Рафаэль", 1);

        cat.makeNoise();
        dog.makeNoise();
        rat.makeNoise();
        cat2.makeNoise();
    }
}