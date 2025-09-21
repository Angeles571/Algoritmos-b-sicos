import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("¿Es 4 par? " + Algoritmos.esPar(4));
        System.out.println("¿Es 7 primo? " + Algoritmos.esPrimo(7));
        System.out.println("Reversa de 'Valdivia': " + Algoritmos.stringEnReversa("Valdivia"));
        System.out.println("¿Es 'Anita lava la tina' un palíndromo? " + Algoritmos.esPalindromo("Anita lava la tina"));
        System.out.println("Secuencia FizzBuzz hasta 15:");
        Algoritmos.secuenciaFizzBuzz(15);
    }
}
