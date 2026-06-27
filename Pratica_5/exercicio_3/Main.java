public class Main {

    public static void main(String[] args) {

        CentralEstacaoTempo cet = new CentralEstacaoTempo();

        PrefeituraUberlandia prefeitura = new PrefeituraUberlandia();
        AeroportoUberlandia  aeroporto  = new AeroportoUberlandia();

        cet.adicionarObserver(prefeitura);
        cet.adicionarObserver(aeroporto);

        separador("Leitura 1 — Condições brandas");
        cet.setDados(26.0, 55.0, 18.0);

        separador("Leitura 2 — Umidade baixa, vento moderado");
        cet.setDados(32.0, 25.0, 38.0);

        separador("Leitura 3 — Umidade crítica e rajadas fortes");
        cet.setDados(38.5, 9.0, 70.0);

        separador("Leitura 4 — Umidade muito baixa, vento perigoso");
        cet.setDados(40.0, 15.0, 80.0);


        System.out.println();
        System.out.println(">>> Aeroporto encerra recebimento de dados da CET <<<");
        cet.removerObserver(aeroporto);

        separador("Leitura 5 — Apenas a Prefeitura ainda inscrita");
        cet.setDados(29.0, 11.0, 90.0);   // Aeroporto NÃO deve ser notificado
    }

    private static void separador(String titulo) {
        System.out.println();
        System.out.printf (" %-52s %n", titulo);
    }
}
