package statisticker;

public class LEDAlert extends IAlerter{
public Boolean ledGlows= false;
	
	public void alert() {
		ledGlows=true;
	}

}
