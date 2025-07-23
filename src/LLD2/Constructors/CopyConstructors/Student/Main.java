package LLD2.Constructors.CopyConstructors.Student;

public class Main {
    public static void main(String[] args) {
        Student kartik = new Student("Kartik", 25);

        // I want to create a copy of kartik object
        Student kartikShallowCopy = kartik;

//        System.out.println("kartik: "+ kartik);
//        System.out.println("kartikCopy: "+ kartikCopy);
//        System.out.println("DEBUG");

        // Create a new object with exact details of the old object
        Student kartikCopy = new Student();
        kartikCopy.setAge(kartik.getAge());
        kartikCopy.setName(kartik.getName());

        System.out.println("kartik: "+ kartik);
        System.out.println("kartikCopy: "+ kartikCopy);
        System.out.println("DEBUG");

        Student kartikCopy2 = new Student(kartik);
        Student kartikCopy3 = new Student(kartik);
        Student kartikCopy4 = new Student(kartik);

        System.out.println("kartik: "+ kartik);
        System.out.println("kartikCopy: "+ kartikCopy);
        System.out.println("DEBUG");
        System.out.println("kartikCopy2: "+ kartikCopy2);
        System.out.println("kartikCopy3: "+ kartikCopy3);
        System.out.println("kartikCopy4: "+ kartikCopy4);
    }
}

/*

new Student("Kartik", 25);

memory is allocated for this particular object

Student@771
name = "kartik"
age = 25


Student kartik = new Student("Kartik", 25);

kartik is not an object

kartik is a reference variable, not an object
kartik contains the address in memory where the object is stored.

Student kartikCopy = kartik;
 */