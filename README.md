# Estudo: Desenvolvimento Real de Software

Bem-vindo ao repositório **estudo-Desenvolvimento-Real-De-Software**! Este projeto foi criado com o objetivo de acompanhar e documentar os meus estudos baseados no livro *"Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java"* (título original: *"Real-World Software Development"*), escrito por Raoul-Gabriel Urma e Richard Warburton e publicado pela O'Reilly Media [1].

Neste repositório, você encontrará a evolução do código-fonte e a aplicação prática dos conceitos discutidos ao longo da leitura, demonstrando o progresso no aprendizado de técnicas e metodologias modernas para o desenvolvimento em Java.

---

## Sobre o Livro

O livro *"Desenvolvimento Real de Software"* adota uma abordagem pedagógica diferenciada, focada no aprendizado através da prática e na construção de projetos reais. Em vez de se concentrar em exemplos abstratos e teoria excessiva, os autores guiam o leitor na construção de aplicações relevantes, ensinando as melhores práticas de desenvolvimento de software de forma contextualizada [2].

A obra é destinada a desenvolvedores que já possuem conhecimento básico em Java e desejam aprimorar suas habilidades para construir softwares modernos, robustos e fáceis de manter. O conteúdo abrange uma ampla gama de tópicos fundamentais, desde programação funcional até arquitetura de sistemas e testes automatizados.

### Principais Conceitos Abordados

Ao longo dos capítulos, o livro explora uma série de conceitos cruciais para a engenharia de software moderna, que serão aplicados neste repositório:

| Categoria | Conceitos e Tecnologias |
| :--- | :--- |
| **Princípios de Design** | Princípios SOLID (Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion), Princípio KISS, DRY. |
| **Programação Funcional** | Expressões Lambda, Method References, Streams, Optional, Inferência de Tipos. |
| **Testes de Software** | Test Driven Development (TDD), JUnit, Mocking, Cobertura de Código, Testes de Comportamento. |
| **Arquitetura e Padrões** | Arquitetura Hexagonal, Padrões de Projeto (Builder, Repository), Injeção de Dependência, Coesão e Acoplamento. |
| **Boas Práticas** | Refatoração de Código, Tratamento de Exceções, Encapsulamento, Uso de Ferramentas de Build (Maven/Gradle). |

---

## Estrutura do Projeto e Projetos Desenvolvidos

O livro é estruturado em torno de desafios práticos, cada um focado em ensinar um conjunto específico de habilidades. À medida que avanço nos estudos, este repositório será incrementado com os seguintes projetos:

### 1. The Bank Statements Analyzer (Analisador de Extratos Bancários)
O primeiro projeto consiste na construção de um analisador de extratos bancários a partir de arquivos CSV. O objetivo principal é introduzir o princípio de responsabilidade única (SRP), demonstrar a importância da coesão e do baixo acoplamento, além de abordar a criação de testes automatizados básicos e a identificação de anti-padrões como a *God Class*.

Atualmente, o repositório já contém a estrutura inicial deste projeto, implementando a leitura e o parsing de arquivos CSV para calcular o montante total de transações e filtrar transações por mês específico.

### 2. Extending the Bank Statements Analyzer (Extensão do Analisador)
Nesta fase, o analisador inicial é aprimorado para suportar novos formatos de entrada e exportação de dados. O foco recai sobre o Princípio Aberto/Fechado (OCP), a utilização de interfaces, expressões lambda para flexibilizar o comportamento, e o tratamento adequado de exceções.

### 3. The Document Management System (Sistema de Gerenciamento de Documentos)
O terceiro desafio envolve a criação de um sistema para indexar e buscar diferentes tipos de documentos. Este projeto aprofunda o entendimento do Princípio de Substituição de Liskov (LSP), estratégias de encapsulamento, e técnicas avançadas de testes, enfatizando o teste de comportamento em vez da implementação.

### 4. The Business Rules Engine (Motor de Regras de Negócio)
Neste projeto, o foco muda para a construção de um motor de regras flexível. É a oportunidade ideal para explorar o Test Driven Development (TDD) de forma intensiva, aplicar o padrão Builder para criar APIs fluentes (Fluent APIs), e entender o Princípio de Segregação de Interfaces (ISP).

### 5. Twootr (Plataforma de Mídia Social)
O projeto final e mais complexo é a construção do núcleo de uma plataforma de mensagens semelhante ao Twitter. Este desafio integra todos os conhecimentos anteriores e introduz conceitos avançados de arquitetura, especificamente a Arquitetura Hexagonal. Também aborda persistência de dados com o padrão Repository, segurança básica (senhas), e o uso de mocks para testar componentes isolados do sistema.

---

## Estado Atual do Repositório

O repositório foi inicializado utilizando o **Maven** como ferramenta de gerenciamento de dependências e build, configurado para utilizar o **Java 17**.

No momento, o desenvolvimento encontra-se na fase inicial do **Bank Statements Analyzer**. O código implementa a leitura de um arquivo CSV de transações bancárias e realiza cálculos simples, como a soma total dos valores e a filtragem de transações por mês. Os próximos passos incluirão a refatoração deste código para aplicar os princípios de design discutidos no livro, separando as responsabilidades de parsing, cálculo e apresentação.

## Como Executar

Para executar os exemplos deste repositório, você precisará ter o [Java JDK 17+](https://adoptium.net/) e o [Maven](https://maven.apache.org/) instalados em sua máquina.

1. Clone o repositório:
   ```bash
   git clone https://github.com/andrebbezerra/estudo-Desenvolvimento-Real-De-Software.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd estudo-Desenvolvimento-Real-De-Software
   ```
3. Compile o projeto com o Maven:
   ```bash
   mvn clean install
   ```
4. Execute a classe principal desejada através da sua IDE de preferência ou via linha de comando.

---

## Referências

[1] [Real-World Software Development [Book] - O'Reilly](https://www.oreilly.com/library/view/real-world-software-development/9781491967164/)
[2] [Iteratr-Learning/Real-World-Software-Development - GitHub](https://github.com/Iteratr-Learning/Real-World-Software-Development)
