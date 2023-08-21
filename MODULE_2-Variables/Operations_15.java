public class Operations_15 {
    
    //OPERATIONS ORDER
    /*
     * 1. Parenthesis
     * 2. Exponents
     * 3. Modulo/Multiplication/Division
     * 4. Addition/Subtraction
    */

	public static void main(String[] args) { 

    int expression1 = 5 % 2 - (4 * 2 - 1);
    //ans = -6
    System.out.println(expression1);

    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
    //ans = 3
    System.out.println(expression2);

    int expression3 = 5 * 4 % 3 - 2 + 1;
    //ans = 1
    System.out.println(expression3);

	}
}