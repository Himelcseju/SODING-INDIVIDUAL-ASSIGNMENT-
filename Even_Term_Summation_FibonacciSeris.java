/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even_number_summation;

/**
 *
 * @author Shah Habibur Rahman
 */
public class Even_Term_Summation_FibonacciSeris {
  
   int number1=1,number2=2,sum=0,evensum=2;
   public void find_the_sum(){
       while(number1+number2<4000000){
           sum=number1+number2;
           number1=number2;
           number2=sum;
           if(sum%2==0){
               evensum+=sum;
           }
          
       }
       System.out.println("The total value of summation of even term is"+" "+evensum);
           
       
   }
    public static void main(String[] args) {
        Even_Term_Summation_FibonacciSeris obj= new Even_Term_Summation_FibonacciSeris();
        obj.find_the_sum();
    }
    
}
