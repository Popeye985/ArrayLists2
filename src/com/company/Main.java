package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank();
        //Bankrekening rek = new Bankrekening("000-0000000-00");
        //bank.addRekening(rek);
        bank.addRekening(new BankRekening("000-0000011-11"));
        bank.addRekening(new BankRekening("000-0000022-22"));
        bank.addRekening(new BankRekening("000-0000033-33"));
        for(String rekeningnummer:bank.getRekeningnummers()){
            BankRekening br = bank.getRekening(rekeningnummer);
            System.out.printf("Op rekening %s staat %.2f EURO%n", br.getRekeningnummer(), br.getSaldo());
        }
    }
}
class BankRekening{
    private String rekeningnummer;
    private double saldo;

    public BankRekening(String rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
        saldo = 0;
    }

    public String getRekeningnummer() {
        return rekeningnummer;
    }

    public double getSaldo() {
        return saldo;
    }
    public void storten(double bedrag){
        saldo += bedrag;
    }
    public void afhalen(double bedrag){
        saldo -= bedrag;
    }
}







