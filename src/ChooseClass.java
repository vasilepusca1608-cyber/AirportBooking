import java.util.Scanner;

public class ChooseClass {
    String finalClass;

    void  settingClass(String classStatus){

        Scanner obScanner = new Scanner(System.in);
        boolean valid     = false;

        do {
            if (classStatus.equals("business")) {
                finalClass = "Business";
                valid      = true;
            } else if (classStatus.equals("economy")){
                finalClass = "Economy";
                valid      = true;
            } else {
                System.out.print("Choose an existing class (Business / Economy): " );
                classStatus = obScanner.next();
            }
        } while (!valid);
    }
}
