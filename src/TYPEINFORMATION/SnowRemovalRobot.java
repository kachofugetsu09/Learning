package TYPEINFORMATION;

import java.util.Arrays;
import java.util.List;

public class SnowRemovalRobot implements Robot{
    private String name;
    public SnowRemovalRobot(String name){this.name=name;}
    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return "SnowBot Series 11";
    }

    @Override
    public List<Operation> operations() {
        return Arrays.asList(
                new Operation() {
                    @Override
                    public String description() {
                        return name+ " can shovel snow";
                    }

                    @Override
                    public void command() {
                        System.out.println(name+ " Clearing roof");

                    }
                }
        );
    }
    public static void main(String[] args){
        Robot.Test.test(new SnowRemovalRobot("Slusher"));
    }
}
