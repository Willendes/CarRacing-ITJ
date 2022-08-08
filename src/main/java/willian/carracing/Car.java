/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package willian.carracing;

/**
 *
 * @author willian
 */
public class Car{
    
    private int point = 0;
    private String name;
  
    public int broked(float brkProb){
        if (brkProb >= (Math.random() * 101)){
            return 30;
        }  
        return 0;
    }
    
    public int fueling(float fuelProb){
        if (fuelProb >= (Math.random() * 101)){
            return 15;
        } 
      return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public void setPoint(int point){
        this.point = point;
    }
    
    public float getPoint(){
        return this.point; 
    }
    
    @Override
    public String toString() {
        return "Car{" + "point=" + point + '}';
    }
}
