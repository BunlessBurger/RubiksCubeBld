import java.util.ArrayList;

public class twoByTwo 
{
    //char arrays because it's faster
    char[] solvedState = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
    char[] scrambledState = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
    char[] scrambleNew = new char[solvedState.length];
    //arrayList because length and elements(A, B, C...) will change
    ArrayList<String> scramble = new ArrayList<String>();
    
    
    //PERMUTATION METHODS
    //turn a side
    public void turnR(){
        //create a copy of list scrambledState
        copyToList(scrambledState,scrambleNew);
        
        //replace white with green
        //System.out.println(swapDist('w','g'));
        scrambleNew[1] = scrambledState[9];
        scrambleNew[2] = scrambledState[10];
        //blue with white
        //System.out.println(swapDist('b','w')); ////////-16
        scrambleNew[16] = scrambledState[2];//-14
        scrambleNew[19] = scrambledState[1];//-18
        //green with yellow
        //System.out.println(swapDist('g','y'));
        scrambleNew[9] = scrambledState[21];
        scrambleNew[10] = scrambledState[22];
        //yellow with blue
        //System.out.println(swapDist('y','b')); /////-4
        scrambleNew[21] = scrambledState[19];//-2, 17
        scrambleNew[22] = scrambledState[16];//-6, 18
        //rotate red face
        rotateClockwise(12);
        
        scramble.add("R");
        
        //replace scrambledState with the new scramble
        copyToList(scrambleNew,scrambledState);
    }
    public void turnR(String extra){
        //create a copy of list scrambledState
        copyToList(scrambledState,scrambleNew);
        
        if (extra == "'" || extra =="prime"){
            //replace white with blue
            scrambleNew[1] = scrambledState[19];
            scrambleNew[2] = scrambledState[16];
            //blue with yellow
            scrambleNew[16] = scrambledState[22];
            scrambleNew[19] = scrambledState[21];
            //green with white
            scrambleNew[9] = scrambledState[1];
            scrambleNew[10] = scrambledState[2];
            //yellow with green
            scrambleNew[21] = scrambledState[9];
            scrambleNew[22] = scrambledState[10];
            //rotate red face
            rotateCounter(12);
            
            scramble.add("R'");
        } else if (extra == "2"){
            //replace white with yellow
            scrambleNew[1] = scrambledState[21];
            scrambleNew[2] = scrambledState[22];
            //blue with green
            scrambleNew[16] = scrambledState[10];
            scrambleNew[19] = scrambledState[9];
            //green with blue
            scrambleNew[9] = scrambledState[19];
            scrambleNew[10] = scrambledState[16];
            //yellow with white
            scrambleNew[21] = scrambledState[1];
            scrambleNew[22] = scrambledState[2];
            //rotate red face twice
            rotate2(12);
            
            scramble.add("R2");
        }
        
        //replace scrambledState with the new scramble
        copyToList(scrambleNew,scrambledState);
        
    }
    
    public void turnL(){
        copyToList(scrambledState,scrambleNew);
        
        //replace white with blue
        scrambleNew[0] = scrambledState[18];
        scrambleNew[3] = scrambledState[17];
        //replace blue with yellow
        scrambleNew[17] = scrambledState[23];
        scrambleNew[18] = scrambledState[20];
        //replace yellow with green
        scrambleNew[20] = scrambledState[8];
        scrambleNew[23] = scrambledState[11];
        //replace green with white
        scrambleNew[8] = scrambledState[0];
        scrambleNew[11] = scrambledState[3];
        //rotate orange face
        rotateClockwise(4);
        
        scramble.add("L");
        copyToList(scrambleNew,scrambledState);
    }
    public void turnL(String extra){
        copyToList(scrambledState,scrambleNew);
        
        if (extra == "'" || extra == "prime"){
            //replace white with green
            scrambleNew[0] = scrambledState[8];
            scrambleNew[3] = scrambledState[11];
            //replace blue with white
            scrambleNew[17] = scrambledState[3];
            scrambleNew[18] = scrambledState[0];
            //replace yellow with blue
            scrambleNew[20] = scrambledState[18];
            scrambleNew[23] = scrambledState[17];
            //replace green with yellow
            scrambleNew[8] = scrambledState[20];
            scrambleNew[11] = scrambledState[23];
            //rotate orange face
            rotateCounter(4);
            
            scramble.add("L'");
        } else if (extra == "2"){
            //replace white with yellow
            scrambleNew[0] = scrambledState[20];
            scrambleNew[3] = scrambledState[23];
            //replace blue with green
            scrambleNew[17] = scrambledState[11];
            scrambleNew[18] = scrambledState[8];
            //replace yellow with white
            scrambleNew[20] = scrambledState[0];
            scrambleNew[23] = scrambledState[3];
            //replace green with blue
            scrambleNew[8] = scrambledState[18];
            scrambleNew[11] = scrambledState[17];
            //rotate orange face twice
            rotate2(4);
            
            scramble.add("L2");
        }
        
        copyToList(scrambleNew,scrambledState);
    }
    
