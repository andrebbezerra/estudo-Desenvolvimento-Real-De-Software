package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Notification {
    private final List<String> erros =  new ArrayList<>();

    public void addErro(final String message){
        erros.add(message);
    }

    public List<String> getErros() {
        return erros;
    }

    public boolean hasErros() {
        return !erros.isEmpty();
    }

    public String errorMessage(){
        return erros.toString();
    }

    public Notification validate(){
       final Notification notification = new Notification();
       if(this.description.length() > 100){
           notification.addErro("The description is too long");
       }

       final LocalDate parsedDate;
       try{
           parsedDate = LocalDate.parse(this.date);
           if(parsedDate.isAfter(LocalDate.now())){
               notification.addErro("date cannot be in the future");
           }
       }
       catch (DateTimeParseException e){
           notification.addErro("Invalidate date format");
       }

       final double amount;
       try{
           amount = Double.parseDouble(this.amount);
       }
       catch(NumberFormatException e){
           notification.addErro("Invalid format for amount");
       }
       return notification;
    }
}
