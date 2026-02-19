public class PracticeProblems {
  //Problem1: Write a function called countOccurrences that takes an integer array 
  // arr and an integer n, and returns the number of times that n appears in arr.
  public static int countOccurences(int arr [], int n){
    int numberOfOccurences = 0;
    for (int i = 0; i < arr.length; i++) {
      int arr_number = arr[i];
      if (arr_number == n) {
          numberOfOccurences += 1;
      }
    }
    return numberOfOccurences;
  }

  //Problem 2:Write a function called reverseArray that takes an integer array arr and 
  // returns a new array with the elements of arr but in reverse order.
  public static int[] reverseArray(int[] arr) {
      int[] reversed = new int[arr.length];

      for (int i = 0; i < arr.length; i++) {
          reversed[i] = arr[arr.length - 1 - i];
      }

      return reversed;
  }
  //Problem 3: Write a function called sumGrid that takes a 2d double array grid and returns the sum of all the elements. 
  // Hint: you can do this with nested for loops (look up what that is).
    public static double sumGrid(double[][] grid) {
      double sum = 0;
      for (int row = 0; row < grid.length; row++) {
          for (int col = 0; col < grid[row].length; col++) {
              sum += grid[row][col];
          }
      }
      return sum;
  }
  //Problem 4: Write a function called fib that takes an integer n and returns the nth number in the fibonacci sequence (starting with 01 ).
  public static int fib(int n) {
        if (n == 0) return 0;   
        if (n == 1) return 1;   

        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
