import java.util.ArrayList;

public class ogrenciMain {
    public static void main(String[] args) {
        ArrayList<String>dersler=new ArrayList<>();
        ArrayList<String>dersler2=new ArrayList<>();
        dersler.add("Veri yapıları");
        dersler.add("Ayrık Matematik");
        dersler.add("Nesne Yönelimli programlama");

        dersler2.add("Matematik");
        dersler2.add("Fizik");
        dersler2.add("Biyoloji");
        dersler2.add("Ingilizce");

        ogrenci.setSehir("Çanakkale");
        ogrenci ogr1=new ogrenci("Merve","Çelik",2002,"210401000",dersler);
        ogrenci ogr2=new ogrenci();
        ogrenci ogr3=new ogrenci("May","Cody",2009,"123456",dersler2);

        ogr2.setAd("Toso");
        ogr2.setSoyad("Çelik");
        ogr2.setDogumYil(2005);
        ogr2.setOkulNo("220401056");
        ogr2.setDersler(dersler2);

        System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);
        System.out.println("Öğrencilerin bulunduğu şehir: "+ogrenci.getSehir());

    }
}
