public class ControleFluxo {
    public static void main (String [] args) {
        // Estrutura Condicional Simples
        double saldo = 25.5;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println("Condicional Simples: " + saldo);
        System.out.println("--------------------");

        // Estrutura Condicional Composta
        int valorNota = 6;

        if (valorNota >= 7)
            System.out.println("Condicional Composta: " + "Aprovado");
        else
            System.out.println("Condicional Composta: " + "Reprovado");
        System.out.println("--------------------");

        // Estrutura Condicional Encadeada
        int notaProva = 5;

        if (notaProva >= 7)
            System.out.println("Condicional Encadeada: " + "Aprovado");

        else if (notaProva >= 5 && notaProva < 7)
            System.out.println("Condicional Encadeada: " + "Repuperação");

        else
            System.out.println("Condicional Encadeada: " +"Reprovado");

    }
}
