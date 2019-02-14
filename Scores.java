import java.util.Scanner;

	public class Scores{

		public static void main (String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println("Input your Score : ");
		int score = input.nextInt();

		if (score <=44){
			System.out.println("Your grade is F .");}
		else if (score <=54){
			System.out.println("Your grade is E .");}
		else if (score <=59){
			System.out.println("Your grade is D .");}
		else if (score <=64){
			System.out.println("Your grade is C .");}
		else if (score <=69){
			System.out.println("Your grade is B .");}
		else if (score <=100){
			System.out.println("Your grade is A .");}
		else{
			System.out.println("Invalid Score , check score and re-enter .");}

}
}
