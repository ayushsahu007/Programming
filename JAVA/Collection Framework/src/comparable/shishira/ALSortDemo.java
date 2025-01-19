package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ALSortDemo {
    public static void main(String[] args) {
        Student s1 = new Student(12,35.6,"Ayush");
        Student s2 = new Student(233,63.66,"Jhon");
        Student s3 = new Student(56,99,"king");
        Student s4 = new Student(67,63.6,"Thala");
        //normal step to print all object data
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);System.out.println(s3);

        List<Student> lst = new LinkedList<>();
        lst.add(s1); lst.add(s2); lst.add(s3);lst.add(s4);
        System.out.println("------------------------------------");

        for (Student s : lst){
            System.out.println(s);
        }
        Collections.sort(lst);
        System.out.println("-----------------------------------");

        for(int i = 0;i<lst.size();i++){
            Student s = lst.get(i);
            System.out.println(s);
        }



    }
}
