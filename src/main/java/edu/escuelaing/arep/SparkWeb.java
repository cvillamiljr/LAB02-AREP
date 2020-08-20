package edu.escuelaing.arep;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 * Minimal web app example for Heroku using SparkWeb
 *
 * @author daniel
 */
public class SparkWeb {

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<DOCTYPE html"
                + "<html>"
                + "<title> Web Calculator</title>"
                + "<body>"
                + "<h1>Statistical calculator</h1>"
                + "<form action=\"/submit\">"
                + "<p>This calculator has the operations of mean and standard deviation.</p>"
                + "<p>Please follow the next recommendations  to get the most out of this tool:</p>"
                + "<ol>"
                + "<li>Type the numbers separated by commas</li>"
                + "<li>If you are using real numbers, separate the natural part and the fractional part with a period (.)</li>"
                + "</ol>"
                + "<br></br>"
                + "<label for=\"fdata\">Data set:</label>"
                + "<input type=\"text\" id=\"fdata\" name=\"fdata\"><br><br>"
                + "<input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) throws Exception {
        String request = req.queryParams("fdata");
        String[] data = request.split(",");
        Calculadora calculadora = new Calculadora(data);

        String pagina;
        pagina = "<DOCTYPE html"
                + "<html>"
                + "<title> Web Calculator</title>"
                + "<body>"
                + "<h1>Results</h1>"
                + "<h3>Data set : " + request + "</h3>"
                + "<h3>Mean : " + calculadora.media() + "</h3>"
                + "<h3>Standard deviation : " + calculadora.desviacion() + "</h3>"
                + "</body>"
                + "</html>";
        return pagina;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}
