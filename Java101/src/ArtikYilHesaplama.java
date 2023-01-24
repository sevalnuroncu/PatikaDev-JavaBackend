import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int artikYil;
        Scanner input=new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        artikYil=input.nextInt();
        if(artikYil%100==0){
            if(artikYil%400==0){
                System.out.println(artikYil+" bir artık yıldır!");
            }else{
                System.out.println(artikYil+" bir artık yıl değildir!");
            }
        }else if(artikYil%4==0){
            System.out.println(artikYil+" bir artık yıldır!");
        } else{
            System.out.println(artikYil+" bir artık yıl değildir!");
        }

    }
}
