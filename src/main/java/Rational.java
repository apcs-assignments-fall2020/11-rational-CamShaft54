public class Rational
{
    // instance variables: every Rational object will have its own copy
    // of these variables
    public int numerator;
    public int denominator;
    
    /**
     * Constructor: the special method that will actually create a new Rational
     * object
     * Constructors are always public
     * Constructors have the same name as the class
     * Constructors have no return type
     */
    public Rational(int a, int b)
    {
        numerator = a;
        denominator = b;
    }
    
    // This method takes two Rationals, add thems up, 
    // and returns a Rational equal to the sum
    public static Rational add(Rational r, Rational s)
    {
        int newNumerator = r.numerator*s.denominator + s.numerator*r.denominator;
        int newDenominator = r.denominator*s.denominator; 
        
        Rational x = new Rational(newNumerator, newDenominator);
        return x;
    }

    // Finds the greatest common factor between a and b
    public static int greatestCommonFactor(int a, int b){
        int gcd = 1;

        int k = Math.max(a, b);
        
        for(int i = 1; i <= k; i ++){
            if (a%i == 0 && b%i == 0){
                gcd = i;
            }
        }

        return gcd;
    }

    // This method is given a rational, and returns a simplified version
    // of the input rational
    // e.g. simplify(2/4) => 1/2
    //      simplify(1/2) => 1/2
    public static Rational simplify(Rational r)
    {
        // REPLACE WITH YOUR CODE HERE
        return null;
    }

    // This method takes two Rationals, subtracts thems up, 
    // and returns a Rational equal to the difference
    public static Rational subtract(Rational r, Rational s)
    {
        // REPLACE WITH YOUR CODE HERE
        return null;
    }
    
    public static Rational multiply(Rational r, Rational s)
    {
        // REPLACE WITH YOUR CODE HERE
        return null;
    }
    
    public static Rational divide(Rational r, Rational s)
    {
        // REPLACE WITH YOUR CODE HERE
        return null;
    }



    // These following methods are NOT static, we'll talk about them next class!
    // This returns a string representation of a Rational (e.g. "1/2")
    @Override
    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }


    public Rational add(Rational s)
    {
        // REPLACE WITH YOUR CODE HERE
        return null;
    }
    
    public Rational subtract(Rational s)
    {
        // REPLACE WITH YOUR CODE HERE
        return null;
    }
    
    public Rational multiply(Rational s)
    {
        // REPLACE WITH YOUR CODE HERE
        return null;
    }
    
    public Rational divide(Rational s)
    {
        // REPLACE WITH YOUR CODE HERE
        return null;
    }
}













