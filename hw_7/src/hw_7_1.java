public class hw_7_1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder addition = new StringBuilder();
        addition.append(a)
                .append("+")
                .append(b)
                .append(" = ")
                .append(a + b);
        System.out.println(addition.replace(5, 6, "равно"));

        StringBuilder subtraction = new StringBuilder();
        subtraction.append(a)
                .append("-")
                .append(b)
                .append(" = ")
                .append(a - b);
        System.out.println(subtraction.replace(5, 6, "равно"));

        StringBuilder multiplication = new StringBuilder();
        multiplication.append(a)
                .append("*")
                .append(b)
                .append(" = ")
                .append(a * b);
        System.out.println(multiplication.replace(5, 6, "равно"));
    }
}