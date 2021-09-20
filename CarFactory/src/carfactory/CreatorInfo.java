package carfactory;
public class CreatorInfo {
    private String name;
    private int number;
    final String cp="copyright(c) BS car company";

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   void CreatorInfoDisplay(){
       System.out.println(cp);
   }
   
}
