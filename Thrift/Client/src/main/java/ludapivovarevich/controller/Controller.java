package ludapivovarevich.controller;

import ludapivovarevich.FamilyPlants;
import ludapivovarevich.Plant;
import ludapivovarevich.Service;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.List;

public class Controller {

    private TTransport transport;
    private Service.Client client;

    public void connect() throws TException {
        transport = new TSocket("localhost", 8000);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        client = new Service.Client(protocol);
    }

    public List<FamilyPlants> getListFamilyPlants() throws TException {
        return client.getListFamilyPlants();
    }

    public void addFamilyPlants(FamilyPlants familyPlants) throws TException {
        client.addFamilyPlants(familyPlants);
    }

    public void deleteFamilyPlants(int index) throws TException {
        client.deleteFamilyPlants(index);
    }

    public void changeFamilyPlants(int index, FamilyPlants familyPlants) throws TException {
        client.changeFamilyPlants(index, familyPlants);
    }

    public List<Plant> getListPlants(int index) throws TException {
        return client.getListPlants(index);
    }

    public void addPlant(Plant plant, int indexFamily) throws TException {
        client.addPlant(plant, indexFamily);
    }

    public void deletePlant(int index, int indexFamily) throws TException {
        client.deletePlant(index, indexFamily);
    }

    public void changePlant(int index, Plant plant, int indexFamily) throws TException {
        client.changePlant(index, plant, indexFamily);
    }

    public void close(){
        transport.close();
    }
}
