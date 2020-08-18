package practice;


import java.util.*;
import java.util.regex.Pattern;
import java.security.*;


public class encryption_SHA_256{

    public static void main(String[] args) {
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
