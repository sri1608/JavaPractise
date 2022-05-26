package hashset;

import java.util.HashSet;

public class HashSetDeletingDuplicates1 {

	public static void main(String[] args) {

		HashSet<String> s = new HashSet<>();
		s.add("komatlapalli");
		s.add("satya");
		s.add("subha");
		s.add("sri");
		s.add("sri");
		s.add("sri");
		s.add("sri");

		
for(String name : s) {
	System.out.println(name);
}
		

	}

}
