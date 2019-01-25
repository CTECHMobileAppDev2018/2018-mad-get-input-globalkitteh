public class AddInput { 

    public static void main(String[] args) {
    
        // Advanced section (once you get the sum working):
        // If you want to make sure that the user entered EXACTLY two integers, you need to get the number of inputs
        // The variable "args" holds all of the arguments that were passed into this program
        // The variable "args" is called an "array" because it's actually a list of items
        // If you good "How to get the number of items in an array in Java", you should be able to figure out how many integers there are in the variable "args"
        // int num_args = ???
        // if (??? != 2) {
        //    do something
        // }
        // More advanced: What if the two inputs aren't integers? Then what? How could you check that?
    
        // **** START HERE: ****
        // These two lines will get you the first two arguments
       //---------------------------------------------------------------------
      //Defining Variables
      int a; //input
      int b; //input
      int errorState = 0; //changed if errored
      int numArgs = args.length; //number of inputs
        
      try{  
       Integer.parseInt(args[0]); //Testing the inputs to make sure they are 2 numbers not exceeding the limits of 'int'
       Integer.parseInt(args[1]);        
      }
      catch(RuntimeException ex){ //Catching any input exceptions
        if(numArgs == 1){
          System.out.println("This program requires 2 values to function.");
        }
        else if(numArgs == 0){
          System.out.println("Please provide some input.");
        }
        else{
          System.out.println("One or more of your inputs exceeds the limitations of the integer object; "+ ex.getMessage());
        }
        errorState = 1;
      }
      finally{
        if(numArgs != 2){ //If too many (or few) inputs, this runs and says so.
          System.out.println("You have entered " + numArgs + " arguments. This program takes 2 arguments, and excess input will be ignored.");
        }
        if(errorState == 0){ //Final print of sum and values
          a = Integer.parseInt(args[0]);
          b = Integer.parseInt(args[1]);
          int sum = (a + b);
          System.out.println("The sum of " + a + " and " + b + " is " + sum);
        }
      }
    }
}

