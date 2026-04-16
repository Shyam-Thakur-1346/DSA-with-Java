import java.util.ArrayList;

class operators
{
	public static void main(String[] args) {
	    System.out.println("a"+"b");     // ab
	    System.out.println("a"+'b');      // ab
	    System.out.println('a'+'b');     //195
	    System.out.println(1+"a");        //1a
	    System.out.println((char)'a'+ 1);      //98
	    System.out.println("shyam"+ new ArrayList<>()); //shyam[]
	}
}
/// + opeeator is overloaded in java