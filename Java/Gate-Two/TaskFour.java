import java.util.Scanner;
public class TaskFour{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter NUmber: ");
    int num = input.nextInt();
    
    for(int number =1;number <= 12;number++){
        System.out.print("{multipler} * {number}) = {multipler * number}");
    }
    
    }
}
