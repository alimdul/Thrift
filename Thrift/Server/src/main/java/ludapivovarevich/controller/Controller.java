package ludapivovarevich.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ludapivovarevich.FamilyPlants;
import ludapivovarevich.model.ReferenceBook;

import java.io.*;
import java.util.List;

public class Controller {

    private final static String FILE_NAME = "E:\\aipos_laba2_thrift\\fileWithData\\data.json";

    private ReferenceBook referenceBook;

    public Controller(ReferenceBook referenceBook){
        this.referenceBook = referenceBook;
    }

    public List<FamilyPlants> getListFamilyPlants() {
        return referenceBook.getList();
    }

    public void readData(){
        Gson gson = new Gson();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FILE_NAME));
            referenceBook = gson.fromJson(reader, ReferenceBook.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void save(){
        ReferenceBook newReferenceBook = new ReferenceBook();
        newReferenceBook.setList(referenceBook.getList());

        Gson gs = new GsonBuilder().setPrettyPrinting().create();
        String json = gs.toJson(newReferenceBook);

        FileWriter writer = null;

        try {
            writer = new FileWriter(FILE_NAME);
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
