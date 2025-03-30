package week1_Tasks;

public class EnumImpl {
	// enum for implementing Days of the Week
	public enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
	public static void main(String[] args) {
		for (DaysOfWeek particularDay : DaysOfWeek.values()) {
			if (particularDay == DaysOfWeek.SATURDAY || particularDay == DaysOfWeek.SUNDAY) {
                System.out.println(particularDay + " : Holiday");
            } else {
                System.out.println(particularDay + " : Not Holiday");
            }
        }
    }

}
