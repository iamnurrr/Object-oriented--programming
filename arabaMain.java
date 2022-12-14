import java.util.*;
public class arabaMain {
               public static void main(String[] args) {
        //ArabaSınıfı-model: String-bas_km: int-bitis_km: int-ucret : int<< constructor>> Araba(m:String)
       // Bir  araç  kiralama  şirketinde  kiralananaraçların  ücret   hesabı  için  bir  program  yazmanız beklenmektedir.
        // Bu şirkette iki model araç bulunmaktadır.  Model-1 içinkm başınakiralama ücreti 100TL, Model-2 içinkm başına kiralama ücreti150TL’dir.
        // Bu amaçla: Bir araba sınıfı ve bu sınıfın çalışmasını sınayacak bir test metodu yazılacaktır.
        // Araba sınıfının temel özellikleri yukarıdaki UML şemasında verilmiştir
        // (Sadece UML de verilmiş constructor’ı kullanabilirsinizancak ek metodlar yazabilirsiniz).
        // Araba sınıfı içerisindeki UcretHesapla()metodu  biraraba  nesnesi  parametrealarak,  kiralama ücretini hesaplayacak ve geri döndürecektir.
        // Test sınıfında iki adet araba nesnesi oluşturun. Bu nesnelerin model bilgileri farklı olmalıdır.
        // Oluşturduğunuz  her  araba  nesnesi  için  başlangıç  ve  bitiş  km.  bilgisi klavyedengirilecektir.
        //Oluşturulan bu nesneler için ödenmesi gereken kira ücreti ekrana yazdırılmalıdır.
                araba c1=new araba("BMW");
                araba c2=new araba("Mercedes");
                 Scanner inp=new Scanner(System.in);
                   System.out.println("BMW'nin Başlangıç km giriniz:");
                   int b1= inp.nextInt();
                    c1.setBas_km(b1);
                   System.out.println("BMW'nin Bitiş km giriniz:");
                   int f1= inp.nextInt();
                   c1.setBit_km(f1);

                   System.out.println("Mercedes'in Başlangıç km giriniz:");
                   int b2= inp.nextInt();
                   c2.setBas_km(b2);

                   System.out.println("Mercedes'in Bitiş km giriniz:");
                   int f2= inp.nextInt();
                   c2.setBit_km(f2);

                   System.out.println("BMW'nin Başlangıç km"+" "+c1.getBas_km());
                   System.out.println("Mercedesin Başlangıç km"+" "+c2.getBas_km());

                   System.out.println("BMW için ödenmesi gereken ücret:"+c1.UcretHesapla(c1));
                   System.out.println("Mercedes için ödenmesi gereken ücret:"+c2.UcretHesapla(c2));
    }

}
