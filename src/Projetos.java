import java.util.Scanner;

public class Projetos {

//Algoritmo capaz de dar o resultado de eficiencia e eficacia de uma producao e classifica-las.
    public static void main(String[] args){
        System.out.println("EFICIENCIA E EFICACIA");

        //SCANNERS
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva sua meta de vendas: ");
        float meta = sc.nextFloat();

        System.out.print("Escreva sua Produção Total: ");
        float pt = sc.nextFloat();

        System.out.print("Escreva sua Produção Conforme: ");
        float pc = sc.nextFloat();

        sc.close();

        //CALCULOS PARA EFICIENCIA E EFICACIA

        System.out.print("Sua eficiencia foi de: "+ (pc/pt)*100 +"%");
    }
}
