import java.util.*;

/**
 * Practice using a Set.
 * @author Kunyaruk Katebunlu
 */
public class SetPractice {
	
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Collection<String> set, String ...values) {
		// add all the values to the set. 
		// print each one as you add it
		for (String string : values) {
			set.add(string);
			System.out.println(string);
		}
	}
	
	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Collection<String> set) {
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String s = itor.next();
			System.out.println(s);
		}
	}
	
	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer(Collection<String> set) {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		//set = new HashSet<String>();
		addAll(set, "dog", "ant", "bird", "elephant", "cat");
		System.out.println();
		
		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do it.
		print(set);
		
		// 3. are the elements printed in same order than you added them? 
		// What does this tell you about Sets?
			//Ans.: No, they don't printed the elements in same order as I added them.
			// 		This tell me that Sets is give unordered result.
		
		System.out.println();
		// 4. Remove all the elements from the set, using a method that 
		// defined in Set (and Collection). What is the method to use?
		set.clear();
			//Ans.: Remove all elements from the set by using clear() method.
		
		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		addAll(set, "cat", "elephant", "bird", "ant", "dog");
		System.out.println();
		
		// 6. Print the elements in the set.  Is the order same as before?
		print(set);
		System.out.println();
		
		// 7. Add duplicate elements to the set.  Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
		System.out.println("Add duplicate items to the set ");
		set.add(new String("cat"));
		set.add(new String("dog"));
		
		// 8. Print the elements in set.  Are there any duplicates?
		// What property of Set does this demonstrate?
		System.out.println("Set contains: ");
		print(set);
		System.out.println();
			//Ans.: Set is unordered elements but the elements will have no duplicate.
		
		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		//  What is different when you use TreeSet?
//		set = new TreeSet<String>();
//		addAll(set, "dog", "ant", "bird", "elephant", "cat");
//		print(set);
//		System.out.println("Add duplicate items to the set ");
//		set.add(new String("cat"));
//		set.add(new String("dog"));
//		System.out.println("Set contains: ");
//		print(set);
			//Ans.: TreeSet still give unordered and no duplicate elements
			//		but it will sorted the elements by alphabetical.
		
		// Hint: Use Polymorphism.  Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!
		
		// 10. Repeat again using TreeSet with a Comparator.
		
	}

	public static void main(String[] args) {
		//Step 1-8
		setExplorer(new HashSet<String>());
		System.out.println("================");
		
		//Step 9
		setExplorer(new TreeSet<String>());
		System.out.println("================");
		
		//Step 10
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		setExplorer(new TreeSet<String>(comp));
		System.out.println("================");
		
		//Try to use List instead of Set
		List<String> tryList = new ArrayList<String>();
		setExplorer(tryList);
	}
}
