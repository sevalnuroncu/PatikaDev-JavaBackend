public class UcBasamakliArmstrongSayilari {
    public static void main(String[] args) {
        /**
         * Üç basamaklı armstrong sayıları bulup ekrana yazdıran program
         */
       int basNumber, basValue, tempNumber,basPow,result;
       for(int number=100; number<1000; number++){
            result=0;
            basNumber=0;
            tempNumber=number;
            while(tempNumber!=0){
                tempNumber/=10;
                basNumber++;//we can say directly 3 to basNumber. But I wanted to calculate.
            }
            tempNumber=number;
            while(tempNumber!=0){
                basValue=tempNumber%10;
                basPow=1;
                for(int i=1; i<=basNumber; i++){
                    basPow*=basValue;
                }
                result+=basPow;
                tempNumber/=10;

            }
            if (result==number){
                System.out.println(number +" sayısı bir Armstrong sayısıdır");
            }



       }
    }
}
