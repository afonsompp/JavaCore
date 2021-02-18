package JavaCore.sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Player> team = new ArrayList<>();

		team.add(new Player("Romário", 17, 2));
		team.add(new Player("Ronaldo", 23, 1));
		team.add(new Player("Rayon", 42, 3));

		System.out.println("Comparable");
		System.out.println("\nAntes de ordenar:");

		for (var player : team) {
			System.out.println(player.getName());
		}
		Collections.sort(team);

		System.out.println("\nDepois de ordenar:");
		for (var player : team) {
			System.out.println(player.getName());
		}

		System.out.println("\n\ncomparator");
		var comparator = new PlayerComparator();
		Collections.sort(team, comparator);

		for (var player : team) {
			System.out.println(player.getName());
		}
	}

}
