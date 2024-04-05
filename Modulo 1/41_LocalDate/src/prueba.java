import java.time.LocalDate;

public class prueba {
	public static void main(String[] args) {
		LocalDate f1= LocalDate.now();
		LocalDate f2= LocalDate.of(2021, 11, 1);
		System.out.println(f1);
		System.out.println(f2);
		LocalDate f3= LocalDate.of(2024, 2, 29);
		System.out.println(f3.plusMonths(2));
		System.out.println(f3.plusDays(10));

	}

}
