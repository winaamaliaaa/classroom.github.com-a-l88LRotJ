
import java.util.Scanner; //import scanner kedalam program

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat Scanner baru
        int x = 0;      // inisialisasi awal variabel x
        int n = 0;      // inisialisasi awal variabel n
        x = input.nextInt();    //Memasukkan nilai dari variabel x
        n = input.nextInt();    //Memasukkan nilai dari variabel n
        System.out.println(x * n); //Mencetak hasil perkalian variabel x dengan n
    }
}
