package Helpers;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateReport implements ITestListener {

    private String timestamp = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
    private String folderName = "reports/";
    private File report = new File(folderName + "report " + timestamp + ".html");
    private String reportName = report.getName();
    private String reportPath = folderName + reportName;
    private Writer writer;

    @Override
    public void onStart(ITestContext arg0) {
        new File(folderName).mkdirs();
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(report)));
            writer.write("<!doctype html>\n<html lang=\"en\">\n<meta charset=\"utf-8\">\n<body>\n<table>\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void onTestStart(ITestResult arg0) {

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        try {
            String p = "\t<tr><td>" + arg0.getName() + "</td><td>passed</td></tr>\n";
            Files.write(Paths.get(reportPath), p.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        try {
            String p = "\t<tr><td>" + arg0.getName() + "</td><td>failed</td></tr>\n";
            Files.write(Paths.get(reportPath), p.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        try {
            String p = "\t<tr><td>" + arg0.getName() + "</td><td>skipped</td></tr>\n";
            Files.write(Paths.get(reportPath), p.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext arg0) {
        try {
            Files.write(Paths.get(reportPath), "</table></body>\n</html>".getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

    }
}
