import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
public class Bai7 {
    public static void main(String[] args) {

    }
    public static int GiaiNghiemBac1(

    )

    {
        boolean run = true;
        int a = 0;
        while (run = true) {
            try {

                int aNumber, bNumber;
                double nghiem;
                DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân
                Scanner scanner = new Scanner(System.in);

                System.out.println("Nhập vào số a: ");
                aNumber = scanner.nextInt();
                System.out.println("Nhập vào số b: ");
                bNumber = scanner.nextInt();

                System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
                if (aNumber == 0) {
                    if (bNumber == 0) {
                        System.out.println("Phương trình này có vô số nghiệm.");
                    } else {
                        System.out.println("Phương trình vô nghiệm.");
                    }
                } else {
                    nghiem = (double) -bNumber / aNumber;   // ép kiểu để cho ra kết quả chính xác
                    System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
                }

            }
            catch (Exception e) {
                System.out.println("sothingstrong");
            }



        }

        return (int)a ;
    }
}
