# Java Streams - Código mais conciso, legível e performático

Este projeto demonstra o uso da API de **Streams** do Java para manipulação de coleções de forma **mais declarativa**, **imutável** e com **melhor legibilidade**. Utilizamos operações como `filter`, `map`, `collect`, entre outras, para construir pipelines de dados claros e eficientes.

## 🧠 Conceitos aplicados

- **Código mais conciso e legível**  
  Evitamos loops explícitos e estruturas verbosas, utilizando streams para expressar intenção de forma direta.

- **Operações declarativas**  
  Focamos no *"o que fazer"*, não no *"como fazer"*. Isso melhora a clareza do código e facilita a manutenção.

- **Composições de operações**  
  Utilizamos encadeamento de operações (`.filter().map().collect()`) para construir pipelines de processamento eficientes e reutilizáveis.

- **Imutabilidade**  
  Evitamos alterações no estado de objetos, promovendo segurança e previsibilidade no fluxo de dados.

- **Desempenho**  
  Streams podem ser otimizadas internamente, e com `parallelStream()`, é possível obter ganhos de performance em coleções grandes.

## 📂 Exemplos

List<String> nomes = List.of("Guilherme", "Ana", "Carlos", "Gabriel");

List<String> nomesComG = nomes.stream()
    .filter(nome -> nome.startsWith("G"))
    .map(String::toUpperCase)
    .collect(Collectors.toList());


## 📌 Requisitos

Java 17+
Maven 3.8+

