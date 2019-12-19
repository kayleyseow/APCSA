public class SuperheroClient{
	public static void main(String[] args) {
		System.out.println();

		System.out.println("slide 14");
		Superhero superhero = new Superhero();
		superhero.punch(superhero);

		// System.out.println("slide 16");
		// Batman batman = new Batman("I'M BATMAN!");
		// batman.punch(batman);

		System.out.println("slide 18");
		Batman batman = new Superhero();
		batman.punch(batman);


	}
}
