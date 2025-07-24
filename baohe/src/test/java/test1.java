import org.testng.annotations.Test;

public class test1 {
    @Test
    public void case1(){
        System.out.println("test——success 23424");
        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]); 
        }
    }
      @Test(description = "123")
    public void case2(){
        System.out.println("test——success 3243423423423");
        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]); 
        }
    }
}   
