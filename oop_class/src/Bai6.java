import java.util.Scanner;

public class Bai6 {

    public static int tile(


    ){
        boolean run = true;
        int a = 0;
        while(run =true){
            try { Scanner sc = new Scanner(System.in);
                System.out.println("nhap so dien ");
                int sodien = sc.nextInt();

                int tiendien ;
                if(sodien <= 50){
                    tiendien = sodien*100;
                }
                else {
                    tiendien = 50*1200 + (sodien-50)*1200;
                }
                System.out.println( "tien dien su dung la " + tiendien + " tien" );}
            catch (Exception e){
                System.out.println("Something went wrong");
            }
        }



        return (int)a;
    }

}
