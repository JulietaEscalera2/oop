package polimorfismo;

public class Main {

    public static void main (String [] args){

        ListLandTransport trans = new ListLandTransport();

        Land transport1 = new Bicycle("Cross",1500,false, true);
        Land transport2 = new Bicycle("mongo",1500,false, false);
        Land transport3 = new Car("Audi",15000,true, true);
        Land transport4 = new Car("Toyota",25000,true, false);

        trans.addLand(transport1);
        trans.addLand(transport2);
        trans.addLand(transport3);
        trans.addLand(transport4);

        trans.display();


    }
}
