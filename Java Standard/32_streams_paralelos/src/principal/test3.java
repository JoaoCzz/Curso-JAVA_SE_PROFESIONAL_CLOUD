package principal;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.stream.LongStream;

public class test3 {
	public static void main(String[] args) {
		LocalTime t1= LocalTime.now();
		System.out.println(LongStream.rangeClosed(1, 60_000_000_000L).sum());
		LocalTime t2= LocalTime.now();
		Duration d= Duration.between(t1, t2);
		System.out.println(d);
		
		}
}
