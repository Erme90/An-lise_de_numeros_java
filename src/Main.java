import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner lernum = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = lernum.nextInt();

        System.out.println("O número digita foi: "+num);

        //calculando resto da divisão
        int rest = num % 2;
        System.out.println("O resto de divisão é "+ rest);

        //Calculando raiz quadrada
        float raizq = (float) Math.sqrt(num);
        System.out.println("A raiz quadrada é: "+ raizq);

        //Calculando elevação ao cubo
        float cubo = (float) Math.pow(num,3);
        System.out.println("Elevado ao cubo é: "+cubo);

    }
}