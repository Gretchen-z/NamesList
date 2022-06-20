import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;

public class NamesList extends HttpServlet {
    List<String> namesList = new ArrayList<>(){{
        add("Булыгин Константин");
        add("Зайцева Маргарита");
        add("Кудряшов Иван");
        add("Михин Александр");
        add("Тарасова Анна");
    }};

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print(namesList);
        writer.flush();
    }
} 