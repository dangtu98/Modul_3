import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("desc");
        float price = Float.parseFloat(request.getParameter("list"));
        float percent = Float.parseFloat(request.getParameter("per"));

        float Amount = (float) (price * percent * 0.01);
        float price1 = price * Amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Name :" + name +"</h1>");
        writer.println("<h1>Price :" + price +"</h1>");
        writer.println("<h1>Amount :" + Amount +"</h1>");
        writer.println("<h1> Discounted price:" + price1 +"</h1>");
        writer.println("</html>");
    }
}
