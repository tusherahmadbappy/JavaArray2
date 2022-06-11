
package arraysearch;

public class Maxmin {
    public void maximum(int arr[]){
        int i;
        //maxValue = arr[0] means suppose arr[0] value is maximum value
        int maxValue=arr[0];
        for(i=1;i<arr.length;i++){
            if(arr[i]>maxValue){//if arr[i] index gteatterthen maxValue then maxValue is arr[i] 
                maxValue = arr[i];
            }
        }
        System.out.println("Max value of array is: "+maxValue);
    }
    
    
    public void minimum(int arr[]){
        int i;
        //minValue = arr[0] means suppose arr[0] value is minimum value
        int minValue=arr[0];
        for(i=1;i<arr.length;i++){
            if(arr[i]<minValue){//if arr[i] index lessthen minValue then minValue is arr[i] 
                minValue = arr[i];
            }
        }
        System.out.println("Min value of array is: "+minValue);
    }
}
