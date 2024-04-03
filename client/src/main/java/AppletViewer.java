import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

// properly, you'd use JagexAppletViewer, but this is handy for quick testing
public class AppletViewer extends Applet implements AppletStub {
    public static final String HOST_ADDRESS = "127.0.0.1";

    public static Properties client_parameters = new Properties();

    static {
        client_parameters.put("separate_jvm", "true");
        client_parameters.put("image", "http://www.runescape.com/img/game/splash2.gif");
        client_parameters.put("centerimage", "true");
        client_parameters.put("boxborder", "false");
        client_parameters.put("java_arguments", "-Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
        client_parameters.put("boxbgcolor", "black");
        client_parameters.put("5", "true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
        client_parameters.put("11", "0");
        client_parameters.put("34", "225");
        client_parameters.put("30", "MpanIDx68ZShS/0wQc60lSvsuExhgYKEW");
        client_parameters.put("9", "false");
        client_parameters.put("32", "7E38D137C0C97EAC1B89C07E1823D93B92621D5FF287F27135B71ECF61D4B07BDF4D957CA0C90F16707EE156B23C4365");
        client_parameters.put("25", "false");
        client_parameters.put("0", "gBY1FFD2PtHXiWDimCyWmg");
        client_parameters.put("12", "false");
        client_parameters.put("21", "true");
        client_parameters.put("28", "t6VmPGef1q2SfGVu5*Boi1FauurdIIXIIXzRjGVy4Yo");
        client_parameters.put("7", "0");
        client_parameters.put("35", "0");
        client_parameters.put("24", "");
        client_parameters.put("-1", "7KYq*VzZDycfkn7KXq98Xg");
        client_parameters.put("23", "");
        client_parameters.put("1", "410601069");
        client_parameters.put("13", "0");
        client_parameters.put("29", "");
        client_parameters.put("18", "1");
        client_parameters.put("6", "28348");
        client_parameters.put("26", "true");
        client_parameters.put("10", HOST_ADDRESS);
        client_parameters.put("4", "");
        client_parameters.put("33", "0");
        client_parameters.put("3", ".runescape.com");
        client_parameters.put("16", "0");
        client_parameters.put("15", "false");
        client_parameters.put("8", "1107");
        client_parameters.put("14", "false");
        client_parameters.put("20", "0");
        client_parameters.put("27", "false");
        client_parameters.put("2", "");
        client_parameters.put("haveie6", "false");
    }

    public static void main(String[] args) {
        AppletViewer applet = new AppletViewer();
        applet.start();
    }

    public void start() {
        try {
            JFrame frame = new JFrame("RuneScape");
            frame.add(this);
            frame.setVisible(true);
            frame.setSize(1280, 720);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
            frame.toFront();

            client cl = new client();
            cl.supplyApplet(this);
            cl.init();
            cl.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void appletResize(int dimensionX, int dimensionY) {
        super.resize(new Dimension(dimensionX, dimensionY));
    }

    @Override
    public String getParameter(String paramName) {
        return (String) client_parameters.get(paramName);
    }

    @Override
    public URL getDocumentBase() {
        return this.getCodeBase();
    }

    @Override
    public URL getCodeBase() {
        try {
            return new URL("http://" + HOST_ADDRESS);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
