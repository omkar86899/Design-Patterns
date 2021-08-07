package external;

import com.techlab.model.Item;

public class HatAdapter implements Item {
	private Hat hat;
	
	public HatAdapter(Hat hat) {
		this.hat = hat;
	}

	@Override
	public String itemName() {
		// TODO Auto-generated method stub
		return this.hat.getLongName();
	}

	@Override
	public double itemPrice() {
		// TODO Auto-generated method stub
		return this.hat.getPrice();
	}
}
