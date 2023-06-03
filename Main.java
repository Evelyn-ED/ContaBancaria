import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int opc;
        int escolher;

        Scanner sc = new Scanner (System . in);
        Scanner sc2 = new Scanner (System . in);

        ContaBancaria cb = new ContaBancaria();
        ContaBancaria cb2 = new ContaBancaria();

        cb.lerConta();
        cb2.lerConta();

        do{
            System.out.println("---------- MENU ----------");
            System.out.println("1 - SACAR");
            System.out.println("2 - DEPOSITAR");
            System.out.println("3 - VER SALDO");
            System.out.println("4 - FINALIZAR");
            opc = sc.nextInt();

            switch (opc){
                case 1 :
                System.out.println("De qual conta você deseja sacar? 1 ou 2?");
                escolher = sc2.nextInt();

                if(escolher == 1){
                    cb.sacar();
                }else{
                    cb2.sacar();
                }
                break;

                case 2:
                System.out.println("Em qual conta você deseja depositar dinheiro? 1 ou 2?");
                escolher = sc2.nextInt();

                if(escolher == 1){
                    cb.depositar();
                }else{
                    cb2.depositar();
                }
                break;

                case 3:
                System.out.println("De qual das contas você deseja ver o saldo? 1 ou 2?");
                escolher = sc.nextInt();

                if(escolher == 1){
                    cb.consultarSaldo();
                }else{
                    cb2.consultarSaldo();
                }
                break;

                case 4 :
                System.out.println("Operações bancárias realizadas com sucesso!!! Obrigada por utilizar nosso sistema!");
                break;
                default:
                    System.out.println("Ops!! Você digitou uma opção inválida! Por favor, digite novamente:");

            }

        }while(opc != 4);

        }
     }
