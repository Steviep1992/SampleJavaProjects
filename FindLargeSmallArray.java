

public class FindLargeSmallArray {

	public static void main(String[] args) {
		 
               
              
               int numbers[] = new int[]{31,22,36,5,212,42,676,68,38,31};
              
               //assign array to find largest and smallest number
               int smallest = numbers[0];
               int largest = numbers[0];
               double total = 0;
               
               for(int i=0; i<numbers.length; i++){
               	total = total + numbers[i];
               }
               
               double average = total / numbers.length;
               
               for(int i=1; i< numbers.length; i++)
               {
                       if(numbers[i] > largest)
                               largest = numbers[i];
                       else if (numbers[i] < smallest)
                               smallest = numbers[i];
                      
               }
              
               System.out.println("Largest Number is : " + largest);
               System.out.println("Smallest Number is : " + smallest);
               System.out.println("Average Number is : " + average);
       }

	}


