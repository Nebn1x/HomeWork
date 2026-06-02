package hw_1.service;

import java.util.List;

public class ReportValidator {

    public void validate(List<String> data) {
        if (data == null || data.isEmpty()) {
            throw new RuntimeException("Data is empty");
        }
    }
}