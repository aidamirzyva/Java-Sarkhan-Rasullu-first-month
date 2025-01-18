package util;

import az.mirzyva.example.Config;
import bean.Student;

import java.awt.*;

public class StudentUtil {

    public static Student fillStudent() {
//burada elave parametrlerdi name,surname,classname,age elave eetmek
        String name = MenuUtil.requireName(); //kodu rahatlasdirdiq
        String surname = MenuUtil.requireSurname(); //kodu rahatlasdirdiq
        String className = MenuUtil.requireClassName();
        int age = MenuUtil.requireAge(); //kodu rahatlasdirdiq

        Student st = new Student(name, surname, age, className);

        return st;
    }

    public static void printALLRegisteredStudents() {
        if (Config.students == null) {
            return;//student null-dursa yeni hecne yoxdursa return edir geri qaytarir
//metoodan cxir eks halda davam edir//else ona gore yazmamisiqki null olsa eger onsuz metoddan cxacaq// null deilse for dongusune girecek
        }
        for (int i = 0; i < Config.students.length; i++) {//studentlerin sayi qeder
            Student st = Config.students[i];// studentlerin i-nincisini goturur
            System.out.println((i+1)+"."+st.getFullInfo()); //getfull info metodunu cagirir ve onu capa verir
        } //i+1 indeki her daim 1 vahid cox gosterir yeni sifirinci telebe yoxdur


    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("How many students will be enrolled?");
//neche telebe istediyimizi sorusur
        Config.students = new Student[count]; //reqemin sayi qeder student massivi duzeldirik

        for (int i = 0; i < count; i++) { //meselen 3
            System.out.println(i + 1 + "Register");//eger sifirdirsa birinci studente register edirString name = InputUtil.requireText("enter name");
//student massivini  i-ninci elementine fillStudentin geriye qaytardigi obyekti massivini menimselt
            Config.students[i] = StudentUtil.fillStudent();//geriye student obyekti qaytarir
        } //butun telebeler qeydiyyatdan kecirmek olur/
//fill student ile massivin eleementleri daxil olur/ ad/soyad/yas/sinif nomresi
 MenuUtil.showSuccessMessage();

        StudentUtil.printALLRegisteredStudents();


    }

    public static void findStudentsAndPrint() { //adamdan hem texti teleb edecek sorada goturecek
        String text = InputUtil.requireText("type name, surname or classNAme"); //musteriden texti teleb etdim
        //students found-tapilan telebeler
        Student[] studentsFound = findStudents(text); //aldigim texti find studente gonderdim ve bu geriye massiv qaytarir
        for (int i = 0; i < studentsFound.length; i++) {
            System.out.println(studentsFound[i].getFullInfo());
//hemin massivide cap etdik
        }
    }

    public static Student[] findStudents(String text) { //tapdigi studentleri arraya doldurur
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) { //studentlerin hamsini axtarir
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++; //countu artirir baxir gorek neche student uygundu
            }
            //yuxarida count neche eded olsa asagidada o qeder olacaq meselen 3 count varsa foundda 3 olacaq. ve 3 olculu massiv olacaq

        }
        Student[] result = new Student[count]; //countu tapdu/hemin count
        //qeder bir massiv yaradir
        int found = 0;//tapildi
        for (int i = 0; i < Config.students.length; i++) {//butun massivi yoxlayir

            Student st = Config.students[i]; // yoxlayir her hansisa bir student bu serti odeyirse,
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found] = st; //resultun founduna st menimsedir
                found++; // ve bir vahid artirir
            }
        }
        return result;
    } public static void updateStudentWithNewObject(){ //obyekt yaratmaqla update
        StudentUtil.printALLRegisteredStudents(); //showAll yeni hamsini gosteririk
        int i = InputUtil.requireNumber("How many people do you want to change?"); //Sonra sorusuruq //Neçənci adamda dəyişiklik etmək istəyirsiniz?
        //indeksi goturecek sonra
        System.out.println("Enter new information!");//yeni melumatlari daxil et

        Student s = StudentUtil.fillStudent();
        Config.students[i-1] =s; // i-ninci telebeye s-i menimsedirik
        //i-1
        //musteri sececekki birinci adami deyismek isteyirem/ onun secdiyi birinci adam bizim sifirinci adamdi
    }

    public static void updateStudentWithSameObject() { //obyekti deyismekle update
        StudentUtil.printALLRegisteredStudents(); //showAll yeni hamsini gosteririk
        int i = InputUtil.requireNumber("How many people do you want to change?"); //Sonra sorusuruq //Neçənci adamda dəyişiklik etmək istəyirsiniz?
        //indeksi goturecek sonra
        System.out.println("Enter new information!");//yeni melumatlari daxil et

        Student selectStudent = Config.students[i - 1]; // i-ninci telebeye s-i menimsedirik
        //i-1
        //musteri sececekki birinci adami deyismek isteyirem/ onun secdiyi birinci adam bizim sifirinci adamdi
        String changeParams = InputUtil.requireText("What do you want to change? example 'name' , 'surname' or 'className' , 'age' ");
        //Nəyi dəyişmək istəyirsiniz?

        if (changeParams.contains("'name'")) {
            selectStudent.setName(MenuUtil.requireName());
        }
        if (changeParams.contains("'surname'")) {
            selectStudent.setSurname(MenuUtil.requireSurname());
        }
        if (changeParams.contains("'className'")) {
            selectStudent.setClassName(MenuUtil.requireClassName());
        }
        if (changeParams.contains("'age'")) {
            selectStudent.setAge(MenuUtil.requireAge());
        }

    }
    public static void updateStudentWithSplit(){


        StudentUtil.printALLRegisteredStudents(); //showAll yeni hamsini gosteririk
        int index = InputUtil.requireNumber("How many people do you want to change?"); //Sonra sorusuruq //Neçənci adamda dəyişiklik etmək istəyirsiniz?
        //indeksi goturecek sonra
        System.out.println("Enter new information!");//yeni melumatlari daxil et

        Student selectStudent = Config.students[index - 1]; // i-ninci telebeye s-i menimsedirik
        //index-1
        //musteri sececekki birinci adami deyismek isteyirem/ onun secdiyi birinci adam bizim sifirinci adamdi
        String changeParams = InputUtil.requireText("What do you want to change? example 'name' , 'surname' , 'className' , 'age' ");
        //Nəyi dəyişmək istəyirsiniz?

        String[] paramters = changeParams.split(","); //bosluga gore parcalayacaq
        for (int i = 0; i < paramters.length; i++) {
            String param = paramters[i];

            if (param.equalsIgnoreCase("name")) { //boyuk namede yazsa balacada yazsa isleyece
                selectStudent.setName(MenuUtil.requireName());
            } else if (param.equalsIgnoreCase("surname")) {
                selectStudent.setSurname(MenuUtil.requireSurname());
            } else if (param.equalsIgnoreCase("class name")) {
                selectStudent.setClassName(MenuUtil.requireClassName());
            } else if (param.equalsIgnoreCase("age")) {
                selectStudent.setAge(MenuUtil.requireAge());
            }

        }
    }



}
