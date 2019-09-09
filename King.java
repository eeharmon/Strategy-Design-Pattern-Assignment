
public class King extends Character {

	public King(String name) {
		super(name);
		weaponBehavior = new WeaponSword();
	}

	@Override
	public void display() {
		
		System.out.println(name + " is a Noble King");

	}

}
