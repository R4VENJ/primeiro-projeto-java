import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        System.out.println(numeros);
        for (int i=0; i < numeros.length; i++) {
            numeros[i] = i+1;
            System.out.println(numeros[i]);
        }
        String[] letras = {"A", "B", "C", "D", "E", "F",};
        System.out.println(letras);
        for (int i=0; i < numeros.length; i++) {
            System.out.println(letras[i]);
        }
            System.out.println(Arrays.toString(letras));
        int[] numeros2 = {9, 10, 12, 25, 2};
        int maior = numeros2 [0];
        int menor = numeros2 [0];
        int media = 0;
        for (int i=0; i < numeros2.length; i++) {
            if (numeros2[i] > maior) {
                maior = numeros2[i];
            }
            if (numeros2[i] < menor) {
                menor = numeros2[i];
            }
            media += numeros2[i];
        }
        media = media / numeros2.length;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
    }
}
