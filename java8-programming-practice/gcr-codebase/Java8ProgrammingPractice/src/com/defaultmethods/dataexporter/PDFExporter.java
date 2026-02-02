package com.defaultmethods.dataexporter;

public class PDFExporter implements ReportExporter {
	@Override
	public void exportToCSV() {
		System.out.println("PDF exporter generating CSV report");
	}

	@Override
	public void exportToPDF() {
		System.out.println("Exporting report to PDF format");
	}
}