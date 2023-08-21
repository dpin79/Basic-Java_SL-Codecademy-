public class GreaterLessThan_16 {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;

    boolean check = creditsEarned > creditsToGraduate;
    System.out.println(check);

    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;

    boolean check2 = creditsToGraduate < creditsAfterSeminar;
    System.out.println(check2);
	}
}
