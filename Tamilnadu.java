package india;

public class Tamilnadu extends SouthIndia{
	public Tamilnadu(String primeMinister) {
		super(primeMinister);
		
	}
	
	static String capital = "chennai";
	public static void main(String[] args) {
		System.out.println(India.capital);
		System.out.println(Tamilnadu.capital);
		SouthIndia si = new Tamilnadu(capital);
		si.speakLanguage();
		si.eat();
		si.dress();
		si.cultivate();
		si.livingStyle();
	}

	@Override
	void speakLanguage() {
		System.out.println("our speak language");
		
	}

	@Override
	void eat() {
		System.out.println("biriyani");
		
	}

	@Override
	void dress() {
		System.out.println("pants and shirts");
		
	}
	void cultivate() {
		System.out.println("rice and sugarcane cultivation");
	}
	void livingStyle() {
		System.out.println("above average development");
	}

}
