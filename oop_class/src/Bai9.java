import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.println("Nhập lựa chọn:\n[1] Tinh tien dien .\n[2] Tinh phuong trinh bac1 .\n[3] Tinh phuong trinh bac 3.\n[4] Thoát chương  trình.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int choose = sc.nextInt();


        switch (choose) {

            case 1:

                Bai6.tile();

                break;

            case 2:

                Bai7.GiaiNghiemBac1();
                break;

            case 3:
                Bai8.GiaiMghiemBac2();
                break;
            case 4:
                break;
        }


    }}


