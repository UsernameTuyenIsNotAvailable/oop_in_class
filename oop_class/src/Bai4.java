import java.util.Scanner;

public class Bai4
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a : ");
        int a = sc.nextInt();

        System.out.print("nhap b :  " );
        int b = sc.nextInt();
        System.out.print("nhap c : "  );
        int c = sc.nextInt();

        int delte = (int) (Math.pow(b,2) -4*a*c);
        System.out.println("ket qua "+ delte);
        if (delte == 0){
            System.out.println("phuong trinh co nghiem kep ");

        }
        else if (delte < 0){
            System.out.println("phuong trinh co vo so nghiem  ");
        }
        else  {
            System.out.println("phuong trinh co 0 nghiem  ");
        }

    }
}
