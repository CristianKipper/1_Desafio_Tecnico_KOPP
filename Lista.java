package modelo;

import java.util.ArrayList;
import java.util.List;

//Criando a classe Lista
public class Lista {

        private List<Double> listaValores;

        // Construtor para inicializar a Lista de valores
        public Lista() {
            listaValores = new ArrayList<>();
        }

        // Construtor para adicionar valores na Lista
        public void AddValor(double valor){
            listaValores.add(valor);
            System.out.print("Valor add ");
        }

        // Método para printar os valores contidos na Lista
        public String listarValores(){
            String resultado = "Remessa gerada:";

            for (int i = 0; i < listaValores.size(); i++) {
                int sequencia = i + 1;
                double valor = listaValores.get(i);
                 String valorS = String.format("%.2f", valor);
                 valorS = valorS.replace(".",",");
                if (i == listaValores.size() - 1) {
                    resultado = resultado + sequencia + " Cujo Valor é R$ " + valorS;
                } else {
                    resultado = resultado + sequencia + " Cujo Valor é R$ " + valorS + ", ";
                }
            }
            return  resultado;
        }

        // Método para realizar a soma dos valores contidos na Lista
         public String somarLista() {
            double soma = 0;
            String somaS = "0.00";

             for (int i = 0; i < listaValores.size(); i++) {
                 double valor = listaValores.get(i);
                 soma += valor;
                 somaS = String.format("%.2f", soma);

             }
             return somaS;
        }
}
