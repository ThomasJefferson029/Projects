import java.util.Scanner;

public class pratica {

    public static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
    public static int calcularQuadrado(int a) {
        return a*a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva seu nome de Usuario: ");
        String nome = sc.nextLine();

        exibirMensagem("Olá, " + nome + "! Seja bem-vindo ao sistema!");

        System.out.println("Escreva o Numero que deseja saber o Quadrado: ");
        int a = sc.nextInt();
        sc.close();

        int resultado = calcularQuadrado(a);
        System.out.println("O resultado do quadrado é: " + resultado);
    }
}
