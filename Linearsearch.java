
package arraysearch;

public class Linearsearch {
    public void searchElement(int a[],int searchTo){
    
        int i;
        boolean foundIt = false;
        for(i=0;i<a.length;i++){
            //a[i] == searchTo that is condition is true that means if statement is executed and foundit is true and loop is break
            if(a[i]==searchTo){
                foundIt = true;
                break;
            }
        }
        
        //foundIt true that means if statement is executed otherwise else statement is executed
        if(foundIt){
            System.out.println(searchTo +" found at possion: "+i);
        }
        else{
            System.out.println(searchTo+" Is not in array: ");
        }
    }
    
    
}
