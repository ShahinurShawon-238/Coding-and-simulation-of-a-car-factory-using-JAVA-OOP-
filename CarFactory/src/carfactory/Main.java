package carfactory;

import java.util.Scanner;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----------------------------BS CAR FACTORY-------------------------------");
        System.out.println("-Welcome to BS car factory Here you can create your car and manufsctured-");
        System.out.println("Do you want to create a car???");
        System.out.println("1.Yes\n2.No");
        System.out.print("Enter your Choice(Yes/No): ");
        String ch = sc.nextLine();
        
        if(ch.equalsIgnoreCase("yes"))
        {
            CarFactory cf = new CarFactory();
            cf.display();
            System.out.println("\n\n");
            
            
            CreatorInfo ci = new CreatorInfo();
            ci.setName("S.S.R. Shawon");
            ci.setNumber(1954154357);
            
            
            System.out.println("Creator name: "+ci.getName());
            System.out.println("Phone number: "+ci.getNumber());
            ci.CreatorInfoDisplay();
            
            
        }
        else if(ch.equalsIgnoreCase("no")){
            ChoiceNo cn = new ChoiceNo();
            cn.IfChoiceIsNo();
        }
        else{
            System.out.println("Wrong Input");
        } 
        String newe;
        while(true){
        
        System.out.println("\n\n\n");
        System.out.println("Do you want to do the task again: ");
        System.out.print("Enter your choice(Yes/No):");
        newe = sc.nextLine();
        if(newe.equalsIgnoreCase("Yes"))
        {
        System.out.println("Do you want to create a car???");
        System.out.println("1.Yes\n2.No");
        System.out.print("Enter your Choice(Yes/No): ");
        String ch2 = sc.nextLine();
        
        if(ch2.equalsIgnoreCase("yes"))
        {
            CarFactory cf = new CarFactory();
            cf.display();
            System.out.println("\n\n");
            
            
            
            CreatorInfo ci = new CreatorInfo();
            ci.setName("S.S.R. Shawon");
            ci.setNumber(1954154357);
            
            System.out.println("Creator name: "+ci.getName());
            System.out.println("Phone number: "+ci.getNumber());
            ci.CreatorInfoDisplay();
            
            
        }
        else if(ch2.equalsIgnoreCase("no")){
          ChoiceNo cn2 = new ChoiceNo();
          cn2.IfChoiceIsNo();
        }
        else{
            System.out.println("Wrong Input");
        } 
        }
        else if(newe.equalsIgnoreCase("No"))
        {
               System.exit(0); 
        }
        else{
            System.out.println("Wrong Input");
        }
        }
        
        
    }

    
    
}

