package sudoku.sinx.afta.cl.sudoku3;

import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by black on 03/11/2016.
 */

public class AsyncSolve extends AsyncTask {


    int [][] tablero;

    /**
     * constructor del thread asincrono
     * @param tablero
     */
    public AsyncSolve (int[][] tablero){

        this.tablero = tablero;

    }

    /**
     * metodo que ejecuta codigo de manera backgroud
     * @param objects
     * @return
     */
    @Override
    protected Object doInBackground(Object[] objects) {

        boolean solved = solve(new Cell(0,0),tablero);

        if(solved) return tablero;

        return null;
    }

    static class Cell{
        int fila, columna;

        public Cell(int fila, int columna){
            super();
            this.fila = fila;
            this.columna = columna;
        }

        @Override
        public String toString(){
            return "Cell [fila=" + fila + "columna=" + columna +"]";
        }
    }

    /**
     * metodo que revisa si el numero que se ingresa en la celda es valido para poder insertarlo
     * @param cell
     * @param valor
     * @param tablero
     * @return
     */
    static boolean esValido(Cell cell, int valor, int[][] tablero){
        if(tablero[cell.fila][cell.columna] != 0){
            throw new RuntimeException("No se puede llamar para este valor");
        }

        for(int i=0;i<9;i++){
            if(tablero[cell.fila][i] == valor){
                return false;
            }
        }

        for(int i=0;i<9;i++){
            if(tablero[i][cell.columna] == valor){
                return false;
            }
        }

        int x1 = 3 * (cell.fila / 3);
        int y1 = 3 * (cell.columna / 3);
        int x2 = x1 + 2;
        int y2 = y1 + 2;

        for(int x=x1; x<=x2; x++){
            for(int y=y1; y<=y2; y++){
                if(tablero[x][y]==valor){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * metodo que genera valores para la proxima celda
     * @param cur
     * @return
     */
    static Cell getNextCell(Cell cur){
        int fila = cur.fila;
        int columna = cur.columna;

        columna++;

        if(columna>8){
            columna=0;
            fila++;
        }

        if(fila>8) {
            return null;
        }
        Cell next = new Cell(fila,columna);
        return next;

    }

    /**
     * metodo que ejecuta la resolucion del sudoku
     * @param cur
     * @param tablero
     * @return
     */
    static boolean solve (Cell cur, int[][] tablero){
        if(cur==null){
            return true;
        }

        if(tablero[cur.fila][cur.columna] != 0){
            return solve(getNextCell(cur),tablero);
        }

        for (int i=1; i<=9;i++) {
            boolean valid = esValido(cur, i, tablero);

            if (!valid) {
                continue;
            }

            tablero[cur.fila][cur.columna] = i;

            //aquí se hace la recursion
            boolean solved = solve(getNextCell(cur), tablero);

            if (solved) {
                return true;
            } else {
                tablero[cur.fila][cur.columna] = 0;
            }
        }
        return false;

    }

}
