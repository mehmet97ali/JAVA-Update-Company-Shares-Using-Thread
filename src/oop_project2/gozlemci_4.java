package oop_project2;

public class gozlemci_4 extends Observer{
    
       @Override
       public void update(int Hisse_Senet,String Firma_Adi) {
           System.out.println("Sayın Filiz Hanım  "+Firma_Adi+"  Firmasının Hisseleri Güncellendi... "+
                   "\n Yeni Hisse: "+Hisse_Senet+"\n");
       }
}
