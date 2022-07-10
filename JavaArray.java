import java.util.Scanner;
public class Array {



  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int response;
    boolean decision=true;
    String name2;
      checkname("Amazingmercy");
      System.out.println("Do you want to try a Name?? /n 1. YES/n 2. NO");
      response=input.nextInt();
      while(decision){
      if(response==1){ 
      System.out.println("Enter A Name");
      name2 = input.nextLine();
      checkname(name2);
    }
      else if(response==2)
       System.out.println("Thank you!");
      else
          System.out.println("You have not choosen correctly");
   }
      decision=false;
      System.out.println("Enter Your Name");
      name2 = input.nextLine();
      checkname(name2);
     
  } 

  

  public static void checkname(String name) {
    int numberOfA=0;
    System.out.println(" The Lenght of "+ name+" is "+ name.length());
    if(name.toUpperCase().contains("A")){
    System.out.println( name +" contains Letter 'A' ");
    
    for (int i = 0; i <name.length(); i++) {
      if(name.toUpperCase().charAt(i)=='A'){
       System.out.println(name+" has Letter 'A' at position "+(i+1));  
        System.out.println();
        numberOfA++;
      }
   }
   System.out.println(name+" contains "+ numberOfA+" Number of 'A's");
  }
  else
       System.out.println(name+" does not contain letter 'A'");

}
}
