
package arraysearch;

import java.util.Scanner;

public class Arraysearch {

    public static void main(String[] args) {
        // TODO code application logic here
        char ch;
        int num;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");  

        num=s1.nextInt();  
        //creates an array in the memory of length fixed num  
        int[] anArray = new int[num];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<num; i++)  
        {  
        //reading array elements from the user   
            anArray[i]=s1.nextInt();  
        }
        
        System.out.println("Array elements are: ");  
        // accessing array elements using the for loop  
        for (int i=0; i<num; i++)   
        {  
        System.out.printf("%d ",anArray[i]);  
        }  
        
        
        //Again call using do-while loop
        do{
            
            Scanner s = new Scanner(System.in);
            System.out.println("\n\nWhich case call you want: ");
            int caseNumber = s.nextInt();

            switch(caseNumber){

                case 1:{
                    
                    //Create Linearsearch class object
                    Linearsearch ob1 = new Linearsearch();
                    System.out.println("Enter value to search in array: ");
                    int searchFor = s.nextInt();
                    //object method call
                    ob1.searchElement(anArray, searchFor);

                    break;

                }

                case 2:{

                    //create Maxmin class object
                    Maxmin ob2 = new Maxmin();
                    //object method call
                    ob2.maximum(anArray);
                    ob2.minimum(anArray);

                    break;

                }
                case 3:{

                    //create Secondmaxmin object
                    Secondmaxmin ob3 = new Secondmaxmin();
                    //object method call
                    ob3.secondMax(anArray);
                    ob3.secondMin(anArray);

                    break;
                }

                case 4:{

                    //Create DuplicateElement object
                    DuplicateElement ob4 = new DuplicateElement();
                    //object method call
                    ob4.duplicateValue(anArray);
                    break;
                }

                case 5:{

                    //Create EvenOddNumber object
                    EvenOddNumber ob5 = new EvenOddNumber();
                    //object method call
                    ob5.evenodd(anArray);

                    break;

                }

                case 6:{

                    
                    System.out.println("Enter which values are sum in array: ");
                    int sum=s.nextInt();
                    //Create TotalElement object
                    TotalElement ob6 = new TotalElement();
                    //object method call
                    ob6.total(anArray,sum);

                    break;

                }
                
                case 7:{
                    //Case terminates
                
                    System.exit(0);
                }
               
                default:
                    System.out.println("Your choiceNumber not in this case.");
                    
                

            } 
            
            System.out.println("\nWant to continue(Y/N or  y/n)");
            ch = s.next().charAt(0);
            
        
        }while(ch=='Y' || ch=='y');
    }    
}
    

