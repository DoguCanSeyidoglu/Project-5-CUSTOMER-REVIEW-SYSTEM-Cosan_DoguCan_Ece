import java.util.ArrayList;

public class Review
{
	private String title;
	private String price;
	private String rating;
	private String context;
	
	private ArrayList<String> reviews;

	public Review(String title, String price, String rating, String context)
	{
		super();
		this.title = title;
		this.price = price;
		this.rating = rating;
		this.context = context;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getPrice()
	{
		return price;
	}

	public void setPrice(String price)
	{
		this.price = price;
	}

	public String getRating()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		this.rating = rating;
	}

	public String getContext()
	{
		return context;
	}

	public void setContext(String context)
	{
		this.context = context;
	}

	public ArrayList<String> reviews()
	{
		return reviews;
	}
	
	public void addToReviews(String item)
	{
		reviews.add(item);
	}
	
	public void removeFromWishlist(String item)
	{
		reviews.remove(item);
	}

	public String getItemFromWishlist(int i)
	{
		return reviews.get(i);}
	
	
}
