package problems;

public class StarTriangle {
	public int width;
	
	public StarTriangle(int size) {
		width = size;
	}
	
	
	public String toString() {
		String res = "";
		for (int i = 1; i <= width; i++) {
			for (int j = 0; j < i; j++) {
				res += "[*]";
			}
			res+="\n";
		}
		return res;
	}
	public static void main(String[] args) {
		StarTriangle small = new StarTriangle(3);
		System.out.println(small.toString());
	}

}
