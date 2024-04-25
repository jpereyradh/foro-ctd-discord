public class Main {
    public static void main(String[] args) {


        int i = 10; // Declaración de una variable int
        Integer j = new Integer(20); // Declaración de un objeto Integer
        Integer k = null; // Declaración de un objeto Integer nulo

        // Operaciones con int
        int sum = i + 5;
        int product = i * 2;

        // Operaciones con Integer
        int result1 = j.intValue() + 5;
        int result2 = j.compareTo(new Integer(15));

        System.out.println("Suma de int: " + sum);
        System.out.println("Producto de int: " + product);
        System.out.println("Suma de Integer: " + result1);
        System.out.println("Comparación de Integer: " + result2);
    }
}