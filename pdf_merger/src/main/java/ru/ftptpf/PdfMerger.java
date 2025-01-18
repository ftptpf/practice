package ru.ftptpf;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Объединение нескольких pdf-файлов в один
 * В качестве первого аргумента передается название объединенного файла,
 * все последующие аргументы это файлы которые нужно будет объединить.
 * Исходные и объединенные файлы должны будут находиться в pdf_merger/src/main/resources
 */
public class PdfMerger {

    public static void main(String[] args) throws IOException {
        if (args.length < 3) {
            throw new IllegalArgumentException("Неверное количество переданных аргументов. "
                    + "Должен быть указан 1 итоговый фай и минимум 2 которые будут объединены.");
        }

        File outputFile = new File(args[0]);
        List<File> files = List.of(args).subList(1, args.length).stream()
                .map(File::new)
                .toList();

        PDFMergerUtility mergerUtility = new PDFMergerUtility();
        mergerUtility.setDestinationFileName(outputFile.toString());

        for (File file : files) {
            mergerUtility.addSource(file);
        }

        mergerUtility.mergeDocuments(null);
        System.out.println("Объединение файлов завершено");
    }
}
