package statisticker;

public class EmailAlert extends IAlerter{
	public Boolean emailSent= false;
	
	public void alert() {
		emailSent=true;
	}

}
