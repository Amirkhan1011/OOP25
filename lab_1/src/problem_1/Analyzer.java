package problem_1;

public class Analyzer {
		private double avg;
		private double max = Double.NEGATIVE_INFINITY;
		private int len;
		
		public void addValue(double num) {
			avg += num;
			len++;
			max = Math.max(max, num);
		}
		
		public double getAverage() {
			return avg / len;
		}
		
		public double getMaximum() {
			return max;
		}
}
