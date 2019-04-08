package oop_project2;

import java.util.Random;

public class NewThread implements Runnable{
    int Number;
    private Subject senet_A,senet_B,senet_C,senet_D,senet_E;
    
    public NewThread(Subject senet_A,Subject senet_B,Subject senet_C,Subject senet_D,Subject senet_E){
      this.senet_A=senet_A;
      this.senet_B=senet_B;
      this.senet_C=senet_C;
      this.senet_D=senet_D;
      this.senet_E=senet_E;
    }
    @Override
    public void run(){
      
        for(int i = 1; i <= 3; i++){

            try{ Thread.sleep(2000); } catch(InterruptedException e){}
            
            Random rand = new Random();
            
             System.out.println("\n------ A FİRMASI HİSSE SENETLERİ GUNCELLENDİ -------\n");
            ((Firma_Hisse_Senetleri)senet_A).setHisse_Senedi(rand.nextInt(100)+1);  
             try{ Thread.sleep(2000); } catch(InterruptedException e){}
            
             System.out.println("\n------ B FİRMASI HİSSE SENETLERİ GUNCELLENDİ -------\n");
            ((Firma_Hisse_Senetleri)senet_B).setHisse_Senedi(rand.nextInt(100)+1);
            try{ Thread.sleep(2000); } catch(InterruptedException e){}
            
            System.out.println("\n------ C FİRMASI HİSSE SENETLERİ GUNCELLENDİ -------\n");
            ((Firma_Hisse_Senetleri)senet_C).setHisse_Senedi(rand.nextInt(100)+1);
            try{ Thread.sleep(2000); } catch(InterruptedException e){}
            
            System.out.println("\n------ D FİRMASI HİSSE SENETLERİ GUNCELLENDİ -------\n");
            ((Firma_Hisse_Senetleri)senet_D).setHisse_Senedi(rand.nextInt(100)+1);
            try{ Thread.sleep(2000); } catch(InterruptedException e){}
            
            System.out.println("\n------ E FİRMASI HİSSE SENETLERİ GUNCELLENDİ -------\n");
            ((Firma_Hisse_Senetleri)senet_E).setHisse_Senedi(rand.nextInt(100)+1);
            try{ Thread.sleep(2000); } catch(InterruptedException e){}
            
        }

    }
}
