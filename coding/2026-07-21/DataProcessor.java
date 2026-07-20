
public class DataProcessor {
   

    public int processData(String input,int index) throws NumberFormatException{
        if(input == null){
            throw new NullPointerException("string value is null");
        }

        if(index < 0 || index >= input.length()){
            throw new StringIndexOutOfBoundsException("Bound check error");
        }

        return Integer.parseInt(input);
    }
}