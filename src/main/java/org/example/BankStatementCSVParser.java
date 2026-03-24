package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser {

    //CRIA UMA VARIAVEL FINAL COM O FORMATO PADRAO DA DATA DO ARQUIVO
    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    //METODO PARA LER O ARQUIVO CSV CRIANDO O OBJETO BANKTRANSACTION COM OS DADOS OBTIDOS DO ARQUIVO
    private BankTransaction parseFromCSV(final String line){
        final String[] columns = line.split(",");

        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
        final double amount = Double.parseDouble(columns[1]);
        final String description = columns[2];

        return new BankTransaction(date, amount, description);
    }

    //METODO QUE CRIA UMA LISTA DE BANKTRANSACTION RECEBENDO UMA LISTA DE STRING
    // PARA ADICIONAR AO OBJETO AS LINHAS RECEBIDAS
    public List<BankTransaction> parseLinesFromCSV(final List<String> lines){
        final  List<BankTransaction> bankTransactions = new ArrayList<>();
        for (String line : lines){
            bankTransactions.add(parseFromCSV(line));
        }
        return bankTransactions;
    }
}
