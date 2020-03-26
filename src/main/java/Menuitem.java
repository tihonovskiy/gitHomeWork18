public class Menuitem {
    private String value;
    private String onclick;

    public Menuitem(String value, String onclick) {
        this.value = value;
        this.onclick = onclick;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOnclick() {
        return onclick;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    @Override
    public String toString() {
        return "MyMenuitem{" +
                "value='" + value + '\'' +
                ", onclick='" + onclick + '\'' +
                '}';
    }
}