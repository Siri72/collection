package collections.collection_pack;

public class App {
	
	    public static void main(String[] args) 
	    {
	    	collections<Integer> list = new collections<Integer>();
	 
	        //Add elements
	        list.add(20);
	        list.add(34);
	        list.add(35);
	        System.out.println(list);
	         
	        //Remove elements from index
	        list.remove(2);
	        System.out.println(list);
	         
	        //Get element with index
	        System.out.println( list.get(0) );
	        System.out.println( list.get(1) );
	 
	        //List Size
	        System.out.println(list.size());
	    }
	}
