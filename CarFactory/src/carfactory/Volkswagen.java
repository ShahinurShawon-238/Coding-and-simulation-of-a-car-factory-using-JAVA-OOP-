package carfactory;
public class Volkswagen{
    static int count3,count4,count8=0;
    static String cm2;
     static void ChModell()
    {
        System.out.println("Which model you will prefer:");
        System.out.println("1.Audi\n2.Lamborghini");
        System.out.print("Enter your model name: ");
        cm2 = Main.sc.nextLine();
        if(cm2.equalsIgnoreCase("audi"))
        {
            System.out.println("Your Choice is Audi");
            CarFactory Cf1 = new CarFactory();
            Cf1.create();
            count3++;
            Model n3 = new Model();
            int b3 = n3.ModelNo();
            System.out.println("Your model no is: Audi"+b3);
            ChoiceNo.a3[ChoiceNo.acall3]=b3;
            ChoiceNo.acall3++;
            
        }
        else if(cm2.equalsIgnoreCase("lamborghini"))
        {
            System.out.println("Your Choice is lamborgini");
            CarFactory Cf1 = new CarFactory();
            Cf1.create();
            count4++;
            Model n4 = new Model();
            int b4 = n4.ModelNo();
            System.out.println("Your model no is: L"+b4);
            ChoiceNo.a4[ChoiceNo.acall4]=b4;
            ChoiceNo.acall4++;
        }
        else{
            System.out.println("Wrong Input");
        }
        
        count8++;
        
    }
    
}
