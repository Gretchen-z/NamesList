import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class NamesList extends HttpServlet {
    List<String> namesList = new ArrayList<>(){{
        add("Булыгин Константин");
        add("Зайцева Маргарита");
        add("Кудряшов Иван");
        add("Михин Александр");
        add("Тарасова Анна");
    }};

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print(namesList);
        writer.flush();
    }
} 