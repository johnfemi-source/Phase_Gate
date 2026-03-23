public class TaskTen{

    public static void main(String[] args){
    
    int number = 1000;
    int result = 0;

    for(int count = 1;count<=number.length;count++){
        result += count;
    }
    System.out.print("total number of digit: ", result);
    }
}
