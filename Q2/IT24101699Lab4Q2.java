import java.util.Scanner;

public class IT24101699Lab4Q2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       
        System.out.print("Please enter exam marks(out of 100):"); 
        int examMarks = scanner.nextInt();

        if(examMarks<0 || examMarks>100) {
        System.out.println("Invalid input for exam marks. Terminating program.");
        return;
}

        System.out.print("Please enter the lab submission marks(out of 100)");
        int labSubmissionMarks = scanner.nextInt();
        
        if(labSubmissionMarks<0 || labSubmissionMarks>100){
        System.out.println("Invalid input for lab marks. Terminating program.");
        return;
} 
        System.out.print("Please enter the percentage given for the exam:");
        int examMarkPercentageGiven = scanner.nextInt();


        System.out.print("Please enter the percentage given for the lab submission:"); 
        int labMarkPercentageGiven = scanner.nextInt();

       
        double totalPercentage = examMarkPercentageGiven + labMarkPercentageGiven;

        if( totalPercentage<0|| totalPercentage>100){
           System.out.println("The percentage must add up to 100. Terminating program.");
        return;

} 
        double examMarkFromPercentage = examMarks*examMarkPercentageGiven/100;

        double labMarkFromPercentage = labSubmissionMarks*labMarkPercentageGiven/100;

        double finalExamMark = examMarkFromPercentage + labMarkFromPercentage;
       
        System.out.println("The final exam mark is: "+finalExamMark);          
       scanner.close();

    }
}
     
     