    public void turnU(){
        copyToList(scrambledState,scrambleNew);
        
        //replace green with red
        //System.out.println(swapDist('g','r'));
        scrambleNew[8] = scrambledState[12];
        scrambleNew[9] = scrambledState[13];
        //orange with green
        //System.out.println(swapDist('o','g'));
        scrambleNew[4] = scrambledState[8];
        scrambleNew[5] = scrambledState[9];
        //blue with orange
        //System.out.println(swapDist('b','o'));
        scrambleNew[16] = scrambledState[4];
        scrambleNew[17] = scrambledState[5];
        //red with blue
        //System.out.println(swapDist('r','b'));
        scrambleNew[12] = scrambledState[16];
        scrambleNew[13] = scrambledState[17];
        //rotate white face
        rotateClockwise(0);
        
        scramble.add("U");
        
        //replace scrambledState with the new scramble
        copyToList(scrambleNew,scrambledState);
    }
    public void turnU(String extra){
        copyToList(scrambledState,scrambleNew);
        
        if (extra == "'" || extra == "prime"){
            //replace green with orange
            scrambleNew[8] = scrambledState[4];
            scrambleNew[9] = scrambledState[5];
            //orange with blue
            scrambleNew[4] = scrambledState[16];
            scrambleNew[5] = scrambledState[17];
            //blue with red
            scrambleNew[16] = scrambledState[12];
            scrambleNew[17] = scrambledState[13];
            //red with green
            scrambleNew[12] = scrambledState[8];
            scrambleNew[13] = scrambledState[9];
            //rotate white face
            rotateCounter(0);
            
            scramble.add("U'");
        } else if (extra == "2"){
            //replace green with blue
            scrambleNew[8] = scrambledState[16];
            scrambleNew[9] = scrambledState[17];
            //orange with red
            scrambleNew[4] = scrambledState[12];
            scrambleNew[5] = scrambledState[13];
            //blue with green
            scrambleNew[16] = scrambledState[8];
            scrambleNew[17] = scrambledState[9];
            //red with orange
            scrambleNew[12] = scrambledState[4];
            scrambleNew[13] = scrambledState[5];
            //rotate white face twice
            rotate2(0);
            
            scramble.add("U2");
        }
        
        
        //replace scrambledState with the new scramble
        copyToList(scrambleNew,scrambledState);
    }
    
    public void turnD(){
        copyToList(scrambledState,scrambleNew);
        
        //replace orange with blue
        scrambleNew[7] = scrambledState[19];
        scrambleNew[6] = scrambledState[18];
        //replace green with orange
        scrambleNew[11] = scrambledState[7];
        scrambleNew[10] = scrambledState[6];
        //replace red with green
        scrambleNew[15] = scrambledState[11];
        scrambleNew[14] = scrambledState[10];
        //replace blue with red
        scrambleNew[19] = scrambledState[15];
        scrambleNew[18] = scrambledState[14];
        //rotate yellow face
        rotateClockwise(20);
        
        scramble.add("D");
        copyToList(scrambleNew,scrambledState);
    }
    public void turnD(String extra){
        copyToList(scrambledState,scrambleNew);
        
        if (extra == "'" || extra == "prime"){
            //replace orange with green
            scrambleNew[7] = scrambledState[11];
            scrambleNew[6] = scrambledState[10];
            //replace green with red
            scrambleNew[11] = scrambledState[15];
            scrambleNew[10] = scrambledState[14];
            //replace red with blue
            scrambleNew[15] = scrambledState[19];
            scrambleNew[14] = scrambledState[18];
            //replace blue with orange
            scrambleNew[19] = scrambledState[7];
            scrambleNew[18] = scrambledState[6];
            //rotate yellow face
            rotateCounter(20);
            
            scramble.add("D'");
        } else if (extra == "2"){
            //replace orange with red
            scrambleNew[7] = scrambledState[15];
            scrambleNew[6] = scrambledState[14];
            //replace green with blue
            scrambleNew[11] = scrambledState[19];
            scrambleNew[10] = scrambledState[18];
            //replace red with orange
            scrambleNew[15] = scrambledState[7];
            scrambleNew[14] = scrambledState[6];
            //replace blue with green
            scrambleNew[19] = scrambledState[11];
            scrambleNew[18] = scrambledState[10];
            //rotate yellow face twice
            rotate2(20);
            
            scramble.add("D2");
        }
        
        copyToList(scrambleNew,scrambledState);
    }
    
