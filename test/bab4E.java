/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMD KOMPUTER
 */
public class bab4E {
    private int LuasAlas;
    public int tinggi;
    double volume;
    
    public int getLuasAlas(){
        return LuasAlas;
    }
    public void setLuasAlas(int LuasAlas){
        this.LuasAlas=LuasAlas;
    }
    double VolumeLimas(){
        volume = (getLuasAlas()*tinggi)/3;
        return volume;
    }
}
