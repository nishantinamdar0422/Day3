package Assignment;

public class Palindrome {
    public static void main(String[] args) {
       String str = "";
       for(String s:args)
       {
           //str += s;
       }
       System.out.println("String "+str);
       System.out.println("Length "+str.length());
       System.out.println(("String in UpperCase "+str.toUpperCase()));

       StringBuffer strbuf = new StringBuffer(str);
       strbuf.reverse();
       String StrRev = strbuf.toString();

       if(str.equals(StrRev))
           System.out.println("Palindrome");
       else
           System.out.println(" Not a Palindrome");
    }
}
