public class AB05MainF {

    final static int DIM1 = 12;
    final static int DIM2 = 12;
    static boolean[][] welt = new boolean[DIM1][DIM2];
    // liefert eine zufällig initialisierte Welt
    public static void initWelt() {

        for(int i = 1; i < DIM1-1; i++){
            for(int j = 1; j < DIM2-1; j++){
                welt[i][j] = Math.random() > 0.4;
            }
        }
    }
    // gibt die aktuelle Welt aus
    public static void zeigeWelt(boolean[][] welt) {
        for(int i = 1; i < DIM1-1; i++){
            for(int j = 1; j < DIM2-1; j++){
                if(welt[i][j]){
                    System.out.print("\tX");
                }else {
                    System.out.print("\t-");
                }
            }
            System.out.println("");
        }
    }

    public static int countNeighbours(int x, int y){
        int neighbours = 0;
        for (int i=x-1; i<=x+1; ++i){
            for (int j=y-1; j<=y+1; ++j){
                if (welt[i][j]){
                    neighbours++;
                }
            }
        }
        if(welt[x][y]){
            neighbours--;
        }
        return neighbours;
    }

    public static void prepareNextGen(){
        for(int i = 1; i < DIM1-1; i++){
            for(int j = 1; j < DIM2-1; j++){
                int neighbours = countNeighbours(i,j);
                if(welt[i][j] && (neighbours < 2 || neighbours > 3)){
                    welt[i][j] = false;
                }else if(!welt[i][j] && neighbours == 3){
                    welt[i][j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        initWelt();
        System.out.println("Startkonstellation");
        while(true){
            zeigeWelt(welt);
            System.out.println("\n\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            prepareNextGen();
        }
    }
}
