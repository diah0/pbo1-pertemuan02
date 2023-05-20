import koneksi.Database;
import model.Dosen;
import model.Mahasiswa;
import model.Matakuliah;

public class Main {
    public static void main (String [] args){
        System.out.println("Ini Program Main");
        Database.hubungkan();
        Dosen.tampilanInfo();
        Mahasiswa.tampilanInfo();
        Matakuliah.tampilanInfo();
    }
}