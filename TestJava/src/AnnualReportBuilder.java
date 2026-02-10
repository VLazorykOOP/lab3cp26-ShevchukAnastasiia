class AnnualReportBuilder implements ReportBuilder {
    private Report report;

    public AnnualReportBuilder() {
        this.reset();
    }

    private void reset() {
        this.report = new Report();
    }

    @Override
    public void buildHeader() {
        report.setHeader("=== РІЧНИЙ ЗВІТ 2025 ===");
    }

    @Override
    public void buildContent() {
        report.setContent("Фінансові показники стабільні. Зростання на 20%.");
    }

    @Override
    public void buildFooter() {
        report.setFooter("Затверджено директором.");
    }

    @Override
    public Report getResult() {
        Report product = this.report;
        this.reset();
        return product;
    }
}