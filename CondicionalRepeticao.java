import java.util.Scanner;

public class CondicionalRepeticao {
    public static void main (String [] args) {

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println(carneirinhos);
        }
        System.out.println("-----------------------------------");
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        for (int num = 1; num <=  5; num++) {
            if(num == 3)
                break;

        System.out.println(num);
        }
        System.out.print("----------------------------------------");
        Scanner naturalNum = new Scanner(System.in);
        System.out.print("Enter The Starting Number: ");
        int s = naturalNum.nextInt();
        System.out.print("Enter The Ending Number: ");
        int e =naturalNum.nextInt();
        while(s >= e) {
            System.out.println(s);
            s--;
        }
    }
}