package cse360assignment02;

/* 
  This is Assignment 01: Version Control, but the requirements were to 
   "Create the package cse360assignment02" 
      and 
   "Add a  file AddingMachine.java to this package."
*/

// Assignment Instructions can be found in the README @ github.
// github repository URL: "https://github.com/cachiles/CSE360_Assignment01"

public class AddingMachine 
{
  private int total;
  private String transactionHistory;
  
  // 
  public AddingMachine () 
  {
    total = 0;  // not needed - included for clarity
    transactionHistory = "0";
  }
  
  // The getTotal method should return the current total
  public int getTotal () 
  {
    return total;
  }
  
  // The add method should add the parameter to the total variable
  public void add (int value) 
  {
    total += value;
    transactionHistory += " + " + value;
  }

  // The subtract method should subtract the parameter from the total variable
  public void subtract (int value) 
  {
    total -= value;
    transactionHistory += " - " + value;
  }

  // A history of the transactions must be kept to be returned by the toString 
  // method. The history should start from the initial 0 value to the last input.
  public String toString () 
  {
    // transactionHistory += " = " + total;
    return transactionHistory;
  }

  // The clear method should clear your AddingMachine.
  public void clear() 
  {
	total = 0;
	transactionHistory = "0";
  }
}
