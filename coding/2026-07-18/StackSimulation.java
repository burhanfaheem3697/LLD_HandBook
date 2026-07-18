
public class StackSimulation {
    public static void main(String[] args) {
        StackSimulationHelper helper = new StackSimulationHelper();

        helper.levelOne(9);
    }
}

class StackSimulationHelper{
    public void levelOne(int x){
        System.out.println("x : " + x);
        System.out.println(System.identityHashCode(this));
        levelTwo(x+1);
    }

    public void levelTwo(int x){
        System.out.println("x : " + x);
        System.out.println(System.identityHashCode(this));
        levelThree(x+1);

    }

    public void levelThree(int x){
        System.out.println("x : " + x);
        System.out.println(System.identityHashCode(this));
    }
}