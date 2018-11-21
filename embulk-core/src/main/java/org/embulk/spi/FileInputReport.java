package org.embulk.spi;

public class FileInputReport {
    private String fileName;
    private long expectedSize;

    public FileInputReport() {
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setExpectedSize(long expectedSize) {
        this.expectedSize = expectedSize;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getExpectedSize() {
        return this.expectedSize;
    }
}
