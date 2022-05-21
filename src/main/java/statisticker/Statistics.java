package statisticker;

import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Stats stats = new Stats();
        stats.average = numbers.size()==0?Float.NaN:stats.getAverage(numbers);
        stats.min = numbers.size()==0?Float.NaN:stats.getMin(numbers);
        stats.max = numbers.size()==0?Float.NaN:stats.getMax(numbers);
        return stats;
        
    }
    public static class Stats {
        public Float average = Float.NaN;
        public Float min = Float.NaN;
        public Float max = Float.NaN;
        
        public Float getMin(List<Float> numbers){
            min = numbers.get(0);
            for(int i=1;i<numbers.size();i++){
                min = Math.min(min,numbers.get(i));
            }
            return min;
        }
        public Float getMax(List<Float> numbers){
            max = numbers.get(0);
            for(int i=1;i<numbers.size();i++){
                max = Math.max(max,numbers.get(i));
            }
            return max;
        }
        public Float getAverage(List<Float> numbers){
            Float total=0.0f;
            for(int i=0;i<numbers.size();i++){
                total+=numbers.get(i);
            }
            average = total/numbers.size();
            return average;
        }
        
    }
}
