import java.util.ArrayList;
import java.util.List;

// ==========================================
// 1. PRODUCT & MEMENTO (Предметна область)
// ==========================================

// Клас, який ми будуємо (Product) і стан якого зберігаємо (Originator)
class Report {
    private String header;
    private String content;
    private String footer;

    public void setHeader(String header) { this.header = header; }
    public void setContent(String content) { this.content = content; }
    public void setFooter(String footer) { this.footer = footer; }

    public String getHeader() { return header; }
    public String getContent() { return content; }
    public String getFooter() { return footer; }

    @Override
    public String toString() {
        return "Report: [Header=" + header + ", Content=" + content + ", Footer=" + footer + "]";
    }

    // --- Memento Methods ---

    // Створює знімок поточного стану
    public ReportMemento save() {
        return new ReportMemento(header, content, footer);
    }

    // Відновлює стан зі знімка
    public void restore(ReportMemento memento) {
        this.header = memento.getHeader();
        this.content = memento.getContent();
        this.footer = memento.getFooter();
    }
}