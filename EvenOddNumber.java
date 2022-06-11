
package arraysearch;

public class EvenOddNumber {
    
    public void evenodd(int arr[]){
        
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++){
            //If arr[i]%2 that means arr[0] index value % 2==0, that is even number otherwise odd number.
            if(arr[i]%2==0){
                even+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }
        
        System.out.println("Sum of even number is: "+even);
        System.out.println("Sum of odd number is: "+odd);
    }
    
}
