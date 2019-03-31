package softepec.es.ejemplogson;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Houses {

    private ArrayList<House> housesList;

    public Houses() {
        this.housesList = new ArrayList<>();
    }

    public ArrayList<House> getHousesList() {
        return housesList;
    }

    public String toJSON(){
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }

    public Houses fromJSON(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Houses.class);
    }

    public void addHouse(House house) {
        housesList.add(house);
    }

    public void removeHouse(House house) {
        housesList.remove(house);
    }

    @Override
    public String toString() {
        return "Houses{" +
                "housesList=" + housesList +
                '}';
    }
}
