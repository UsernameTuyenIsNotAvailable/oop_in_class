import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh khoi lap phuong");
        int canh = sc.nextInt();
        int ttlp = canh *canh*canh;
        System.out.println( "the tich cua khoi hinh chu nhat "+ ttlp);


    }
}
