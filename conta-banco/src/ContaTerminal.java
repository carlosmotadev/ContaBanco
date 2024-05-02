import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
      
    System.out.println("Por favor, digite o número da conta:");
    int numeroConta = scanner.nextInt();
    
    scanner.nextLine();

    System.out.println("Por favor, digite o número da Agência!");
    String numeroAgencia = scanner.nextLine();

    System.out.println("Por favor, digite o nome do cliente:");
    String nomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o valor do saldo:");
    double saldoConta = scanner.nextDouble();

    System.out.println(
      "Olá ".concat(nomeCliente)
      .concat(" obrigado por criar uma conta em nosso banco, sua agência é ")
      .concat(numeroAgencia)
      .concat(", conta ")
      .concat(Integer.toString(numeroConta))
      .concat(" e seu saldo ")
      .concat(Double.toString(saldoConta))
      .concat(" já está disponível para saque.")
    );    
  }
}
