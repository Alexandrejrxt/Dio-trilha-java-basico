import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro parametro.");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o valor do segundo parametro.");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExceptions e) {
            System.out.println("ERROR " + e.getMessage());
        }
        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptions{
        if(parametroDois <= parametroUm){
            throw new ParametrosInvalidosExceptions();
        }

        for(int i = parametroUm + 1; i<= parametroDois; i++){
            System.out.println(i);
        }

    }
}
