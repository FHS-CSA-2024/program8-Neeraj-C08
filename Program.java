import java.util.Scanner;//import stuff here

//Your code here

//Class and file name should match (Pretend the file name is Program8.java
public class program8{
    
   public static void main(String [] args){
       int num1;
       int num2;
       int sum;
       int difference;
       int product;
       double average;
       int distance;
       int maximum;
       int minimum;
       Scanner mynum = new Scanner(System.in);
       
       System.out.println("Enter number 1: ");
       
       num1 = mynum.nextInt();
       
       System.out.println("Enter number 2: ");
       
       num2 = mynum.nextInt();
       
       sum = num1 + num2;
       difference = num1 - num2;
       product = num1*num2;
       
       average = sum/2.0;
       
       distance = Math.abs(difference);
       
       minimum = Math.abs(difference) + num1;
    
       maximum = Math.abs(difference) +  num2;
       
       System.out.println("Sum: " + sum );
    
       System.out.println("Difference: " + difference);
       
       System.out.println("Product: " + product);
       
       System.out.println("Average: " + average);
       
       System.out.println("Distance: " + distance);
       
       System.out.println("Maximum:" + maximum);
       
       System.out.println("Minimum:" + minimum);
       
       
   }
     
}
//Paste console output below:
/*
Enter number 1: 
20
Enter number 2: 
13
Sum: 33
Difference: 7
Product: 260
Average: 16.5
Distance: 7
Maximum:20
Minimum:13

*/
