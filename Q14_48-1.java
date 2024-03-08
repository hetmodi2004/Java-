import java.util.LinkedList;

public class Q14_48
{
   public static void main(String[] args)
   {
	   LinkedList<String> elements = new LinkedList<String>();
	   System.out.println();
	   System.out.println("add elements in LinkedList:");
	   elements.add("het");
	   elements.add("pratik");
	   elements.add("meet");
	   elements.add("ashutosh");
	   System.out.println("LinkedList:"+ elements);
	   System.out.println();
	   
	   System.out.println("add elements at a specific position in LinkedList:");
	   elements.add(2,"muskan");
	   System.out.println("LinkedList after inscrtion:"+elements);
	   System.out.println();
	   
	   System.out.println("delete elements from a specific position in LinkedList:" +elements);
       elements.remove(3);
       System.out.println("LinkedList after deletion:" +elements);
       System.out.println();	   
   }
}
	