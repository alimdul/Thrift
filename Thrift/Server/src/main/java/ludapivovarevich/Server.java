package ludapivovarevich;

import ludapivovarevich.controller.Controller;
import ludapivovarevich.controller.ReferenceHandler;
import ludapivovarevich.model.ReferenceBook;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class Server {

    private static final int PORT = 8000;

    public static ReferenceHandler handler;
    public static Service.Processor processor;

    public static void main(String[] args) {
        ReferenceBook referenceBook = new ReferenceBook();
        Controller controller = new Controller(referenceBook);
        controller.readData();

        try {
            handler = new ReferenceHandler(controller);
            processor = new Service.Processor(handler);
            Runnable simple = () -> perform(processor);
            new Thread(simple).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void perform(Service.Processor processor) {
        try {
            TServerTransport serverTransport = new TServerSocket(PORT);
            TServer server = new TSimpleServer(
                    new TServer.Args(serverTransport).processor(processor)
            );
            System.out.println("Server start");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
