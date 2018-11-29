import java.util.ArrayList;
public class Day2{
	public static ArrayList<Integer> convertToArrayList(int x){
		ArrayList<Integer> a = new ArrayList<>();
		int b = x;
		while (b/10!=0 || b%10!=0){
			int y = b%10;
			b = b/10;
			a.add(0,y);


		}
		return a;


	}

	public static void main(String[] args){
		System.out.println("Praneet");

		System.out.println("Lucas");

		System.out.println("Dhruv");
		System.out.println("Hi");
		int k= 4086;
		System.out.println(convertToArrayList(k));

		int j = 123456781;
		System.out.println(convertToArrayList(j));
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

	}




}