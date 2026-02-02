package com.defaultmethods.dataexporter;

public class ReportExportTest {
	public static void main(String[] args) {
		ReportExporter csvExporter = new CSVExporter();
		ReportExporter pdfExporter = new PDFExporter();

		csvExporter.exportToCSV();
		csvExporter.exportToJSON(); // default method

		pdfExporter.exportToPDF();
		pdfExporter.exportToJSON(); // default method
	}
}