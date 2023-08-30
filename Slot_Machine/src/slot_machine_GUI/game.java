package slot_machine_GUI;

public class game {

    private String SymbolOne;
    private String SymbolTwo;
    private String SymbolThree;
    private int TokenCount;
    private int Winnings;

    public game(){
    }

    // Setters
    public void setSymbolOne(String symbolOne){
        this.SymbolOne = symbolOne;
    }

    public void setSymbolTwo(String symbolTwo){
        this.SymbolTwo = symbolTwo;
    }

    public void setSymbolThree(String symbolThree){
        this.SymbolThree = symbolThree;
    }

    public void setTokenCount(int tokenCount){
        this.TokenCount = tokenCount;
    }

    public void setWinnings(int winnings){
        winnings = 5;
        this.Winnings = winnings;
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


