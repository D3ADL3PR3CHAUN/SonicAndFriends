package mcgee.sonicandfriends;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnTL, btnTM, btnTR, btnML, btnMM, btnMR, btnBL, btnBM, btnBR;
    TextView sonicTV, tailsTV;

    int playerTurn;

    private int sonicScore = 0;
    private int tailsScore = 0;

    public void gameCheck() {
        winnerCheck(btnTL, btnTM, btnTR);
        winnerCheck(btnML, btnMM, btnMR);
        winnerCheck(btnBL, btnBM, btnBR);
        winnerCheck(btnTL, btnML, btnBL);
        winnerCheck(btnTM, btnMM, btnBM);
        winnerCheck(btnTR, btnMR, btnBR);
        winnerCheck(btnTL, btnMM, btnBR);
        winnerCheck(btnTR, btnMM, btnBL);
    }

    private void winnerCheck(Button btnTL, Button btnTM, Button btnTR) {

        sonicTV = (TextView) findViewById(R.id.sonicTV);
        tailsTV = (TextView) findViewById(R.id.tailsTV);

        if(btnTL.getText().toString() == btnTM.getText().toString() && btnTM.getText().toString() == btnTR.getText().toString() && btnTR.getText().toString() == "X") {
            Toast.makeText(this, "Sonic Wins!", Toast.LENGTH_LONG).show();
            sonicScore++;
            sonicTV.setText("Sonic: " + sonicScore);
            reset();
        }
        if(btnTL.getText().toString() == btnTM.getText().toString() && btnTM.getText().toString() == btnTR.getText().toString() && btnTR.getText().toString() == "O") {
            Toast.makeText(this, "Tails Wins!", Toast.LENGTH_LONG).show();
            tailsScore++;
            tailsTV.setText("Tails: " + tailsScore);
            reset();
        }
    }

    public void reset() {
        playerTurn = 1;
        btnTL.setText("");
        btnTL.setBackgroundDrawable(getResources().getDrawable(R.drawable.chaosemeralds));
        btnTM.setText("");
        btnTM.setBackgroundDrawable(getResources().getDrawable(R.drawable.chaosemeralds));
        btnTR.setText("");
        btnTR.setBackgroundDrawable(getResources().getDrawable(R.drawable.chaosemeralds));
        btnML.setText("");
        btnML.setBackgroundDrawable(getResources().getDrawable(R.drawable.chaosemeralds));
        btnMM.setText("");
        btnMM.setBackgroundDrawable(getResources().getDrawable(R.drawable.chaosemeralds));
        btnMR.setText("");
        btnMR.setBackgroundDrawable(getResources().getDrawable(R.drawable.chaosemeralds));
        btnBL.setText("");
        btnBL.setBackgroundDrawable(getResources().getDrawable(R.drawable.chaosemeralds));
        btnBM.setText("");
        btnBM.setBackgroundDrawable(getResources().getDrawable(R.drawable.chaosemeralds));
        btnBR.setText("");
        btnBR.setBackgroundDrawable(getResources().getDrawable(R.drawable.chaosemeralds));
    }

    public void resetscore(View view) {
        sonicScore = 0;
        sonicTV.setText("Sonic: 0");
        tailsScore = 0;
        tailsTV.setText("Tails: 0");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);
    }

    public void start(View view) {
        setContentView(R.layout.activity_main);

        btnTL = (Button) findViewById(R.id.btnTL);
        btnTM = (Button) findViewById(R.id.btnTM);
        btnTR = (Button) findViewById(R.id.btnTR);
        btnML = (Button) findViewById(R.id.btnML);
        btnMM = (Button) findViewById(R.id.btnMM);
        btnMR = (Button) findViewById(R.id.btnMR);
        btnBL = (Button) findViewById(R.id.btnBL);
        btnBM = (Button) findViewById(R.id.btnBM);
        btnBR = (Button) findViewById(R.id.btnBR);

        playerTurn = 1;

        sonicScore = 0;
        tailsScore = 0;

        btnTL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnTL.getText().toString().equals("")) {
                    if(playerTurn == 1) {
                        btnTL.setText("X");
                        btnTL.setBackgroundDrawable(getResources().getDrawable(R.drawable.sonic));
                        playerTurn = 2;
                    } else if(playerTurn == 2) {
                        btnTL.setText("O");
                        btnTL.setBackgroundDrawable(getResources().getDrawable(R.drawable.tails));
                        playerTurn = 1;
                    }
                }
                gameCheck();
            }
        });
        btnTM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnTM.getText().toString().equals("")) {
                    if(playerTurn == 1) {
                        btnTM.setText("X");
                        btnTM.setBackgroundDrawable(getResources().getDrawable(R.drawable.sonic));
                        playerTurn = 2;
                    } else if(playerTurn == 2) {
                        btnTM.setText("O");
                        btnTM.setBackgroundDrawable(getResources().getDrawable(R.drawable.tails));
                        playerTurn = 1;
                    }
                }
                gameCheck();
            }
        });
        btnTR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnTR.getText().toString().equals("")) {
                    if(playerTurn == 1) {
                        btnTR.setText("X");
                        btnTR.setBackgroundDrawable(getResources().getDrawable(R.drawable.sonic));
                        playerTurn = 2;
                    } else if(playerTurn == 2) {
                        btnTR.setText("O");
                        btnTR.setBackgroundDrawable(getResources().getDrawable(R.drawable.tails));
                        playerTurn = 1;
                    }
                }
                gameCheck();
            }
        });
        btnML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnML.getText().toString().equals("")) {
                    if(playerTurn == 1) {
                        btnML.setText("X");
                        btnML.setBackgroundDrawable(getResources().getDrawable(R.drawable.sonic));
                        playerTurn = 2;
                    } else if(playerTurn == 2) {
                        btnML.setText("O");
                        btnML.setBackgroundDrawable(getResources().getDrawable(R.drawable.tails));
                        playerTurn = 1;
                    }
                }
                gameCheck();
            }
        });
        btnMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnMM.getText().toString().equals("")) {
                    if(playerTurn == 1) {
                        btnMM.setText("X");
                        btnMM.setBackgroundDrawable(getResources().getDrawable(R.drawable.sonic));
                        playerTurn = 2;
                    } else if(playerTurn == 2) {
                        btnMM.setText("O");
                        btnMM.setBackgroundDrawable(getResources().getDrawable(R.drawable.tails));
                        playerTurn = 1;
                    }
                }
                gameCheck();
            }
        });
        btnMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnMR.getText().toString().equals("")) {
                    if(playerTurn == 1) {
                        btnMR.setText("X");
                        btnMR.setBackgroundDrawable(getResources().getDrawable(R.drawable.sonic));
                        playerTurn = 2;
                    } else if(playerTurn == 2) {
                        btnMR.setText("O");
                        btnMR.setBackgroundDrawable(getResources().getDrawable(R.drawable.tails));
                        playerTurn = 1;
                    }
                }
                gameCheck();
            }
        });
        btnBL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnBL.getText().toString().equals("")) {
                    if(playerTurn == 1) {
                        btnBL.setText("X");
                        btnBL.setBackgroundDrawable(getResources().getDrawable(R.drawable.sonic));
                        playerTurn = 2;
                    } else if(playerTurn == 2) {
                        btnBL.setText("O");
                        btnBL.setBackgroundDrawable(getResources().getDrawable(R.drawable.tails));
                        playerTurn = 1;
                    }
                }
                gameCheck();
            }
        });
        btnBM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnBM.getText().toString().equals("")) {
                    if(playerTurn == 1) {
                        btnBM.setText("X");
                        btnBM.setBackgroundDrawable(getResources().getDrawable(R.drawable.sonic));
                        playerTurn = 2;
                    } else if(playerTurn == 2) {
                        btnBM.setText("O");
                        btnBM.setBackgroundDrawable(getResources().getDrawable(R.drawable.tails));
                        playerTurn = 1;
                    }
                }
                gameCheck();
            }
        });
        btnBR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnBR.getText().toString().equals("")) {
                    if(playerTurn == 1) {
                        btnBR.setText("X");
                        btnBR.setBackgroundDrawable(getResources().getDrawable(R.drawable.sonic));
                        playerTurn = 2;
                    } else if(playerTurn == 2) {
                        btnBR.setText("O");
                        btnBR.setBackgroundDrawable(getResources().getDrawable(R.drawable.tails));
                        playerTurn = 1;
                    }
                }
                gameCheck();
            }
        });
    }
}
