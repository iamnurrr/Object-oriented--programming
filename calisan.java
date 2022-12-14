public  class calisan {
    public String isim;
    public double maas;
   public int saat;
   public int yil;
  public calisan(){

  }
    public calisan(String isim, double maas, int saat, int yıl) {

        this.isim = isim;
        this.maas = maas;
        this.saat = saat;
        this.yil = yil;

    }

    public  double vergi() {
        if (maas > 5000) {
            double vergi = maas * 0.05;
            return vergi;
        }
        else
        return 0;
    }

    public  double bonus (){
       int saat1 =250*this.saat;
    return saat1;
    }
    public  double kacyıl(){
        if(this.yil<10){
            double ymaas=this.maas;
            return ymaas*0.10;
        }
        if(yil>10 && yil<20){
            return this.maas*0.15;
        }
        if(yil>20){
            return this.maas*0.25;
        }
        else return  0;
    }
    public double guncelmaas(){
        double gmaas=this.maas+bonus()+kacyıl()-vergi();
        return gmaas;
    }

    public  void bas(){
        System.out.println("İsminiz:"+this.isim);
        System.out.println("Şuan ki Maaşınız: "+this.maas);
        System.out.println("Ödeyeceğiniz vergi: "+this.vergi());
        System.out.println("Alacağınız Bonus: "+bonus());
        System.out.println("Maaş artışı : "+kacyıl());
        System.out.println("Güncel Maaşınız: "+guncelmaas());
    }

}

