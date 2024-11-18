import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(1001);
		hs.add(1009);
		hs.add(1004);
		hs.add(1006);
		hs.add(1002);
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
