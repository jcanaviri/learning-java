package beans;

public class TestJavaBean {
    public static void main(String[] args) {
        PersonBean susan = new PersonBean();
        susan.setFirstName("Susan");
        susan.setLastName("Wilson");

        System.out.println("susan = " + susan);
    }
}
