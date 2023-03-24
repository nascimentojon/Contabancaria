package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class ecxercicio1Pilha {

	public static void main(String[] args) {
		// Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar
		//a retirada de livros em uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		//1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
		//2: Listar todos os livros da Pilha
		//3: Retirar um livro da pilha 
		//0: O programa deve ser finalizado. 
		//Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
         Stack<String> livro = new Stack<String>();
         Scanner leia = new Scanner (System.in);
         
         
         livro.push("Zelda");
         livro.push("Mario Kart");
         livro.push("Kurb");
         livro.push("Metroid");
         livro.push("Pokemon");
         
         int opçao;
            do {
            	
         System.out.println("\nO que o usuario deseja fazer?: \nOpção 1:  Adicionar um novo livro... \nOpção 2: Listar todos os livros ... \nOpção 3: remover um livro \nOpção 0: finalizar");
         opçao = leia.nextInt();
         
         switch (opçao) {
         case 1: 
        	 
      System.out.println("\nDigite o nome do livro que deseja adicionar: ");
       leia.nextLine();
     	String nome = leia.nextLine();
        livro.push(nome);
        	  if(livro.contains(nome)) {
        		  System.out.println("\nLivre: "+nome+" foi adicionado com sucesso. ");
        	  }
         case 2: System.out.println("\nA lista de livros atualizado é: "+livro);
             break;
         case 3:
        	 System.out.println("\nRemovendo um livro da lista"+livro.pop());
        	 break;
         case 0:
        	 System.out.println("\n obrigado por utilizar a melhor livraria do mundo... ");
        	 break;
         }
         }while (opçao !=0); {
         
            }
		
            }

}
