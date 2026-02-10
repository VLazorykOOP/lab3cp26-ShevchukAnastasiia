class ReportHistory {
    private final List<ReportMemento> history = new ArrayList<>();

    public void push(ReportMemento memento) {
        history.add(memento);
    }

    public ReportMemento pop() {
        if (history.isEmpty()) return null;
        return history.remove(history.size() - 1);
    }
}