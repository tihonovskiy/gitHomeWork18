/*3. Write program which convert json, change values of 3 different elements on different levels and convert back to new json file. */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HW17Task3 {
    public static void main(String[] args) throws IOException {
        String widgetJSON = "{\"widget\": {\n" +
                "    \"debug\": \"on\",\n" +
                "    \"window\": {\n" +
                "       \"title\": \"Sample Konfabulator Widget\",\n" +
                "       \"name\": \"main_window\",\n" +
                "       \"width\": 500,\n" +
                "       \"height\": 500\n" +
                "    },\n" +
                "   \"image\": { \n" +
                "       \"src\": \"Images/Sun.png\",\n" +
                "       \"name\": \"sun1\",\n" +
                "       \"hOffset\": 250,\n" +
                "       \"vOffset\": 250,\n" +
                "       \"alignment\": \"center\"\n" +
                "    },\n" +
                "   \"text\": {\n" +
                "       \"data\": \"Click Here\",\n" +
                "       \"size\": 36,\n" +
                "       \"style\": \"bold\",\n" +
                "       \"name\": \"text1\",\n" +
                "       \"hOffset\": 250,\n" +
                "       \"vOffset\": 100,\n" +
                "       \"alignment\": \"center\",\n" +
                "        \"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"\n" +
                "    }\n" +
                "}}";

        String menuJSON = "{\"menu\": {\n" +
                "  \"id\": \"file\",\n" +
                "  \"value\": \"File\",\n" +
                "  \"popup\": {\n" +
                "    \"menuitem\": [\n" +
                "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" +
                "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" +
                "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" +
                "    ]\n" +
                "  }\n" +
                "}}";

        Gson gson = new Gson();

        Widgets widgets = gson.fromJson(widgetJSON, Widgets.class);
        widgets.getWidget().setDebug("OFF");
        widgets.getWidget().getWindow().setName("MY WINDOW");
        widgets.getWidget().getImage().setvOffset(750);
        writingJSONtoFile(widgets, "C:\\IdeaProjects\\HW17Gson\\src\\main\\java\\widgetsJSON.json");

        Menus menu = gson.fromJson(menuJSON, Menus.class);
        menu.getMenu().setId("NEW ID");
        menu.getMenu().getPopup().getMenuitem().add(new Menuitem("NEW", "ITEM"));
        writingJSONtoFile(menu, "C:\\IdeaProjects\\HW17Gson\\src\\main\\java\\menuJSON.json");
    }

    public static void writingJSONtoFile(Object obj, String pathToFile) throws IOException {
        Gson gsonWrite = new GsonBuilder().setPrettyPrinting().create();
        Writer writer = new FileWriter(pathToFile);
        gsonWrite.toJson(obj, writer);
        writer.flush();
        writer.close();
    }
}