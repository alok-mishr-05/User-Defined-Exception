import java.util.Scanner;

class MyException extends Exception{
    public MyException(String str)
    {
        super(str);
    }
}
public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        try
        {
            String s = sc.nextLine();
            if(s.length()>8) {
                throw new MyException("Inputted String have more than 8 character !!");
            }
            else {
                System.out.println("You have entered : "+s);
            }
        }
        catch (MyException e)
        {
            System.out.println("Exception Occurred : "+e.getMessage());
        }
    }
}
