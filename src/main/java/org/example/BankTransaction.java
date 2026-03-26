package org.example;

import java.time.LocalDate;
import java.util.Objects;

//CLASSE PARA O OBJETO BANKTRANSACTION QUE SERÁ USADA EM OUTRAS CLASSES
public class BankTransaction {
    //CRIAÇÃO DAS VARIAVEIS DE INSTANCIA DO OBJETO
    private final LocalDate date;
    private final double amount;
    private final String description;

    //DECLARACAO DO CONSTRUTOR
    public BankTransaction(LocalDate date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    //GETTERS
    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    //SOBRESCREVENDO O METODO TOSTRING DE OBJECT
    @Override
    public String toString() {
        return "BankTransaction{" +
                "date=" + date +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }

    //SOBRESCREVENDO O METODO EQUALS DE OBJECT
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankTransaction that = (BankTransaction) o;
        return Double.compare(amount, that.amount) == 0 && Objects.equals(date, that.date) &&
                Objects.equals(description, that.description);
    }

    //SOBRESCREVENDO O METODO HASCODE DE OBJECT
    @Override
    public int hashCode() {
        return Objects.hash(date, amount, description);
    }
}
