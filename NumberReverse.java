
public class NumberReverse {
  public static void main(String[] args){

	int num = 256321 ;

	int reverse = 0;

	while (num != 0 ) 
	{
		reverse = (reverse *10) + (num % 10 )  ;
		
		num/=10 ;
		

	}


    System.out.println("Reversed Num is "+ reverse );


 }
}