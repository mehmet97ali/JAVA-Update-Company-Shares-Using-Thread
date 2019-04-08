package oop_project2;

public class gozlemci_2 extends Observer{
    
       @Override
       public void update(int Hisse_Senet,String Firma_Adi) {
           System.out.println("Sayın Ahmet Bey  "+Firma_Adi+"  Firmasının Hisseleri Güncellendi... "+
                   "\n Yeni Hisse: "+Hisse_Senet+"\n");
       }
}
