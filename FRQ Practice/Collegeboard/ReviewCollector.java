//from an APCS practice test
/*
A student plans to analyze product reviews found on a Web site by looking for keywords in posted reviews. The ProductReview class, shown below, is used to represent a single review. A product review consists of a product name and a review of that product.

a. 
Write the addReview method, which adds a single product review, represented by a ProductReview object, to the ReviewCollector object. The addReview method does the following when it adds a product review.
The ProductReview object is added to the reviewList instance variable.
The product name from the ProductReview object is added to the productList instance variable if the product name is not already found in productList.
Elements may be added to reviewList and productList in any order.

b. 
Write the getNumGoodReviews method, which returns the number of good reviews for a given product name. A review is considered good if it contains the string "best" (all lowercase). If there are no reviews with a matching product name, the method returns 0. Note that a review that contains "BEST" or "Best" is not considered a good review (since not all the letters of "best" are lowercase), but a review that contains "asbestos" is considered a good review (since all the letters of "best" are lowercase).
*/

public class ReviewCollector{
	private ArrayList<ProductReview> reviewList;
	private ArrayList<String> productList;
	  /** Constructs a ReviewCollector object and initializes the instance variables. */
	public ReviewCollector(){
	reviewList = new ArrayList<ProductReview>();
	productList = new ArrayList<String>();
	}
	  /** Adds a new review to the collection of reviews, as described in part (a). */
	public void addReview(ProductReview prodReview){
		/* to be implemented in part (a) */ 
		reviewList.add(prodReview);
		String name = prodReview.getName();
		if (!(productList.contains(name))) productList.add(name);
	}
	  /** Returns the number of good reviews for a given product name, as described in part (b). */
	public int getNumGoodReviews(String prodName){
		/* to be implemented in part (b) */
		int goodreviews=0;
		for (int i=0;i<reviewList.size();i++){
			if (reviewList.get(i).getName().equals(prodName)&&reviewList.get(i).indexof("best")>-1) goodreviews++;
		}
		return goodreviews;
	}
	// There may be instance variables, constructors, and methods not shown.
}
