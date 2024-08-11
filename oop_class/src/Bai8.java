import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {

    }
    public static int GiaiMghiemBac2 (

    ){
        boolean run = true;
        int a = 0;
       while (run = true) {
           try {
              Scanner sc = new Scanner(System.in);
               System.out.print("Nhập hệ số bậc 2, x = ");
               float x = sc.nextFloat();
               System.out.print("Nhập hệ số bậc 1, y = ");
               float y = sc.nextFloat();
               System.out.print("Nhập hằng số tự do, z = ");
               float z = sc.nextFloat();

                 if ( x == 0){
                     if (y == 0){
                         System.out.println("phuong trinh vo nghiem");
                     }
                     else {
                         System.out.println("phuong trinh 1 nghiem" + "x = " + (-x / y));
                     }

                 }
                     float delta = y*y - 4*x*z;
                     float x1;
                     float x2;
                     if (delta > 0) {
                         x1 = (float) ((-y + Math.sqrt(delta)) / (2*x));
                         x2 = (float) ((-y - Math.sqrt(delta)) / (2*x));
                         System.out.println("Phương trình có 2 nghiệm là: "
                                 + "x1 = " + x1 + " và x2 = " + x2);
                     } else if (delta == 0) {
                         x1 = (-y / (2 * a));
                         System.out.println("Phương trình có nghiệm kép: "
                                 + "x1 = x2 = " + x1);
                     } else {
                         System.out.println("Phương trình vô nghiệm!");
                     }


           }
           catch (Exception e) {
               System.out.println("Something went wrong");
           }
       }
            return (int)a;
    }

}
