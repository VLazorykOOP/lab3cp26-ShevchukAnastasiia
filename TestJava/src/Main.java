public class Main {
    public static void main(String[] args) {
        // ------------------------------------------------
        // 1. Використання BUILDER для створення звіту
        // ------------------------------------------------
        System.out.println("1. Створення звіту через Builder...");
        Director director = new Director();
        ReportBuilder builder = new AnnualReportBuilder();

        director.constructReport(builder);
        Report myReport = builder.getResult();

        System.out.println("Звіт створено: " + myReport);

        // ------------------------------------------------
        // 2. Використання MEMENTO для зміни та відкату
        // ------------------------------------------------
        System.out.println("\n2. Демонстрація Memento (Збереження стану)...");
        ReportHistory history = new ReportHistory();

        // Зберігаємо початковий стан
        history.push(myReport.save());
        System.out.println("Стан збережено.");

        // Вносимо зміни (імітація редагування)
        myReport.setContent("УВАГА: Дані змінено! Зростання впало до 5%.");
        System.out.println("Поточний звіт (змінений): " + myReport.getContent());

        // Відновлюємо старий стан
        System.out.println("Відновлення попереднього стану...");
        myReport.restore(history.pop());
        System.out.println("Відновлений звіт: " + myReport.getContent());

        // ------------------------------------------------
        // 3. Використання BRIDGE для відображення
        // ------------------------------------------------
        System.out.println("\n3. Демонстрація Bridge (Різні способи рендеру)...");

        // Відображення через простий текстовий рушій
        ReportView simpleView = new DetailedReportView(new SimpleTextEngine());
        simpleView.display(myReport);

        // Відображення того ж звіту через HTML рушій (без зміни коду звіту)
        ReportView htmlView = new DetailedReportView(new HtmlEngine());
        htmlView.display(myReport);
    }
}