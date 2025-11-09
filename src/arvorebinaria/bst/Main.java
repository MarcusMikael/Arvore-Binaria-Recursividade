/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arvorebinaria.bst;

/**
 *
 * @author anail
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(8);
        arvore.inserir(10);
        arvore.inserir(3);
        arvore.inserir(1);
        arvore.inserir(6);
        arvore.inserir(14);
        arvore.inserir(4);
        arvore.inserir(7);

        System.out.println("Buscar o numero 10: " + arvore.buscar(10)); // Tem que retorna true.
        System.out.println("Buscar o numero 9: " + arvore.buscar(9)); // Vai retorna false, pois não existe esse valor.

        // Pré-Ordem
        System.out.print("Pre-ordem: ");
        arvore.preOrdem(arvore.raiz);
        System.out.println();

        // Em-Ordem
        System.out.print("Em ordem: ");
        arvore.emOrdem(arvore.raiz);
        System.out.println();

        // Pós-Ordem
        System.out.print("Pos-ordem: ");
        arvore.posOrdem(arvore.raiz);
        System.out.println();
    }

}
