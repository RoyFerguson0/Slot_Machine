package slot_machine_GUI;

public class game {

    // Objects State
    private String SymbolOne;
    private String SymbolTwo;
    private String SymbolThree;
    private int TokenCount;
    private int Winnings;

    public game(){
    }

    /////////////////////////////////////////
    //////////////// Setters ////////////////
    /////////////////////////////////////////

    // Set Symbol 1
    public void setSymbolOne(String symbolOne){
        this.SymbolOne = symbolOne;
    }

    // Set Symbol 2
    public void setSymbolTwo(String symbolTwo){
        this.SymbolTwo = symbolTwo;
    }

    // Set Symbol 3
    public void setSymbolThree(String symbolThree){
        this.SymbolThree = symbolThree;
    }

    // Set Token Count
    public void setTokenCount(int tokenCount){
        this.TokenCount = tokenCount;
    }




    // Getters
    public String getSymbolOne(){
        return SymbolOne;
    }

    public String getSymbolTwo(){
        return SymbolTwo;
    }

    public String getSymbolThree(){
        return SymbolThree;
    }

    public int getTokenCount(){
        return TokenCount;
    }

    public int getWinnings(){
        return Winnings;
    }

}


