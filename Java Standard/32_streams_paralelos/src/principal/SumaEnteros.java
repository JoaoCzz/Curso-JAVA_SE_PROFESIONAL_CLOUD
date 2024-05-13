package principal;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumaEnteros {
public static void main(String[] args) {
System.out.println(LongStream.rangeClosed(1, 600000000L).sum());	
}
}
