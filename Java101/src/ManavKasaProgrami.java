import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine
         * göre toplam tutarını ekrana yazdıran programı yazın.
         * Meyveler ve KG Fiyatları
         * Armut : 2,14 TL
         * Elma : 3,67 TL
         * Domates : 1,11 TL
         * Muz: 0,95 TL
         * Patlıcan : 5,00 TL
         */
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5, armutkgDegeri,elmakgDegeri,domateskgDegeri,
                muzkgDegeri, patlicankgDegeri, toplam;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?: ");
        armutkgDegeri=input.nextDouble();
        System.out.print("Elma Kaç Kilo ?: ");
        elmakgDegeri=input.nextDouble();
        System.out.print("Domates Kaç Kilo ?: ");
        domateskgDegeri=input.nextDouble();
        System.out.print("Muz Kaç Kilo ?: ");
        muzkgDegeri=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ?: ");
        patlicankgDegeri=input.nextDouble();
        toplam=armut*armutkgDegeri+elma*elmakgDegeri+domates*domateskgDegeri+muzkgDegeri*muz+patlican*patlicankgDegeri;
        System.out.print("Toplam Tutar: "+toplam);



    }
}
