import sun.misc.Queue;

import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String str) throws InterruptedException {
        str = str.toLowerCase();
        String[] arr = str.split("");

        Queue<String> myQ = new Queue<>();
        for (int i = arr.length-1; i >= 0 ; i--) {
            myQ.enqueue(arr[i]);
        }
        String str2 = "";
        for (int i = 0; i < arr.length; i++) {
            str2 += myQ.dequeue();
        }
        if(str2.equals(str)){
            return true;
        }
        return false;
    }
}
