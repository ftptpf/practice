package ru.practice.schildt.io21;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Класс ограничивает имена файлов возвращаемых методом list(),
 * только теми которые оканчиваются расширением, указанным при создании объекта этого класса.
 */
public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
