import java.util.Arrays;
public class Main {

  public static void main(String[] args) {
     int arr[] = {1, 2, 3, 4, 5};
    
    //Problem 1
    int numberOfOccurences = PracticeProblems.countOccurences(arr, 2);
    System.out.println(numberOfOccurences);

    //Problem 2
    int[] reversedArray = PracticeProblems.reverseArray(arr);
    System.out.println(Arrays.toString(reversedArray));

    //Problem 3
    double[][] grid = {
            {1.5, 2.5, 3.5},
            {4.0, 5.0, 6.0}
        };
        System.out.println("Grid Sum: " + PracticeProblems.sumGrid(grid));
    
    //Problem 4
    System.out.println("Fib(6): " + PracticeProblems.fib(6)); 
    
  }
}
