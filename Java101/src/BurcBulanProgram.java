import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        /**
         * Koç Burcu : 21 Mart - 20 Nisan         * Boğa Burcu : 21 Nisan - 21 Mayıs
         *İkizler Burcu : 22 Mayıs - 22 Haziran   * Yengeç Burcu : 23 Haziran - 22 Temmuz
         * Aslan Burcu : 23 Temmuz - 22 Ağustos   * Başak Burcu : 23 Ağustos - 22 Eylül
         * Terazi Burcu : 23 Eylül - 22 Ekim      * Akrep Burcu : 23 Ekim - 21 Kasım
         * Yay Burcu : 22 Kasım - 21 Aralık       * Oğlak Burcu : 22 Aralık - 21 Ocak
         * Kova Burcu : 22 Ocak - 19 Şubat        * Balık Burcu : 20 Şubat - 20 Mart
         */
        int ay, gun;
        boolean isError=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        ay=input.nextInt();
        System.out.print("Doğduğunuz gün: ");
        gun=input.nextInt();

        if((ay==3 && gun>=21) || (ay==4 && gun<=20) ){
            if(gun>=1 && gun<=31){
                System.out.println("Burcunuz: Koç");
            }else{
                isError=true;
            }

        }else if((ay==4 && gun>=21) || (ay==5 && gun<=21)){
            if(gun>=1 && gun<=30){
                System.out.println("Burcunuz: Boğa");
            }else{
                isError=true;
            }

        }else if((ay==5 && gun>=22) || (ay==6 && gun<=22)){
            if(gun>=1 && gun<=31){
                System.out.println("Burcunuz: İkizler");
            }else{
                isError=true;
            }

        }else if((ay==6 && gun>=23) || (ay==7 && gun<=22)){
            if(gun>=1 && gun<=30){
                System.out.println("Burcunuz: Yengeç");
            }else{
                isError=true;
            }

        }else if((ay==7 && gun>=23) || (ay==8 && gun<=22)){
            if(gun>=1 && gun<=31){
                System.out.println("Burcunuz: Aslan");
            }else{
                isError=true;
            }

        }else if((ay==8 && gun>=23) || (ay==9 && gun<=22)){
            if(gun>=1 && gun<=31){
                System.out.println("Burcunuz: Başak");
            }else{
                isError=true;
            }

        }else if((ay==9 && gun>=23) || (ay==10 && gun<=22)){
            if(gun>=1 && gun<=30){
                System.out.println("Burcunuz: Terazi");
            }else{
                isError=true;
            }

        }else if((ay==10 && gun>=23) || (ay==11 && gun<=21)){
            if(gun>=1 && gun<=31){
                System.out.println("Burcunuz: Akrep");
            }else{
                isError=true;
            }

        }else if((ay==11 && gun>=22) || (ay==12 && gun<=21)){
            if(gun>=1 && gun<=30){
                System.out.println("Burcunuz: Yay");
            }else{
                isError=true;
            }

        }else if((ay==12 && gun>=22) || (ay==1 && gun<=21)){
            if(gun>=1 && gun<=31){
                System.out.println("Burcunuz: Oğlak");
            }else{
                isError=true;
            }

        }else if((ay==1 && gun>=22) || (ay==2 && gun<=19)){
            if(gun>=1 && gun<=31){
                System.out.println("Burcunuz: Kova");
            }else{
                isError=true;
            }

        }else if((ay==2 && gun>=20) || (ay==3 && gun<=20)){
            if(gun>=1 && gun<=29){
                System.out.println("Burcunuz: Balık");
            }else{
                isError=true;
            }

        }

        if(isError){
            System.out.println("Geçersiz bir gün girdiniz");
        }
    }
}
