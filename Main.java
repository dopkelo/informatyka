package com.company.inf10;

public class Main {

    public static void main(String[] args) {
        Zwierze zebra = new Zwierze(new Color("czarny"),new rasa("albanska"),new Size(200,33), new Kraj("Anglia"), new Kopyta("tak"), new Zycie("ziemia"));
        System.out.println("Rasa: " + zebra.rasa.nazwa );
        System.out.println("Kolor: " + zebra.color.name );
        System.out.println("Rozmiar: " + zebra.size.height + ", " + zebra.size.width);
        System.out.println("Kraj: " + zebra.kraj.nazwa );
        System.out.println("Kopyta: " + zebra.kopyta.odp );
        System.out.println("Zycie: " + zebra.zycie.polozenie );
        Zwierze koala = new Zwierze(new Color("biala"),new rasa("nocna"),new Size(10,55), new Kraj("Norwegia"), new Kopyta("nie"), new Zycie("ziemia"));
        System.out.println("Rasa: " + koala.rasa.nazwa );
        System.out.println("Kolor: " + koala.color.name );
        System.out.println("Rozmiar: " + koala.size.height + ", " + koala.size.width);
        System.out.println("Kraj: " + koala.kraj.nazwa );
        System.out.println("Kopyta: " + koala.kopyta.odp );
        System.out.println("Zycie: " + koala.zycie.polozenie );
        Zwierze pies = new Zwierze(new Color("brazowy"),new rasa("niemiecki"),new Size(100,55), new Kraj("Niemcy"), new Kopyta("nie"), new Zycie("ziemia"));
        System.out.println("Rasa: " + pies.rasa.nazwa );
        System.out.println("Kolor: " + pies.color.name );
        System.out.println("Rozmiar: " + pies.size.height + ", " + pies.size.width);
        System.out.println("Kraj: " + pies.kraj.nazwa );
        System.out.println("Kopyta: " + pies.kopyta.odp );
        System.out.println("Zycie: " + pies.zycie.polozenie );
        Zwierze kon = new Zwierze(new Color("bialy"),new rasa("arabski"),new Size(200,70), new Kraj("Turcja"), new Kopyta("tak"), new Zycie("ziemia"));
        System.out.println("Rasa: " + kon.rasa.nazwa );
        System.out.println("Kolor: " + kon.color.name );
        System.out.println("Rozmiar: " + kon.size.height + ", " + kon.size.width);
        System.out.println("Kraj: " + kon.kraj.nazwa );
        System.out.println("Kopyta: " + kon.kopyta.odp );
        System.out.println("Zycie: " + kon.zycie.polozenie );
        Zwierze szczupak = new Zwierze(new Color("zielony"),new rasa("wodny"),new Size(33,33), new Kraj("Polska"), new Kopyta("nie"), new Zycie("woda"));
        System.out.println("Rasa: " + szczupak.rasa.nazwa );
        System.out.println("Kolor: " + szczupak.color.name );
        System.out.println("Rozmiar: " + szczupak.size.height + ", " + szczupak.size.width);
        System.out.println("Kraj: " + szczupak.kraj.nazwa );
        System.out.println("Kopyta: " + szczupak.kopyta.odp );
        System.out.println("Zycie: " + szczupak.zycie.polozenie );
    }
}
