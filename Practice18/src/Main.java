import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Exception1().exceptionDemo();
        new Exception2().exceptionDemo();
        new Exception3().exceptionDemo();
        new ThrowsDemo1().printMessage(null);
        new ThrowsDemo2().getKey();
        new ThrowsDemo3().getKey();
    }

    public static class Exception1 {
        public void exceptionDemo() {
            try {
                System.out.println(0 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        }
    }

    public static class Exception2 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Attempted enter an incorrect format");
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");

            } finally {
                System.out.println("It's something");
            }
        }
    }

    public static class Exception3 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }

    public static class ThrowsDemo1 {
        public void printMessage(String key) {
            String message = getDetails(key);
            System.out.println( message );
        }
        public String getDetails(String key) {
            try {
                if (key == null) {
                    throw new NullPointerException("null key in getDetails");
                }
                return "data for" + key;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
            return "data for";
        }
    }

    public static class ThrowsDemo2 {
        public void getKey() {
            Scanner myScanner = new Scanner( System.in );
            System.out.print( "Enter a key ");
            String key = myScanner.next();
            printDetails( key );
        }
        public void printDetails(String key) {
            String message = getDetails(key);
            System.out.println( message );
        }
        private String getDetails(String key) {
            try {
                if (key == "") {
                    throw new Exception("Key set to empty string");
                }
            } catch (Exception e) {
                System.out.println("Exception");
            }
            return "data for " + key;
        }
    }

    public static class ThrowsDemo3 {
        public void getKey() {
            Scanner myScanner = new Scanner( System.in );
            System.out.print( "Enter a key ");
            String key = myScanner.next();
            try {
                printDetails(key);
            } catch (Exception e) {
                key = myScanner.next();
            }
        }
        public void printDetails(String key) throws Exception{
            String message = getDetails(key);
            System.out.println( message );
        }
        private String getDetails(String key) throws Exception{
            if (key == "") {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        }
    }
}