package arshGoyalSheet.Strings;

import java.util.ArrayList;
import java.util.List;

public class RabinKarp {
    public static void main(String[] args) {
        String str ="fxtlsgypsfa";
        String pattern ="tlsgyp";
        System.out.println(PatternMatch(str,pattern));
    }

    static List<Integer> PatternMatch(String str, String pattern){
        str = str.trim();
        long MOD = 1000000007;
        int base = 256;
        int n = str.length(), m = pattern.length();
        List<Integer> res = new ArrayList<>();
        long pattHash = getHash(pattern,m,MOD,base);
        long winHash = getHash(str,m,MOD,base);


    // ✅ precompute power = base^(m-1) % MOD
    long power = 1;
    for (int i = 0; i < m-1; i++) {
        power = (power * base) % MOD;
    }

        //check the hashes
        for (int i = 0; i <= n-m; i++) {
            //check hash value and chars at each iteartion 

            if (winHash == pattHash) {
                if (isMatched(str,pattern,i)) {
                    res.add(i);
                }
            }

            //roll the hash by subtract and end hash values to window hashes
            if (i < n-m) {
                
                winHash = rolledHash(str,winHash,str.charAt(i),str.charAt(i+m),power,base,MOD);
            }
        }

        return res;
    }

    static long getHash(String str ,int length, long MOD, int base){
        long h =0;
        //hash function
        for (int i = 0; i < length; i++) {
            h = ( h * base + str.charAt(i) ) % MOD ;
        }
        return h;
    }
    
    static boolean isMatched(String str, String pattern , int index){

        for (int i = 0; i < pattern.length(); i++) {
            //break conditon
            if (pattern.charAt(i) != str.charAt(index + i)) {
                return false ;
            }
        }
        return true;
    }

    static long rolledHash(
        String str,
        long prevHash,
        char oldChar,
        char newChar,
        long power,
        int base,
        long MOD)
        {

            //subtract oldchar value;

            long newHash = (prevHash - oldChar * power ) % MOD;
            //hanle negetives
            if (newHash < 0) {
                newHash += MOD;
            }

            //add the new char t hash
            newHash = (newHash * base + newChar) % MOD;
            return newHash;
        }
}