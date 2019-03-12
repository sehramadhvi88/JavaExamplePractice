package PlayExceptions;

import java.util.Scanner;

public class CustomExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int i=5;
		int j;
		//i=7; // The final local variable i cannot be assigned. It must be blank and not using a compound assignment
		System.out.println(i); // gives error if i try to access without initialize;
		
		System.out.println("enter age");  
		Scanner sc=new Scanner(System.in);
		
		int age=sc.nextInt();
		
		try{
			
			if(age<=0)
			{
				throw new AgeIsNegativeException("Age can not be negative");
			}
			
		}catch(AgeIsNegativeException ex){
			System.out.println(ex);
		}
		
		int balance = 5000;            //Initializing the balance
		 
        Scanner sc1 = new Scanner(System.in);     //Scanner variable to take input from user
 
        System.out.println("Enter Withdrawl Money");
 
        int withdrawlMoney = sc1.nextInt();      //taking input from the user
 
        try
        {
            //checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
 
            if(withdrawlMoney > balance)
            {
                throw new InvalidWithdrawlMoneyException();
            }
            else
            {
                System.out.println("Transaction Successful");
            }
        }
        catch(InvalidWithdrawlMoneyException ex)
        {
            //InvalidWithdrawlMoneyException will be caught here
 
            System.out.println(ex);
        }
		
	}

}


class AgeIsNegativeException extends Exception
{
    String errorMessage;
 
    public AgeIsNegativeException(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
 
    //Modifying toString() method to display customized error message
 
    @Override
    public String toString()
    {
        return errorMessage;
    }
}

class InvalidWithdrawlMoneyException extends ArithmeticException
{
    //Overriding toString() method of ArithmeticException as per our needs
 
    @Override
    public String toString()
    {
        return "You don't have that much of money in your account";
    }
}
 
