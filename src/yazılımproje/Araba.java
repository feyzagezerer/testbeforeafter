/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazılımproje;

/**
 *
 * @author feyza
 */
public class Araba {
    private double hiz;
    private double yol;
    private double depo;
    
    public Araba(double depo){
       hiz=0;
       this.depo = depo;
    }
        
    public void sur(double zaman){
        if  (hiz<=0)throw new IllegalArgumentException("hız girilmeli");
        yol=hiz*zaman;
            depo -= (yol/100)*ortalamaYakit();
        }
    public void setHiz(double hiz){
        this.hiz=hiz;
        
    }
    public double getHiz(){
        return hiz;
    }
    public double getYol(){
        return yol;
        
    }
    public double getDepo(){
        return depo;
    }
    public double ortalamaYakit(){
        if(hiz<=100)return 7;
        else if(hiz<=130) return 8;
        else if(hiz<=150)return 9;
        else if(hiz<=180)return 10;
        else if(hiz<=200)return 12;
        else return 15;
    }
    public double menzil(){
        return 100*(depo/ortalamaYakit());
    }
    public void SifirYuz(){
    try{
        Thread.sleep(3000);
    }
    catch(InterruptedException ex){
        
    }
}
}
