import java.util.Scanner;

public class DaireDilimiAlanı {
    public static void main(String[] args) {
        /**
         * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
         * 𝜋 sayısını = 3.14 alınız.
         * Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        int yaricap, merkezaci;
        double pi=3.14, dilimAlanı;
        Scanner input=new Scanner(System.in);
        System.out.print("yarıçapı giriniz: ");
        yaricap=input.nextInt();
        System.out.print("merkez açısını giriniz: ");
        merkezaci=input.nextInt();
        dilimAlanı=(pi*yaricap*yaricap*merkezaci)/360;
        System.out.println("Daire diliminin alanı= "+dilimAlanı);


    }
}
