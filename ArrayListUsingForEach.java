import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingForEach 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list=new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		for (String str : list) 		//first way to print values using foreach
		{
//			if(str=="b")
//			{
//			System.out.println(str);
//			
//			}
		System.out.println(str);
		
	}
		System.out.println(list.get(0));    //a   second way to get values 
		
		Iterator itr=list.iterator();	//third way to print values or iterate values
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
}

}
