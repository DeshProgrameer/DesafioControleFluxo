import java.util.Scanner;

public class Contador  {


    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = terminal.nextInt();

        try {
            if (primeiroParametro > segundoParametro) {
                throw new ParametrosInvalidosException();
            }
            for (int i = primeiroParametro; i <= segundoParametro; i++) {
                System.out.println(i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }          
                int contagem = segundoParametro - primeiroParametro;
                for (int i = 0; i <= contagem; i++) {
                    System.out.println(primeiroParametro + i);
                }
            }
        
    }

