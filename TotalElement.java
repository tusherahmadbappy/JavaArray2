
package arraysearch;

public class TotalElement {
    
    public void total(int arr[],int sum){
        
      
       System.out.println("Which elements of array sum is: "+sum);
       for(int i=0; i<arr.length; i++){
           
            for (int j=i; j<arr.length; j++){
                
                for(int k=j;k<arr.length;k++){
                
                    if((arr[i]+arr[j])+arr[k]== sum && i!=j && i!=k && j!=k){

                        System.out.println(i+", "+j+", "+k);
                }   }
            }
        }
    }
}
