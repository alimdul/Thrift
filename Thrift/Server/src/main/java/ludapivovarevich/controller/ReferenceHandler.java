package ludapivovarevich.controller;

import ludapivovarevich.FamilyPlants;
import ludapivovarevich.Plant;
import ludapivovarevich.Service;

import java.util.List;

public class ReferenceHandler implements Service.Iface {

    private Controller controller;

    public ReferenceHandler(Controller controller){
        this.controller = controller;
    }

    @Override
    public List<FamilyPlants> getListFamilyPlants(){
        for(int i = 0; i < controller.getListFamilyPlants().size(); i++){
            controller.getListFamilyPlants().get(i).setId(i+1);
        }
        return controller.getListFamilyPlants();
    }

    @Override
    public void addFamilyPlants(FamilyPlants familyPlants){
        controller.getListFamilyPlants().add(familyPlants);
        controller.save();
    }

    @Override
    public void deleteFamilyPlants(int index){
        controller.getListFamilyPlants().remove(index);
        controller.save();
    }

    @Override
    public void changeFamilyPlants(int index, FamilyPlants familyPlants){
        controller.getListFamilyPlants().remove(index);
        controller.getListFamilyPlants().add(index, familyPlants);
        controller.save();
    }

    @Override
    public List<Plant> getListPlants(int index){
        for(int i = 0; i < controller.getListFamilyPlants().get(index).getListPlants().size(); i++){
            controller.getListFamilyPlants().get(index).getListPlants().get(i).setId(i+1);
        }
        return controller.getListFamilyPlants().get(index).getListPlants();
    }

    @Override
    public void addPlant(Plant plant, int indexFamily){
        controller.getListFamilyPlants().get(indexFamily).addToListPlants(plant);
        controller.save();
    }

    @Override
    public void deletePlant(int index, int indexFamily){
        controller.getListFamilyPlants().get(indexFamily).getListPlants().remove(index);
        controller.save();
    }

    @Override
    public void changePlant(int index, Plant plant, int indexFamily){
        controller.getListFamilyPlants().get(indexFamily).getListPlants().remove(index);
        controller.getListFamilyPlants().get(indexFamily).getListPlants().add(index, plant);
        controller.save();
    }
}
