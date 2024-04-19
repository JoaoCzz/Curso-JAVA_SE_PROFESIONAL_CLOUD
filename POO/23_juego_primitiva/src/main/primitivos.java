package main;

import java.util.Random;
import java.util.stream.Stream;

public class primitivos {
public static void main(String[] args) {
	Random r1= new Random();
	Stream.generate(()-> r1.nextInt(0,9)).distinct().limit(6).forEach(System.out::println);
	
}
}
