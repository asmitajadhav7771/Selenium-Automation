package UtilityClass;

import java.time.LocalDateTime;
import java.util.Random;

public class Javautility {
public static int randaomInt(int bound) {
	Random r = new Random();
	int num = r.nextInt(bound);
	return num;
}
public static String dynamicnameWithDateTime(String name) {
	 String DateTime = LocalDateTime.now().toString().replace(':', '-');
	return name+DateTime;
}
public static void main(String[] args) {
	int num = Javautility.randaomInt(1000);
	System.out.println(num);
	String name = Javautility.dynamicnameWithDateTime("Manu");
	System.out.println(name);
}
}
