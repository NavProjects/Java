
public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		return this.getRingTone();
	}

	@Override
	public String unlock() {
		return "Unlocking via finger print";
	}

	@Override
	public void displayInfo() {
		System.out.println(this.getClass().getSimpleName() + " " + this.getVersionNumber() + " from " + this.getCarrier());

	}

}
