package week1_Tasks;

public class ObjectClassImpl {
	 public static void main(String[] args) {
		 User user1 = new User("Jenefer", 26, "Female");
		 User user2= new User("Jenefer", 26, "Female");
	     SecondUser secondUser1 = new SecondUser("Jenefer", 26, "Female");
	     SecondUser secondUser2 = new SecondUser("Jenefer", 26, "Female");
	     System.out.println("Without overridding SecondUser is : " + secondUser1);
	     System.out.println("With overridden methods User is : " + user1);
	     System.out.println("Comparing User objects with equals(): " + user1.equals(user2));
	     System.out.println("SecondUser1 and SecondUser2 comparison using equals(): " + secondUser1.equals(secondUser2));
	 }
}
