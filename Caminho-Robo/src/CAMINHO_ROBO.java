import java.util.Scanner;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class CAMINHO_ROBO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String direcao;
		int blocos=0, passos, bateria=25;
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Seja bem vindo! ");
		System.out.println("at� o final, sem que bata em nenhuma parede e em que a autonomia de sua");
		System.out.println("bateria acabe.");
		System.out.println("Voc� primeiro ir� escolher a dire��o que ir� andar, depois escolher�");
		System.out.println("a quantidade de blocos que ir� deslocar!");
		System.out.println();
		System.out.println("O robo tem 50W de potencia, a cada bloco, voc� ir� usar 5w de potencia, use com sabedoria! ");
		
		System.out.println("Vamos come�ar?");
		
		do {
			System.out.println("Escolha a dire��o que ir� come�ar:");
			System.out.println("Cima | Direita | Baixo | Esquerda");
			direcao = tec.next();
			if (!direcao.equalsIgnoreCase("baixo"))System.out.println("Por ai n�o d�!Digite outra dire��o.\n");
			
		}while (!direcao.equalsIgnoreCase("baixo"));
		System.out.println("Dire��o certa");
		do	{
			System.out.println("Quantos blocos voc� deseja andar?");
			passos = tec.nextInt();
			blocos = blocos+passos;
			if (passos<0){
				System.out.println("N�o pode andar -1, n�o ter� autonomia para bateria!");
				blocos = blocos-passos;
			}else if(passos>3||blocos>3){
				System.out.println("Assim voc� vai bater o carrinho, isso n�o pode\n");
				blocos = blocos-passos;
			}else {
				bateria = bateria-passos*5;
				if (blocos<3) {System.out.println("Ande mais! Por enquanto voc� tem " + bateria +("W de bateria"));
			
					do {
					System.out.println("Escolha a dire��o que ir� continuar:");
					direcao = tec.next();
					if (!direcao.equalsIgnoreCase("baixo"))System.out.println("Por ai n�o d�!Digite outra dire��o.\n");
				
					}while (!direcao.equalsIgnoreCase("baixo"));
				}
			}
		}while (blocos!=3);
		
		
		blocos=0;
		System.out.println("Chegou no limite para baixo.Por enquanto voc� tem " + bateria +("W de bateria"));
		
		
		do {
			System.out.println("Escolha a dire��o que ir� continuar:");
			direcao = tec.next();
			if (!direcao.equalsIgnoreCase("direita"))System.out.println("\nPor ai n�o d�!Digite outra dire��o.");
			
		}while (!direcao.equalsIgnoreCase("direita"));
		System.out.println("Dire��o certa");
		
		
		do	{
			System.out.println("Quantos blocos voc� deseja andar?");
			passos = tec.nextInt();
			blocos = blocos+passos;
			if (passos<0){
				System.out.println("N�o pode andar -1, n�o ter� autonomia para bateria!");
				blocos = blocos-passos;
			}else if(passos>2||blocos>2){
				System.out.println("Assim voc� vai bater o carrinho, isso n�o pode\n");
				blocos = blocos-passos;
			}else {
				bateria = bateria-passos*5;
				if (blocos<2) {System.out.println("Ande mais! Por enquanto voc� tem " + bateria +("W de bateria"));
			
					do {
					System.out.println("Escolha a dire��o que ir� continuar:");
					direcao = tec.next();
					if (!direcao.equalsIgnoreCase("direita"))System.out.println("\nPor ai n�o d�!Digite outra dire��o.");
				
					}while (!direcao.equalsIgnoreCase("direita"));
				}
			}
		}while (blocos!=2);
		
		System.out.println("AUTONOMIA DA BATERIA = " +bateria + "W");
		System.out.println("Voc� chegou no seu objetivo! Parab�ns!!!");
		
		System.out.println("");
		System.out.println("Gabriel de Souza Valls - RM 95590");
		System.out.println("Guilherme Ribeiro Fiochi - RM 95508");
		System.out.println("Kaio dos Santos Valls - RM 94685");
		System.out.println("Luana Fumes de Aquino - RM 93074");
		System.out.println("Yasmin de Almeida Lins - RM 96070");
	}
	
	
	
		
}


