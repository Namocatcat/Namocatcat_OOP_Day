package student;

public class Student {
    
    private String firstName, lastName;
    private int age;
    private boolean isMinor;
    
    public Student(){
    
    }
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age < 18;
       
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
       return lastName + ", " + firstName;
    }
    
        public boolean getIsMinor() {
            return isMinor;
        }
    
    public void increaseAge(){
        age++;
        isMinor = age < 18;
         
    }
    
    
    @Override
    public String toString(){
        String ageUpdate = isMinor? "minor" : "adult";
        return getName() + " - " + age + " - " + ageUpdate;
    }
}