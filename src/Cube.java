public class Cube {
    //properties
    private int side;

    //constructor
    public Cube(){
        side=1;
    }
    public Cube(int s){
        side = s;
        if (side < 1)
            throw new IllegalArgumentException();
    }

    //behavior
    public void setSide(int side){
        this.side = side;
        if (side < 1)
            throw new IllegalArgumentException();
    }
    public int getSide(){
        return side;
    }
    public int getSurfaceArea(){
        return (6*side*side);
    }
    public int getVolume(){
        return (side*side*side);
    }
    public String toString(){
        return "Side length: " + side;
    }
}

