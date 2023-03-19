
public class DiscountMethod {
	 private double Decimal = 0.01;
	    double BeforeDiscounts;
	    double TheDiscounts;
	    
	    public double DiscountMethod(double BeforeDiscounts,double TheDiscounts){
	        double x = TheDiscounts * Decimal;
	        double price = x * BeforeDiscounts;
	        return price;
	    } 
}
