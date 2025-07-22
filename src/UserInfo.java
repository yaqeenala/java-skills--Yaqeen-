//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UserInfo {
    private String name;
    private int age;
    private String email;
    private boolean isActive;

    public UserInfo(String name, int age, String email, boolean isActive) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void displayInfo() {
        System.out.println("User name: " + name);
        System.out.println("User age: " + age);
        System.out.println("User email address: " + email);
        System.out.println("Is the user active: " + isActive);
    }

    public static void main(String[] args) {
        UserInfo firstUser = new UserInfo("Yaqeen", 20, "alayaqeen282@gmail.com", true);
        System.out.println("First user data: ");
        firstUser.displayInfo();
        UserInfo secondUser = new UserInfo("Sarah", 22, "sarah@gmail.com", true);
        System.out.println("\nSecond user data: ");
        secondUser.displayInfo();
        UserInfo thirdUser = new UserInfo("Saleh", 18, "salah2006@gmail.com", false);
        System.out.println("\nThird user data: ");
        thirdUser.displayInfo();
    }
}