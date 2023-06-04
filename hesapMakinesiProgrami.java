package hesapMakinesiProgrami;
import java.util.Scanner;

public class hesapMakinesiProgrami {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        n1 = input.nextInt();

        System.out.print("ikinci sayıyı giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplama \n2-Cıkarma\n3-Carpma\n4-Bolme");
        System.out.print("Girdiğiniz sayılarla hangi işlemi yapmak istersiniz :");
        select = input.nextInt();

/*
        if (select==1){
            System.out.println("Toplam : " + (n1+ n2));
        } else if (select==2) {
            System.out.println("Cıkarma : " + (n1 - n2));
        } else if (select==3) {
            System.out.println("Carpma :" + (n1 * n2));
        } else if (select==4) {
            if (n2!=0) {
                System.out.println("Bolme : " + (n1 / n2));
            } else {
                System.out.println("Bir sayı sıfıra bölünemez");
            }
        } else {
            System.out.println("Yanlış Seçim yaptınız. Tekrar Deneyiniz");
        }
      */  
        switch (select){

            case 1:
                System.out.println("Toplam : " + (n1+ n2));
                break;

            case 2:
                System.out.println("Cıkarma : " + (n1 - n2));
                break;

            case 3:
                System.out.println("Carpma :" + (n1 * n2));
                break;

            case 4:
                if (n2!=0) {
                    System.out.println("Bolme : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez");
                }
                break;

            default:
                System.out.println("Yanlış Seçim yaptınız. Tekrar Deneyiniz");
                break;
        }

    }
}
