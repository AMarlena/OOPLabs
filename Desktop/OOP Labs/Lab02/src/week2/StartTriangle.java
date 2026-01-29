package week2;
public class StartTriangle {
	private int count;
	public StartTriangle(int cnt) {
		this.count = cnt;
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(int i = 1; i <= count; i++) {
			for(int j = 1; j <= 1; j++) {
				s.append("[*]");
			}
			if(i < count) s.append("\n");
		}
		return s.toString();
	}
	public static void main(String[] args) {
		StartTriangle small = new StartTriangle(3);
		System.out.println(small.toString());
	}
}
