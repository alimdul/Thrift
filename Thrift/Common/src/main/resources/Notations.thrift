namespace java com.ludapivovarevich.thrift

struct Plant {
	1:i32 id
    2:string plant
	3:string leaf
	4:string stem
}

struct FloweringTime {
    1:string firstMonthFlowering
	2:string lastMonthFlowering
}

struct FamilyPlants {
	1:i32 id
	2:string name
    3:FloweringTime floweringTime
	4:list<Plant> listPlants
}

service Service {
	list<FamilyPlants> getListFamilyPlants()
	void addFamilyPlants(1:FamilyPlants familyPlants)
	void deleteFamilyPlants(1:i32 index)
	void changeFamilyPlants(1:i32 index, 2:FamilyPlants familyPlants)
	list<Plant> getListPlants(1:i32 indexFamily)
	void addPlant(1:Plant plant, 2:i32 indexFamily)
	void deletePlant(1:i32 index, 2:i32 indexFamily)
	void changePlant(1:i32 index, 2:Plant plant, 3:i32 indexFamily)
}