package com.defaultmethods.dataexporter;

public class CSVExporter implements ReportExporter {
	@Override
	public void exportToCSV() {
		System.out.println("Exporting report to CSV format");
	}

	@Override
	public void exportToPDF() {
		System.out.println("CSV exporter generating PDF report");
	}
}