public class Deneme {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x++);//5
        System.out.println(x);//6
        System.out.println(++x);//7

        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)){//2010
            System.out.println(a);
        }else{
            System.out.print(a);
        }
        System.out.println(b);
    }
}
