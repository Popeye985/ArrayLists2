package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankRekening> rekeningen = new ArrayList<>();

    public void addRekening(BankRekening rek) {
        rekeningen.add(rek);
    }

    public ArrayList <String> getRekeningnummers() {
        ArrayList<String> rekeningnummers = new ArrayList<>();
        for (BankRekening rek:rekeningen){
            String rekeningnummer = rek.getRekeningnummer();
            rekeningnummers.add(rekeningnummer);
        }

        return rekeningnummers;
    }

    public BankRekening getRekening(String rekeningnummer) {
        for (BankRekening bankRekening: rekeningen){
            if (bankRekening.getRekeningnummer().equals(rekeningnummer)){
                return bankRekening;
            }
        }return null;


    }
}


