package algorithms.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by WWW on 29.11.2018.
 *
 * 929. Unique Email Addresses
 *
 *
 */
public class Main929 {

    public static void main(String[] args) {
        String[]emails = new String[]{"test.email+alex@leetcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {

        Set uniqueEmails = new HashSet();
        for ( String email : emails) {

            String localName = email.split("@")[0];
            String domenName = email.split("@")[1];

            String newLocalName = "";
            String tmpName = "";

            if (isExistPlusSymbol(localName))
                tmpName = localName.split("\\+")[0];
            else
                tmpName = localName;

            for (int i = 0; i < tmpName.length() ; i++) {
                if (tmpName.charAt(i)!='.') {
                    newLocalName+=tmpName.charAt(i);
                }
            }
            uniqueEmails.add(newLocalName+"@"+domenName);
        }

        return uniqueEmails.size();

    }


    public  static boolean  isExistPlusSymbol(String email){

        boolean isExistPlusSymbol = false;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '+') {
                isExistPlusSymbol = true;
                break;
            }
        }

        return isExistPlusSymbol;
    }
}
