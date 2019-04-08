package oop_project2;

import java.util.ArrayList;


public class Firma_Hisse_Senetleri implements Subject {
    
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int Hisse_Senedi;
    private String Firma_Adi;
    
    public Firma_Hisse_Senetleri( int Hisse_Senedi, String Firma_Adi) {
        
            this.Hisse_Senedi = Hisse_Senedi;
            this.Firma_Adi = Firma_Adi;
    }
    public int getHisse_Senedi() {
            return Hisse_Senedi;
    }
    public String getFirma_Adi() {
            return Firma_Adi;
    }
    public void setHisse_Senedi(int Hisse_Senedi) {
            this.Hisse_Senedi = Hisse_Senedi;
            notifyObservers();
    }
    @Override
    public void attach(Observer observer) {
              observers.add(observer);
    }
    @Override
    public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(this.Hisse_Senedi,this.Firma_Adi);
            }
    }

}
