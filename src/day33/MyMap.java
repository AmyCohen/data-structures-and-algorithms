package day33;

public class MyMap<X, Y, Z> {

    private X key;
    private Y valueY;
    private Z valueZ;

    public void put(X key, Y valueY, Z valueZ){
        this.key = key;
        this.valueY = valueY;
        this.valueZ = valueZ;
    }

    @Override
    public String toString(){
        return "" + key + valueY + valueZ;
    }
}