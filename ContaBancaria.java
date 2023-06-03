import java.util.Scanner;
public class ContaBancaria {
    int numConta;
    double saldo;
    String donoConta;
    double deposito;
    double valorPlusDep;
    double valorSacado;
    double saque;
  
    Scanner sc = new Scanner(System . in);
    Scanner sc2 = new Scanner(System . in);

    void consultarSaldo(){
        System.out.println("O saldo da sua conta bancária é:"+saldo);
    }

    void lerConta(){

        System.out.println("Qual é o número da sua conta bancária?");
        numConta = sc.nextInt();

        System.out.println("Qual é o seu saldo total da conta bancária?");
        saldo = sc.nextDouble();

        System.out.println("Digite seu nome completo:");
        donoConta = sc2.nextLine();
    }

    void depositar(){
        System.out.println("Quanto você deseja depositar?");
        deposito = sc.nextDouble();
        valorPlusDep = saldo + deposito;
        System.out.println("Depósito efetuado!");
        System.out.println("O valor final da sua conta bancária ficou em: " +valorPlusDep);

    }

    void sacar(){

        System.out.println("Qual valor você deseja sacar?");
        saque = sc.nextDouble();

        valorSacado = saldo - valorSacado;

        if(saque > saldo){
           System.out.println("Não é possível realizar o saque, pois o valor a ser sacado é superior ao valor disponível na sua conta bancária.");

        }else{
            System.out.println("Saque liberado!!!");
            System.out.println("O valor da sua conta bancária depois do saque é de :"+valorSacado);
        }
    }
}
