package week1_Tasks;

public class SecondUser {
	private String name;
    private int age;
    private String gender;
    public SecondUser(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setgender(String gender) {
        this.gender = gender;
    }
}
