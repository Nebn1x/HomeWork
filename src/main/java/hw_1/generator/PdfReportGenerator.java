package hw_1.generator;

import java.util.List;

public class PdfReportGenerator implements ReportGenerator {

    @Override
    public void generate(List<String> data) {
        System.out.println("Generating PDF...");

        for (String line : data) {
            System.out.println("[PDF] " + line);
        }
    }
}