import java.util.Scanner;
public class usluSayıHesabı {
    public static void main (String[]Args){
        int s,u,ussu=1;

        Scanner scan = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        s = scan.nextInt();
        System.out.print("Us giriniz : ");
        u = scan.nextInt();

        for (int i = 1; i <= u; ++i){
             ussu *=s;

        }
        System.out.println(ussu);
    }
}
