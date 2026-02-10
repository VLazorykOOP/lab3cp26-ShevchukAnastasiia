class ReportMemento {
    private final String header;
    private final String content;
    private final String footer;

    public ReportMemento(String header, String content, String footer) {
        this.header = header;
        this.content = content;
        this.footer = footer;
    }

    public String getHeader() { return header; }
    public String getContent() { return content; }
    public String getFooter() { return footer; }
}