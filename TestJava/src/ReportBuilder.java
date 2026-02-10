public interface ReportBuilder {
    void buildHeader();
    void buildContent();
    void buildFooter();
    Report getResult();
}