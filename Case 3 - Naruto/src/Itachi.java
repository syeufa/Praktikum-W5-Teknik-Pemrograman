/**
 * CASE 3 TEKPRO PRAKTIK
 * Nama: Syifa Khairina
 * NIM: 211524063
 * Kelas: 1B D4 Teknik Informatika
 */

public class Itachi extends Rikudo {
private String KekkeiGenkai = "Susanoo";
private String Dojutsu = super.Dojutsu;

void printKekkeiGenkai(){
System.out.println(this.KekkeiGenkai);
}   

void printDojutsu() {
System.out.println(this.Dojutsu);
this.setDojutsu(); // mengisi var dojutsu dengan "mangekyou sharingan"
System.out.println(this.Dojutsu);
}
private void setDojutsu() {
this.Dojutsu = "Mangekyou Sharingan";
}
}
