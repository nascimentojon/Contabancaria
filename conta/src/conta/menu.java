package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.contaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.cores;

public class menu {

	public static void main(String[] args) {
		contaController contas = new contaController();
		
		
		Scanner leia = new Scanner (System.in);
		
		int opcao,numero,agencia,tipo,aniversario;
		String titular;
		float saldo,limite;
		
		System.out.println("\nCriar contas\n");
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(),123,1,"João da silva",1000f,100.0f);
		contas.cadastrar(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(),124,1,"Maria da Silva",2000f,100.0f);
		contas.cadastrar(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(),125,2,"Mariana dos Santos",4000f,12);
		contas.cadastrar(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(),125,2,"Juliana Ramos",8000f,15);
		contas.cadastrar(cp2);
		
		contas.listarTodas();
		
		
		try {
			opcao = leia.nextInt();
		} catch (InputMismatchException e ){
			System.out.println("nDigite Valores inteiros! ");
			leia.nextLine();
			opcao = 0;
			
		}
		
		
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO GAMER                          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			
			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(cores.TEXT_WHITE+"Criar Conta\n\n");
                      System.out.println("Digite o numero da Agencia: ");
                      agencia = leia.nextInt();
                      System.out.println("Digite o nome do Titular: ");
                      leia.skip("\\R?");
                      titular = leia.nextLine();
                      
                      do {
                    	  System.out.println("Digite o Tipo da conta (1-cc ou 2-cp): ");
                    	  tipo = leia.nextInt();
                      }while(tipo< 1 && tipo>2);
                      
                      System.out.println("Digite o saldo da conta (R$): ");
                      saldo = leia.nextFloat();
                      
                      
                          switch(tipo) {
                          case 1->{
                        	  System.out.println("Digite o limite de credito (R$)");
                        	  limite = leia.nextFloat();
                        	  contas.cadastrar(new ContaCorrente(contas.gerarNumero(),agencia,tipo,titular,saldo,limite));
                          }case 2 ->{
                        	  System.out.println("Digite o dia do aniversario da conta:");
                        	  aniversario = leia.nextInt();
                        	  contas.cadastrar(new ContaPoupanca(contas.gerarNumero(),agencia,tipo,titular,saldo,aniversario));
                        	  }
                          }
                      keyPress();    
					break;
				case 2:
					System.out.println(cores.TEXT_WHITE+"Listar todas as Contas\n\n");
                    contas.listarTodas();
                    keyPress();
					break;
				case 3:
					System.out.println(cores.TEXT_WHITE+"Consultar dados da Conta - por número\n\n");
                       System.out.println("Digite o munero da conta: ");
                       numero = leia.nextInt();
                       
                       contas.procurarPorNumero(numero);
                       
                       keyPress();
					break;
				case 4:
					System.out.println(cores.TEXT_WHITE+"Atualizar dados da Conta\n\n");
					
                    System.out.println("Digite o numero da conta");
                    numero = leia.nextInt();
                    
                    if (contas.buscarNaCollection(numero)!=null) {
                    	
                    	System.out.println("Digite o numero da agencia: ");
                    	agencia = leia.nextInt();
                    	System.out.println("Digite o nome do titular: ");
                    	titular = leia.nextLine();
                    	
                    	System.out.println("Digite o saldo da conta (R$): ");
                    	saldo = leia.nextFloat();
                    	
                    	tipo = contas.retornaTipo(numero);
                    	
                        switch (tipo) {
                        case 1->{
                        	System.out.println("Digite o limote de cretido (R$): ");
                        	limite = leia.nextFloat();
                        	contas.atualizar(new ContaCorrente(numero,agencia,tipo,titular,saldo,limite));
                        }
                        case 2->{
                        	System.out.println("Digite o dia do aniversario da Conta: ");
                        	aniversario = leia.nextInt();
                        	contas.atualizar(new ContaPoupanca(numero,agencia,tipo,titular,saldo,aniversario));
                        }
                        default ->{
                        	System.out.println("Tipo de conta invalida! ");
                        }
                        }
                    }else
                    	System.out.println("\nConta não encontrada!");
                    keyPress();
					break;
				case 5:
					System.out.println(cores.TEXT_WHITE+"Apagar a Conta\n\n");
                     System.out.println("Digite o numero da conta: ");
                     numero = leia.nextInt();
                     
                     contas.deletar(numero);
                     
                     keyPress();
					break;
				case 6:
					System.out.println(cores.TEXT_WHITE+"Saque\n\n");

					break;
				case 7:
					System.out.println(cores.TEXT_WHITE+"Depósito\n\n");

					break;
				case 8:
					System.out.println("Transferência entre Contas\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
					
			}
		}
		}
		public static void keyPress () {
			try {
				    System.out.println(cores.TEXT_RESET + "\n\npressione enter para continuar... ");
				    System.in.read();
			} catch (IOException e ) {
				System.out.println(" voce pressionou um tecla diferente de enter!");
			}
		}

	}


