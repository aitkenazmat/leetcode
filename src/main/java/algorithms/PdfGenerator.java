package algorithms;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfGenerator {

  public static void main(String[] args) {
    String filePath = "Извещение.pdf";
    String fontPath = "/fonts/arial.ttf"; // Укажите путь к шрифту

    try {
      Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream(filePath));
      document.open();

      // Подключаем шрифт для поддержки кириллицы
      BaseFont baseFont = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
      Font titleFont = new Font(baseFont, 14, Font.BOLD);
      Font textFont = new Font(baseFont, 12, Font.NORMAL);

      // Заголовок "Судебному исполнителю"
      Paragraph title = new Paragraph("Судебному исполнителю", titleFont);
      title.setAlignment(Element.ALIGN_LEFT);
      document.add(title);

      // Линия
      document.add(new Paragraph("__________________", textFont));
      document.add(new Paragraph("\n")); // Отступ

      // Извещение
      Paragraph notice = new Paragraph("Извещение\n\n", titleFont);
      notice.setAlignment(Element.ALIGN_CENTER);
      document.add(notice);

      // Основной текст
      String content = "Настоящим сообщаем, что гражданин(ка) Халмурзаев А.Р за период с «05» июня 2024г. " +
              "по «05» июля 2024г. отказался(ась) от предложенных вакансий.";
      Paragraph contentParagraph = new Paragraph(content, textFont);
      contentParagraph.setAlignment(Element.ALIGN_JUSTIFIED);
      document.add(contentParagraph);

      document.add(new Paragraph("\n\n")); // Отступ

      // Подпись директора
      Paragraph director = new Paragraph("Директор Карьерного центра", textFont);
      document.add(director);

      Paragraph signature = new Paragraph("__________________________", textFont);
      signature.setAlignment(Element.ALIGN_LEFT);
      document.add(signature);

      Paragraph fio = new Paragraph("ФИО, эл.подпись", textFont);
      fio.setAlignment(Element.ALIGN_LEFT);
      document.add(fio);

      document.add(new Paragraph("\n\n")); // Отступ

      // Исполнитель и контакты
      Paragraph contacts = new Paragraph("исп.: __________\nтел.: __________\nмоб.: ___________", textFont);
      contacts.setAlignment(Element.ALIGN_LEFT);
      document.add(contacts);

      document.close();
      System.out.println("PDF создан: " + filePath);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
