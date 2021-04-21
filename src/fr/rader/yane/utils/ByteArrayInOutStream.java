package fr.rader.yane.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayInOutStream extends ByteArrayOutputStream {

    protected ByteArrayInOutStream() {
        super();
    }

    public ByteArrayInOutStream(int size) {
        super(size);
    }

    public byte[] getBufferData() {
        return this.buf;
    }

    public ByteArrayInputStream getInputStream() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(this.buf, 0, this.count);

        this.buf = null;

        return inputStream;
    }
}