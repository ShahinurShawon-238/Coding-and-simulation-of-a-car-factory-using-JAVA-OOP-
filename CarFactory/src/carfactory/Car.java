package carfactory;
public abstract class Car {
    protected void created(){
        System.out.println("\n\n\n\n");
        System.out.println(ChoiceNo.tryo+" is starting");
        System.out.println(ChoiceNo.tryo+" is driving");
        System.out.println(ChoiceNo.tryo+" is stopping");
        System.out.println(ChoiceNo.tryo+" Checking complete");
        System.out.println("\n\n\n\n");
        
    }
    abstract void display();
    
}
