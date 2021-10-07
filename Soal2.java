
import java.util.Scanner; //import scanner kedalam program

public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //Membuat Scanner baru
        String nama;    //deklarasi variabel nama
        int umur;       //deklarasi variabel umur
        nama = input.nextLine();    //Memasukkan nilai dari variabel nama
        umur = input.nextInt();     //Memasukkan nilai dari variabel umur
        System.out.println("Halo, " + nama); //Mencetak variabel nama
        System.out.println("Ternyata usiamu baru " + umur + " Tahun ya!"); //Mencetak variabel umur
    }
}
