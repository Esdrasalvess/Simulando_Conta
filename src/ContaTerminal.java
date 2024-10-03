import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		
		String Agencia, NomeDoCliente;
		int numero;
		double saldo;

		
		
		System.out.print("Digite o nome do cliente: ");
		NomeDoCliente = sc.nextLine();
		
		System.out.print("Digite a agência: ");
		Agencia = sc.nextLine();
		
		System.out.print("Digite o número da Agência: ");
		numero = sc.nextInt(); 
		
		
		
		System.out.print("Digite o saldo: ");
		saldo = sc.nextDouble();
		
		
		System.out.println("Olá " + NomeDoCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + "conta: " + numero + " e seu saldo é " + saldo);
		
		sc.close();

	}

}
