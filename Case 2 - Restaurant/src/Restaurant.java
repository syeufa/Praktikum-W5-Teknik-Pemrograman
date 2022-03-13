/**
 * CASE 2 PRAKTIKUM W5 TEKPRO
 * Nama: Syifa Khairina
 * NIM: 211524063
 * Kelas: 1B D4 Teknik Informatika
 */

public class Restaurant {
    public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stok;
    public static byte id=0;

    public Restaurant() {
    nama_makanan = new String[10];
    harga_makanan = new double[10];
    stok = new int[10];
    }
    
    //                   BUAT SETTER DAN GETTER
                       
    //setter  
    public void setNamaMakanan(String[] nama_makanan){
        this.nama_makanan = nama_makanan;
    }

    public void setHargaMakanan(double[] harga_makanan){
        this.harga_makanan = harga_makanan;
    }

    public void setStok(int[] stok){
        this.stok = stok;
    }

    public static void setId(byte id){
        Restaurant.id = id;
    } 
    
   
    //getter
    
    //tanpa ID
    public String[] getNamaMakanan(){
        return nama_makanan;
    }
     public double[] getHargaMakanan(){
        return harga_makanan;
    }
    
    public int[] getStok() {
        return stok;
    }
    
    
    //dengan ID
    public String getNamaMakanan(int id){
        return nama_makanan[id];
    }
    
    public double getHargaMakanan(int id){
        return harga_makanan[id];
    }

    
    public int getStok(int id){
        return stok[id];
    }
    

    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
    this.nama_makanan[id] = nama;
    this.harga_makanan[id] = harga;
    this.stok[id] = stok;
    }
    
    public void tampilMenuMakanan(){
    for(int i =0; i<=id;i++){
        if(!isOutOfStock(i)){
            System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }
    
    //method untuk memesan makanan
    public void pesanMakanan(String nama_makanan, int qty){
       int i= 0;
       while (i<=id){
       if(nama_makanan == getNamaMakanan(i)){
           int n = 0;
            while (n < qty){
            if(!isOutOfStock(i)){ 
                    this.stok[i]--; // mengurangi stok
                   n++;
                   }
       }
       }
       i++;
       
    }
       
   }
    
    public boolean isOutOfStock(int id){
    if(stok[id] == 0){
        return true;
    }else{
        return false;
        }
    }
    public static void nextId(){
    id++;   
    }
    

         }
   
   
    