    public void turnF(){
        copyToList(scrambledState,scrambleNew);
        
        //replace white with orange
        scrambleNew[2] = scrambledState[5];
        scrambleNew[3] = scrambledState[6];
        //replace orange with yellow
        scrambleNew[5] = scrambledState[20];
        scrambleNew[6] = scrambledState[21];
        //replace yellow with red
        scrambleNew[20] = scrambledState[15];
        scrambleNew[21] = scrambledState[12];
        //replace red with white
        scrambleNew[12] = scrambledState[3];
        scrambleNew[15] = scrambledState[2];
        //rotate green face
        rotateClockwise(8);
        
        scramble.add("F");
        copyToList(scrambleNew,scrambledState);
    }
    public void turnF(String extra){
        copyToList(scrambledState,scrambleNew);
        
        if (extra == "'" || extra == "prime"){
            //replace white with red
            scrambleNew[2] = scrambledState[12];
            scrambleNew[3] = scrambledState[15];
            //replace orange with white
            scrambleNew[5] = scrambledState[2];
            scrambleNew[6] = scrambledState[3];
            //replace yellow with orange
            scrambleNew[20] = scrambledState[5];
            scrambleNew[21] = scrambledState[6];
            //replace red with yellow
            scrambleNew[12] = scrambledState[21];
            scrambleNew[15] = scrambledState[20];
            //rotate green face
            rotateCounter(8);
            
            scramble.add("F'");
        } else if (extra == "2"){
            //replace white with yellow
            scrambleNew[2] = scrambledState[20];
            scrambleNew[3] = scrambledState[21];
            //orange with red
            scrambleNew[5] = scrambledState[15];
            scrambleNew[6] = scrambledState[12];
            //yellow with white
            scrambleNew[20] = scrambledState[2];
            scrambleNew[21] = scrambledState[3];
            //red with orange
            scrambleNew[12] = scrambledState[6];
            scrambleNew[15] = scrambledState[5];
            //rotate white face twice
            rotate2(8);
            
            scramble.add("F2");
        }
        
        copyToList(scrambleNew,scrambledState);
    }
    
    public void turnB(){
        copyToList(scrambledState,scrambleNew);
        
        //replace white with red
        scrambleNew[1] = scrambledState[14];
        scrambleNew[0] = scrambledState[13];
        //replace orange with white
        scrambleNew[4] = scrambledState[1];
        scrambleNew[7] = scrambledState[0];
        //replace yellow with orange
        scrambleNew[23] = scrambledState[4];
        scrambleNew[22] = scrambledState[7];
        //replace red with yellow
        scrambleNew[14] = scrambledState[23];
        scrambleNew[13] = scrambledState[22];
        //rotate blue face
        rotateClockwise(16);
        
        scramble.add("B");
        copyToList(scrambleNew,scrambledState);
    }
    public void turnB(String extra){
        copyToList(scrambledState,scrambleNew);
        
        if (extra == "'" || extra == "prime"){
            //replace white with orange
            scrambleNew[1] = scrambledState[4];
            scrambleNew[0] = scrambledState[7];
            //replace orange with yellow
            scrambleNew[4] = scrambledState[23];
            scrambleNew[7] = scrambledState[22];
            //replace yellow with red
            scrambleNew[23] = scrambledState[14];
            scrambleNew[22] = scrambledState[13];
            //replace red with white
            scrambleNew[14] = scrambledState[1];
            scrambleNew[13] = scrambledState[0];
            //rotate blue face
            rotateCounter(16);
            
            scramble.add("B'");
        } else if (extra == "2"){
            //replace white with yellow
            scrambleNew[1] = scrambledState[23];
            scrambleNew[0] = scrambledState[22];
            //replace orange with red
            scrambleNew[4] = scrambledState[14];
            scrambleNew[7] = scrambledState[13];
            //replace yellow with white
            scrambleNew[23] = scrambledState[1];
            scrambleNew[22] = scrambledState[0];
            //replace red with orange
            scrambleNew[14] = scrambledState[4];
            scrambleNew[13] = scrambledState[7];
            //rotate blue face twice
            rotate2(16);
            
            scramble.add("B2");
        }
        
        copyToList(scrambleNew,scrambledState);
    }
    
