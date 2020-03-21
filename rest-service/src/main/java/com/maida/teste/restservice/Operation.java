package com.maida.teste.restservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Operation {
    
    public final char operationType;
    public final int amount;
    public final String date;
    
    public Operation(char operationType, int amount) {
        this.operationType = operationType;
        this.amount = amount;
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        date = df.format(calendar.getTime());
    }
    
    public String getOperationDescription() {
        return operationType+" "+amount+" "+date;
    }
}
