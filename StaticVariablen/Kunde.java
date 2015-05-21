package StaticVariablen;



//Hier wird der Aufruf von Static Variablen geprobt.
//Die Funktion soll sein: Jeder Kunde bekommt eine eigene Kundennummer, die dem Kunden nach Erzeugung
//des Kunden automatisch zugewiesen und dann inkrementiert wird.

public class Kunde {
 
 private static int anzahlKundennr = 0;
 private int persönlicheKundennr;
 private String name;
 
 public Kunde() {}
 
 
// Die Getters werden im Folgenden auf public geschalten, um in der main Methode nocheinmal hervorzuheben, 
// dass die kundennr unabhängig von der persönlichenKundennr wächst
 
//static Methoden um die Kundennummer auszugeben und zu inkrementieren.  
 public static int getAnzahlKundennr() {
     return anzahlKundennr;
 }
 private static void incKundennr() {
     anzahlKundennr = anzahlKundennr+1;
 }
 
// Getter und Setter für name;
 private void setName(String name) {
     this.name=name;
 }
 public String getName() {
     return name;
 }
 
// Getter und Setter für die persönliche Kundennummer.
 private void setPersönlicheKundennr(int nr) {
     persönlicheKundennr = nr;
 }
 public int getPersönlicheKundennr() {
     return persönlicheKundennr;
 }
 
// Ausgabe der Kundendaten.
 public void printKunde() {
     System.out.println("Der Kunde mit der persönlichen Kundennummer " + this.getPersönlicheKundennr() + " trägt den Namen " 
             + this.getName() + " und die Anzahl der Kundennummern beträgt nun " + getAnzahlKundennr());
 }
 
 
 public static Kunde erzeugeKunde(String name) {
     Kunde kunde = new Kunde();
     kunde.setName(name);
     kunde.setPersönlicheKundennr(getAnzahlKundennr());
     incKundennr();
     
     return kunde;
 }
 
 public static void main(String[] args) {
     Kunde kunde1 = Kunde.erzeugeKunde("Waldemar Gareis");
     Kunde kunde2 = Kunde.erzeugeKunde("Natalija Egel");
     Kunde kunde3 = Kunde.erzeugeKunde("Leo Gareis");
     
     kunde1.printKunde();
     kunde2.printKunde();
     kunde3.printKunde();
     
     System.out.println("Jetzt nocheinmal die Kundennummern:");
     
     System.out.println(kunde1.getName() + " hat die Kundennummer " + kunde1.getPersönlicheKundennr() + 
                         " und die Anzahl der Kunden beträgt: " + Kunde.getAnzahlKundennr());
     
     kunde2.printKunde();
     kunde3.printKunde();
     
 }
}
