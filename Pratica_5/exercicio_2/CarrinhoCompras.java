import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CarrinhoCompras {

    private final List<Item> itens = new ArrayList<>();

    private PagamentoStrategy pagamentoStrategy;
    private FreteStrategy     freteStrategy;


    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public void adicionaItem(Item item) {
        if (item == null) throw new IllegalArgumentException("Item não pode ser nulo.");
        itens.add(item);
        System.out.printf("[Carrinho] Item adicionado: %s%n", item.getNome());
    }

    public boolean removeItem(String nomeItem) {
        boolean removido = itens.removeIf(i -> i.getNome().equalsIgnoreCase(nomeItem));
        if (removido) {
            System.out.printf("[Carrinho] Item removido: %s%n", nomeItem);
        } else {
            System.out.printf("[Carrinho] Item não encontrado: %s%n", nomeItem);
        }
        return removido;
    }

    public double calculaTotal() {
        return itens.stream()
                    .mapToDouble(Item::getSubtotal)
                    .sum();
    }

    public double calculaFrete() {
        if (freteStrategy == null) {
            throw new IllegalStateException("Nenhuma modalidade de frete foi selecionada.");
        }
        if (itens.isEmpty()) {
            throw new IllegalStateException("Carrinho vazio — não há o que entregar.");
        }

        double pesoTotal = itens.stream()
                               .mapToDouble(Item::getPesoTotal)
                               .sum();

        double valorFrete = freteStrategy.calcularFrete(pesoTotal);

        System.out.printf("[Frete] Modalidade : %s%n",          freteStrategy.getNome());
        System.out.printf("[Frete] Peso total : %.2f kg%n",     pesoTotal);
        System.out.printf("[Frete] Prazo      : %d dia(s) útil(is)%n", freteStrategy.getPrazoUteis());
        System.out.printf("[Frete] Valor      : R$ %.2f%n",     valorFrete);

        return valorFrete;
    }

    public void exibeCarrinho() {
        System.out.println("CARRINHO DE COMPRAS: ");
        if (itens.isEmpty()) {
            System.out.println("  (carrinho vazio)");
        }

        double subtotal = calculaTotal();
        System.out.printf("  Subtotal produtos : R$ %.2f%n", subtotal);

        if (freteStrategy != null && !itens.isEmpty()) {
            double frete = freteStrategy.calcularFrete(
                    itens.stream().mapToDouble(Item::getPesoTotal).sum());
            System.out.printf("  Frete (%s)%s: R$ %.2f%n",
                    freteStrategy.getNome(),
                    " ".repeat(Math.max(1, 12 - freteStrategy.getNome().length())),
                    frete);
            System.out.printf("  TOTAL GERAL       : R$ %.2f%n", subtotal + frete);
        } else {
            System.out.printf("  TOTAL (sem frete) : R$ %.2f%n", subtotal);
        }
    }

    public void realizaPagamento() {
        if (pagamentoStrategy == null) {
            throw new IllegalStateException("Nenhuma forma de pagamento foi selecionada.");
        }
        if (freteStrategy == null) {
            throw new IllegalStateException("Nenhuma modalidade de frete foi selecionada.");
        }
        if (itens.isEmpty()) {
            throw new IllegalStateException("Não é possível pagar um carrinho vazio.");
        }

        double totalProdutos = calculaTotal();
        double totalFrete    = calculaFrete();
        double totalGeral    = totalProdutos + totalFrete;

        System.out.println();
        pagamentoStrategy.pagar(totalGeral);
        itens.clear();
        System.out.println("Carrinho esvaziado após o pagamento.\n");
    }


    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
}
