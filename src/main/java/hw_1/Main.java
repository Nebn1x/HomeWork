package hw_1;

import hw_1.generator.CsvReportGenerator;
import hw_1.generator.PdfReportGenerator;
import hw_1.generator.ReportGenerator;
import hw_1.service.EmailSender;
import hw_1.service.FileSaver;
import hw_1.service.ReportValidator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //ReportManager порушує SRP, бо виконує декілька різних типів задач
        // ще OCP бо треба кожен раз змінювати код для типів import
        // та й варто додати інтерфейс щоб була DIP
        // Логіку розбив на декілька класів

        ReportValidator validator = new ReportValidator();
        ReportGenerator pdfGenerator = new PdfReportGenerator();
        ReportGenerator csvGenerator = new CsvReportGenerator();
        EmailSender emailSender = new EmailSender();
        FileSaver fileSaver = new FileSaver();

        List<String> data = List.of(
                "Alex",
                "John",
                "Mike"
        );

        validator.validate(data);

        pdfGenerator.generate(data);

        System.out.println();

        csvGenerator.generate(data);

        System.out.println();

        fileSaver.save("report.pdf");
        emailSender.send("report.pdf");
    }
}