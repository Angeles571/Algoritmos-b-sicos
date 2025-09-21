package clases;
public class Algoritmos {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static String stringEnReversa(String texto) {
        StringBuilder reversa = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            reversa.append(texto.charAt(i));
        }
        return reversa.toString();
    }

    public static boolean esPalindromo(String texto) {
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        return limpio.equals(stringEnReversa(limpio));
    }

    public static void secuenciaFizzBuzz(int limite) {
        for (int i = 1; i <= limite; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

