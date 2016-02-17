package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 5;
        x = 5;
        x = 7;
        System.out.println("x");
        int y = 4;
        y = x + 3;
        x = x + 3;
        x += 3;
        x += 1;
        x++;
        ++x;
        x = 9;
        y = ++x;

        int z = 5; //4 bytes -2.1B to 2.1B
        byte b = 7; //1 byte  -128 to 127
        short s = 10;//2 bytes - 65,536    -32,768 to 32,767
        long l = 123L;     //  8 bytes, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float f = 124.5f;  // 4 bytes
        // 234659873405968703000000000
        // 300
        double d = 123.34536; //8 bytes
        char c = '@'; //1 byte
        boolean bool = false;
        x = 2 - 3;
        x = 2 * 3;
        x = 2 / 3;
        x = 2 % 3; // = 2;
        x = 3 % 2; // = 1;
        x = 2 + 3 + 4;
        x = (2 + 3) * y;

        bool = x < 6;

    }
}
