// strings are immutable
public class string
{
	public static void main(String[] args) {
	    String name ="Shyam Thakur";
		System.out.println(name);
		
		String a="shyam";
		System.out.println(a); // memory created for shyam
		a="thakur";
		System.out.println(a); // new memory is created for thakur

        System.out.println("a.charAt(2): " + a.charAt(2)); // character at index 2 'a'
        System.out.println("a.length(): " + a.length()); // length of string 'thakur' is 6
	}
}