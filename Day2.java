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
	public static int method2(ArrayList<Integer> a){
		int b=0;
		for(int i=0;i<a.size();i++){
			b+=a.get(i);
			b*=10;
		}
		b/=10;
		return b;
	}
	public static void main(String[] args){
		System.out.println("Praneet");

		System.out.println("Lucas");

		System.out.println("Dhruv");
		System.out.println("Hi");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(9);
		list.add(5);
		list.add(0);
		System.out.println(method2(list));
		int k= 8950;
		System.out.println(convertToArrayList(k));
	}
}