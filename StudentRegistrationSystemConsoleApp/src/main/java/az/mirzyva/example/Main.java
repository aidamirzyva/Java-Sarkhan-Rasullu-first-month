package az.mirzyva.example;

import bean.Student;
import util.InputUtil;
import util.MenuUtil;
import util.StudentUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requireNumber("What do you want to do?%n" +
                    "\n 1. Register Student" +
                    "\n 2. Show all student" +
                    "\n 3. Find student " +
                    "\n 4. Update student"+
                    "\n 5. Exit");
            MenuUtil.processMenu(menu);

        }
    }

}


//
//
//
//        sc=new Scanner(System.in);
//            System.out.println("How many students will be enrolled?");
//        int count = sc.nextInt();
//        sc=new Scanner(System.in);
//                System.out.println("Enter name");
//        String name = sc.nextLine();
//
//        sc=new Scanner(System.in);
//                System.out.println("Enter surname");
//        String surname = sc.nextLine();
//
//
//
//        sc=new Scanner(System.in);
//                System.out.println("Enter classNAme");
//        String className = sc.nextLine();

//sc=new Scanner(System.in);
//                System.out.println("Enter age");
//                int age = sc.nextInt();