package hashset;

import java.util.*;

public class UniqueValues {

	public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<>();

list.add(12);
list.add(45);
list.add(34);
list.add(45);
list.add(34);
list.add(13);
list.add(19);
HashSet<Integer> value = new HashSet<>();
HashSet<Integer> value1 = new HashSet<>();

for(Integer num : list) {
	if(!value.add(num)) {
		value1.add(num);
	}
}

System.out.print(value1);
	}

}
