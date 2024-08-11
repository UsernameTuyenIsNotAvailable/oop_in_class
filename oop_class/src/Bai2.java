import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("chieu dai : "  );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("chieu rong : " );
        int b = sc.nextInt();

        int c = (a + b) * 2 ;
        int d = a*b  ;
        System.out.println("chu vi hinh hinh chu nhat : " + c);
        System.out.println("dien tich hinh chu nhat : " + d);

        int canh_nho_nhat = Math.min(a,b);
        System.out.println(canh_nho_nhat);


        System.out.println();

    }

}
