import java.util.Scanner;
  public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        int angka = input.nextInt();
        int hasil = angka % 2;

        if ( hasil % 2 == 0) {
          System.out.println( angka + " termasuk bilangan genap");
        } else {
          System.out.println( angka + " termasuk bilangan ganjil");
        }
          
        input.close();
    }
}

