import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* Task:1. Max, min, average values
        Fill an array with random doubles, find and print out max, min and arithmetical mean.
        Use Math.random() to generate random numbers.*/
        System.out.println("Task 1 :");
        int n=10;
        double[] arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=Math.random();
        }
        System.out.print("Random double Array is:");
        System.out.println(Arrays.toString(arr));
        double min=arr[0];
        double max=arr[0];
        double sum=0.0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){ max=arr[i];}
            if(arr[i]<min){ min=arr[i];}
            sum+=arr[i];
        }
        System.out.println("Minimum value in array:"+ min);
        System.out.println("Maximum value in array:"+max);
        System.out.println("Arithmetic mean of array:"+sum/10);

        /*
        Task 2. Bubble sorting
        Using an array generated in previous task - implement a method that sorts an array using bubble sorting.
        Use it to sort randomly generated array and print out the result.*/
        System.out.println("Task 2 :");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    double temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        /*Task 3. Looking for prime numbers
        Implement a logic that looks for all prime numbers on the specified interval.
        Use interval [2, 100] to test it (2 and 100 are included into the interval).
        Print the test result.*/
        System.out.println("Task 3 :");
        System.out.println("Prime numbers in the interval[2,100]");
        for(int i=2;i<=100;i++){
            boolean flag= true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0) {
                    flag = false;
                    break;
                }

            }
            if(flag==true){System.out.print(i+"  ");}
        }
        System.out.println();
        /* Task 4 testing*/
        System.out.println("Task 4 :");
        int number=5;
        int[] array={2,5,7,4,5,2,3,8,6,1,3,5,4,5};
        System.out.println("Array of integers:"+Arrays.toString(array));
        System.out.println(Arrays.toString(removeNumber(number,array)));

        //Task 5: testing
        System.out.println("Task 5 :");
        countLetters("netcrackertechnologies").forEach((k,v)-> System.out.println( k +" : " + v));

        /*
        Task 6. Even numbers iterator
        Implement iterator over the integer array that only iterates over the even numbers and ignores uneven.
        Print the test result.
        */
        System.out.println("Task 6 :");
        Iterator<Integer> itr= Arrays.stream(array).iterator();
        while(itr.hasNext()) {
            int even = itr.next();
            if(even%2==0) {
                System.out.print(even+" ");
            }
        }
        System.out.println();
        //Task 7 Testing
        System.out.println("Task 7 :");
        System.out.print("Unique letter from String \"netcrackertechnologies\" "+unique("netcrackertechnologies"));
    }

    /* Task 4. Removal of the number
        Implement a method that receives an integer number and an array of integers.
        Method should remove every element of an array that contains the number from the first argument.
        There should be no gaps in the result array.
        Print the test result.*/
    public static int[] removeNumber(int num,int[] array){
        return Arrays.stream(array).filter(value -> value!=num).toArray();
    }
    /*
        Task:5. Count letters
        Implement a method that receives a string and returns a map with letters from this string
        and a number of how many times this letter occur in the string.
        Print the test result.*/
    public static Map countLetters(String str){
        Map<Character, Integer> result=new HashMap<>();
        for(char ch:str.toCharArray()){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            result.putIfAbsent(ch,count);
        }

        return result;
    }
    /*
    Task 7. First unique number
    Implement a method that receives a string and looks for a unique character with the least index in this input string.
    Method should return the character itself.
    */
    public static char unique(String str){
        char ch=str.charAt(0);
        for(int i=0;i<str.length();i++){
            int count=0;
            char chr=str.charAt(i);
            for(int j=0;j<str.length();j++){
                if(chr==str.charAt(j)){
                    count+=1;
                }
            }
            if(count==1){
                ch=chr;
                break;
            }
        }
        return ch;
    }
}