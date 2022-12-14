public class araba{

   private String model;
   private int bas_km;
   private int bit_km;
  private   int ucret;

    public araba(String m){
        model=m;
        if(model=="BMW"){
            ucret=120;}
            else
                ucret=150;

            }

    public void  setBas_km(int x){
        bas_km=x;
    }
public void setBit_km(int x){
        bit_km=x;
}
public void setUcret(int x){
        ucret=x;
}
public int getBas_km(){

        return bas_km;
}
public int getBit_km()
{
    return bit_km;
}

    public int getUcret() {
        return ucret;
    }

    public int UcretHesapla(araba x){

        int t=(bit_km-bas_km)*ucret;

         return t;
    }


}
