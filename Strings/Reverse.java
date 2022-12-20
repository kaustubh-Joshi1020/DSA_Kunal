package com.kj;

public class Reverse {
    static int i;
    public static String reverseWord(String str)
    {
        String op;
        for(i=str.length()-1;i>=0;i--)
        {
            op = str[i];
        }
        return str;
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        obj.reverseWord("Geeks");
    }


}

