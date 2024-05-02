public class TiposEVariaveis {
    public static void main (String [] args) {
        int umPouco = 200000000;
        long doisMuito = 255665655L;
        double outroNumero = 2.5;
        final float NUMERO_RACIONAL = 6.4F;
        byte bitOito= 8;
        short pequenoNum = 24;

        System.out.println(doisMuito - umPouco);
        System.out.println(outroNumero + NUMERO_RACIONAL);
        System.out.println(pequenoNum / bitOito);

        outroNumero = 4.6;

        System.out.println(outroNumero + NUMERO_RACIONAL);

        String meuNome = "Caio";
        char darNota = 'B';
        boolean alunoMedio = true;

        System.out.println(meuNome + " - " + "Aluno Nota: " + darNota + " - " + alunoMedio);
    }
}