package test1;

public class Nikke {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Nikke nikke = new Nikke();
		System.out.println(nikke.tower(120));
		System.out.println(nikke.necessary_floor(180));

	}
	
	public Integer tower(int floor) {
		int mold = 0;
		for (int i = 1; i <= floor; ++i) {
			if (i % 5 == 0) {
				mold += 5;
			}else {
				mold += 1;
			}
		}
		return mold;
	}
	
	public Integer necessary_floor(int mold) {
		int floor = 1;
		for (int i = 0; i <= mold;) {
			if (floor % 5 == 0) {
				i += 5;
				++floor;
			}else {
				++i;
				++floor;
			}
		}
		return floor;
	}

}
