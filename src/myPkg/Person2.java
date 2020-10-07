package myPkg;

public class Person2 {
	private String name;
	private String age;
	private String gender;
	private String hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", gender=" + gender + ", hobby=" + hobby + "]";
	}
	
	
}
