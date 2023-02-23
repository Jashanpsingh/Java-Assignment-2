// Question-1
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int roll = s.nextInt();
        String interest1 = s.next();
        
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Field of interest: " + interest1);
    }
}


// Question-2
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String first = s.nextLine();
        String last = s.nextLine();
        System.out.println(first + last);
    }
}


// Question-3
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int third = s.nextInt();
        int total = first+second+third;
        int percentage = total/3; 
        System.out.println("Total marks: " + total);
        System.out.println("Percentage marks: " + percentage + "%");
    }
}


// Question-4
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        for(int i=0;i<first;i++){
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println(x+y);
        }
    }
}


// Question-5
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        for(int i=0; i<first; i++){
            String a = s.next();
            String b = s.next();
            System.out.println(a+b);
        }
    }
}
