package tutorial;

public class Motor {
	int horsepower, cc;
	
	public Motor() {
		horsepower = 0;
		cc = 0;
	}
	
	public Motor(int horsepower, int cc) {
		this.horsepower = horsepower;
		this.cc = cc;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
}
