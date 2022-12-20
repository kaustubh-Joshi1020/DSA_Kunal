package com.kj;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char a = (char)( 'a' + i);
            builder.append(a + " ");
        }
        System.out.println(builder);
        System.out.println(builder.reverse());

    }

}
