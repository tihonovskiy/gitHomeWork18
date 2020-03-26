public class Widget {
    private String debug;
    private WidgetWindow window;
    private WidgetImage image;
    private WidgetText text;

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public WidgetWindow getWindow() {
        return window;
    }

    public void setWindow(WidgetWindow window) {
        this.window = window;
    }

    public WidgetImage getImage() {
        return image;
    }

    public void setImage(WidgetImage image) {
        this.image = image;
    }

    public WidgetText getText() {
        return text;
    }

    public void setText(WidgetText text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "debug='" + debug + '\'' +
                ", window=" + window +
                ", image=" + image +
                ", text=" + text +
                '}';
    }
}
