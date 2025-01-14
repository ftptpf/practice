package ru.ftptpf;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Объединение нескольких pdf-файлов в один
 * В качестве первого аргумента передается название объединенного файла,
 * все последующие аргументы это файлы которые нужно будет объединить
 */
public class PdfMerger {

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Должно быть как минимум три файла в качестве аргументов.");
            return;
        }
        String outputFilePath = args[0];
        List<String> inputFiles = List.of(args).subList(1, args.length);

        mergePdfFile(outputFilePath, inputFiles);
    }

    private static void mergePdfFile(String outputFilePath, List<String> inputFiles) throws IOException {
        PDDocument resultDocument = new PDDocument();
        PDFMergerUtility mergerUtility = new PDFMergerUtility();

        for (String file : inputFiles) {
            PDDocument document = new PDDocument();
            document.save(file);

            mergerUtility.appendDocument(resultDocument, document);
        }

        Files.createDirectories(Paths.get(outputFilePath).getParent());
        resultDocument.save(outputFilePath);
        resultDocument.close();
    }
}
