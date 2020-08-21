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
        get("/", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<title> Calculadora</title>"
                + "<body>"
                + "<h1>Calculadora Web</h1>"
                + "<form action=\"/results\">"
                + "<p>Calculadora de Desviación estandar y media de una muestra dada.</p>"
                + "<br></br>"
                + "<label for=\"fdata\">Ecribe los datos separados por comas:</label><br>"
                + "<input type=\"text\" id=\"Datos\" name=\"Datos\"><br><br>"
                + "<input type=\"submit\" value=\"Calcular\">"
                + "<p>Si quieres saber la desviación estandar y media de la muestra que ingresaste presiona Calcular.</p>"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) throws Exception {
        String request = req.queryParams("Datos");
        String[] data = request.split(",");
        Calculadora calculadora = new Calculadora(data);
        String pagina;
        pagina = "<DOCTYPE html"
                + "<html>"
                + "<title> Resultados</title>"
                + "<body>"
                + "<h1>Resultados</h1>"
                + "<h3>Muestra :</h3>"
                + "<h3>"+ request +"</h3>"
                + "<h3>Media Muestral :</h3>"
                + "<h3>"+ calculadora.media() + "</h3>"
                + "<h3>Desviación Estandar muestral : </h3>"
                + "<h3>"  + calculadora.desviacion() + "</h3>"
                + "<p> Gracias por utilizar nuestra calculadora.<p/>"
                + "</body>"
                + "</html>";
        return pagina;    }

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
