# 🌳 Árvore Binária de Busca (BST) com Recursividade

Implementação de uma **Árvore Binária de Busca (Binary Search Tree)** em Java, utilizando **recursividade** para as operações de inserção, busca e percorrência (pré-ordem, em ordem e pós-ordem).

---

## 🧠 Conceitos

### 🔹 O que é recursividade?
É um objeto que se define em si próprio, ou seja, uma função que chama ela mesma repetidamente até a sua resolução (final).

---

### 🔹 Como a recursividade é usada em uma árvore binária?
Na árvore binária, cada nó possui dois filhos, com isso, para percorrer todos esses nós se usa a recursividade, pois cada subárvore é, por si só, uma árvore binária.

---

### 🔹 Diferença entre recursão e laço (for/while)
A recursão possui uma estrutura de dados embutida nela, coisa que o loop (`for`/`while`) não tem.  
Ou seja, para cada chamada da função há uma cópia separada de cada uma das variáveis, e o loop (`for`/`while`) tem que criar uma estrutura auxiliar, como uma pilha.

---

## ⚙️ Estrutura do Projeto

src/
├── Node.java
├── ArvoreBinaria.java
└── Main.java

---

## 🧩 Implementação

### **Main.java**

```java
public class Main {
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

        System.out.println("Buscar o numero 10: " + arvore.buscar(10)); // Tem que retornar true.
        System.out.println("Buscar o numero 9: " + arvore.buscar(9));   // Vai retornar false, pois não existe esse valor.

        // Pré-Ordem
        System.out.print("Pre-ordem: ");
        arvore.preOrdem(arvore.raiz);
        System.out.println();
    }
}
```
🖼️ Saída (Pré-Ordem):
<img width="1309" height="830" alt="Pré-ordem" src="https://github.com/user-attachments/assets/32d22247-b766-4896-a2ba-072b25b001e5" />
```java
// Em-Ordem
System.out.print("Em ordem: ");
arvore.emOrdem(arvore.raiz);
System.out.println();
```
🖼️ Saída (Em-Ordem):
<img width="1309" height="830" alt="Em ordem" src="https://github.com/user-attachments/assets/d41d0e8b-b0a7-4a68-8c66-31970a20be7b" />
```java
// Pós-Ordem
System.out.print("Pos-ordem: ");
arvore.posOrdem(arvore.raiz);
System.out.println();
```
🖼️ Saída (Pós-Ordem):
<img width="1309" height="830" alt="Pós-ordem" src="https://github.com/user-attachments/assets/6a854836-77c3-4cf9-b0d7-53c9bc874441" />
```
✍️ Autor
Marcus Mikael Rodrigues 
