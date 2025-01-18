package util;

public class MenuUtil {
    public static void processMenu(int selectMenu){

        switch (selectMenu) { //5
            case 1:
                StudentUtil.registerStudents();
                break;

            case 2:
                StudentUtil.printALLRegisteredStudents();
                break;

            case 3:
                StudentUtil.findStudentsAndPrint();
                break;

            case 4:
                StudentUtil.updateStudentWithNewObject();
                break;

                case 5:
                    System.exit(0);
                    break;
            default:
                break;
        }
    }

    public static String requireName(){
        return InputUtil.requireText("Please enter a name");
    }

    public static String requireSurname(){
        return InputUtil.requireText("Please enter a surname");
    }
    public static String requireClassName(){
        return InputUtil.requireText("Please enter a class name");
    }
    public static int requireAge(){
        return InputUtil.requireNumber("Please enter a age");

    }

    public static void showSuccessMessage(){
        System.out.println("Operation completed Succesfully");
// harda success mesaj istifade olunsa onun ucun istifade olunur
    }

}
