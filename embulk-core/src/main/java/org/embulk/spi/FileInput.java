package org.embulk.spi;

import java.util.Optional;

public interface FileInput extends AutoCloseable {
    boolean nextFile();

    Buffer poll();

    void close();

    default void setFileName(String fileName) {
        report.setFileName(fileName);
    }

    default void setExpectedSize(long expectedSize) {
        report.setExpectedSize(expectedSize);
    }

    default Optional<String> fileName() {
        return Optional.ofNullable(report.getFileName());
    }

    default Optional<Long> expectedSize() {
        return Optional.ofNullable(report.getExpectedSize());
    }

    FileInputReport report = new FileInputReport();
}
