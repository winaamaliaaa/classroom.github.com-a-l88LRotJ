
import java.util.Scanner; //import Scanner kedalam program

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //Membuat Scanner Baru
        int n, t;   //Deklarasi variabel
        n = input.nextInt();    //Memasukkan nilai n
        t = input.nextInt();    //Memasukkan nilai t
        System.out.println(n / t);  //Mencetak hasil pembagian n dan t
        System.out.println(n % t);  //Mencetak hasil modulus n dan t
    }
}
