import java.util.*;

public class Demo {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1001);
		hs.add(1009);
		hs.add(1009);
		hs.add(1009);
		hs.add(1009);
		System.out.println(hs);
		System.out.println("............................");
		for(int x:hs)
		{
			System.out.println(x);
		}
		System.out.println("............................");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
