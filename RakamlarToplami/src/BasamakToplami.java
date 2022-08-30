import java.util.Scanner;
public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, basamak, total;
        System.out.print("Sayiyi giriniz: ");
        sayi = input.nextInt();
        total =0;
        basamak=0;
        while(sayi!=0){

            total+=sayi%10;
            sayi/=10;
            basamak++;
        }
        System.out.println(total);
    }
}
