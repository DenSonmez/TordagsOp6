import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student a = new Student("Allan", new ArrayList<>(Arrays.asList("Algorithms")));
        Student b = new Student("Benny",new ArrayList<>() );
        Student c = new Student("Carla", new ArrayList<>());

        String basic = "Algorithms";
        String web = "Web Programming";
        String databases = "Databases";

        ArrayList<String>courses = new ArrayList<>(Arrays.asList(basic,web,databases));

        Teacher  d = new Teacher ("Tess", new ArrayList<>(Arrays.asList(basic,web,databases)));
        Teacher  h = new Teacher ("Jorg",new ArrayList<>(Arrays.asList(basic,web,databases)));
        courses.add("Dansk");
        Teacher  t = new Teacher ("Signe", courses);

        String basic1 = "Algorithms";
        String web1 = "Web Programming";
        String databases1 = "Databases";

        ArrayList<Person>persons = new ArrayList<>(Arrays.asList(a,b,c,d,h,t));

        for(Person p : persons){
            for(String s: courses){
                if(!p.addCourse(s)){
                    switch (p.getClass().getSimpleName()){
                        case "Student":
                            System.out.println(p.getName() +" Du har allerede bestået dette fag");
                            break;
                        case "Teacher":
                            System.out.println(p.getName() + " Du kan ikke undervise dette fag");
                            break;
                    }
                }
            }


        }





    }
}