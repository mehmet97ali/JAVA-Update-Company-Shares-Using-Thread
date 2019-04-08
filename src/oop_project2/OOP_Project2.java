package oop_project2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

public class OOP_Project2 {

    public static void main(String[] args) throws FileNotFoundException {
       
       
       Firma_Hisse_Senetleri hisse_A=new Firma_Hisse_Senetleri(12,"A");
       Firma_Hisse_Senetleri hisse_B=new Firma_Hisse_Senetleri(5,"B");
       Firma_Hisse_Senetleri hisse_C=new Firma_Hisse_Senetleri(9,"C");
       Firma_Hisse_Senetleri hisse_D=new Firma_Hisse_Senetleri(45,"D");
       Firma_Hisse_Senetleri hisse_E=new Firma_Hisse_Senetleri(89,"E");
      
       
       gozlemci_1 observer_1=new gozlemci_1();
       gozlemci_2 observer_2=new gozlemci_2();
       gozlemci_3 observer_3=new gozlemci_3();
       gozlemci_4 observer_4=new gozlemci_4();
       gozlemci_5 observer_5=new gozlemci_5();
       
       
       
       hisse_A.attach(observer_1);
       hisse_A.attach(observer_4);
       hisse_A.attach(observer_5);
       
       hisse_B.attach(observer_2);
       
       hisse_C.attach(observer_1);
       hisse_C.attach(observer_5);
       
       hisse_D.attach(observer_5);
       hisse_D.attach(observer_4);
       hisse_D.attach(observer_2);
       hisse_D.attach(observer_3);
       
       hisse_E.attach(observer_2);
       hisse_E.attach(observer_4);   
  
       
       Runnable gethisse = new NewThread(hisse_A,hisse_B,hisse_C,hisse_D,hisse_E);
       new Thread(gethisse).start();

    }
    
}
