package reviewproj;

public class CalcReview {
	private int result=0;
	
	public void add(int x, int y) {
		result=x+y;
	}
	public int getResult() {
		return result;
	}
	public void sub(int x, int y){
		result=x-y;
	}
	
	public void mul(int x, int y){
		result=x*y*1; //곱하기 하는 함수입니다.
	}
}
