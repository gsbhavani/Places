import java.util.Scanner;


public class Demo{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
    
       
        System.out.println("Enter student marks");
        int mar=sc.nextInt();
        if(mar>=90)
        {
            System.out.println("congras student was with passed with A+");
        }
        else if(mar>=80){
            System.out.println("Passed with A");
        }
       else if(mar>=70)
       {
        System.out.println("Passed with B");
       }
        else if(mar>=60)
        {
            System.out.println("Passed with c");
        }
        else{
            System.out.println("Student should be improved");
        }
    }
}