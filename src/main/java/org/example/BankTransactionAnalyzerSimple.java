package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankTransactionAnalyzerSimple {

    public static void main(String[] args) {
        final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
        // 1. Obtém o diretório home do usuário (ex: C:\Users\NomeDoUsuario)
        String userHome = System.getProperty("user.home");

        // 2. Constrói o caminho para a pasta Downloads
        // Windows geralmente usa "Downloads" em inglês, mesmo em PT-BR
        Path downloadsPath = Paths.get(userHome, "Downloads/estudo_livro/");

        // Exemplo: Criando um arquivo nesta pasta
        Path arquivo = downloadsPath.resolve("teste_csv_estudo_livro.csv");

        //CRIANDO UMA LISTA DE STRING QUE IRÁ ARMAZENAR AS LINHAS DO ARQUIVO CARREGADOS
        final List<String> lines;
        //BLOCO PARA TESTAR LINHA A LINHA DO ARQUIVO E SE EXISTIR CARREGAR PARA A LISTA.
        try {
            lines = Files.readAllLines(arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFromCSV(lines);

        System.out.println("O total para todas as transações é: " + calculateTotalAmont(bankTransactions));
        System.out.println("Transações em Janeiro: " + selectInMonth(bankTransactions, Month.JANUARY));

    }

    //METODO PARA TOTALIZAR O VALOR DAS TRANSACOES DO MES DE ENVIADO COMO PARAMETRO
    private static List<BankTransaction> selectInMonth(final List<BankTransaction> bankTransactions,final Month month) {
        final List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();
        for (final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDate().getMonth() == month) {
                bankTransactionsInMonth.add(bankTransaction);
            }
        }
        return bankTransactionsInMonth;
    }

    private static double calculateTotalAmont(final List<BankTransaction> bankTransactions) {
        double total = 0d;
        for (BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }
        return total;
    }
}
