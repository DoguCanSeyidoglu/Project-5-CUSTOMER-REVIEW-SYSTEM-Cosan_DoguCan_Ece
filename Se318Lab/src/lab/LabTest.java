package lab;

public class LabTest {
public static int add(int number1,int number2 ){
		
		return number1+ number2;
	}
	
	
	public static int sub(int number1,int number2 ){
		
		return number1 - number2;
	}
	
	public static int mulp(int number1,int number2 ){
		
		return number1 * number2;
	}
	
	public static int div(int number1,int number2 ){
		if(number2 ==0 ){
			throw new IllegalArgumentException(" Cannot Divide ");
		}
		return number1 / number2;
	}
	
	public static int fac(int number1){
		
		if(number1>0){
		return number1 * fac(number1- 1);
		}
		else
			return 1;
	}
	
	public static int addOddUntil(int number){
		
		if(number > 100){
			throw new IllegalArgumentException( " Entered bigger than 100 ");
		}
		
		else{
		int toplam = 0 ;
		
		for(int i =1 ; i<=number; i++ ){
			
			if(i % 2 != 0 ){
				toplam += i;
			}
		}
		return toplam;
		}
	}
	
	public static String testConcateText(String string1, String string2){
		
		return string1 + string2;
		
	} 
			
	
	
	

	public static void main(String[] args) {
		
		System.out.println(addOddUntil(12));
		
		System.out.println(testConcateText("ali", "ahmet"));
		
		
		}
}
