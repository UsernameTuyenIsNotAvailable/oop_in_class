import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n = ");
        try {
            int n=sc.nextInt();
        }
        catch(Exception e) {
            System.out.println("nhap so ");
        }
        int n=sc.nextInt();

        if(checksonguyento(n)){
            System.out.println(n+" là số nguyên tố!");
        } else {
            System.out.println(n+" không là số nguyên tố!");
        }



    }
    public static boolean checksonguyento( int n){
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

return true;
    }

}



