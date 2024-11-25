import java.util.Scanner;

public class appKasir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inisialisasi
        int pilih = 0, pilihSubMenu = 0;
        String barang [] = {"Paha Atas", "Paha Bawah", "Sayap", "Dada", "Milo"};
        int harga[] = {20000, 15000, 20000, 15000, 7000};

        // Tampilkan daftar barang
        System.out.println("Data Barang");
        for (int i = 0; i < barang.length; i++) {
            System.out.println((i+1) + ". " + barang[i] + " [" + harga[i] + "] ");
        }

        // Tampilan aplikasi
        do{
            System.out.println("\nAplikasi Kasir");
            System.out.println("1. Pembelian");
            System.out.println("2. Master Barang");
            System.out.println("3. Exit");
            System.out.print("Pilihan : "); pilih = sc.nextInt();

            switch(pilih){
                case 1 :
                    System.out.println("\nSkip dulu...");
                    break;

                case 2:
                    System.out.println("Sub Menu");
                    System.out.println("1. Urutkan Barang");
                    System.out.println("2. Ubah Barang");
                    System.out.print("Pilihan : "); pilihSubMenu = sc.nextInt();

                    switch(pilihSubMenu){
                        case 1 :
                            // Bubble sort
                            for (int i = 0; i < barang.length; i++){
                                for (int j = 0; j < barang.length-1; j++){
                                    if(barang[j].compareToIgnoreCase(barang[j+1]) > 0){
                                        String temp = barang[j];
                                        barang[j] = barang[j+1];
                                        barang[j+1] = temp;

                                        // Tukar harga barang
                                        int temp2 = harga[j];
                                        harga[j] = harga[j+1];
                                        harga[j+1] = temp2;
                                    }
                                }
                            }

                            // Tampilkan hasil sorting
                            System.out.println("\nHasil Pengurutan Nama Barang");
                            for (int i = 0; i < barang.length; i++) {
                                System.out.println((i+1) + ". " + barang[i] + " [" + harga[i] + "] ");
                            }
                            break;

                        case 2:
                            System.out.println("Ubah Harga");
                            System.out.print("Masukkan nama barang : "); String namaBarang = sc.next();
                            boolean ketemu = false;
                            for (int i = 0; i < barang.length; i++) {
                                if(namaBarang.equalsIgnoreCase(barang[i])){
                                    ketemu = true;
                                    System.out.println("Harga Lama : " + harga[i]);
                                    System.out.print("Harga Baru : "); int hargaBaru = sc.nextInt();
                                    harga[i] = hargaBaru;
                                }

                            }

                            if (ketemu){
                                System.out.println("Harga Barang berhasil diubah");
                            } else {
                                System.out.println("Barang tidak ada!");
                            }
                            break;

                        default :
                            System.out.println("Pilihan tidak ada!");
                            break;
                    }
                    break;

                case 3 :
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }while (pilih != 3);
    }
}
