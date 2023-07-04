package test1;

public class test1 {
	/*
	 * test comment
	 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		num_print();

	}
	
	public static void num_print() {
		System.out.println("practice1");
		for (int i = 10; i >= 1; --i) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("practice2");
		int total = 0;
		int count = 0;
		for (int i = 1; i <= 10; ++i) {
			if (i % 2 == 0) {
				++count;
				total += i;
			}
		}
		System.out.println(count);
		System.out.println(total);

		System.out.println("practice3");
		for (int i = 1; i <= 10; ++i) {
			if (i < 10) {
				System.out.print(i);
				System.out.print(",");
			}else {
				System.out.print(i);
			}
		}

		System.out.println("");
		System.out.println("practice4");
		int list[] = new int[20];
		int num = 0;
		for (int i = 0; i < list.length; ++i) {
			num += 5;
			list[i] = num;
		}
		
		for (int i = 0; i < list.length; ++i) {
			if (i <= 10 && list[i] % 2 != 0) {
				System.out.print(list[i]);
				System.out.print(",");
			}else if(i >= 11 && list[i] % 2 == 0) {
				if (i != list.length - 1) {
					System.out.print(list[i]);
					System.out.print(",");
				}else {
					System.out.print(list[i]);
				}
			}
		}
	}

}
