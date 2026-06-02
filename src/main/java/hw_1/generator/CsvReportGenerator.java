package hw_1.generator;

import java.util.List;

public class CsvReportGenerator implements ReportGenerator {

    @Override
    public void generate(List<String> data) {
        System.out.println("Generating CSV...");

        for (String line : data) {
            System.out.println(line + ",");
        }
    }
}