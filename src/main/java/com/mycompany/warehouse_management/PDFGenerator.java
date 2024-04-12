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
import java.text.SimpleDateFormat;
import java.util.List;

public class PDFGenerator {
    public void generateExitPDF(String exitDate, String ticketCode, List<ArticleExit> exitArticles, String outputFile) throws IOException {
        try {
            PdfWriter writer = new PdfWriter(outputFile);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("Exit Date: " + exitDate));
            document.add(new Paragraph("Ticket Code: " + ticketCode));

            // Create a table with the ArticleExit properties
            Table table = new Table(UnitValue.createPercentArray(new float[]{10, 20, 10, 10, 10, 10, 10, 10, 10}));
            table.addCell("Num Sort");
            table.addCell("Code Art");
            table.addCell("Qte Sort");
            table.addCell("Prix Unit");
            table.addCell("Montant S");
            table.addCell("Pump Anc");
            table.addCell("Qte Stock Anc");
            table.addCell("Pump Nouv");
            table.addCell("Qte Stock Nouv");

            for (ArticleExit article : exitArticles) {
                table.addCell(article.getNumSort());
                table.addCell(article.getCodeArt());
                table.addCell(String.valueOf(article.getQteSort()));
                table.addCell(String.valueOf(article.getPrixUnit()));
                table.addCell(String.valueOf(article.getMontantS()));
                table.addCell(String.valueOf(article.getPumpAnc()));
                table.addCell(String.valueOf(article.getQteStockAnc()));
                table.addCell(String.valueOf(article.getPumpNouv()));
                table.addCell(String.valueOf(article.getQteStockNouv()));
            }

            document.add(table);

            document.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error generating PDF: " + e.getMessage());
        }
    }
    public void generateReturnPDF(String returnDate, String ticketCode, List<ArticleReturn> returnArticles, String outputFile) throws IOException {
        try {
            PdfWriter writer = new PdfWriter(outputFile);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("Return Date: " + returnDate));
            document.add(new Paragraph("Ticket Code: " + ticketCode));

            // Create a table with the ArticleReturn properties
            Table table = new Table(UnitValue.createPercentArray(new float[]{10, 20, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
            table.addCell("Num BRS");
            table.addCell("Code Art");
            table.addCell("Qte Reint");
            table.addCell("Prix Unit");
            table.addCell("Montant Re");
            table.addCell("Num Sort");
            table.addCell("Pump Anc");
            table.addCell("Qte Stock Anc");
            table.addCell("Qte Stock Nouv");
            table.addCell("Pump Nouv");
            table.addCell("Date Reint");
            table.addCell("Heure Reint");

            for (ArticleReturn article : returnArticles) {
                table.addCell(article.getNumBrs());
                table.addCell(article.getCodeArt());
                table.addCell(String.valueOf(article.getQteReint()));
                table.addCell(String.valueOf(article.getPrixUnit()));
                table.addCell(String.valueOf(article.getMontRe()));
                table.addCell(article.getNumSort());
                table.addCell(String.valueOf(article.getPumpAnc()));
                table.addCell(String.valueOf(article.getQteStockAnc()));
                table.addCell(String.valueOf(article.getQteStockNouv()));
                table.addCell(String.valueOf(article.getPumpNouv()));
                table.addCell(article.getDateReint().toString());
                table.addCell(article.getHeureReint());
            }

            document.add(table);

            document.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error generating PDF: " + e.getMessage());
        }
    }
}

