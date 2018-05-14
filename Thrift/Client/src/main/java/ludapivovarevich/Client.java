package ludapivovarevich;

import ludapivovarevich.controller.Controller;
import ludapivovarevich.view.MainFrame;
import org.apache.thrift.TException;

import java.awt.*;

public class Client {
    public static void main(String args[]) throws TException {
        Controller controller = new Controller();
        MainFrame frame = new MainFrame("Справочник по видам цветов",new Dimension(710,600), controller);
        frame.init();
    }
}
