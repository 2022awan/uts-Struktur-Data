import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class id {

    public static void main(String[] args) {
        LinkedList<Mahasiswa> mahasiswaList = new LinkedList<>();
        mahasiswaList.add(new Mahasiswa(2255201, "Fauzi Darmawan", "TIFRM22A", 181122));
        mahasiswaList.add(new Mahasiswa(2255202, "Doni Ramdani", "TIFRM22B", 181122));
        mahasiswaList.add(new Mahasiswa(2255203, "Hidayat saepullah", "TIFK22A", 181122));
        mahasiswaList.add(new Mahasiswa(2255204, "Abdul Hermawan", "TIFK22B", 181122));
        mahasiswaList.add(new Mahasiswa(2255205, "Prasetyo Nurulhuda", "TIFRM22C", 181122));

        Scanner valueId = new Scanner(System.in);
        Scanner valueName = new Scanner(System.in);
        Scanner valueKelas = new Scanner(System.in);
        Scanner valueTanggal = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        System.out.println("Masukan Data Mahasiswa Untuk Ditambahkan");
        System.out.print("Masukan Id Mahasiswa : ");
        int id = valueId.nextInt();
        System.out.print("Masukan Nama Mahasiswa : ");
        String name = valueName.nextLine();
        System.out.print("Masukan Kelas Mahasiswa : ");
        String kelas = valueKelas.nextLine();
        System.out.print("Masukan Tanggal : ");
        int tanggal = valueTanggal.nextInt();

        mahasiswaList.add(new Mahasiswa(id, name, kelas, tanggal));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

        System.out.println("Masukan Data Mahasiswa Untuk Dihapus");
        System.out.print("Masukan Nama Mahasiswa : ");
        String nameRemove = value.nextLine();
        mahasiswaList.removeIf(mahasiswa -> mahasiswa.getNama().contains(nameRemove));
        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

    }

}



