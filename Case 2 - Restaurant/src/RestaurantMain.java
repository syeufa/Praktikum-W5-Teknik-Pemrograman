/**
 * CASE 2 PRAKTIKUM W5 TEKPRO
 * Nama: Syifa Khairina
 * NIM: 211524063
 * Kelas: 1B D4 Teknik Informatika
 */

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        
        //Lakukan pemesanan
        menu.pesanMakanan("Gehu", 10);
        menu.pesanMakanan("Molen", 5);
        
        System.out.println("== Setelah Dilakukan Pemesanan ==");
        menu.tampilMenuMakanan();
}
}  
