public class Deer {
	void run(){
		System.out.println("eats plants");
	}
	public static void main(String [] args) {
		Lion l =new Lion();
		l.run();
		Deer d = new Deer();
		d.run();
	}
} 
class Lion extends Deer {
	void run () {
		System.out.println("Eats animals");
	}
}