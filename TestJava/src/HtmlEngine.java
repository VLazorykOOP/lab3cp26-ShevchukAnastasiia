class HtmlEngine implements RenderEngine {
    @Override
    public void renderSection(String name, String data) {
        System.out.println("<div class='" + name.toLowerCase() + "'>" + data + "</div>");
    }
}