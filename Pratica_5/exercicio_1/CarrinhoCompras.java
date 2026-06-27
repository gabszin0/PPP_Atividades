import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoCompras {
    
    private final List<Item> itens = new ArrayList<>();
    private PagamentoStrategy pagamentoStrategy;

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
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

    public void exibeCarrinho() {
        System.out.println("CARRINHO DE COMPRAS: ");
        if (itens.isEmpty()) {
            System.out.println("  (carrinho vazio)");
        } else {
            itens.forEach(System.out::println);
        }
        System.out.printf("TOTAL: R$ %.2f%n", calculaTotal());
       
    }

    public void realizaPagamento() {
        if (pagamentoStrategy == null) {
            throw new IllegalStateException("Nenhuma forma de pagamento foi selecionada.");
        }
        if (itens.isEmpty()) {
            throw new IllegalStateException("Não é possível pagar um carrinho vazio.");
        }

        double total = calculaTotal();
        pagamentoStrategy.pagar(total);
        itens.clear();
        System.out.println("Carrinho esvaziado após o pagamento.");
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
}


