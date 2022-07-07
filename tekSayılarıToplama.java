import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class tekSayılarıToplama {
public static void main ( String[] Args ){
    int n, total = 0;

    Scanner scan = new Scanner(System.in);

    do {
        System.out.print(" Sayı giriniz : ");
        n = scan.nextInt();
        if ( n%4==0) {
            total += n;
        }

    } while (n%2 != 1);
            System.out.println( "4'ün katları toplamı : " + total) ;
    }
}
