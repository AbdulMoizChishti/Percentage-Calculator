/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentagecalculator;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class PercentageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    double chem=97;
    double phy=97;
    double maths=97;
    
    double per=((chem+phy+maths)/300)*100;
        System.out.println(per);
    
   if (per>=90){
       System.out.println("Grade A+");
   } 
   else if (per>=80){
       System.out.println("Grade A-");
   }
   else if (per>=70){
       System.out.println("Grade A");
   }
   else if (per>=60){
       System.out.println("Grade B");
   }
   else if (per>=50){
       System.out.println("Grade C");
   }
   else{
       System.out.println("Fail");
   }
    }
    
}
