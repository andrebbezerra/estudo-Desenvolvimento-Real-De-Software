package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BankStatementCSVParser implements BankStatementParser {

    //CRIA UMA VARIAVEL FINAL COM O FORMATO PADRAO DA DATA DO ARQUIVO
    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    //METODO PARA LER O ARQUIVO CSV CRIANDO O OBJETO BANKTRANSACTION COM OS DADOS OBTIDOS DO ARQUIVO
    public BankTransaction parseFrom(final String line) {
        final String[] columns = line.split(",");

        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
        final double amount = Double.parseDouble(columns[1]);
        final String description = columns[2];

        return new BankTransaction(date, amount, description);
    }

    //METODO QUE CRIA UMA LISTA DE BANKTRANSACTION RECEBENDO UMA LISTA DE STRING
    // PARA ADICIONAR AO OBJETO AS LINHAS RECEBIDAS
    public List<BankTransaction> parseLinesFrom(final List<String> lines) {
        return lines.stream().map(this::parseFrom).collect(toList());
    }
}
