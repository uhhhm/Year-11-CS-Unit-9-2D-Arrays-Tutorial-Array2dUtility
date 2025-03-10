
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] a){
        for(int i = 0; i < a.length; i++){
            String dsakjfhalsdkjfhlqwkejhfoiuwdshafkjhweqoiudhsaklfjha = "";
            for(int j = 0; j < a[i].length; j++){
                dsakjfhalsdkjfhlqwkejhfoiuwdshafkjhweqoiudhsaklfjha = dsakjfhalsdkjfhlqwkejhfoiuwdshafkjhweqoiudhsaklfjha + a[i][j] + " ";
            }
            System.out.println(dsakjfhalsdkjfhlqwkejhfoiuwdshafkjhweqoiudhsaklfjha);
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] a){
        int b = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                b+= a[i][j];
            }
        }
        return b;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] a){
        return sum(a)*1.0/(a.length*a.length);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] a){
        int minimum = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] < minimum) minimum = a[i][j];
            }
        }
        return minimum;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] a){
        int minimum = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > minimum) minimum = a[i][j];
            }
        }
        return minimum;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] a){
        int count = 0;
        for(int[] arr : a){
            for(int b : arr){
                if(b % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] a){
        boolean flag = true;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] < 0){
                    flag = false;
                }
            }
        }
        return flag;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] a){
        int[] count = new int[a.length];
        for(int i = 0; i < a.length; i++){
            int b = 0;
            for(int j = 0; j < a[i].length; j++){
                b += a[i][j];
            }
            count[i] = b;
        }
        return count;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] a){
        int[] arr = new int[a[0].length];
        for(int i = 0; i < a[0].length; i++){
            int count = 0;
            for(int j = 0; j < a.length; j++){
                count += a[j][i];
            }
            arr[i] = count;
        }
        return arr;
    }
}
