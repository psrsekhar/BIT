class Control {
	public static void main(String[] args) {
		// loop();
		// oldSwitchCase();
		// newSwitchCase();
		newSwitchCaseWithBlock();
	}

	public static void newSwitchCaseWithBlock() {
		String day = "Wednesday";
		// Modern switch expression with String
		String typeOfDay = switch (day) {
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
			case "Saturday", "Sunday" -> "Weekend";
			default -> "Invalid day";
		};
		System.out.println(day + " is a " + typeOfDay);

		// yield and block (if more logic is needed)
		int dayLength = switch (day) {
			case "Monday" -> 6;
			case "Tuesday" -> 7;
			case "Wednesday" -> {
				System.out.println("Midweek day");
				yield 9;
			}
			case "Thursday" -> 8;
			case "Friday" -> 6;
			case "Saturday", "Sunday" -> 0;
			default -> {
				System.out.println("Unknown day");
				yield -1;
			}
		};
		System.out.println("Length of the day name \"" + day + "\" is: " + dayLength);
	}

	public static void newSwitchCase() {
		int day = 4;
		String dayName = switch (day) {
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			case 7 -> "Sunday";
			default -> "Invalid day";
		};
		System.out.println("Day " + day + " is " + dayName);

		// multiple statements in a case with yield
		int dayNumber = switch (day) {
			case 1, 2, 3, 4, 5 -> {
				System.out.println("Weekday");
				yield day; // yield returns the value from the block
			}
			case 6, 7 -> {
				System.out.println("Weekend");
				yield day;
			}
			default -> {
				System.out.println("Invalid");
				yield -1;
			}
		};
		System.out.println("Day number returned: " + dayNumber);
	}

	public static void oldSwitchCase() {
		int day = 3;
		String dayName;
		switch (day) {
			case 1:
				dayName = "Monday";
				break; // important to avoid fall-through
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;
			case 7:
				dayName = "Sunday";
				break;
			default:
				dayName = "Invalid day";
				break;
		}
		System.out.println("Day " + day + " is " + dayName);
	}

	public static void loop() {
		for (int i = 0; i <= 10; i += 2) {
			System.out.print("i : " + i);
		}

		int i = 0;
		while (i <= 10) {
			System.out.print("i : " + i);
			i += 2;
		}

		i = 0;
		do {
			System.out.print("i : " + i);
			i += 2;
		} while (i <= 10);
	}
}