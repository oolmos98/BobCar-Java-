import java.util.Scanner;
public class bobcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userClass, userClassCost = 0, economyClass, 
				compactClass, standardClass, userDays, 
				clubMember, platinumPackage = 0, clubDis;
		float packageOne = 0;
		economyClass = 35;
		compactClass = 45;
		standardClass = 95;
		Scanner in = new Scanner(System.in);

		System.out.println("Which class would you prefer?");
		System.out.println("Type 1 for the Economy Class.");
		System.out.println("Type 2 for the Compact Class.");
		System.out.println("Type 3 for the Standard Class.");

		userClass = in.nextInt();
		switch(userClass){
		case 1: 
			System.out.println("You have chosen the Economy Class which is $" + economyClass + " per day.");
			userClassCost = 35;
			
			break;
		case 2:
			System.out.println("You have chosen the Compact Class which is $" + compactClass + " per day.");
			userClassCost = 45;
			
			break;
		case 3: 
			System.out.println("You have chosen the Standard Class which is $" + standardClass + " per day.");
			userClassCost = 95;
			
			break;

		}
		System.out.println("How many days are you planning on using our services?");
		userDays = in.nextInt();
		System.out.println("Are you a club member, if so press 1.");
		System.out.println("If not press 2.");

		float totalCost = 0, baseCost = 0;
		clubMember = in.nextInt();
		baseCost = (float)(userDays * userClassCost);
		switch(clubMember){
		case 1:
			System.out.println("Since you are a club member you recieve a days pay off for every 7th day.");
			System.out.println("Would you like the Platinum Executive Package? 1 = Yes, 2 = No");
			platinumPackage = in.nextInt();

			if(platinumPackage == 1){
				System.out.println("You have selected the Platinum Executive Package, you will recieve 15% off the base price.");
				packageOne = (float)(baseCost * 0.15);
			}
			else if(platinumPackage == 2)
				packageOne = (baseCost * 0);
			break;




		case 2:
			System.out.println("Since you are not a club member, you do not receive discounts.");
			break;
		}
		clubDis = userDays / 7;
		if(clubMember == 2)
			clubDis = 0;

		else if (clubDis == 1 && userClass == 1)
			clubDis = 35;

		else if(clubDis == 1 && userClass == 2)
			clubDis = 45;
		else if (clubDis == 1 && userClass == 3)
			clubDis = 95;

		else if (clubDis == 2 && userClass == 1)
			clubDis = 70;

		else if(clubDis == 2 && userClass == 2)
			clubDis = 90;
		else if (clubDis == 2 && userClass == 3)
			clubDis = 190;

		else if (clubDis == 3 && userClass == 1)
			clubDis = 105;

		else if(clubDis == 3 && userClass == 2)
			clubDis = 135;
		else if (clubDis == 3 && userClass == 3)
			clubDis = 285;

		totalCost = (float)(baseCost - clubDis + packageOne);
		baseCost = (float)(userDays * userClassCost);
		System.out.println("Base price is $" + baseCost);

		if(clubMember == 1 && platinumPackage == 1){
			System.out.println("Club Member discount: -$" + clubDis);
			System.out.println("Platinum Package: + $" + packageOne);
			System.out.println();

			System.out.println("Total Cost: $" + totalCost );
		}
		else if(clubMember == 1 && platinumPackage == 2){
			System.out.println("Club Member discount: -$" + clubDis);
			System.out.println();

			System.out.println("Total Cost: $" + totalCost );
		}
		else if(clubMember == 2){
			System.out.println();

			System.out.println("Total Cost: $" + totalCost );
		}
		in.close();

	}
}
