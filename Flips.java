
/**
 * Write a description of class Flips here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Flips
{
    public static void main(String[] args)
    {
        
       int T = Integer.parseInt(args[0]);
       Counter heads = new Counter("heads",1);
       Counter tails = new Counter("tails",0);
       for (int t = 0; t < T; t++)
        if (StdRandom.bernoulli(0.5))
    
          heads.increment();
        else tails.increment();
       StdOut.println(heads);
       StdOut.println(tails);
       //int d = heads.tally() - tails.tally();
       //StdOut.println("delta: " + Math.abs(d));
    } 
}
