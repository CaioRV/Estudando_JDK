public class OperadoresClassificacao {
    public static void main (String [] args){

        int numero = 8;
        boolean mintir = true;

        numero++;
        // numero = numerp + 1;


        System.out.println(- numero);
        System.out.println(- ++ numero);
        System.out.print(! mintir);

        int a, b;
        a = 10;
        b = 10;

        String resultado = (a==b) ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        int primeiraA = 1;
        int segundaB = 2;

        if (primeiraA > segundaB)
            System.out.print("A é maior que B");

        if (primeiraA < segundaB)
                System.out.print("A Menor que B");

        if(primeiraA >= segundaB)
            System.out.print("A maior ou igual à B");

        if(primeiraA <= segundaB)
            System.out.print("A menor ou igual à B");

        if(primeiraA != segundaB)
            System.out.print("A é diferente de B");

    }
}
