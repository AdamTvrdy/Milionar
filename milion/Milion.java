
package milion;
import java.util.Scanner;

public class Milion {
    
    
    public static void main(String[] args) {
    milionalfa oop = new milionalfa();
    int pokr = 0;
    int pokr1 = 0;
    oop.nazov();
    oop.otazka1();
    Scanner scanner = new Scanner(System.in);
    String odpoved;
    odpoved = scanner.next();
    if("d".equals(odpoved)||"D".equals(odpoved) ){
      oop.spravne();
      System.out.println("1000€");
    }
    else{
        oop.nespravne();
        System.exit(0);
    }
    oop.otazka2();
    odpoved = scanner.next();
    if("a".equals(odpoved)||"A".equals(odpoved)){
        oop.spravne();
        System.out.println("10 000€");
    }
    else{
        oop.nespravne();
        System.exit(0);
    }
    oop.otazka3();
    odpoved = scanner.next();
    if("a".equals(odpoved)||"A".equals(odpoved)){
        oop.spravne();
        System.out.println("25 000€");
        
        while(pokr !=1 && pokr != 2 ){
            System.out.println("Chete pokračovať(1)alebo skončiť(2)?");
            pokr = scanner.nextInt();
        }
        }
        if(pokr == 2){
            System.out.println("Gratulujem vyhrali ste 25 000€!");
            System.exit(0);
        }
        else if(pokr == 1){   
        }
    
    else{
        oop.nespravne();
        System.exit(0);
    }
    oop.otazka4();
    odpoved = scanner.next();
    if("b".equals(odpoved)||"B".equals(odpoved)){
        oop.spravne();
        System.out.println("50 000€");
    }
    else{
        oop.nespravne();
        System.exit(0);
    }
    oop.otazka5();
    odpoved = scanner.next();
    if("c".equals(odpoved)||"C".equals(odpoved)){
        oop.spravne();
        System.out.println("100 000€");
    }
    else{
        oop.nespravne();
        System.exit(0);
    }
    oop.otazka6();
    odpoved = scanner.next();
    if("a".equals(odpoved)||"A".equals(odpoved)){
        oop.spravne();
        System.out.println("250 000€");
        
        
        while(pokr1 !=1 && pokr1 != 2 ){
            System.out.println("Chete pokračovať(1)alebo skončiť(2)?");
            pokr1 = scanner.nextInt();
        }
        }
        if(pokr1 == 2){
            System.out.println("--------------------------------------");
            System.out.println("Gratulujem vyhrali ste 250 000€!");
            System.out.println("--------------------------------------");
            System.exit(0);
        }
        else if(pokr1 == 1){   
        }
    
    else{
        oop.nespravne();
        System.exit(0);
        }
    oop.otazka7();
    odpoved = scanner.next();
    if("a".equals(odpoved)||"A".equals(odpoved)){
        oop.spravne();
        System.out.println("500 000€");
    }
    else{
        oop.nespravne();
        System.exit(0);
    }
    oop.otazka8();
    odpoved = scanner.next();
    if("b".equals(odpoved)||"B".equals(odpoved)){
        System.out.println("--------------------------------------");
        System.out.println("Správne! Vyhrali ste:");
        System.out.println("▄█   █▀█ █▀█ █▀█   █▀█ █▀█ █▀█\n" +
                           "░█   █▄█ █▄█ █▄█   █▄█ █▄█ █▄█");
    }
    else{
        oop.nespravne();
        System.exit(0);
    }
    }}