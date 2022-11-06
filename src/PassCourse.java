import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassCourse {
    public static void main(String[] args) {
        int mat,phys,chem,tur,mus, sumtemp = 0,count=0,sum=0;
        double avg;

        Scanner input=new Scanner(System.in);

        System.out.println("Math Grade: ");
        mat = input.nextInt();
        System.out.println("Physics Grade: ");
        phys = input.nextInt();
        System.out.println("Chemistry Grade: ");
        chem = input.nextInt();
        System.out.println("Turkish Grade: ");
        tur = input.nextInt();
        System.out.println("Music Grade: ");
        mus = input.nextInt();

        List<Integer> courseGrades = new ArrayList<Integer>(); // Populating int values in array
        courseGrades.add(mat);
        courseGrades.add(phys);
        courseGrades.add(chem);
        courseGrades.add(tur);
        courseGrades.add(mus);

        Integer[] courses = new Integer[courseGrades.size()]; // converting ArrayList<Integer> to array of primitive data type "int"

        for (int i = 0; i< courseGrades.size(); i++){
            courses[i]=courseGrades.get(i);
            if (courses[i] > 0 && courses[i] < 100 ){

                sumtemp= courses[i];                          // keeping the grade temporarily until adding it into summation
                count++;

            }
            if (courses[i] > 0 && courses[i] < 100 ){
                sum += sumtemp;
            }

        }
        avg = (double) sum / count;

        System.out.println("The Average: "+avg);
        String result = avg> 55 ? "Successfully passed!" : "Failed! ";
        System.out.println(result);


    }

}
