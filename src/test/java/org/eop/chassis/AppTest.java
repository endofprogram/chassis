package org.eop.chassis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class AppTest {
    public static void main(String[] args) throws IOException {
    	InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\a.txt"), "UTF-8");
    	int b;
    	while((b = isr.read()) > -1) {
    		System.out.println(b);
    	}
    	System.out.println((int)'\r');
    	System.out.println((int)'\n');
    	System.out.println("\r\n");
    }
}
