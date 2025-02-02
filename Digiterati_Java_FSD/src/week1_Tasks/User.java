package week1_Tasks;

public class User {
	private String name;
    private int age;
    private String gender;
    public User(String name, int age, String gender) {
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
    public void setGender(String gender) {
        this.gender = gender;
    }
    //// overridding toString() method
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
    // overridding hashcode() method
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
    // overridding equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        User user = (User) obj;
        return age == user.age && name.equals(user.name);
    }
}
