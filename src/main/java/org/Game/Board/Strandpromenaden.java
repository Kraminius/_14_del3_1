package org.Game.Board;

public class Strandpromenaden extends Fields {

    private static Strandpromenaden strandpromenaden;
    public Strandpromenaden() {
        super(23, 5);
    }

    public int buyableFieldID() {
        int fieldID = 23;

        return fieldID;
    }

    public static Strandpromenaden getInstance(){
        if(strandpromenaden == null){
            strandpromenaden = new Strandpromenaden();
        }
        return strandpromenaden;
    }

}
