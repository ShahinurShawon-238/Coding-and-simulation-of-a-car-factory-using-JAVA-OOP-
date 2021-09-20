package carfactory;
public class Toyota{
    
    static int count1,count2,count7=0;
    static String cm;
    static void ChModell()
    {
        
        System.out.println("Which model you will prefer:");
        System.out.println("1.Allion\n2.Premio");
        System.out.print("Enter your model name: ");
        cm = Main.sc.nextLine();
        
        
        if(cm.equalsIgnoreCase("allion"))
        {
            System.out.println("Your Choice is Allion");
            CarFactory Cf1 = new CarFactory();
            Cf1.create();
            count1++;
            
    
            Model n1 = new Model();
            int b=n1.ModelNo();
            System.out.println("Your model no is: A"+b);
            ChoiceNo.a[ChoiceNo.acall]=b;
            ChoiceNo.acall++;
            
        }
        else if(cm.equalsIgnoreCase("premio"))
        {
            System.out.println("Your Choice is Premio");
            CarFactory Cf1 = new CarFactory();
            Cf1.create();
            count2++;
            
            Model n2 = new Model();
            int b2 = n2.ModelNo();
            System.out.println("Your model no is: P"+b2);
            ChoiceNo.a2[ChoiceNo.acall2]=b2;
            ChoiceNo.acall2++;
            
            
            
        }
        else{
            System.out.println("Wrong Input");
        }
        count7++;
        
    }
    
}
