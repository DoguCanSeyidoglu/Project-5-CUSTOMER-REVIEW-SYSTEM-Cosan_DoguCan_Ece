import java.util.ArrayList;
import java.util.Scanner;

public class WelcomeScreen
{
	static ArrayList<Review> reviews;

	public static void main(String[] args)
	{
		reviews = new ArrayList<Review>();
		
		//Creating some fake reviews:
		Review goodReview = new Review(
				"It was Awesome!!!", 
				"369$", 
				"5 Stars", 
				"Located just near the fort in city(perfect location),"
				+ "he hotel is clean and provides u great hospitality.The hotel "
				+ "owner Mr.Mukesh is very helpful and will guide u throughout "
				+ "your stay.The staffs were very helpful.The hotel provides u "
				+ "almost every facilities from good rooms to desert safari,jeep "
				+ "safari,camel safari and tent stay.\r\n" + 
				"The rooftop cafeteria of hotel was great.wen i say food was great"
				+ "(i mean it :))Overall experience was awesome.I'll recommend dis "
				+ "hotel to every couple and families:). You wont regret,just be there:)");
		Review badReview = new Review(
				"Its so bad its funny...", 
				"56$", 
				"1 Star", 
				"The earlier reviews are true in every respect. "
				+ "I will start with the only positives - our room was "
				+ "quite big, and we had a TV with BBC. But its downhill from "
				+ "there... The location leaves a lot to be desired, unless you happen "
				+ "to be a free-lance exotic dancer. Nestled in a district of sex shops "
				+ "and strip clubs, the area attracts the sort of people that you would "
				+ "cross the street to avoid. As you enter the hotel, you are greeted by "
				+ "decor that is almost medival - and a strange old man who is always angry; "
				+ "and ironically smoking a cigar next to the 'no smoking' sign. Next, you enter"
				+ " the lift - I have seen suicide attempts that adhere to more health and safety "
				+ "measures. Seriously - take the stairs. It rather optimistically has a four person "
				+ "maximum capacity - God help you if one of your companions happens to be fat...");
		Review avarageReview = new Review(
				"Meh not really again:(", 
				"650$", 
				"3 Stars", 
				"I really struggled with giving this hotel a 3 star "
				+ "because there is nothing bad to say about this hotel; "
				+ "however it didn't have the wow of the 3 stars we stayed at "
				+ "in Rome and Venice. It is a basic hotel. The room was a good size "
				+ "and very clean. Breakfast was good. The location is probably one of "
				+ "the best parts of staying here - easy walk to all the Florence attractions "
				+ "and less than 10 minutes from the train station. If you want a no frills place "
				+ "to stay at a good price - "
				+ "this is a great place for you. If you need some ambiance, you may be disappointed.");
		Review anotherGoodReview = new Review(
				"A true sample of excellent hospitality!", 
				"65$", 
				"5 Stars", 
				"Without doubt one of the favorite hotels I"
				+ " stayed during my time in Sri Lanka! Upon "
				+ "arrival we were warmly welcomed by the staff "
				+ "and general manager, our names were mentioned "
				+ "on the board and we were upgraded to the Paradise "
				+ "Suite. The staff was extremely friendly, the restaurant "
				+ "very flexible (appreciate this!) and the restaurant supervisor deserves a special thanks. "
				+ "We had two great evenings here, which obviously also added up to the experience. ");
		
		reviews.add(goodReview);
		reviews.add(anotherGoodReview);
		reviews.add(badReview);
		reviews.add(avarageReview);
		
		
		System.out.println("===== WELCOME! =====\n");
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in); // in order to read users' choices
		
		System.out.println("In order to navigate between menus please enter the number of "
				+ "the option that you would like to choose!\n");
		
		System.out.println("0 for Registeration");
		System.out.println("1 for Login");
		System.out.println("2 for Forget Your Password?");
		
		System.out.println("\nWhat would you like to do?: ");
		
		// In the next version add a TRY method for read to prevent crashes in case of reading an invalid input.
		
		String userInputData = read.next();

		switch(userInputData)
		{
		case "0":
			Registration newRegisteration = new Registration();
			
			// Getting the new user name:
			System.out.println("Enter name: ");
			String nameGivenByUser = read.next();
			
			// Getting her/his password:
			System.out.println("Enter password: ");
			String passwordGivenByUser = read.next();
			
			System.out.println("Welcome " + nameGivenByUser + " now you can enter a new review "
					+ "or you may want to read the ones already entered.");
			
			newRegisteration.createNewUser(nameGivenByUser, passwordGivenByUser);
			
			readOrWriteReview();
			
			break;
		case "1":
			// For now there is no arrayList that stores user name and passwords in order to compare them whether 
			// or not they are exist. System accepts any name given for now!
			
			System.out.println("Enter your name: ");
			String userName = read.next();
			
			System.out.println("Please enter your password: ");
			@SuppressWarnings("unused") String password = read.next();
			
			System.out.println("Welcome " + userName + " now you can enter a new review "
					+ "or you may want to read the ones already entered.");
			
			readOrWriteReview();
			
			break;
		case "2":
			
			System.out.println("Please enter your name: ");
			String userName1;
			
			userName1 = read.next();
			
			System.out.println("Please enter your email adress: ");
			String emailAddress;
			
			emailAddress = read.next();
			
			System.out.println( userName1 + ", we have sent to " + emailAddress + " a confirmation code. Please enter "
					+ "the the code you have received: ");
			
			@SuppressWarnings("unused") String confirmationCode;
			confirmationCode = read.next();
			
			
			System.out.println("Welcome back " + userName1 + " now you can enter a new review "
					+ "or you may want to read the ones already entered.");
			
			readOrWriteReview();
			
			break;
		}
		
	}
	
	public static void readOrWriteReview()
	{
		System.out.println("================================================================"
				+ "\n"
				+ "Enter \"0\" in order to read Reviews"
				+ "\nEnter \"1\" in order to enter a new Review");
		
		Scanner read = new Scanner(System.in);
		
		String givenInput = read.next();
		
		switch(givenInput)
		{
		case "0":
			readReviews();
			break;
		case "1":
			writeNewReview();
			break;
		}
	}
	
	public static void readReviews()
	{
		for(int i = 0; i < reviews.size(); i++)
		{
			System.out.println("===============================================");
			System.out.println("Title: " + reviews.get(i).getTitle());
			
			
			System.out.println();
			System.out.println("Price: " + reviews.get(i).getPrice());
			
			
			System.out.println();
			System.out.println("Rating: " + reviews.get(i).getRating());
			
			
			System.out.println();
			System.out.println("Context: " + reviews.get(i).getContext());
			
			
			System.out.println("===============================================");
		}
	}
	
	public static void writeNewReview()
	{
		
	}
	
}
