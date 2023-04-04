package conta.controller;
import java.util.ArrayList;
import conta.model.conta;
import conta.repository.ContaRepository;

public class contaController implements ContaRepository{
    
	private ArrayList<conta> listaContas = new ArrayList<conta>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection (numero);
		
		if (conta !=null)
			conta.visualizar();
		else
			System.out.println("\nA conta numero: "+numero+" não foi encontrada! ");
		
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			 conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(conta conta) {
		listaContas.add(conta);
		System.out.println("\nA conta numero: " + conta.getNumero() + "foi criada com sucesso!");
		
	}
	@Override
	public void atualizar(conta conta) {
		var buscarConta =buscarNaCollection(conta.getNumero());
		
		if (buscarConta !=null) {
			listaContas.set(listaContas.indexOf(buscarConta),conta);
			System.out.println("\nA conta numero: "+conta.getNumero()+" foiatualizada com sucesso! ");
		}else 
			System.out.println("\nA Conta numero: "+conta.getNumero()+ "não foi encontrada!");
		   
	}
		
	

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if(listaContas.remove(conta)== true)
				System.out.println("\nA Conta numero: "+ numero + " foi deletada com sucesso!");
			
		}else
			System.out.println("\nA Conta numero: "+ numero + " não foi encontrada!");
		
		
	}

	@Override
	public void sacar(int numero, float valor) {
		
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
    public int gerarNumero() {
    	return ++ numero;
    }

  
    public conta buscarNaCollection (int numero) {
    	for (var conta: listaContas) {
    		if (conta.getNumero()== numero) {
    			return conta;
    		}
    	}
    	return null;
    }
    public int retornaTipo(int numero) {
    	for (var conta: listaContas) {
    		if (conta.getNumero()== numero) {
    			return conta.getTipo();
    		}
    	}
    	return 0;
    }
}