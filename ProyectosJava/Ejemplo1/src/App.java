package Ejemplo1.src;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 1, b = 2, c = 10, suma = 0, i = 0;
        do {
            suma += a + b;
            System.out.println(suma);
            i++;
        } while (i != c);
    }
}
