package carfactory;
public class CarFactory extends Car{

    @Override
    public void display(){
        System.out.println("Which brand of car would you like to create??");
        System.out.println("1.Toyota\n2.Volkswagen\n3.Mitsubishi");
        System.out.print("Enter your car's brand name: ");
        try{
        String brand = Main.sc.nextLine();
        if(brand.equalsIgnoreCase("toyota"))
        {
            Toyota.ChModell();
        }
        else if(brand.equalsIgnoreCase("volkswagen"))
        {
            Volkswagen.ChModell();
        }
        else if(brand.equalsIgnoreCase("mitsubishi"))
        {
            Mitsubishi.ChModel1();
        }
        else{
            System.out.println("Wrong Input");
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    public void create()
        {
            try{
            System.out.print("Enter the color name: ");
            String color = Main.sc.nextLine();
            System.out.println("Engine types are: \n1.Normal\n2.Average\n3.Fast");
            System.out.print("Enter your engine type: ");
            String et = Main.sc.nextLine();
            System.out.println("Do you want SelfDriving car?");
            System.out.println("1.Yes\n2.No");
            System.out.print("Enter your choice: ");
            String sd = Main.sc.nextLine();
            System.out.println("\n\n");
            System.out.println("The color you choose: "+color);
            System.out.println("Engine type: "+et);
            if(sd.equalsIgnoreCase("yes"))
            {
                System.out.println("Ok, your car will be SelfDriving");
            }
            else if(sd.equalsIgnoreCase("no"))
            {
                System.out.println("Ok, your car won't be SelfDriving");
            }
            else{
                System.out.println("Wrong Input");
            }
        }
            catch(Exception e2){
                System.out.println(e2);
            }
        }
    
}
