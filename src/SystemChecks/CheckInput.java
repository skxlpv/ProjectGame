package SystemChecks;

import Alive.Person;

import java.util.Scanner;

public class CheckInput {
    Person p = new Person();
    Scanner sc = new Scanner(System.in);

    public void nameInput(){
        p.name = sc.nextLine();
        nameCheck();
    }

    private void nameCheck(){
        if (isNumber(p.name)){
            System.out.println("INCORRECT INPUT. TRY TO ENTER YOUR NAME AGAIN");
            nameInput();
        }
        else if (!isNumber(p.name)){
            System.out.println("THE NAME WAS UPDATED, BUT NOTHING HAS REALLY CHANGED");
        }
        else {
            System.out.println("Wh......\n" +
                    "PLEASE, ENTER YOUR NAME AND WE WILL BE DONE WITH IT");
            nameInput();
        }
    }

    static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
}
