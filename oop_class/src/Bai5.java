import java.util.Scanner;

public class Bai5 {
    String a;
    public static void main(String[] args) {
          Bai5 b = new Bai5();
          b.getInt("giai phuong trinh bac 1  ");






    }
    public  int getInt(String ask) {
        boolean run=true;
        int v=0;
        while(run==true) {try {
            Scanner sc = new Scanner(System.in);
            System.out.println(ask);
            System.out.println(" Giai phuong trinh bac 1 ");

            System.out.print("Nhap a :");
            int a = sc.nextInt();
            System.out.print("Nhap b :");
            int b = sc.nextInt();
          //  run=false;

        }catch(Exception e ) {
            System.out.println("Bạn phải nhập một số nguyên");
        }

        }

        return (int)v;
    }
}
