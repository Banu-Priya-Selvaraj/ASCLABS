/*public class Writable {
    public static void main(String args[]){
        Pen Reynolds;
        Reynolds=new Pen();
        System.out.println("Model is : "  + Reynolds.model);
        System.out.println("Price " + Reynolds.price);
        //Access the method
        Reynolds.displayDetails();
        Reynolds.price = 50000;


    }
}
 */
public class Writable{
    public void purpose(){
        System.out.println("The product is used for");
    }
}
class Pen extends Writable{
    public void purpose(){
        System.out.println("Pen is used for writing");
    }
}