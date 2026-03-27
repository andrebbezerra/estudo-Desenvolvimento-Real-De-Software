package org.example;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

//CLASSE CRIADA PARA EFETUAR OS CALCULOS NECESSARIOS NO PROCESSO, ASSIM O PROJETO FICA MAIS COESO, TENDO CADA CLASSE SUA RESPONSABILIDADE
public class BankStatementProcessor {
    //CRIACAO DE UMA LISTA DE BANKTRANSACTION
    private final List<BankTransaction> bankTransactions;

    //METODO CONSTRUTOR
    public BankStatementProcessor(List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    //METODO PARA CALCULAR O TOTAL DE VALORES DO OBJETO BANKTRANSACTION
    public double calculateTotalAmount() {
        double total = 0d;
        for (final BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }
        return total;
    }
    //METODO PARA CALCULAR O TOTAL DE VALORES DO MES DO OBJETO BANKTRANSACTION
    public double calculateTotalInMonth(final Month month) {
        double total = 0d;
        for (final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDate().getMonth() == month) {
                total += bankTransaction.getAmount();
            }
        }
        return total;
    }
    //METODO PARA CALCULAR O TOTAL DE VALORES DA CATEGORIA DO OBJETO BANKTRANSACTION
    public double calculateTotalForCategory(final String category) {
        double total = 0d;
        for (final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDescription().equals(category)) {
                total += bankTransaction.getAmount();
            }
        }
        return total;
    }

    //METODO PARA ENCONTRAR AS TRANSACOES ACIMA DE CERTO MONTANTE
    public List<BankTransaction> findTransactionGreaterThanEqual(final int amount){
        final List<BankTransaction> result = new ArrayList<>();
        for (final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getAmount() > amount) {
                result.add(bankTransaction);
            }
        }
        return result;
    }
    //METODO PARA ENCONTRAR TRANSACOES BANCARIAS EM DETERMINADO MES
    public List<BankTransaction> findTransactionsInMonth(final Month mont){
        final List<BankTransaction> result = new ArrayList<>();
        for (final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDate().getMonth() == mont) {
                result.add(bankTransaction);
            }
        }
        return result;
    }

    //METODO PARA ENCONTRAR TRANSACOES BANCARIAS EM DETERMINADO MES E ACIMA DE CERTO MONTANTE
    public List<BankTransaction> findTransactionsInMontAndGreater(final Month month, final int amount){
        final List<BankTransaction> result = new ArrayList<>();
        for (final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDate().getMonth() == month && bankTransaction.getAmount() > amount) {
                result.add(bankTransaction);
            }
        }
        return result;
    }

    public List<BankTransaction> findTransactions(final BankTransactionFilter bankTransactionFilter) {
        final List<BankTransaction> result = new ArrayList<>();
        for (final BankTransaction bankTransaction : bankTransactions) {
            if(bankTransactionFilter.test(bankTransaction)) {
                result.add(bankTransaction);
            }
        }
        return result;
    }
}
