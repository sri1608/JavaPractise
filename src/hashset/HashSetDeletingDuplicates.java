package hashset;

import java.util.HashSet;

public class HashSetDeletingDuplicates {

	public static void main(String[] args) {
int arr[] = {1, 2, 5, 5, 87, 89, 345, 56, 87};
HashSet<Integer> s = new HashSet<>();

//for(int i = 0; i < arr.length; i++) {
	//s.add(arr[i]);
	//}
for(int num : arr) {
	s.add(num);
}
for(int temp : s) {
	System.out.print(temp + " ");
}
	}

}
