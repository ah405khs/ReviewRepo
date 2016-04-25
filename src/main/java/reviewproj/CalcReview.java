package reviewproj;

public class CalcReview {
	private int result=0;
	
	public void add(int x, int y) {
		result=x+y;
	}
	
	public void minus(int x, int y){
		result = x-y;
	}
	public int getResult() {
		return result;
	}
}
