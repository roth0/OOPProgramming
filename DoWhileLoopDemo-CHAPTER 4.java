package dowhileloopdemo;

public class DoWhileLoopDemo {

    public static void main(String[] args) {
       
        int count = 1;  
        System.out.println("Printing Number from 1 to 10");
        
        do {
            System.out.println(count++);
        } while (count <= 10); 
    }
}
