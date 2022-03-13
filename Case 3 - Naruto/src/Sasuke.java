/**
 * CASE 3 TEKPRO PRAKTIK
 * Nama: Syifa Khairina
 * NIM: 211524063
 * Kelas: 1B D4 Teknik Informatika
 */

public class Sasuke extends Itachi {
    String Dojutsu = "Sharingan";
    Itachi itachi1 = new Itachi(); // create object baru untuk mengakses
                                   // behavior dari kelas parent Itachi
    
    void printDojutsu() {
    itachi1.printDojutsu(); // akses method printDojutsu dengan new object
    System.out.println(this.Dojutsu);
}

}
