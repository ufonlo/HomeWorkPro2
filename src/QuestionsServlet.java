import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class QuestionsServlet extends HttpServlet {

    static final int HUMANAGE_CHILD = 0;
    static final int HUMANAGE_TEENAGER = 1;
    static final int HUMANAGE_YOUNG = 2;
    static final int HUMANAGE_AVERAGE = 3;
    static final int HUMANAGE_AGES = 4;
    static final int HUMANAGE_OLD = 5;

    static final int STUDY_NOTSTUDY = 6;
    static final int STUDY_FEW = 7;
    static final int STUDY_LITTLE = 8;
    static final int STUDY_MIDDLE = 9;
    static final int STUDY_AMIDLE = 10;
    static final int STUDY_LOTOF = 11;
    static final int STUDY_LOTSOF = 12;

    static final int MASIVE_LENGHT =13;

    static final String TEMPLATE = "<html><head><title>Survey stats</title></head>" +
            "<body>%s</body></html>";

    static final int[]result = new int[13];

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        final String humanage = req.getParameter("humanage");
        final String study = req.getParameter("study");

        if("child".equals(humanage)){
            result[HUMANAGE_CHILD]++;
        }
        if("teenager".equals(humanage)){
            result[HUMANAGE_TEENAGER]++;
        }
        if("young".equals(humanage)){
            result[HUMANAGE_YOUNG]++;
        }
        if("average".equals(humanage)){
            result[HUMANAGE_AVERAGE]++;
        }
        if("ages".equals(humanage)){
            result[HUMANAGE_AGES]++;
        }
        if("old".equals(humanage)){
            result[HUMANAGE_OLD]++;
        }

        if("notstudy".equals(study)){
            result[STUDY_NOTSTUDY]++;
        }
        if("few".equals(study)){
            result[STUDY_FEW]++;
        }
        if("little".equals(study)){
            result[STUDY_LITTLE]++;
        }
        if("middle".equals(study)){
            result[STUDY_MIDDLE]++;
        }
        if("amidle".equals(study)){
            result[STUDY_AMIDLE]++;
        }
        if("lotof".equals(study)){
            result[STUDY_LOTOF]++;
        }
        if("lotsof".equals(study)){
            result[STUDY_LOTSOF]++;
        }
        String res = "<p>child: " + result[HUMANAGE_CHILD] +  "<br>teenager: "
        + result[HUMANAGE_TEENAGER] + "<br>young: " + result[HUMANAGE_YOUNG]
         + "<br>average: " + result[HUMANAGE_AVERAGE] + "<br>ages: "
                + result[HUMANAGE_AGES] + "<br>old: " + result[HUMANAGE_OLD] +
                "<br>notstudy: " + result[STUDY_NOTSTUDY] + "<br>few: " +
                result[STUDY_FEW] + "<br>little: " + result[STUDY_LITTLE] +
                "<br>middle: " + result[STUDY_MIDDLE] + "<br>amidle: " +
                result[STUDY_AMIDLE] + "<br>lotof" + result[STUDY_LOTOF] +
                "<br>lotsof: " + result[STUDY_LOTSOF] + "</p>";

        pw.println(String.format(TEMPLATE,res));

    }
}
