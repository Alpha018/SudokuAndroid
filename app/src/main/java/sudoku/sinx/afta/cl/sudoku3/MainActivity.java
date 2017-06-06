package sudoku.sinx.afta.cl.sudoku3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    //enlazar los elementos visuales con sus respectivas variables con butter knife
    @BindView(R.id.a1) TextView a1; @BindView(R.id.a2) TextView a2; @BindView(R.id.a3) TextView a3; @BindView(R.id.a4) TextView a4; @BindView(R.id.a5) TextView a5; @BindView(R.id.a6) TextView a6; @BindView(R.id.a7) TextView a7; @BindView(R.id.a8) TextView a8; @BindView(R.id.a9) TextView a9;
    @BindView(R.id.b1) TextView b1; @BindView(R.id.b2) TextView b2; @BindView(R.id.b3) TextView b3; @BindView(R.id.b4) TextView b4; @BindView(R.id.b5) TextView b5; @BindView(R.id.b6) TextView b6; @BindView(R.id.b7) TextView b7; @BindView(R.id.b8) TextView b8; @BindView(R.id.b9) TextView b9;
    @BindView(R.id.c1) TextView c1; @BindView(R.id.c2) TextView c2; @BindView(R.id.c3) TextView c3; @BindView(R.id.c4) TextView c4; @BindView(R.id.c5) TextView c5; @BindView(R.id.c6) TextView c6; @BindView(R.id.c7) TextView c7; @BindView(R.id.c8) TextView c8; @BindView(R.id.c9) TextView c9;
    @BindView(R.id.d1) TextView d1; @BindView(R.id.d2) TextView d2; @BindView(R.id.d3) TextView d3; @BindView(R.id.d4) TextView d4; @BindView(R.id.d5) TextView d5; @BindView(R.id.d6) TextView d6; @BindView(R.id.d7) TextView d7; @BindView(R.id.d8) TextView d8; @BindView(R.id.d9) TextView d9;
    @BindView(R.id.e1) TextView e1; @BindView(R.id.e2) TextView e2; @BindView(R.id.e3) TextView e3; @BindView(R.id.e4) TextView e4; @BindView(R.id.e5) TextView e5; @BindView(R.id.e6) TextView e6; @BindView(R.id.e7) TextView e7; @BindView(R.id.e8) TextView e8; @BindView(R.id.e9) TextView e9;
    @BindView(R.id.f1) TextView f1; @BindView(R.id.f2) TextView f2; @BindView(R.id.f3) TextView f3; @BindView(R.id.f4) TextView f4; @BindView(R.id.f5) TextView f5; @BindView(R.id.f6) TextView f6; @BindView(R.id.f7) TextView f7; @BindView(R.id.f8) TextView f8; @BindView(R.id.f9) TextView f9;
    @BindView(R.id.g1) TextView g1; @BindView(R.id.g2) TextView g2; @BindView(R.id.g3) TextView g3; @BindView(R.id.g4) TextView g4; @BindView(R.id.g5) TextView g5; @BindView(R.id.g6) TextView g6; @BindView(R.id.g7) TextView g7; @BindView(R.id.g8) TextView g8; @BindView(R.id.g9) TextView g9;
    @BindView(R.id.h1) TextView h1; @BindView(R.id.h2) TextView h2; @BindView(R.id.h3) TextView h3; @BindView(R.id.h4) TextView h4; @BindView(R.id.h5) TextView h5; @BindView(R.id.h6) TextView h6; @BindView(R.id.h7) TextView h7; @BindView(R.id.h8) TextView h8; @BindView(R.id.h9) TextView h9;
    @BindView(R.id.i1) TextView i1; @BindView(R.id.i2) TextView i2; @BindView(R.id.i3) TextView i3; @BindView(R.id.i4) TextView i4; @BindView(R.id.i5) TextView i5; @BindView(R.id.i6) TextView i6; @BindView(R.id.i7) TextView i7; @BindView(R.id.i8) TextView i8; @BindView(R.id.i9) TextView i9;

    @BindView(R.id.solve) Button boton;

    @BindView(R.id.limpiar) Button limpiar;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //crear el metodo click listener para cuando se oprima resolver
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    final int A1 = Integer.parseInt(a1.getText().toString()); final int A2 = Integer.parseInt(a2.getText().toString()); final int A3 = Integer.parseInt(a3.getText().toString()); final int A4 = Integer.parseInt(a4.getText().toString()); final int A5 = Integer.parseInt(a5.getText().toString()); final int A6 = Integer.parseInt(a6.getText().toString()); final int A7 = Integer.parseInt(a7.getText().toString()); final int A8 = Integer.parseInt(a8.getText().toString()); final int A9 = Integer.parseInt(a9.getText().toString());
                    final int B1 = Integer.parseInt(b1.getText().toString()); final int B2 = Integer.parseInt(b2.getText().toString()); final int B3 = Integer.parseInt(b3.getText().toString()); final int B4 = Integer.parseInt(b4.getText().toString()); final int B5 = Integer.parseInt(b5.getText().toString()); final int B6 = Integer.parseInt(b6.getText().toString()); final int B7 = Integer.parseInt(b7.getText().toString()); final int B8 = Integer.parseInt(b8.getText().toString()); final int B9 = Integer.parseInt(b9.getText().toString());
                    final int C1 = Integer.parseInt(c1.getText().toString()); final int C2 = Integer.parseInt(c2.getText().toString()); final int C3 = Integer.parseInt(c3.getText().toString()); final int C4 = Integer.parseInt(c4.getText().toString()); final int C5 = Integer.parseInt(c5.getText().toString()); final int C6 = Integer.parseInt(c6.getText().toString()); final int C7 = Integer.parseInt(c7.getText().toString()); final int C8 = Integer.parseInt(c8.getText().toString()); final int C9 = Integer.parseInt(c9.getText().toString());
                    final int D1 = Integer.parseInt(d1.getText().toString()); final int D2 = Integer.parseInt(d2.getText().toString()); final int D3 = Integer.parseInt(d3.getText().toString()); final int D4 = Integer.parseInt(d4.getText().toString()); final int D5 = Integer.parseInt(d5.getText().toString()); final int D6 = Integer.parseInt(d6.getText().toString()); final int D7 = Integer.parseInt(d7.getText().toString()); final int D8 = Integer.parseInt(d8.getText().toString()); final int D9 = Integer.parseInt(d9.getText().toString());
                    final int E1 = Integer.parseInt(e1.getText().toString()); final int E2 = Integer.parseInt(e2.getText().toString()); final int E3 = Integer.parseInt(e3.getText().toString()); final int E4 = Integer.parseInt(e4.getText().toString()); final int E5 = Integer.parseInt(e5.getText().toString()); final int E6 = Integer.parseInt(e6.getText().toString()); final int E7 = Integer.parseInt(e7.getText().toString()); final int E8 = Integer.parseInt(e8.getText().toString()); final int E9 = Integer.parseInt(e9.getText().toString());
                    final int F1 = Integer.parseInt(f1.getText().toString()); final int F2 = Integer.parseInt(f2.getText().toString()); final int F3 = Integer.parseInt(f3.getText().toString()); final int F4 = Integer.parseInt(f4.getText().toString()); final int F5 = Integer.parseInt(f5.getText().toString()); final int F6 = Integer.parseInt(f6.getText().toString()); final int F7 = Integer.parseInt(f7.getText().toString()); final int F8 = Integer.parseInt(f8.getText().toString()); final int F9 = Integer.parseInt(f9.getText().toString());
                    final int G1 = Integer.parseInt(g1.getText().toString()); final int G2 = Integer.parseInt(g2.getText().toString()); final int G3 = Integer.parseInt(g3.getText().toString()); final int G4 = Integer.parseInt(g4.getText().toString()); final int G5 = Integer.parseInt(g5.getText().toString()); final int G6 = Integer.parseInt(g6.getText().toString()); final int G7 = Integer.parseInt(g7.getText().toString()); final int G8 = Integer.parseInt(g8.getText().toString()); final int G9 = Integer.parseInt(g9.getText().toString());
                    final int H1 = Integer.parseInt(h1.getText().toString()); final int H2 = Integer.parseInt(h2.getText().toString()); final int H3 = Integer.parseInt(h3.getText().toString()); final int H4 = Integer.parseInt(h4.getText().toString()); final int H5 = Integer.parseInt(h5.getText().toString()); final int H6 = Integer.parseInt(h6.getText().toString()); final int H7 = Integer.parseInt(h7.getText().toString()); final int H8 = Integer.parseInt(h8.getText().toString()); final int H9 = Integer.parseInt(h9.getText().toString());
                    final int I1 = Integer.parseInt(i1.getText().toString()); final int I2 = Integer.parseInt(i2.getText().toString()); final int I3 = Integer.parseInt(i3.getText().toString()); final int I4 = Integer.parseInt(i4.getText().toString()); final int I5 = Integer.parseInt(i5.getText().toString()); final int I6 = Integer.parseInt(i6.getText().toString()); final int I7 = Integer.parseInt(i7.getText().toString()); final int I8 = Integer.parseInt(i8.getText().toString()); final int I9 = Integer.parseInt(i9.getText().toString());

                    int tablero[][]={{A1,A2,A3,A4,A5,A6,A7,A8,A9},
                            {B1,B2,B3,B4,B5,B6,B7,B8,B9},
                            {C1,C2,C3,C4,C5,C6,C7,C8,C9},
                            {D1,D2,D3,D4,D5,D6,D7,D8,D9},
                            {E1,E2,E3,E4,E5,E6,E7,E8,E9},
                            {F1,F2,F3,F4,F5,F6,F7,F8,F9},
                            {G1,G2,G3,G4,G5,G6,G7,G8,G9},
                            {H1,H2,H3,H4,H5,H6,H7,H8,H9},
                            {I1,I2,I3,I4,I5,I6,I7,I8,I9}};

                //se llama a la tarea thread asincrono para resolver
                AsyncSolve solved = new AsyncSolve(tablero);

                int[][] newtablero;

                newtablero = (int[][])solved.doInBackground(tablero);

                //cuando se resuelve el tablero
                if(newtablero == null){

                    Toast.makeText(getApplicationContext(), "No existe solución!!",Toast.LENGTH_LONG).show();

                }else{
                    //caso en que se resuelva el sudoku se imprime la solucion
                    a1.setText(""+newtablero[0][0]);a2.setText(""+newtablero[0][1]);a3.setText(""+newtablero[0][2]);a4.setText(""+newtablero[0][3]);a5.setText(""+newtablero[0][4]);a6.setText(""+newtablero[0][5]);a7.setText(""+newtablero[0][6]);a8.setText(""+newtablero[0][7]);a9.setText(""+newtablero[0][8]);
                    b1.setText(""+newtablero[1][0]);b2.setText(""+newtablero[1][1]);b3.setText(""+newtablero[1][2]);b4.setText(""+newtablero[1][3]);b5.setText(""+newtablero[1][4]);b6.setText(""+newtablero[1][5]);b7.setText(""+newtablero[1][6]);b8.setText(""+newtablero[1][7]);b9.setText(""+newtablero[1][8]);
                    c1.setText(""+newtablero[2][0]);c2.setText(""+newtablero[2][1]);c3.setText(""+newtablero[2][2]);c4.setText(""+newtablero[2][3]);c5.setText(""+newtablero[2][4]);c6.setText(""+newtablero[2][5]);c7.setText(""+newtablero[2][6]);c8.setText(""+newtablero[2][7]);c9.setText(""+newtablero[2][8]);
                    d1.setText(""+newtablero[3][0]);d2.setText(""+newtablero[3][1]);d3.setText(""+newtablero[3][2]);d4.setText(""+newtablero[3][3]);d5.setText(""+newtablero[3][4]);d6.setText(""+newtablero[3][5]);d7.setText(""+newtablero[3][6]);d8.setText(""+newtablero[3][7]);d9.setText(""+newtablero[3][8]);
                    e1.setText(""+newtablero[4][0]);e2.setText(""+newtablero[4][1]);e3.setText(""+newtablero[4][2]);e4.setText(""+newtablero[4][3]);e5.setText(""+newtablero[4][4]);e6.setText(""+newtablero[4][5]);e7.setText(""+newtablero[4][6]);e8.setText(""+newtablero[4][7]);e9.setText(""+newtablero[4][8]);
                    f1.setText(""+newtablero[5][0]);f2.setText(""+newtablero[5][1]);f3.setText(""+newtablero[5][2]);f4.setText(""+newtablero[5][3]);f5.setText(""+newtablero[5][4]);f6.setText(""+newtablero[5][5]);f7.setText(""+newtablero[5][6]);f8.setText(""+newtablero[5][7]);f9.setText(""+newtablero[5][8]);
                    g1.setText(""+newtablero[6][0]);g2.setText(""+newtablero[6][1]);g3.setText(""+newtablero[6][2]);g4.setText(""+newtablero[6][3]);g5.setText(""+newtablero[6][4]);g6.setText(""+newtablero[6][5]);g7.setText(""+newtablero[6][6]);g8.setText(""+newtablero[6][7]);g9.setText(""+newtablero[6][8]);
                    h1.setText(""+newtablero[7][0]);h2.setText(""+newtablero[7][1]);h3.setText(""+newtablero[7][2]);h4.setText(""+newtablero[7][3]);h5.setText(""+newtablero[7][4]);h6.setText(""+newtablero[7][5]);h7.setText(""+newtablero[7][6]);h8.setText(""+newtablero[7][7]);h9.setText(""+newtablero[7][8]);
                    i1.setText(""+newtablero[8][0]);i2.setText(""+newtablero[8][1]);i3.setText(""+newtablero[8][2]);i4.setText(""+newtablero[8][3]);i5.setText(""+newtablero[8][4]);i6.setText(""+newtablero[8][5]);i7.setText(""+newtablero[8][6]);i8.setText(""+newtablero[8][7]);i9.setText(""+newtablero[8][8]);

                    Toast.makeText(getApplicationContext(), "Solución Encontrada!!", Toast.LENGTH_LONG).show();

                }


                //boton para limpiar el tablero
                limpiar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        a1.setText("0");a2.setText("0");a3.setText("0");a4.setText("0");a5.setText("0");a6.setText("0");a7.setText("0");a8.setText("0");a9.setText("0");
                        b1.setText("0");b2.setText("0");b3.setText("0");b4.setText("0");b5.setText("0");b6.setText("0");b7.setText("0");b8.setText("0");b9.setText("0");
                        c1.setText("0");c2.setText("0");c3.setText("0");c4.setText("0");c5.setText("0");c6.setText("0");c7.setText("0");c8.setText("0");c9.setText("0");
                        d1.setText("0");d2.setText("0");d3.setText("0");d4.setText("0");d5.setText("0");d6.setText("0");d7.setText("0");d8.setText("0");d9.setText("0");
                        e1.setText("0");e2.setText("0");e3.setText("0");e4.setText("0");e5.setText("0");e6.setText("0");e7.setText("0");e8.setText("0");e9.setText("0");
                        f1.setText("0");f2.setText("0");f3.setText("0");f4.setText("0");f5.setText("0");f6.setText("0");f7.setText("0");f8.setText("0");f9.setText("0");
                        g1.setText("0");g2.setText("0");g3.setText("0");g4.setText("0");g5.setText("0");g6.setText("0");g7.setText("0");g8.setText("0");g9.setText("0");
                        h1.setText("0");h2.setText("0");h3.setText("0");h4.setText("0");h5.setText("0");h6.setText("0");h7.setText("0");h8.setText("0");h9.setText("0");
                        i1.setText("0");i2.setText("0");i3.setText("0");i4.setText("0");i5.setText("0");i6.setText("0");i7.setText("0");i8.setText("0");i9.setText("0");
                    }
                });

            }
        });

    }

}
