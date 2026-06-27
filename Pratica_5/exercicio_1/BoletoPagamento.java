import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BoletoPagamento implements PagamentoStrategy{
    
    private static final int DIAS_VENCIMENTO = 3;
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final String cpfCnpj;

    public BoletoPagamento(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    @Override
    public void pagar(double valor) {
        String codigoBoleto  = gerarCodigoBoleto();
        String dataVencimento = LocalDate.now()
                .plusDays(DIAS_VENCIMENTO)
                .format(FORMATTER);

        System.out.println("Pagamento via Boleto Bancário: ");
        System.out.printf("CPF/CNPJ: %s%n",         cpfCnpj);
        System.out.printf("Valor: R$ %.2f%n",         valor);
        System.out.printf("Código do boleto: %s%n",  codigoBoleto);
        System.out.printf("Vencimento: %s%n",         dataVencimento);
        System.out.println("Boleto gerado! Prazo: até " + DIAS_VENCIMENTO + " dias úteis após o pagamento.");
    }

    private String gerarCodigoBoleto() {
        // Código fictício apenas para demonstração
        return String.format("34191.79001 01043.510047 91020.150008 1 %d0000%07.0f",
                System.currentTimeMillis() % 10,
                Math.random() * 10_000_000);
    }

}
