class Director {
    public void constructReport(ReportBuilder builder) {
        builder.buildHeader();
        builder.buildContent();
        builder.buildFooter();