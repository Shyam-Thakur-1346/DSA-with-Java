/* string pool - when we create a string using double quotes,
 it is stored in a special memory area known as the "string pool".
 If another string with the same value is created, it will reference
  the same memory location in the pool, thus saving memory.*/

  public class comparison
{
	public static void main(String[] args) {
	    String a ="Thakur";
	    String b ="Thakur";
		System.out.println(a.equals(b));     // true, both have the same content; use .equals() to compare strings
		

    String name1=new String("Shyam");
    String name2=new String("Shyam");
	System.out.println(name1==name2);   // true, values are equal; use .equals() to compare strings
	}
}

// == operator compares references (memory locations) for objects
// .equals() method compares values/content of the objects

// we will prefer first part i.e. .equals() method for string comparison