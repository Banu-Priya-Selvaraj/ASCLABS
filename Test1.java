class Test2 {
    public Test2(){
        System.out.println("Hai");


    }
    public Test2(String str){

        System.out.println(str);
    }

}
public class Test1 extends Test2{
    public Test1(String str){
        super(str);
        System.out.println(str);

    }

    public static void main(String[] args) {
        Test2 t2=new Test1("HI");

    }
}

