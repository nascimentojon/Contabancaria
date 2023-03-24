package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a 
		//ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		//1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		//2: Listar todos os Clientes na fila
		//3: Chamar (retirar) uma pessoa da fila 
		//0: O programa deve ser finalizado. 
		//Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..
public class exerciciofila1 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
		Queue<String> fila = new LinkedList<String>();
		fila.add("Pedro");
		  fila.add("Luis");
		  fila.add("ana");
		  fila.add("Jonas");
		int op;
		do {
		 
			 
			
			  System.out.println("\nO que o usuario deseja sazer?: \nOpção 1:  Adicionar um novo Cliente... \nOpção 2: Listar todos os Clientes na fila... \nOpção 3: remover cliente \nOpção 0: finalizar");
				op = leia.nextInt();	
			 
			 switch (op) {
			 
			 case 1:
				 System.out.println("\nDigite o nome do cliente que seseja adicionar");
				 leia.nextLine();
			String nome = leia.nextLine();
			fila.add(nome);
			if (fila.contains(nome)) {
				System.out.println("\n cliente : "+nome+ "foi adicionado com sucesso");
			}
			
				 System.out.println("\nAdicionar um elemento na fila");
				 break;
			 case 2:System.out.println("\nA lista atual de clientes é: "+fila);
			 break ;
			 case 3:
				  System.out.println("\nRemova um cliente da lista"+fila.remove());
		     break;
			 case 0: 
				  System.out.println("\nObrigado por utilizar o melhor sistema existente");
				  break;}
			 }while (op!=0);
			 
			  
			   
			 
			 
			 
		 }
		 
		 
		
		}

	
