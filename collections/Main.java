package collections;

public class Main
{
    public static void main( String[] args )
    {
    	
    	//Lea el c�digo en la clase principal e intente comprender por qu� no funciona
    	
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);

        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
    }


}