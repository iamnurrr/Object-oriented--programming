import java.util.ArrayList;

public class ogrenci {

    public static String Sehir;
    private String ad;
    private String soyad;
    private int dogumYil;
    private String okulNo;
    private ArrayList<String>Dersler ;//=new ArrayList<>();
    public ogrenci() {

    }
    public ogrenci(String ad,String soyad,int dogumYil,String okulNo,ArrayList dersler){
        this.ad=ad;
        this.soyad=soyad;
        this.okulNo=okulNo;
        this.Dersler=dersler;
        this.dogumYil=dogumYil;
    }


    public static void setSehir(String okulAdi){
        ogrenci.Sehir=okulAdi;
    }
    public static String getSehir(){
        return Sehir;
    }
    public void setAd(String ad){
        this.ad=ad;
    }
    public  String getAd(){
        return ad;
    }
    public void setSoyad(String soyad){
        this.soyad=soyad;
    }
    public String getSoyad(){
        return soyad;
    }
    public void setDogumYil(int yil){
        dogumYil=yil;
    }
    public int getDogumYil(){
        return dogumYil;
    }
    public void setOkulNo(String no){
        okulNo=no;
    }
    public String getOkulNo(){
        return okulNo;
    }
    public void setDersler(ArrayList<String>x){
        this.Dersler=x;
    }
    public ArrayList<String>getDersler(){
        return Dersler;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogumYil=" + dogumYil +
                ", okulNo='" + okulNo + '\'' +
                ", Dersler=" + Dersler +
                '}';
    }
}
