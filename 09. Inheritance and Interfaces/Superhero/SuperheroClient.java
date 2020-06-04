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

		// System.out.println("slide 20");
		// Superhero superhero = new Batman();
		// superhero.punch( (Batman) superhero);

		// System.out.println("slide 22");
		// Batman batman = new Batman();
		// ((Superhero) batman).punch(batman);

		// System.out.println("slide 24");
		// Superhero superhero = new Superhero();
		// superhero.punch( (Batman) superhero);

		// System.out.println("slide 26");
		// Superhero superhero = new Batman();
		// superhero.punch( (Batman) superhero);

		// System.out.println("slide 28");
		// Batman batman = new Batman();			//note change in Superhero class
		// ( (Superhero) batman).punch(batman);
	}
}
