package com.firstchar;

/**
 * Created by gbroveri on 29/06/15.
 */
public class StringStream implements Stream {

    private final char[] text;
    private int currentPos = -1;

    public StringStream(String text) {
        this.text = text.toCharArray();
    }

    @Override
    public boolean hasNext() {
        return currentPos + 1 != text.length;
    }

    @Override
    public char getNext() {
        return text[++currentPos];
    }
}
