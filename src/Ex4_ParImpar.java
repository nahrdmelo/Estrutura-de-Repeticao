import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParImpar {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPares++; // se o numero dividido 2 for igual a zero irá somar no par.
            else quantImpares++; // se o numero dividido por 2 o resto for diferente de zero irá somar no impar.

            count++; //count = count + 1
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
        
        }
    }
}