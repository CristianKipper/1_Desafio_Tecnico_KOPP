import java.util.Scanner;
import modelo.Lista;

//Criando a class Main
public class Main{

    public static void main(String[] args) {

        // Cria uma instância de Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();

        System.out.print("----- SISTEMA DE CONTROLE DE REMESSAS -----");
        System.out.print("\n");

        while(true) { //Criando um laço de repetição
            System.out.print("Pressione (A) para Adicionar um novo número a Lista.");
            System.out.print("\n");
            System.out.print("Pressione (R) para ver o Relatório com todos os números da Lista junto a Soma dos mesmos.");
            System.out.print("\n");
            System.out.print("Pressione (S) para sair do Sistema.");
            System.out.print("\n");
            System.out.print("Digite sua escolha:  ");
            String texto = scanner.next();

            double numero = 0;

            if (texto.equals("A") || texto.equals("a")) { // Lê o número que o usuário digitou e adiciona na Lista de Valores
                System.out.print("Digite um número: ");
                numero = scanner.nextDouble();
                System.out.print("\n");
                lista.AddValor(numero);
            } else if (texto.equals("R") || texto.equals("r")) { // Gera um Relatório com todos os números da Lista junto a Soma dos mesmos.
                System.out.print("\n");
                System.out.println(lista.listarValores() + "." + " Total = R$ " + lista.somarLista() + ".");
                System.out.print("\n");
            } else if (texto.equals("S") || texto.equals("s")) { // Sai do sistema.
                break;
            } else { // Gera um alerta sobre a escolha da opção.
                System.out.print("\n");
                System.out.println("A letra dígitada não corresponde a nenhuma das opções!");
                System.out.print("\n");
            }
        }
    }
}