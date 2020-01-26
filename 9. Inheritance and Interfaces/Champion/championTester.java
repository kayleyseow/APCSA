public boolean championTester() {
	Champion a = new Champion(10, "Smite");
	Champion b = new Champion(13, "Heal");

	a.setLevel(15);
	if (a.getLevel() != 15) return false;
	if (!a.toString().equals("Level 15 champion with Smite")) return false;

	b.useQ(); //returns the string "Q used"
	b.setLevel(11);
	b.feed(); //prints the string "mid or feed"
if (!b.toString().equals("Level 11 champion with Heal")) return false;

	Champion c = new Ahri(12, "Cleanse", "K/DA");
	Champion d = new MasterYi(14, "Smite", "Assassin");
	MasterYi e = new MasterYi(9, "Heal", "Original");

	if (!c.toString().equals("Level 12 Ahri with Cleanse"))
		System.out.println(c.useQ()); //prints "Orb used"
	c.feed(); //prints the string "mid or feed"
	
	if (!(d instanceof MasterYi)) return false;
	if (!(d instanceof Champion)) return false;
	
if(!e.getSkin().equals("Original")) return false;
System.out.println(d.useQ()); //prints "Q used"

	return true;
}
