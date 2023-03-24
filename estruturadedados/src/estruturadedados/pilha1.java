package estruturadedados;

import java.util.Iterator;
import java.util.Stack;

public class pilha1 {

	public static void main(String[] args) {
		
		Stack<String> pilha =new Stack<String>();
		pilha.push("prato preto");
		pilha.push("prato rosa");
		pilha.push("prato azul");
		pilha.push("prato branco");
		pilha.push("prato roxo");
		
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nElemento no top da pilha: "+pilha.peek());
		System.out.println("\n Adcionar um elemento na pilha chamado prato amarelo"+pilha.push("prato amarelo"));
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nTamanho da pilha: "+pilha.size());
		System.out.println("\nVerificar um elemento na pilha: "+pilha.contains(" prato roxo"));
		System.out.println("\nExibir todos os elementos da minha pilha....: ");
		
		Iterator<String> iterator = pilha.iterator();
		
	}

}
