package org.example.TestSplit;

public class txt {
    public static void main(String[] args) {
        // ip at index 0,  status at index 8
        String s = "192.168.1.1 - - [12/May/2023:15:30:45 +0000] \"GET /page1 HTTP/1.1\" 200 1234";
        String[] values = s.split(" ");
        int i = 0;
        for (String value : values) {
            System.out.println(value);
            System.out.println("i = " + i);
            i++;
        }
    }
}
