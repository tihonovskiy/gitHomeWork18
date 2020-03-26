import java.util.List;

public class Popup {
    private List<Menuitem> menuitem;

    public List<Menuitem> getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(List<Menuitem> menuitem) {
        this.menuitem = menuitem;
    }

    @Override
    public String toString() {
        return "Popup{" +
                "menuitem =" + menuitem +
                '}';
    }
}