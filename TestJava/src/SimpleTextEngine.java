class SimpleTextEngine implements RenderEngine {
    @Override
    public void renderSection(String name, String data) {
        System.out.println(name + ": " + data);
    }
}