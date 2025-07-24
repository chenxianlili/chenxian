import org.testng.annotations.Test;

public class test1 {
    @Test
    public void test1(){
        System.out.println("test——success 133");
        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]); 
        }
    }
}
