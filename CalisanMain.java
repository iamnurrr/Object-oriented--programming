import java.util.*;
public class CalisanMain {
    public static void main(String[] args) {

  calisan c1=new calisan("Merve",10000,8,6);
  calisan c2= new calisan();
  Scanner scn =new Scanner(System.in);
        System.out.println("Girili olan çalışanın bilgileri");
        c1.bas();
        System.out.println("*************************");
        System.out.println("Çalışanın ismini giriniz: ");
        c2.isim=scn.nextLine();
        System.out.println("Çalışanın maaşını giriniz: ");
        c2.maas=scn.nextInt();
        System.out.println("Çalışanın kaç saat çalıştığını giriniz:  ");
        c2.saat=scn.nextInt();
        System.out.println("Çalışanın kaç yıl çalıştığını giriniz");
        c2.yil=scn.nextInt();
        c2.bas();

    }
}