import java.util.Scanner;

public class Projetos {

//Algoritmo capaz de dar o resultado de eficiencia e eficacia de uma producao e classifica-las.
    public static void main(String[] args){
        System.out.println("EFICIENCIA E EFICACIA");
        System.out.println();

        //SCANNERS
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva sua meta de vendas: ");
        float mv = sc.nextFloat();

        System.out.print("Escreva sua Produção Total: ");
        float pt = sc.nextFloat();

        System.out.print("Escreva sua Produção Conforme: ");
        float pc = sc.nextFloat();

        sc.close();

        //CALCULOS PARA EFICIENCIA E EFICACIA

        float eficiencia = (pc/pt)*100;
        float eficacia = (pc/mv)*100;

        System.out.println();
        System.out.println("Sua Eficiencia foi de: "+ eficiencia +"%");
        System.out.println("Sua Eficacia foi de: "+ eficacia +"%");
        System.out.println();

        //Sistema de classificação

        //Transformando em categorias
        int ef = (eficiencia >= 50) ? 1 : 0;
        int ec = (eficacia >= 50) ? 1 : 0;

        String situacao;

        //Combinação usando switch

        switch (ef * 10 + ec){
            case 0:
                situacao = "Desastroso";
                break;
            case 1:
                situacao = "Oneroso" ;
                break;
            case 10:
                situacao = "Enganoso";
                break;
            case 11:
                situacao = "Ideal" ;
                break;
            default:
                situacao = "Indefinido";
        }
        System.out.println("Situação: "+ situacao);
    }
}
