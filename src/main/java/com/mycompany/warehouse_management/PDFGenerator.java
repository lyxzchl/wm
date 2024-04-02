/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warehouse_management;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author lyeschl
 */
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PDFGenerator {
    public void generatePDF(String exitDate, String ticketCode, String nature, String designation, String articles, String pump, String articleCode, String outputFile) throws IOException {
        try {
            PdfWriter writer = new PdfWriter(outputFile);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("Exit Date: " + exitDate));
            document.add(new Paragraph("Ticket Code: " + ticketCode));
            document.add(new Paragraph("Nature: " + nature));
            document.add(new Paragraph("Designation: " + designation));

            // Create a table with 2 columns
            Table table = new Table(UnitValue.createPercentArray(new float[]{50, 50}));
            table.addCell("Articles");
            table.addCell(articles);
            table.addCell("Pump");
            table.addCell(pump);
            table.addCell("Article Code");
            table.addCell(articleCode);

            document.add(table);

            document.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error generating PDF: " + e.getMessage());
        }
    }
}

