class DetailedReportView extends ReportView {
    public DetailedReportView(RenderEngine engine) {
        super(engine);
    }

    @Override
    public void display(Report report) {
        System.out.println("\n--- Detailed View Start ---");
        engine.renderSection("HEADER", report.getHeader());
        engine.renderSection("BODY", report.getContent());
        engine.renderSection("FOOTER", report.getFooter());
        System.out.println("--- Detailed View End ---");
    }
}