import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    /**
     * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
     * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
     * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
     * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */
    public static void main(String[] args) {
        int sicaklik;

        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        sicaklik=input.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (sicaklik<=25) {
            if(sicaklik<15){
                System.out.println("Sinemaya Gidebilirisiniz");
            }
            if (sicaklik>=10){
                System.out.println("Pikniğe Gidebilirsiniz");
            }
        } else{
            System.out.println("Yüzmeye gidebilirsiniz ");

        }
    }
}
