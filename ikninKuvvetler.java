import java.util.Scanner;

public class ikninKuvvetler {
    public static void main (String[] Args) {

        //ava döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        int n;

        Scanner scan = new Scanner(System.in);

        System.out.print( " Sayı Giriniz : ");
        n = scan.nextInt();

        for ( int b = 1; b <= n ; b*=4) {
            System.out.print(b + ",");
        }
        System.out.println();
        for ( int d = 1; d <= n ; d*=5) {
            System.out.print(d +",");
        }
    }
}
