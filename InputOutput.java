import java.util.Scanner;

public class InputOutput {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String nama;
        int jumlahSks;
        double IPK;

        System.out.print("Masukan Nama Anda : ");
        nama = scanner.nextLine();
        System.out.println("Hai, "+nama);

        System.out.print("Masukan Jumlah SKS Yang Sudah Ditempuh : ");
        jumlahSks = scanner.nextInt();

        System.out.print("Masukan IPK Sementara : ");
        IPK = scanner.nextDouble();

        double jumlah = IPK * jumlahSks;
        System.out.print("Total Nilai = "+jumlah);
    }
}