import java.util.Scanner;
public class DaireninAlaniveCevresiniBulma {
    public static void main(String[] args) {
        /**
         * Java ile yarıçapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
         * 𝜋 sayısını = 3.14 alınız.
         */
        int yaricap;
        double alan,cevre, pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        yaricap=input.nextInt();
        cevre=2*pi*yaricap;
        alan=pi*yaricap*yaricap;
        System.out.println("çevre= "+cevre);
        System.out.println("alan= "+alan);
    }
}
