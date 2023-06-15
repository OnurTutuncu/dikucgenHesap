import java.util.Scanner;

public class hipotenüsBulma {
    public static void main(String[] args) {

int a, b ;
double  hipotenüs , cevre , alan;


        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz:");
        a = input.nextInt();
        System.out.print("2.Kenarı Giriniz:");
        b = input.nextInt();

        hipotenüs= (a*a) + (b*b);
        System.out.println("Hipotenüs :" + hipotenüs);

        cevre = a + b + hipotenüs;
        System.out.println("Dik Üçgenin Çevresi :" + cevre);
        alan = (a*b)/2.0;
        System.out.println("Dik Üçgenin Alanı :" + alan);




 }
}
