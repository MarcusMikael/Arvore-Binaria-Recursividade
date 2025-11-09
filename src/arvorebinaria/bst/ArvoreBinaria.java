/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvorebinaria.bst;

/**
 *
 * @author anail
 */
public class ArvoreBinaria {

    Node raiz; // Representa o inicio da arvaro.

    public void inserir(int valor) { // No caso, seria a função a ser chamada.
        raiz = inserirRecursivo(raiz, valor);
    }

    private Node inserirRecursivo(Node no, int valor) { // Node sera no(Seria basicamente o no atual).  
        if (no == null) { // Caso esteja vazio, o novo valor sera inserirdo.
            return new Node(valor);
        }

        // Valores menores: Esquerda
        // Valores maiores: Direita
        if (valor < no.valor) { // Se o no inserido for menor que a raiz ja existente, o no sera adicionado a esquerda.
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) { // Se não, caso o valor seja maior, sera adicionado na direita.
            no.direita = inserirRecursivo(no.direita, valor);
        }
        return no;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Node no, int valor) {
        if (no == null) {
            return false; // Se , retorna falso.
        }
        if (no.valor == valor) {
            return true; // Caso o valor a ser buscado, seja igual o valor de algum no, retorna verdadeiro. Ou seja, existe.
        }
        if (valor < no.valor) {
            return buscarRecursivo(no.esquerda, valor);// Se o valor a ser buscado for menor que o no atual(Onde está olhando), sera redirecionado a esquerda.
        } else //  Se não, vai para a direita, ou seja, é maior. 
        {
            return buscarRecursivo(no.direita, valor);
        }
    }

    public void preOrdem(Node no) {
        if (no != null) {
            System.out.print(no.valor + " "); // Raiz
            preOrdem(no.esquerda); // Valores a esquerda
            preOrdem(no.direita); //  Valores a direita
        }
    }

    public void emOrdem(Node no) {
        if (no != null) {
            emOrdem(no.esquerda); // Valores a esquerda
            System.out.print(no.valor + " "); // Raiz
            emOrdem(no.direita); // Valores a direita
        }
    }

    public void posOrdem(Node no) {
        if (no != null) {
            posOrdem(no.esquerda); // Valores a esquerda
            posOrdem(no.direita); // Valores a direita
            System.out.print(no.valor + " "); // Raiz
        }
    }

}
