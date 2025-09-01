Java-Bank

Este projeto propõe uma simulação de sistema bancário virtual construído em Java, com o propósito de reforçar os pilares da Programação Orientada a Objetos (POO). Através da simulação de operações bancárias como depósitos, saques, transferências PIX e gestão de investimentos, a aplicação demonstra conceitos de herança, encapsulamento, polimorfismo e abstração em um ambiente prático e funcional.

💻 Funcionalidades do Código
Utiliza recursos da linguagem Java para estruturar as diferentes partes de um sistema financeiro.

🎯 Objetivo do projeto
Desenvolvido como parte do desafio do Bootcamp Riachuelo - Primeiros Passos com Java, da plataforma DIO . O projeto tem como meta criar aplicações back-end em Java, com foco em código limpo e versionado, e boas práticas para uso em ambientes reais. O conteúdo está alinhado com o dia a dia de desenvolvedores back-end.

📋 Pré-requisitos

Para executar este projeto, será necessário ter instalado em sua máquina:
Java Development Kit (JDK): Versão 11 ou superior;
Maven: Para gerenciar as dependências do projeto;
IDE de sua preferencia para editar o código.

🛠️ Construído com

Java 11 - A linguagem principal usada;
Records - Recurso moderno do Java para classes de dados.

📦 Implementação
Este projeto está estruturado de seguinte forma:
O main apresenta um codigo para o menu de opções no console, permitindo que o usuário escolha a operação desejada (criar conta, depositar, sacar, etc.). 
 
 java-bank/br.com.dio
      1)model:
        AccountWallet(class);
        Investment(class);
        InvestmentWallet(class);
        Money(class);
        MoneyAudit(class);
        Wallet(class).
      2)repository;
          AccountRepository(class);
          AccountWallet(class);
          CommonsRepositorys(class);
          InvestmentRepository(class).
      3)Exception;
          AccountWithinvestment;
          AccountWithInvestmentException;
          AcountNotFoundException;
          InvestmentNotFoundException;
          NotFoundEnoughException;
          PixInUseException;
          WalletNotFoundException.

🎁 Agradecimentos
Agradeço imensamente à plataforma DIO pela oportunidade de aprendizado e práticas, suporte e conteúdo fornecido para o desenvolvimento. 
