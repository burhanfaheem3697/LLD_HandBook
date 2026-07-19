
public class ReferenceMutationPlayground {
    public static void main(String[] args) {
        Coordinate c = new Coordinate(10,10);

        shift(c);

        System.out.println("The modified x : " + c.getX());
        System.out.println("The modified y : " + c.getY());
    }

    private static void shift(Coordinate c){
        c.setX(99);
        c.setY(100);
    }
}


class Coordinate{
    int x;
    int y;
    Coordinate(int x,int y){
        this.x = x;
        this.y = y;
    }

    void setX(int x){
        this.x = x;
    }

    void setY(int y){
        this.y = y;
    }

    int getX(){
        return this.x;
    }

    int getY(){
        return this.y;
    }
}