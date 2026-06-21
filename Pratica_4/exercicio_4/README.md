# Padrão Facade - Sistema de Controle de Carro

## Descrição
Implementação do padrão estrutural **Facade** em Java para um sistema de controle de carro. Este padrão fornece uma interface unificada para um conjunto de interfaces em um subsistema, simplificando a utilização de componentes complexos.

## Estrutura

### Componentes do Subsistema
- **Motor.java**: Controla ligar/desligar do motor
- **Porta.java**: Controla trancar/destrancar das portas
- **CintodeSeguranca.java**: Controla travar/destravar do cinto
- **Farol.java**: Controla acender/apagar do farol
- **Radio.java**: Controla ligar/desligar e sintonizar o rádio

### Fachada (Interface Unificada)
- **Carro.java**: A fachada que coordena todos os componentes
  - `ligarCarro()`: Coordena o ligar de todos os subsistemas
  - `desligarCarro()`: Coordena o desligar de todos os subsistemas
  - `exibirStatus()`: Mostra o estado atual de todos os componentes

### Classe de Demonstração
- **CarroFachada.java**: Classe principal com método `main()` que demonstra o funcionamento

## Como Funciona

### Sem o Padrão Facade
O cliente teria que coordenar manualmente cada componente:

```java
Motor motor = new Motor();
Porta porta = new Porta();
Farol farol = new Farol();
Radio radio = new Radio();

// Para ligar o carro seria necessário:
motor.ligar();
porta.trancar();
farol.acender();
radio.ligar();
radio.sintonizarPreferida();
```

### Com o Padrão Facade
Basta uma simples chamada:

```java
Carro carro = new Carro();
carro.ligarCarro();
```

## Vantagens do Padrão

1. **Simplificação**: Interface simples para sistema complexo
2. **Desacoplamento**: Cliente não precisa conhecer os detalhes internos
3. **Manutenção**: Alterações nos componentes não afetam o cliente
4. **Flexibilidade**: Fácil adicionar novos comportamentos
5. **Encapsulamento**: Oculta a complexidade do subsistema

## Compilação e Execução

```bash
# Compilar
javac *.java

# Executar
java CarroFachada
```

## Saída Esperada

```
===================================================
  PADRÃO FACADE - SISTEMA DE CONTROLE DE CARRO
===================================================

--- STATUS DO CARRO ---
Motor: DESLIGADO
Portas: DESTRANCADAS
...

--- LIGANDO O CARRO ---
  ✓ Motor ligado
  ✓ Portas trancadas
  ✓ Cinto de segurança travado
  ✓ Farol aceso
  ✓ Rádio ligado
  ✓ Rádio sintonizado em estação preferida: FM 89.5
✓ Carro pronto para dirigir!

--- DESLIGANDO O CARRO ---
  ✓ Motor desligado
  ✓ Portas destrancadas
  ✓ Cinto de segurança destravado
  ✓ Farol apagado
  ✓ Rádio desligado
✓ Carro desligado com segurança!
```

## Quando Usar o Padrão Facade

- Quando você tem um subsistema complexo que você quer simplificar
- Quando quer desacoplar clientes de subsistemas
- Quando precisa agrupar operações relacionadas em uma única operação
- Quando quer organizar hierarquias de subsistemas em camadas

## Exemplos Reais

- **Biblioteca de gráficos**: Simplifica operações complexas de renderização
- **Framework web**: Façade para requisições HTTP
- **Banco de dados**: ORM como façade para queries SQL
- **API de sistema operacional**: Simplificação de chamadas de sistema
