package carfactory;
public class Mitsubishi {
    static int count5,count6,count9=0;
     static void ChModel1()
    {
        System.out.println("Which model you will prefer:");
        System.out.println("1.Lancer\n2.Grandis");
        System.out.print("Enter your model name: ");
        String cm = Main.sc.nextLine();
        if(cm.equalsIgnoreCase("Lancer"))
        {
           System.out.println("Your Choice is Lancer");
           CarFactory Cf1 = new CarFactory();
           Cf1.create();
           count5++;
           Model n5 = new Model();
           int b5 = n5.ModelNo();
           System.out.println("Your model no is: Lancer"+b5);
           ChoiceNo.a5[ChoiceNo.acall5]=b5;
           ChoiceNo.acall5++;
            
        }
        else if(cm.equalsIgnoreCase("grandis"))
        {
            System.out.println("Your Choice is Grandis");
            CarFactory Cf1 = new CarFactory();
            Cf1.create();
            count6++;
            Model n6 = new Model();
            int b6 = n6.ModelNo();
            System.out.println("Your model no is: G"+b6);
            ChoiceNo.a6[ChoiceNo.acall6]=b6;
            ChoiceNo.acall6++;
        }
        else{
            System.out.println("Wrong Input");
        }
        
        count9++;
        
    }
}
