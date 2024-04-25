import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Por favor, digite o número da Agência!");
        usuario.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o número da conta!");
        usuario.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome completo!");
        usuario.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o seu saldo!");
        usuario.setSaldo(scanner.nextDouble());

        System.out.println("Olá " + usuario.getNomeCliente() + ", obrigado por criar " +
                "uma conta em nosso banco, sua agência é " + usuario.getAgencia() + ", conta "
                + usuario.getNumero() + ", e seu saldo " + usuario.getSaldo() +
                " já está disponível para saque");

                
    }
}
