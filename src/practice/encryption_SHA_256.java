import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.security.*;
import java.nio.charset.Charset;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("[a-zA-Z0-9]{6,20}");
        //String str = sc.next();
        String str = "";
        if(sc.hasNext(p))
        {
            str = sc.next();
            try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

            messageDigest.update(str.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
            }
            catch(NoSuchAlgorithmException e)
            {
                System.out.println(e);
            }
            
        }
    }
}
