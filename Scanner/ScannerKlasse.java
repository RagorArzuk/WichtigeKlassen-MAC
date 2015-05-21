package Scanner;



import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerKlasse {
    
//    Man sollte immer nur 1 Scanner Objekt benutzen!
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String txt;
        
//        String-Eingabe:
        do {
            System.out.print("Bitte Eingabe: ");
            txt=in.nextLine();
            System.out.println("Ihre Eingabe: " + txt);
        }while (!txt.equals("quit"));
        System.out.println("Programm1 wurde beendet!");
//        in.close(); Wenn der Scanner beendet wird, dann ist kein anderer Scanner mehr gültig und es gibt einen Fehler!
        
        
//        Integer-Eingabe:
        boolean schleifenAbruch=false;
//        Scanner in2 = new Scanner(System.in); <-- DAS IST UNNÖTIG! NIEMALS 2 SCANNER OBJEKTE BENUTZEN!
        
        while(!schleifenAbruch) {
            try {
                System.out.print("Bitte einen Integer eingeben: ");
                int i = in.nextInt();
                System.out.println("Ihre Eingabe: " + i);                
            }catch(InputMismatchException e) {
                System.out.println("Es wurde kein Integer eingegeben!");
                schleifenAbruch=true;
            }
        };
        in.close();
        System.out.println("Programm2 wurde beendet!");
    }

}
