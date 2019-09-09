
public class Queen extends Character {

	public Queen(String name) {
		super(name);
		weaponBehavior = new WeaponKnife();
	}

	@Override
	public void display() {

		System.out.println(name + " is a beautiful queen");

	}

}
