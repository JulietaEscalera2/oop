package polimorfismo;

import java.util.ArrayList;

public class ListLandTransport {

    private ArrayList<Land> list = new ArrayList<>();

    public ArrayList<Land> getTransport() {
        return list;
    }

    public void setTransport(ArrayList<Land> transport) {
        this.list = transport;
    }

    public void addLand(Land land){
        list.add(land);
    }

    public void display(){
        System.out.println(list.size());
        list.stream()
                .forEach(value->System.out.println("name = "+value.getName()
                        +", price = "+ value.getPrice()+", hasMotor = "+ value.isHasMotor()
                        +value.displayData()));

    }

}
