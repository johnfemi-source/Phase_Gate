import java.util.Scanner;
public class TaskSeven{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int total = 0;
    for(int count =1;count<= 5;count++){
        System.out.print("Enter NUmber: ");
        int num = input.nextInt();
        
        total += count;
    }
    System.out.print(total);
    }
}

