import java.lang.Object;
/**
 * Write a description of class Reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reverse
{
    public static void main(String[] args)
 {
     Stack<Integer> stack;
     stack = new Stack<Integer>();
     while (!StdIn.isEmpty())
     stack.push(StdIn.readInt());
     for (int i : stack)
     StdOut.println(i);
 } 
}
