public class HealthProfile {
    private String firstName, lastName;
    private int age;
    private int height;
    private int weight;
    private String dateOfBirth, gender;
    private String years;
    private String month;
    private String day;
    int y1,m1,d1;

    public HealthProfile(String firstName, String lastName, String dateOfBirth ,String gender,int age , int weight, int height){
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;

        years = dateOfBirth.substring(0,4);
        y1 = Integer.parseInt(years);
        month = dateOfBirth.substring(5,7);
        m1 = Integer.parseInt(month);
        day = dateOfBirth.substring(8,10);
        d1 = Integer.parseInt(day);

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void calculateAge(){

        y1 = 1402 - y1;
        System.out.println(getFirstName() + " has " + y1 + " years old ");


    }

}
