package Ejemplo1.src;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 1, b = 2, c = 10, suma = 0, i = 0;
        while (i != c)
        {
            suma += a + b;
            System.out.println(suma);
            i++;
        } 
        // Profe, lo hice con do while y funcionaba, tambien en C#, aqui no se
        // porque pero en teoria deberia correr, gracias de antemano
    }
}
