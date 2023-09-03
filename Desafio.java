import java.math.BigDecimal;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nome = "João Vitor Macedo";
        String tipoConta = "Corrente";
        int opcao;
        int loop = 1;
        double saldo = 1353.00;
        double transfer;

        System.out.println("""
                ********************
                Dados do cliente:
                NOME:"""+ nome+ """
                
                TIPO DA CONTA:""" + tipoConta+"""
                              
                ********************
                """);
        System.out.println("Olá " + nome + ", Segue as opções de operação a baixo: ");
        System.out.println("""
                1 - CONSULTA DE SALDO
                
                2 - TRANSFERÊNCIA
                
                3 - DEPÓSITO
                                             
                4 - SAQUE
                
                0 - CANCELAR OPERAÇÕES
                
                Por favor digite a opção desejada: """);
        opcao = read.nextInt();
        //O while controla as vezes que será repetido até que seja feita a escolha da case 0.

        while (loop == 1){
            switch (opcao){
                case 0:
                    System.out.println("""
                            Obrigado por ser nosso cliente, até a próxima!!""");
                    loop=0;
                    break;
                case 1:
                    System.out.println("Olá "+nome+", o saldo da sua conta é: "+ saldo+ """
                            
                            Obrigado por ser nosso cliente!!
                            
                            Deseja fazer outra operação?
                            DIGITE A OPERAÇÃO DESEJADA:""");
                    opcao = read.nextInt();
                    break;
                case 2:

                    System.out.println("Olá "+nome+", Digite o valor que irá ser TRANSFERIDO: ");
                    transfer = read.nextDouble();
                    if (saldo>transfer) {
                        saldo = saldo - transfer;
                        System.out.println("Olá "+nome+", o valor TRANSFERIDO foi de: "+ transfer+"Foi DEBITADO de sua conta, seu saldo atual é de: "
                                + saldo+ """
                                 
                                Obrigado por ser nosso cliente!!
                                
                                Deseja fazer outra operação?
                                DIGITE A OPERAÇÃO DESEJADA:""");
                            opcao = read.nextInt();

                    }else{
                        System.out.println("Valor inválido pois é menor que o saldo, Inserir valor maior que o saldo para a operação ocorra");
                        System.out.println("Digite a OPÇÃO DESEJADA");
                        opcao = read.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("Olá "+ nome +", Digite o valor que irá ser DEPOSITADO: ");
                    transfer = read.nextDouble();
                    saldo = saldo + transfer;
                    System.out.println("Olá "+ nome +", o valor transferido de: "+ transfer+ " " +
                            " Foi DEPOSITADO em sua conta, seu saldo atual é de: "
                            + saldo + """
                              
                            Obrigado por ser nosso cliente!!
                            
                            Deseja fazer outra operação?
                            DIGITE A OPERAÇÃO DESEJADA:""");
                    opcao = read.nextInt();
                    break;
                case 4:
                        System.out.println("Olá " + nome + ", Digite o valor que será feito o SAQUE: ");
                        transfer = read.nextDouble();
                    if (saldo>transfer) {
                        saldo = saldo - transfer;
                        System.out.println("Olá " + nome + ", o valor do SAQUE foi: " + transfer + """
                                                            
                                Foi DEBITADO de sua conta, seu saldo atual é de: """ + saldo + """
                                                            
                                Obrigado por ser nosso cliente!!
                                                            
                                Deseja fazer outra operação?
                                DIGITE A OPERAÇÃO DESEJADA:""");
                        opcao = read.nextInt();
                    }else{
                        System.out.println("Valor inválido pois é menor que o saldo, Inserir valor maior que o saldo para a operação ocorra");
                        System.out.println("Digite a OPÇÃO DESEJADA");
                        opcao = read.nextInt();
                    }
                    break;
                default:
                    System.out.println("OPÇÃO ESCOLHIDA NÃO EXISTENTE, TENTE OUTRA OPÇÃO");
                    opcao = read.nextInt();
                    break;
            }
        }

    }
}