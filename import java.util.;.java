import java.util.*;  

class Sample {
    public static void main(String args[]) {
        int a;
        Scanner s = new Scanner(System.in);  

        System.out.println("Enter a value:");
        a = s.nextInt();  

        System.out.println(a);

        s.close();  
    }
}