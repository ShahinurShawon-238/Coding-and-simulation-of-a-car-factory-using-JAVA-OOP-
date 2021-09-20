package carfactory;

import java.util.Random;

public class Model extends Car{
    public int ModelNo(){
    Random model = new Random();
    int modelNo = model.nextInt(99)+1;
    display();
    return modelNo;
    
    }
    @Override
    public void display(){
        System.out.println("Your new car has been created");
    }
    
}
