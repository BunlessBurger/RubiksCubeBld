public class RubiksCubeBld
{
    public static void main(String[] args)
    {
        twoByTwo cube = new twoByTwo();
        
        //test if turnS methods use the correct indices
        
        System.out.println("R test");
        System.out.println("side: "+cube.atIndex(1)+" "+cube.atIndex(2));
        System.out.println("face: "+cube.atIndex(12)+" "+cube.atIndex(13)+" "+cube.atIndex(14)+" "+cube.atIndex(15));
        cube.turnR();
        cube.turnR("2");
        System.out.println(cube.getState());
        cube.turnR("'");
        cube.turnR("prime");
        cube.turnR("'");
        System.out.println("end side: "+cube.atIndex(1)+" "+cube.atIndex(2));
        System.out.println("end face: "+cube.atIndex(12)+" "+cube.atIndex(13)+" "+cube.atIndex(14)+" "+cube.atIndex(15));
        System.out.println(cube.getScramble());
        System.out.println(cube.getState());
        System.out.println(cube.getSolved());
        System.out.println(cube.isSolved());
        System.out.println("");

        cube.reset();
        System.out.println("L test");
        System.out.println("side: "+cube.atIndex(0)+" "+cube.atIndex(3));
        System.out.println("face: "+cube.atIndex(4)+" "+cube.atIndex(5)+" "+cube.atIndex(6)+" "+cube.atIndex(7));
        cube.turnL();
        cube.turnL("2");
        System.out.println(cube.getState());
        cube.turnL("'");
        cube.turnL("prime");
        cube.turnL("'");
        System.out.println("end side: "+cube.atIndex(0)+" "+cube.atIndex(3));
        System.out.println("end face: "+cube.atIndex(4)+" "+cube.atIndex(5)+" "+cube.atIndex(6)+" "+cube.atIndex(7));
        System.out.println(cube.getScramble());
        System.out.println(cube.isSolved());
        System.out.println("");
        
        cube.reset();
        System.out.println("U test");
        cube.turnU();
        cube.turnU("2");
        System.out.println(cube.getState());
        cube.turnU("'");
        cube.turnU("prime");
        cube.turnU("'");
        System.out.println(cube.getScramble());
        System.out.println(cube.getState());
        System.out.println(cube.getSolved());
        System.out.println(cube.isSolved());
        System.out.println("");
    
        cube.reset();
        System.out.println("D test");
        cube.turnD();
        cube.turnD("2");
        System.out.println(cube.getState());
        cube.turnD("'");
        cube.turnD("prime");
        cube.turnD("'");
        System.out.println(cube.getScramble());
        System.out.println(cube.getState());
        System.out.println(cube.getSolved());
        System.out.println(cube.isSolved());
        System.out.println("");
        
        cube.reset();
        System.out.println("F test");
        cube.turnF();
        cube.turnF("2");
        System.out.println(cube.getState());
        cube.turnF("'");
        cube.turnF("prime");
        cube.turnF("'");
        System.out.println(cube.getScramble());
        System.out.println(cube.getState());
        System.out.println(cube.getSolved());
        System.out.println(cube.isSolved());
        System.out.println("");
        
        cube.reset();
        System.out.println("B test");
        cube.turnB();
        cube.turnB("2");
        System.out.println(cube.getState());
        cube.turnB("'");
        cube.turnB("prime");
        cube.turnB("'");
        System.out.println(cube.getScramble());
        System.out.println(cube.getState());
        System.out.println(cube.getSolved());
        System.out.println(cube.isSolved());
        System.out.println("");
    }
}
