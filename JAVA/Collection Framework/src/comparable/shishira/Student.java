package collection;

public class Student implements Comparable<Student> {
    int id;
    double perc;
    String name;

    public Student(int id, double perc, String name) {
        this.id = id;
        this.perc = perc;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + " " + this.perc + " " + this.name;
    }

    //compare name based
    @Override
    public int compareTo(Student anotherStudent) {
        // return this.name.compareToIgnoreCase(anotherStudent.name);
         return anotherStudent.name.compareToIgnoreCase(this.name);
       // return this.name.compareToIgnoreCase(anotherStudent.name) * -1;
        //return anotherStudent.name.compareToIgnoreCase(this.name);
    }
}
