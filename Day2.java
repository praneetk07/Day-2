import java.util.ArrayList;
public class Day2{
	public static void main(String[] args){
		System.out.println("Praneet");

		System.out.println("Lucas");

		System.out.println("Dhruv");
		System.out.println("Hi");
		int k=0;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(9);
		list.add(5);
		list.add(0);
		System.out.println(method2(list));

	}
	public static int method2(ArrayList<Integer> a){
		int b=0;
		for(int i=0;i<a.size();i++){
			b+=a.get(i);
			b*=10;
		}
		b/=10;
		return b;
	}
}