import java.util.Scanner;

public class KullaniciGirisi {
    /**Kullanıcıadı:patika şifre:java123 varsayınız.
     *Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
     * isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
     * şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
     * yazan programı yazınız.
     */
    public static void main(String[] args) {
        String userName,password,answer,newPassword;
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName=input.nextLine();

        System.out.print("Şifre giriniz: ");
        password=input.nextLine();
        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }else {
            System.out.println("Bilgileriniz Yanlış!");
            System.out.println("Şifre sıfırlamak ister misin?: \n1-Evet\n2-Hayır");
            System.out.print("Seçiminiz: ");
            answer=input.nextLine();
            if(answer.equals("1")){
                System.out.print("Yeni şifre: ");
                newPassword=input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }

            }
        }
    }
}
