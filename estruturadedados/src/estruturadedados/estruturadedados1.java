package estruturadedados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class estruturadedados1 {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		for(int i=0;i<=10;i++) {
			fila.add(i);
			
		}
		
                 System.out.println("\nElementos da fila: ");
                 System.out.println("\nRemova um elemento da fila"+fila.remove());
                 System.out.println("\nElemento da fila apos a remoção"+fila);
                 System.out.println("\nAdicionar um elemento na fila"+fila.add(11));
                 System.out.println("\nElemento da fila : "+fila);
                 System.out.println("\nPegar o primeiro elemento da fila: "+fila.peek());
                 System.out.println("\nPegar o tamanho da fila: "+fila.size());
                 System.out.println("\nVerificar um elemento na fila" +fila.contains(37));
                System.out.println("\nExibir e retirar primeiro elemento da fila: "+fila.poll());
                 
                 Iterator<Integer> Iterator =fila.iterator();
                 
                 while(Iterator.hasNext()) {
                	 System.out.println(Iterator.next());
                	 
                	
                 }
                 System.out.println("\nLimpar fila ");
                 fila.clear();
                 System.out.println("\n Verificar se a fila esta limpa (vazia): "+fila.isEmpty());
                 System.out.println("\nElementos da fila: "+fila);
                 
	}
	
	
	

}
