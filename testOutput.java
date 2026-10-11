public class testOutput
{
    public static void testTwoByTwo()
    {
        //twoByTwo follows white top, green front
        twoByTwo cubeTwo = new twoByTwo();
        
        //test if turnS methods use the correct indices
        System.out.println("R test");
        System.out.println("side: "+cubeTwo.atIndex(1)+" "+cubeTwo.atIndex(2));
        System.out.println("face: "+cubeTwo.atIndex(12)+" "+cubeTwo.atIndex(13)+" "+cubeTwo.atIndex(14)+" "+cubeTwo.atIndex(15));
        cubeTwo.turnR();
        cubeTwo.turnR("2");
        System.out.println(cubeTwo.getState());
        cubeTwo.turnR("'");
        cubeTwo.turnR("prime");
        cubeTwo.turnR("'");
        System.out.println("end side: "+cubeTwo.atIndex(1)+" "+cubeTwo.atIndex(2));
        System.out.println("end face: "+cubeTwo.atIndex(12)+" "+cubeTwo.atIndex(13)+" "+cubeTwo.atIndex(14)+" "+cubeTwo.atIndex(15));
        System.out.println(cubeTwo.getScramble());
        System.out.println("solved = "+cubeTwo.isSolved());
        System.out.println("");

        cubeTwo.reset();
        System.out.println("L test");
        cubeTwo.turnL();
        cubeTwo.turnL("2");
        System.out.println(cubeTwo.getState());
        cubeTwo.turnL("'");
        cubeTwo.turnL("prime");
        cubeTwo.turnL("'");
        System.out.println(cubeTwo.getScramble());
        System.out.println("solved = "+cubeTwo.isSolved());
        System.out.println("");
        
        cubeTwo.reset();
        System.out.println("U test");
        cubeTwo.turnU();
        cubeTwo.turnU("2");
        System.out.println(cubeTwo.getState());
        cubeTwo.turnU("'");
        cubeTwo.turnU("prime");
        cubeTwo.turnU("'");
        System.out.println(cubeTwo.getScramble());
        System.out.println("solved = "+cubeTwo.isSolved());
        System.out.println("");
    
        cubeTwo.reset();
        System.out.println("D test");
        cubeTwo.turnD();
        cubeTwo.turnD("2");
        System.out.println(cubeTwo.getState());
        cubeTwo.turnD("'");
        cubeTwo.turnD("prime");
        cubeTwo.turnD("'");
        System.out.println(cubeTwo.getScramble());
        System.out.println("solved = "+cubeTwo.isSolved());
        System.out.println("");
        
        cubeTwo.reset();
        System.out.println("F test");
        cubeTwo.turnF();
        cubeTwo.turnF("2");
        System.out.println(cubeTwo.getState());
        cubeTwo.turnF("'");
        cubeTwo.turnF("prime");
        cubeTwo.turnF("'");
        System.out.println(cubeTwo.getScramble());
        System.out.println("solved = "+cubeTwo.isSolved());
        System.out.println("");
        
        cubeTwo.reset();
        System.out.println("B test");
        cubeTwo.turnB();
        cubeTwo.turnB("2");
        System.out.println(cubeTwo.getState());
        cubeTwo.turnB("'");
        cubeTwo.turnB("prime");
        cubeTwo.turnB("'");
        System.out.println(cubeTwo.getScramble());
        System.out.println("solved = "+cubeTwo.isSolved());
        System.out.println("");
    }
}
