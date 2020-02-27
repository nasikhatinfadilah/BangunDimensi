
import bangundimensi.PersegiPanjang.Balok;
import bangundimensi.PersegiPanjang.LimasPersegiPanjang;
import bangundimensi.lingkaran.Bola;
import bangundimensi.lingkaran.Tabung;
import bangundimensi.persegi.Kubus;
import bangundimensi.persegi.LimasPersegi;
import bangundimensi.persegi.Persegi;


import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int panjang, lebar, tinggi, jari;
    char kembali;

    do {
      System.out.println("\nMenghitung Luas, Keliling Dan Volume\n");
      System.out.print("Input Panjang : ");
      panjang = input.nextInt();
      System.out.print("Input Lebar : ");
      lebar = input.nextInt();
      System.out.print("Input Tinggi : ");
      tinggi = input.nextInt();
      System.out.print("Input Jari-Jari : ");
      jari = input.nextInt();

      Tabung tabung= new Tabung(jari,tinggi);
      Bola bola = new Bola(jari);
      Persegi persegi = new Persegi(panjang);
      LimasPersegi limaspersegi=new LimasPersegi(panjang, tinggi);
      Kubus kubus = new Kubus(panjang);
      LimasPersegiPanjang limasPP = new LimasPersegiPanjang(panjang, lebar, tinggi);
       Balok balok = new Balok(panjang, lebar, tinggi);

      tabung.tampil();
      bola.tampil();
      limaspersegi.tampil();
      kubus.tampil();
      balok.tampil();
      limasPP.tampil();

      System.out.print("\nUlang? : ");
      kembali = input.next().charAt(0);
    } while (kembali == 'y');
  }

}