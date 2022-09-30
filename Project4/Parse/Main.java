/**
 * Main.java
 *
 *
 * Created: Todays
 *
 * @author <a href="mailto:maverick.berner@marquette.edu">Maverick Berner</a>
 * @version 1.0
 */

 package Parse;

public class Main
{
  public static void main(String[] args) 
  {
    try
      {
	      java.io.Reader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        //java.io.Reader reader = new java.io.B(args[0]);
        new MiniJava(reader).Goal();
      }
    // catch (java.io.IOException e)
    //   {
	  //       System.err.println(e.toString());
    //   }
    catch (ParseException p)
      {
	      System.out.println(p.toString());
	      System.exit(-1);
      }
  }
} // Main
