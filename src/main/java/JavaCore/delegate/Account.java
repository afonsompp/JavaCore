package JavaCore.delegate;

public class Account {

	private double ballance;

	public Account(double ballance) {
		this.ballance = ballance;
	}


	public double getBallance() {
		return this.ballance;
	}

	public double getBallance(Coversion conversion) {
		return conversion.convert(this.ballance);
	}
}
