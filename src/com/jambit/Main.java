package com.jambit;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        InputReader inputReader = new InputReader();
        final StringArray fileContent = inputReader.readFile("EncryptedText.txt");
    }
}