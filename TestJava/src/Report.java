public class Report {
    private String header;
    private String content;
    private String footer;
    // ... (тут методи get/set)

    public ReportMemento save() {
        return new ReportMemento(header, content, footer);
    }

    public void restore(ReportMemento memento) {
        this.header = memento.getHeader();
        this.content = memento.getContent();
        this.footer = memento.getFooter();
    }
}