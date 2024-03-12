# Exemplo:

Imagine um sistema de e-commerce que oferece duas formas de pagamento: cartão de crédito e PayPal. O padrão Strategy pode ser usado para implementar essa funcionalidade de forma flexível e modular.

Este é um exemplo simplificado. Em um sistema real, as classes de pagamento provavelmente teriam mais funcionalidades, como validação de dados e integração com APIs externas.
O padrão Strategy também pode ser usado com outras funcionalidades, como ordenação de dados, cálculo de impostos e validação de formulários.

## Estutura:

- Interface Strategy: Define o contrato comum para todos os algoritmos.
- Classes de Algoritmo Concreto: Implementam a interface Strategy, definindo a lógica específica para cada algoritmo.
- Classe Cliente: Contém a lógica principal e usa a interface Strategy para delegar a execução do algoritmo.

## Benefícios do uso do Strategy neste exemplo:

- Flexibilidade: Permite adicionar novas formas de pagamento sem modificar o código do cliente.
- Manutenibilidade: Reduz a duplicação de código e torna o código mais fácil de entender e modificar.

## Conclusão:

O padrão Strategy é uma ferramenta poderosa para aumentar a flexibilidade e modularidade do seu código. Ele permite que você defina famílias de algoritmos e os utilize de forma intercambiável, sem a necessidade de modificar o código do cliente.
