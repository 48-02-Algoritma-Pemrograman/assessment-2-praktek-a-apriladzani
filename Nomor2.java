import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        String[] daftarBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int[] hargaBuku = {350000, 450000, 500000, 95000};

        boolean a = true;
        while (a) {
            System.out.print("Masukan pilihan buku [1/2/3/4]:");
            int pilihan = scanner.nextInt();
            hargaBelanja.add(hargaBuku[pilihan - 1]);
            System.out.print("Input lagi (Y/N)?: ");
            String jawaban = scanner.next();
            if (jawaban.equalsIgnoreCase("N")) {
                a = false;
            }
        }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
