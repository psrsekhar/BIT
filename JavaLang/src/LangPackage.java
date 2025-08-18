import edu.bit.training.Games;
import edu.bit.training.Login;

public class LangPackage {
	public static void main(String[] args) {
		Games games = new Games("Cricket", 49, new Login(true));
		System.out.println(games.getName() + games.getScore() + games.getLogin().isAuthenticated());
		
		Games newCopy = (Games) games.clone();//Shallow copy
		System.out.println(newCopy.getName() + newCopy.getScore() + newCopy.getLogin().isAuthenticated());
	}
}
/**
 * Object a = "Samantha";//Unboxing a = 10; a.toString(); Games player1 = new
 * Games("Cricket", 49); Games player2 = new Games("Cricket", 49);
 * 
 * //implicit call to toString() System.out.println(player1);
 * System.out.println(player2);
 * 
 * System.out.println(player1.getName() + player1.hashCode());
 * System.out.println(player2.getName() + player2.hashCode()); /** String
 * name="Samantha";String actress = new String("Samantha");
 * System.out.println(name == artist);//true System.out.println(name ==
 * actress);//false System.out.println(name.equals(actress));//true
 * 
 * System.out.println(player1.equals(player2));//false
 * 
 * 
 * 		ArrayList<Games> movies = new ArrayList<Games>();
		movies.add(new Games("Cricket", 49, new Login(true)));
		movies.add(new Games("FootBall", 149, new Login(false)));
		movies.add(new Games("Badminton", 30, new Login(false)));
		movies.add(new Games("Kabadi", 50, new Login(false)));
		ArrayList<Games> moviesCopy = (ArrayList<Games>) movies.clone();// shallow copy
		movies.set(0, new Games("Cricket", 49, new Login(false)));
		
		for(Games game: moviesCopy) {
			System.out.println("Name: " + game.getName() + "\tScore: " +game.getScore() +"\tLogin Status: " + game.getLogin().isAuthenticated());
		}
 */