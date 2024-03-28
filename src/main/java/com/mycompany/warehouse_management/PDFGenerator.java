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
public class PDFGenerator {
    public void generatePDF(String exitdate, String ticketcode, String nature,String desig, String articles, String pump, String articlecode, String outputFile) throws IOException {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA, 12);
                contentStream.newLineAtOffset(100, 700);
                contentStream.showText("Exit Date: " + exitdate);
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Ticket Code: " + ticketcode);
                contentStream.showText("Nature: " + nature);
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Designation: " + desig);
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("N* Articles: " + articles);
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Pump: " + pump);
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Article Code: " + articlecode);
                contentStream.endText();
            }

            document.save(outputFile);
        }
    }
    public static void main(String[] args) {
        PDFGenerator pdfGenerator = new PDFGenerator();
        try {
        pdfGenerator.generatePDF("2023-04-20", "ABC123", "Maintenance", "Manager", "Wrench, Screwdriver, Pliers", "Pump 1", "PART-001", "output.pdf");            System.out.println("PDF generated successfully!");
        } catch (IOException e) {
            System.err.println("Error generating PDF: " + e.getMessage());
        }
    }
}
