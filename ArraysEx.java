import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args){
        char[] consonats={'q','t','l','k','b'};

        for(int i=0;i< consonats.length;i++){
            System.out.println(consonats[i]);
        }
        char[] reverse=new char[consonats.length];
        for(int i=0;i< consonats.length;i++){
            reverse[i]=consonats[consonats.length-1-i];
        }
            System.out.println("Sorted Array:"+Arrays.toString(reverse));

        char search='k';
        int index=-1;
        for(int i=0;i<consonats.length;i++){
            if (consonats[i]==search) {
                index = i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Element "+search+" found at index:"+index);
        }
        else{
            System.out.println("Element"+search+"is not found");
        }



    }

}
