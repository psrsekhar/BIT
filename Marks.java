import java.util.Scanner;
class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
		System.out.println("Mark1:");
        int mark1 = scanner.nextInt();
        System.out.println("Mark2:");
        int mark2 = scanner.nextInt();
        System.out.println("Mark3:");
        int mark3 = scanner.nextInt();
        System.out.println("Mark4:");
        int mark4 = scanner.nextInt();
        System.out.println("Mark5:");
        int mark5 = scanner.nextInt();
        System.out.println("Mark6:");
        int mark6 = scanner.nextInt();
		scanner.close();
        int total = mark1 + mark2 + mark3 + mark4 + mark5 + mark6;
        double percentage = (total / 600.0) * 100; 
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
