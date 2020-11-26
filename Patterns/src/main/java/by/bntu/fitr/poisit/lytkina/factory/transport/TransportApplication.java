package by.bntu.fitr.poisit.lytkina.factory.transport;

import by.bntu.fitr.poisit.lytkina.factory.transport.bean.Transport;
import by.bntu.fitr.poisit.lytkina.factory.transport.service.TransportFactory;

public class TransportApplication {
    public static void main(String[] args) throws Exception {
        Transport monocycle = TransportFactory.getTransport(1);
        Transport bicucle = TransportFactory.getTransport(2);
        Transport tricycle = TransportFactory.getTransport(3);
        Transport car = TransportFactory.getTransport(4);
    }
}
