package carfactory;
public class ChoiceNo {
    static int a[]=new int[100],a2[]=new int[100],
            a3[]=new int[100],a4[]=new int[100],
            a5[]=new int[100],a6[]=new int[100];
    
    static int acall,acall2,acall3,acall4,acall5,acall6=0;
    static String tryo;
    public void IfChoiceIsNo(){
        System.out.println("Total cars that have created the company: ");
            System.out.println("1. Toyota: "+Toyota.count7);
            System.out.println("1.1 Toyota-Allion: "+Toyota.count1);
            System.out.println("1.2 Toyota-Premio: "+Toyota.count2);
            System.out.println("2. Volkswagen: "+Volkswagen.count8);
            System.out.println("2.1 Volkswagen-Audi: "+Volkswagen.count3);
            System.out.println("2.2 Volkswagen-Lamborghini: "+Volkswagen.count4);
            System.out.println("3. Mitsubishi: "+Mitsubishi.count9);
            System.out.println("3.1 Mitsubishi-Lancer: "+Mitsubishi.count5);
            System.out.println("3.1 Mitsubishi-Grandis: "+Mitsubishi.count6);
            
            System.out.println("The available cars of the company: ");
            
            System.out.print("1.Toyota-Allion: ");
            for(int l=0;l<acall;l++)
            {
                System.out.println("A"+a[l]+" ");
            }
            System.out.print("2.Toyota-Premio: ");
            for(int l2=0;l2<acall2;l2++)
            {
                System.out.println("P"+a2[l2]+" ");
            }
            System.out.print("3.Volkswagen-Audi: ");
            for(int l3=0;l3<acall3;l3++)
            {
                System.out.println("Audi"+a3[l3]+" ");
            }
            System.out.print("4.Volkswagen-Lamborghini: ");
            for(int l4=0;l4<acall4;l4++)
            {
                System.out.println("L"+a4[l4]+" ");
            }
            System.out.print("5.Mitsubishi-Lancer: ");
            for(int l5=0;l5<acall5;l5++)
            {
                System.out.println("Lancer"+a5[l5]+"");
            }
            System.out.print("5.Mitsubishi-Grandis: ");
            for(int l6=0;l6<acall6;l6++)
            {
                System.out.println("G"+a6[l6]+" ");
            }
            
            System.out.print("Enter the model number of the car you want to try out: ");
            tryo = Main.sc.nextLine();
            
            CarFactory cf1 = new CarFactory();
            cf1.created();
    }
}
