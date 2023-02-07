package india;

abstract class SouthIndia extends India{
	public SouthIndia(String primeMinister) {
		super(primeMinister);
	}
	void cultivate() {
		System.out.println("Rice and Wheat cultivation");
	}
	void livingStyle() {
		System.out.println("Average development");
	}

}
