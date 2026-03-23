import java.util.Scanner;
public class TaskEleven{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Number:");
    int name = input.nextInt();

    for(int count = 0; count <= 1;count++){
        if(count %2 == 0){
          System.out.print("even");
        }else{
          System.out.print("odd");
        }
    }
}
}
