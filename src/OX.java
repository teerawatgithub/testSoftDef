public class OX {
    private  String[][] table = {
            {" ", "0", "1", "2"} ,
            {"0", "-", "-", "-"} ,
            {"1", "-", "-", "-"} ,
            {"2", "-", "-", "-"}
    };
    private String player;
    private int countX;
    private int countO;
    private int countDraw;
    public String getTableString() {
        String resultt = "";
        for(int row=0; row<table.length; row++){
            for(int col=0; col<table[row].length; col++){
                resultt = resultt + table[row][col];
            }
            resultt = resultt + "\n";
        }
        return resultt;
    }
}
