package org.Game.ChanceCards;

public class Descriptions {

    private String[] descriptions = new String[20];
    public Descriptions(){
        descriptions[0] = "Gratis felt! Ryk frem til et orange felt." +
                " Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.";
        descriptions[1] = "Gratis felt! Ryk frem til et orange eller grønt felt." +
                " Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.";
        descriptions[2] = "Gratis felt! Ryk frem til et lyseblåt felt." +
                " Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.";
        descriptions[3] = "Gratis felt! Ryk frem til et pink eller mørkeblåt felt." +
                " Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.";
        descriptions[4] = "Gratis felt! Ryk frem til et rødt felt." +
                " Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.";
        descriptions[5] = "Gratis felt! Ryk frem til Skateparken for at lave det perfekt grind!" +
                " Hvis ingen ejer den, får du den gratis! Eller skal du betale leje til ejeren.";
        descriptions[6] = "Gratis felt! Ryk frem til et lyseblåt eller rødt felt." +
                " Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren";
        descriptions[7] = "Gratis felt! Ryk frem til et brunt eller gult felt." +
                " Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.";
        descriptions[8] = "Ryk frem til start. Modtag 2 penge";
        descriptions[9] = "Ryk op til 5 felter frem.";
        descriptions[10] = "Ryk 1 felt frem, eller tag et chancekort mere.";
        descriptions[11] = "Du har spist for meget slik. Betal 2 penge til banken.";
        descriptions[12] = "Du løslades uden omkostninger." +
                " Behold dette kort, indtil du får brug for det.";
        descriptions[13] = "Ryk frem til Strandpromenaden.";
        descriptions[14] = "Det er din fødselsdag! Alle giver dig 1 penge. TILLYKKE MED FØDSELSDAGEN!";
        descriptions[15] = "Du har lavet alle dine lektier! " +
                "Modtag 2 penge fra banken.";

    }

    public String[] getCardInfo(){
        return descriptions;
    }


}
