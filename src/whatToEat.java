import java.util.Scanner;

public class whatToEat {

	public static void main(String[] args) {

		String mealSuggestion = "";

		String preparationSuggestion = "";

		String result = "";

		Scanner input = new Scanner(System.in);

		System.out.println("Please indicate the event type: casual, semi-formal, or formal:");

		String eventType = input.nextLine();

		System.out.println("Please indicate your party size:");

		int partySize = input.nextInt();

		switch (eventType) {
		case "casual":
			mealSuggestion = "sandwiches";
			break;

		case "semi-formal":
			mealSuggestion = "fried chicken";
			break;

		case "formal":
			mealSuggestion = "chicken parmesan";
			break;
		}

		if (partySize == 1) {
			preparationSuggestion = "in the microwave";
		} else if (partySize >= 2 && partySize <= 12) {
			preparationSuggestion = "in your kitchen";
		} else if (partySize >= 13) {
			preparationSuggestion = "by a caterer";
		}

		result = "Since you are hosting a " + eventType + " event for " + partySize + " participant(s), "
				+ "I would recommend that you serve " + mealSuggestion + " " + "prepared " + preparationSuggestion
				+ ". Please consider sending an invitation to me as well.";

		System.out.println(result);

	}

}
