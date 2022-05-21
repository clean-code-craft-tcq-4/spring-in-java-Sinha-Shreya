package statisticker;

import java.util.Arrays;

public class StatsChecker {
	private IAlerter alerters[];
	private float maxThreshold;
	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		super();
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}
	public void checkAndAlert(Float[] numbers) {
		Statistics.Stats s = Statistics.getStatistics(Arrays.asList(numbers));
		if(s.max > this.maxThreshold) {
			for(IAlerter a : alerters)
				a.alert();
		}
	}

}
