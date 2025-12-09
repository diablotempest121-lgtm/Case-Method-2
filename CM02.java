import  java.util.Scanner;
public class CM02 {
  static void tampilan(){
    Scanner sc=new Scanner(System.in);
    System.out.println("=== Sistem Pendaftaran Magang Mahasiswa ===");
    System.out.println("1. Tambah data magang");
    System.out.println("2. Tampolkan semua pendaftar magang");
    System.out.println("3. Cari pendaftar berdasarkan program study");
    System.out.println("4. Hitung jumlah pendaftar untuk setiap status");
    System.out.println("5. Keluar");
    System.out.print("Pilih menu(1-5:" );
  }
  static void data(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Nama mahasiswa: ");
    String nama=sc.nextLine();
    System.out.print("NIM: ");
    int NIM=sc.nextInt();
    System.out.print("Prodi: ");
    String prodi=sc.nextLine();
    System.out.print("Perusahaan tujuan magang: ");
    String perusahaan=sc.nextLine();
    System.out.print("Semesster pengambilan magang: ");
    int semester=sc.nextInt();
    System.out.print("Status magang(diterima/menunggu/ditolak: )");
    String status=sc.nextLine();
    status=sc.nextLine();
    System.out.println("=================================================");
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    do {
      tampilan();
      int a=sc.nextInt();
      if (a==5) {
        break;
      }else if (a==1) {
        data();
      }
      sc.nextLine();
    } while (true);
  }
}
