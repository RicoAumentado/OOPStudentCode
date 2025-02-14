package studentsimulation;

class Student {
    String firstName,lastName,course,section;
    int year;
    double midterm,finalGrade;
    
    Student(String firstName,String lastName,String course,
            String section,int year,double midterm,double finalGrade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.section = section;
        this.year = year;
        this.midterm = midterm;
        this.finalGrade = finalGrade;
    }
    void introduceSelf(){
        
    }
    void evaluateGrade(){
       
       double average = (midterm + finalGrade)/2;
        System.out.println("Fullname: " + firstName + lastName);
        System.out.println("Average: " + average);
       if(average >= 98 && average <= 100){
           System.out.println("With Highest Honors");
       }else if(average >= 95 && average <= 97.99){
           System.out.println("With high Honors");
       }else if(average >= 90 && average <= 94.99){
           System.out.println("with Honors");
       }else if(average >= 75 && average <= 89.99){
           System.out.println("Passed");
       }else if(average < 75){
           System.out.println("Failed");
       }else if(average >= 100){
           System.out.println("Invalid Grade");
       }
     
    }
    
}
