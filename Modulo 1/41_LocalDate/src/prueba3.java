import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class prueba3 {
	public static void main(String[] args) {
		LocalDate f1= LocalDate.of(2022, 11, 4);
		LocalDate f2= LocalDate.of(2024, 3, 7);
		Period p= Period.between(f1, f2);
		System.out.println(p.getMonths());
		System.out.println(ChronoUnit.DAYS.between(f1, f2));
		///////
		LocalDate f3= LocalDate.of(2022, 4, 4);
		LocalDate f4= LocalDate.of(2023, 8, 7);
		Period p2= Period.between(f3, f4);
		System.out.println(p2.getMonths());
		System.out.println(ChronoUnit.DAYS.between(f3, f4));
	}
	

}
