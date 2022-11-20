import java.util.ArrayList;
import java.util.List;

public class id {

    public void Mahasiswa(int i, String didhan_aditya_huda, String tifrm22A, int i1) {
    }
    
    public static void main(String[] args) {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa(2255201, "Fauzi Darmawan", "TIFRM22A", 181122));
        mahasiswaList.add(new Mahasiswa(2255202, "Doni Ramdani", "TIFRM22B", 181122));
        mahasiswaList.add(new Mahasiswa(2255203, "Hidayat saepullah", "TIFK22A", 181122));
        mahasiswaList.add(new Mahasiswa(2255204, "Abdul Hermawan", "TIFK22B", 181122));
        mahasiswaList.add(new Mahasiswa(2255205, "Prasetyo Nurulhuda", "TIFRM22C", 181122));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        mahasiswaList.remove(0);

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
    }

}


