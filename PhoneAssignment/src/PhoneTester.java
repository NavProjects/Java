
public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("Tab", 99, "Verizon", "Beep bop Booop");
		IPhone iPhone10 = new IPhone("X", 100, "AT&T", "Zing");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iPhone10.displayInfo();
		System.out.println(iPhone10.ring());
		System.out.println(iPhone10.unlock());

	}

}
