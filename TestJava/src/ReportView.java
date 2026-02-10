abstract class ReportView {
    protected RenderEngine engine;

    protected ReportView(RenderEngine engine) {
        this.engine = engine;
    }

    public abstract void display(Report report);
}