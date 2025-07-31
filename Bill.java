import java.util.Scanner;
class Bill{
	public static void main(String[] args) {
		int previousReading = 1234567;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current reading:");
		int currentReading = scanner.nextInt();
		System.out.println("Total Bill :" + (currentReading - previousReading)*1.25);
	}
}