# Padrão Decorator - Sistema de Cafeteria

## Descrição
Implementação do padrão estrutural **Decorator** em Java para um sistema de cafeteria. Este padrão permite adicionar responsabilidades dinamicamente a objetos, sem alterar suas estruturas.

## Estrutura

### Interface Principal
- **Bebida.java**: Interface que define o contrato para bebidas com métodos `calculaCusto()` e `getDescricao()`

### Bebidas Base (Concretas)
- **Espresso.java**: Bebida base com custo de R$ 3,50
- **Decaf.java**: Bebida base com custo de R$ 3,00

### Classe Abstrata
- **Decorador.java**: Classe abstrata que implementa `Bebida` e encapsula outra `Bebida` para adicionar funcionalidades

### Decoradores Concretos
- **LeiteDecorador.java**: Adiciona leite (+R$ 1,50)
- **CanelaDecorador.java**: Adiciona canela (+R$ 0,75)
- **ChocolateDecorador.java**: Adiciona chocolate (+R$ 1,25)
- **CarameloDecorador.java**: Adiciona calda de caramelo (+R$ 0,90)
- **ChantillyDecorador.java**: Adiciona chantilly (+R$ 1,00)

### Classe de Demonstração
- **Cafeteria.java**: Classe principal com método `main()` que demonstra o funcionamento do padrão

## Como Funciona

O padrão Decorator funciona envolvendo um objeto `Bebida` com decoradores que adicionam funcionalidades:

```java
// Espresso simples
Bebida bebida1 = new Espresso();

// Espresso com leite
Bebida bebida2 = new LeiteDecorador(new Espresso());

// Espresso com leite e canela
Bebida bebida3 = new CanelaDecorador(
    new LeiteDecorador(new Espresso())
);

// Espresso com leite, canela e chocolate
Bebida bebida4 = new ChocolateDecorador(
    new CanelaDecorador(
        new LeiteDecorador(new Espresso())
    )
);
```

## Vantagens do Padrão

1. **Flexibilidade**: Combinações dinâmicas de decorações
2. **Princípio Aberto/Fechado**: Aberto para extensão (novos decoradores), fechado para modificação
3. **Responsabilidade Única**: Cada classe tem uma responsabilidade bem definida
4. **Reutilização**: Decoradores podem ser combinados de várias formas

## Compilação e Execução

```bash
# Compilar
javac *.java

# Executar
java Cafeteria
```

## Saída Esperada

```
=== SISTEMA DE CAFETERIA - PADRÃO DECORATOR ===

Descrição: Espresso
Custo: R$ 3,50

Descrição: Espresso, com leite
Custo: R$ 5,00

Descrição: Espresso, com leite, com canela
Custo: R$ 5,75

... (mais exemplos)
```

## Extensão

Para adicionar um novo decorador, basta criar uma classe que estenda `Decorador`:

```java
public class MelDecorador extends Decorador {
    public MelDecorador(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.50;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com mel";
    }
}
```
