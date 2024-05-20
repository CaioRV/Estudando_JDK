import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        int cont = 0;
        while (cont <= 10) {
            System.out.println(cont + " - 1 Day, 100 From Now");
            cont++;
        }

        System.out.println("_______-------_______-------");
        // Do While
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        }
        while(tocando());
            System.out.println("Alô!");
        }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;

        // int num = 5, count = 1;
        //        do {
        //            num += count;
        //            System.out.println(num);
        //        } while (count <= 3);
    }
}