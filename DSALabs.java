package dsalabs;
import java.util.*;
public class DSALabs {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        zigzagSort(arr);
        System.out.println(Arrays.toString(arr));}
    public static void zigzagSort(int[] arr) {
        boolean less = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (less) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;}
            } else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;}}
            less = !less;}}}


//Home Task 4 
//        int[] numbers = {3, 0, 1};
//        int n = numbers.length;
//        int missingNumber = MissingNumber(numbers, n);
//        System.out.println("The missing number is: " + missingNumber);
//    }
//    public static int MissingNumber(int[] numbers, int n) {
//        int totalSum = n * (n + 1) / 2;
//        int arraySum = 0;
//        for (int num : numbers) {
//            arraySum += num;
//        }
//        return totalSum - arraySum;
//    }
//}
//Home Task 3  
//    int[] arr = {9, 1, 3, 8, 7, 5};
//    int target = 8;
//    System.out.println(findCombinations(arr, target));}
//    public static List<List<Integer>> findCombinations(int[] arr, int target) {
//    Arrays.sort(arr);
//    List<List<Integer>> result = new ArrayList<>();
//    backtrack(arr, target, 0, new ArrayList<>(), result);
//    return result;}
//    private static void backtrack(int[] arr, int target, int start, List<Integer> temp,
//    List<List<Integer>> result) {
//    if (target == 0) {
//    result.add(new ArrayList<>(temp));
//    return;}
//    for (int i = start; i < arr.length && arr[i] <= target; i++) {
//    if (i > start && arr[i] == arr[i - 1]) continue;
//    temp.add(arr[i]);
//    backtrack(arr, target - arr[i], i + 1, temp, result);
//    temp.remove(temp.size() - 1);
//    }
//  }
//}  
//Home Task1/2
//       double[] numbers = {1.5, 3.14, 2.718, 6.67, 9.81};
//       double key = 2.718;
//       splitArray(numbers, key);}
//       public static void splitArray(double[] arr, double key) {
//       int index = Arrays.binarySearch(arr, key);
//       if (index >= 0) {
//       System.out.println("Part 1: " + Arrays.toString(Arrays.copyOfRange(arr, 0, index)));
//       System.out.println("Part 2: " + Arrays.toString(Arrays.copyOfRange(arr, index + 1,
//       arr.length)));} else {
//       System.out.println("Key not found!");
//       }
//    }
//}

    
//Task 5 
//        int[] arr1 = {1, 3, 5, 7};
//        int[] arr2 = {9, 11, 13, 15};
//        Set<Integer> set = new HashSet<>();
//        for (int num : arr1) set.add(num);
//        for (int num : arr2) set.add(num);
//        System.out.println("Merged array without duplicates: " + set);
//    }
//}
//      
//Task 4 
//          int[] numbers = {1, 3, 6, 8, 7, 10, 12}; 
//        int even = 0;
//        int odd = 0;
//
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//        }
//Task 3
//        System.out.println("Even numbers : " + even);
//        System.out.println("Odd numbers : " + odd);
//    }
//}
//        String[] strings = {"madam", "hello", "world", "mom" , "dad"};
//        
//        for (String str : strings) {
//            if (isPalindrome(str)) {
//                System.out.println(str + " is a palindrome.");
//            } else {
//                System.out.println(str + " is not a palindrome.");
//            }
//        }
//    }
//    public static boolean isPalindrome(String str) {
//        int start = 0, end = str.length() - 1;
//        while (start < end) {
//            if (str.charAt(start) != str.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
//}     
//Task 2 
//        int[] arr1 = {20, 25, 30, 35, 40, 45, 50};
//        int[] arr2 = {3, 5, 7, 9};
//        int save1 = arr1.length;
//        int save2 = arr2. length;
//        int [] r = new int [save1 + save2];
//        System.arraycopy(arr1, 0, r, 0, save1);
//        System.arraycopy(arr2, 0, r, save1, save2);
//        System.out.println(Arrays.toString(r));
//         }
//      }
//Task 1 
//        int[] arr1 = {1, 2, 3, 4};
//        int[] arr2 = {5, 6, 7, 8};
//
//        for (int i = 0; i < 4; i++) {
//            int empty = arr1[i];
//            arr1[i] = arr2[i];
//            arr2[i] = empty;
//        }
//
//        System.out.println("Array 1 after swapping:");
//        for (int i = 0; i < 4; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//
//        System.out.println("\nArray 2 after swapping:");
//        for (int i = 0; i < 4; i++) {
//            System.out.print(arr2[i] + " ");
//        }
    



