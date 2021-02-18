package JavaCore.sorting;

public class Player implements Comparable<Player>{

	private String name;
	private int age;
	private int ranking;

	public Player() {
	}

	public Player(String name, int age, int ranking) {
		this.name = name;
		this.age = age;
		this.ranking = ranking;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRanking() {
		return this.ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public int compareTo(Player o) {
		return name.compareTo(o.name);
	}
}
