import java.util.Scanner;

public class InputOutput {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String nama;
        System.out.println("Masukan nama anda : ");
        nama = scanner.nextLine();
        System.out.println("Hai, "+nama);
    }
}