    //rotate a face (used in turnS methods)
    public void rotateClockwise(int startIndex){
        scrambleNew[startIndex] = scrambledState[startIndex+3];
        scrambleNew[startIndex+1] = scrambledState[startIndex];
        scrambleNew[startIndex+2] = scrambledState[startIndex+1];
        scrambleNew[startIndex+3] = scrambledState[startIndex+2];
    }
    public void rotateCounter(int startIndex){
        scrambleNew[startIndex] = scrambledState[startIndex+1];
        scrambleNew[startIndex+1] = scrambledState[startIndex+2];
        scrambleNew[startIndex+2] = scrambledState[startIndex+3];
        scrambleNew[startIndex+3] = scrambledState[startIndex];
    }
    public void rotate2(int startIndex){
        scrambleNew[startIndex] = scrambledState[startIndex+2];
        scrambleNew[startIndex+1] = scrambledState[startIndex+3];
        scrambleNew[startIndex+2] = scrambledState[startIndex];
        scrambleNew[startIndex+3] = scrambledState[startIndex+1];
    }
    
    
    //OTHER METHODS
    //swapDist and indexOfColor aren't used, might be used to abstract turnS methods in the future
    public int swapDist(char start, char end){
        int startIndex = indexOfColor(start);
        int endIndex = indexOfColor(end);
        if (startIndex < endIndex){
            return Math.abs(startIndex - endIndex);
        } else{
            return -1*(startIndex - endIndex);
        }
        
    }
    public int indexOfColor(char color){
        if (color == 'o'){
            return 4;
        } else if (color == 'g'){
            return 8;
        } else if (color == 'r'){
            return 12;
        } else if (color == 'b'){
            return 16;
        } else if (color == 'y'){
            return 20;
        } else {
            return 0;
        }
        
    }
    
    //replace listB with listA
    public void copyToList(char[] listA, char[] listB){
        //listA stays the same
        for (int i = 0; i<listA.length;i++){
            listB[i] = listA[i];
        }
    }
    
    //return letter A, B, C...
    public char atIndex(int index){
        return scrambledState[index];
    }
    
    //print arraylist
    public String getScramble(){
        String output = "Scramble:";
        for (int i=0; i<scramble.size(); i++){
            output += " "+scramble.get(i);
        }
        return output;
    }
    //print array
    public String getState(){
        String output = "State:";
        for (int i=0; i<scrambledState.length; i++){
            output += " "+scrambledState[i];
        }
        return output;
    }
    public String getSolved(){
        String output = "Solve:";
        for (int i=0; i<solvedState.length; i++){
            output += " "+solvedState[i];
        }
        return output;
    }
    
    //check if cube is solved, doesn't work though
    public boolean isSolved(){
        return scrambledState.equals(solvedState);
    }
    
    //reset arrayList and arrays to default
    public void reset(){
        scramble.clear();
        copyToList(solvedState,scrambledState);
        copyToList(solvedState,scrambleNew);
    }
    
    //printAll isn't used anywhere currently, used for testing
    public void printAll(char[] list){
        String output = "Full list:";
        for (int i=0; i<list.length; i++){
            output += " "+list[i];
        }
        System.out.println(output);
    }
    public void printAll(ArrayList<String> list){
        String output = "Full list";
        for (int i=0; i<list.size(); i++){
            output += " "+list.get(i);
        }
        System.out.println(output);
    }

}
