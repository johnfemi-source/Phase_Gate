import java.util.Scanner;
public class TaskFive{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int number = 0;

    System.out.print("Enter NUmber: ");
    int num = input.nextInt();

    for (int count= 0;count <= number;count++){
        number += count;
    }
    System.out.println(number);
    }
}
