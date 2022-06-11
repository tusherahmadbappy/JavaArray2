
package arraysearch;

public class DuplicateElement {
    
    public void duplicateValue(int arr[]){
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                // if arr[i]==arr[j] that means arr[0]==arr[0] that is duplicate number 
                if(arr[i]==arr[j]){
                    
                    System.out.printf("Duplicate value array is: %d\n",arr[j]);
                    count=1;//count=1 that means duplicate value in this array
                }
                
                
            }
            
            
        }
        if(count==0)
        {
            System.out.println("No duplicate valu in this array.");
        }
        
        
        
    }
    
}
