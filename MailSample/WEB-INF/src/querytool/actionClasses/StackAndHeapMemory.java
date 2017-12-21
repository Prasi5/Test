package querytool.actionClasses;

public class StackAndHeapMemory {

    static void methodOne()
    {
         System.out.println("From Method One");
         
    }

    static void methodTwo()
    {
         System.out.println("From Method Two");
         methodOne();
    }

    public static void main(String[] args)
    {
         System.out.println("Main Method Started");
         methodTwo();
         System.out.println("Main Method Ended");
    }

} 