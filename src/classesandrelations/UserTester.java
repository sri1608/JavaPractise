package classesandrelations;

import java.util.ArrayList;
import java.util.List;

public class UserTester {

	public static void main(String[] args) {

		UserMovie brothers = new UserMovie("brothers", 3.10);
		UserMovie gajini = new UserMovie("gajini", 2.45);
		UserMovie singam = new UserMovie("singam", 3.20);
		UserMovie yamudu = new UserMovie("yamudu", 2.30);

		List<UserMovie> subhawatchedmovies = new ArrayList<>();
		subhawatchedmovies.add(brothers);
		subhawatchedmovies.add(gajini);
		subhawatchedmovies.add(singam);
		subhawatchedmovies.add(yamudu);
		
		User user = new User(1, "subha", subhawatchedmovies);
		
		List<UserMovie> sangramwatchedmovies = new ArrayList<>();
		sangramwatchedmovies.add(brothers);
		sangramwatchedmovies.add(gajini);
		
		User user1 = new User(2, "sangram", sangramwatchedmovies);
		
		List<UserMovie> heerawatchedmovies = new ArrayList<>();
		heerawatchedmovies.add(brothers);
		heerawatchedmovies.add(yamudu);
		User user2 = new User(3, "heera", heerawatchedmovies);

		List<UserMovie> swathiwatchedmovies = new ArrayList<>();
		
		User user3 = new User(4, "swathi", null);

		System.out.println(user);
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);

 
	}

}
