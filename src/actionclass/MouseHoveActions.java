package actionclass;

public class MouseHoveActions {
    public static void main(String[] args){

        int[] grades ={55,65,75,85,95};
        int gradeA = 95;
        boolean excellentGrade = false;

        for(int g : grades){
            if (g == gradeA) {
                excellentGrade = true;
                break;
            }
        }

        if( excellentGrade)
        System.out.println(gradeA + " is an A");
        else
            System.out.println(gradeA + " didn't receive an A");

    }
}
