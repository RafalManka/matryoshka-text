package pl.rafalmanka.matryoshkatextshowcase;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import pl.rafalmanka.matryoshkatext.MatryoshkaText;

public class ShowcaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcase);

        // Display "9.5 excellent!"
        final MatryoshkaText matryoshka1 = (MatryoshkaText) findViewById(R.id.text);
        matryoshka1.addPiece(new MatryoshkaText.Piece.Builder("  9.5  ")
                .backgroundColor(Color.parseColor("#073680"))
                .textColor(Color.WHITE)
                .build());
        matryoshka1.addPiece(new MatryoshkaText.Piece.Builder(" excellent! ")
                .backgroundColor(Color.parseColor("#DFF1FE"))
                .textColor(Color.parseColor("#073680"))
                .style(Typeface.BOLD)
                .build());
        matryoshka1.display();

        // Display "3.4 horrible!"
        final MatryoshkaText matryoshka2 = (MatryoshkaText) findViewById(R.id.text2);
        matryoshka2.addPiece(new MatryoshkaText.Piece.Builder("  3.4  ")
                .backgroundColor(Color.parseColor("#800736"))
                .textColor(Color.WHITE)
                .build());
        matryoshka2.addPiece(new MatryoshkaText.Piece.Builder(" horrible! ")
                .backgroundColor(Color.parseColor("#fedfe2"))
                .textColor(Color.parseColor("#800736"))
                .style(Typeface.BOLD)
                .build());
        matryoshka2.display();

        // Display "starting at $420"
        MatryoshkaText matryoshka3 = (MatryoshkaText) findViewById(R.id.text3);
        matryoshka3.addPiece(new MatryoshkaText.Piece.Builder("starting at ")
                .textColor(Color.parseColor("#50AF2C"))
                .build());
        matryoshka3.addPiece(new MatryoshkaText.Piece.Builder("$420!")
                .textColor(Color.parseColor("#50AF2C"))
                .textSizeRelative(1.2f)
                .style(Typeface.BOLD)
                .build());
        matryoshka3.display();

        // Display "nightly price"
        MatryoshkaText matryoshka4 = (MatryoshkaText) findViewById(R.id.text4);
        matryoshka4.addPiece(new MatryoshkaText.Piece.Builder("nightly price  ")
                .textColor(Color.parseColor("#5F5F5F"))
                .superscript()
                .textSizeRelative(0.9f)
                .style(Typeface.BOLD)
                .build());
        matryoshka4.addPiece(new MatryoshkaText.Piece.Builder("$256")
                .textColor(Color.parseColor("#5F5F5F"))
                .superscript()
                .strike()
                .textSizeRelative(0.9f)
                .style(Typeface.BOLD)
                .build());
        matryoshka4.addPiece(new MatryoshkaText.Piece.Builder(" $179")
                .textColor(Color.parseColor("#9E0719"))
                .textSizeRelative(1.5f)
                .style(Typeface.BOLD)
                .build());
        matryoshka4.display();

        // Display "new York"
        MatryoshkaText matryoshka5 = (MatryoshkaText) findViewById(R.id.text5);
        matryoshka5.addPiece(new MatryoshkaText.Piece.Builder("New York, United States\n")
                .textColor(Color.parseColor("#414141"))
                .style(Typeface.BOLD)
                .build());
        matryoshka5.addPiece(new MatryoshkaText.Piece.Builder("870 7th Av, New York, Ny\n")
                .textColor(Color.parseColor("#969696"))
                .textSizeRelative(0.9f)
                .style(Typeface.BOLD)
                .build());
        matryoshka5.addPiece(new MatryoshkaText.Piece.Builder("10019, United States of America")
                .textColor(Color.parseColor("#969696"))
                .textSizeRelative(0.8f)
                .build());
        matryoshka5.display();

        // Display "Central Park"
        MatryoshkaText matryoshka6 = (MatryoshkaText) findViewById(R.id.text6);
        matryoshka6.addPiece(new MatryoshkaText.Piece.Builder("Central Park, NY\n")
                .textColor(Color.parseColor("#414141"))
                .build());
        matryoshka6.addPiece(new MatryoshkaText.Piece.Builder("1.2 mi ")
                .textColor(Color.parseColor("#0081E2"))
                .textSizeRelative(0.9f)
                .build());
        matryoshka6.addPiece(new MatryoshkaText.Piece.Builder("from here")
                .textColor(Color.parseColor("#969696"))
                .textSizeRelative(0.9f)
                .build());
        matryoshka6.display();

        // Display "Bryant Park Hotel"
        MatryoshkaText matryoshka7 = (MatryoshkaText) findViewById(R.id.text7);
        matryoshka7.addPiece(new MatryoshkaText.Piece.Builder("The Bryant Park Hotel\n")
                .textColor(Color.parseColor("#414141"))
                .build());
        matryoshka7.addPiece(new MatryoshkaText.Piece.Builder("#6 of 434 ")
                .textColor(Color.parseColor("#0081E2"))
                .build());
        matryoshka7.addPiece(new MatryoshkaText.Piece.Builder("in New York City\n")
                .textColor(Color.parseColor("#969696"))
                .build());
        matryoshka7.addPiece(new MatryoshkaText.Piece.Builder("2487 reviews\n")
                .textColor(Color.parseColor("#969696"))
                .build());
        matryoshka7.addPiece(new MatryoshkaText.Piece.Builder("$540")
                .textColor(Color.parseColor("#F7B53F"))
                .style(Typeface.BOLD)
                .build());
        matryoshka7.addPiece(new MatryoshkaText.Piece.Builder(" per night")
                .textColor(Color.parseColor("#969696"))
                .build());
        matryoshka7.display();

        // Display "Follow us on twitter #Matryoshkatext"
        MatryoshkaText matryoshka8 = (MatryoshkaText) findViewById(R.id.text8);
        matryoshka8.addPiece(new MatryoshkaText.Piece.Builder("Follow us on twitter ")
                .build());
        matryoshka8.addPiece(new MatryoshkaText.Piece.Builder(" #matryoshkatext ")
                .backgroundColor(Color.parseColor("#DFF1FE"))
                .clickCallback(new MatryoshkaText.ClickCallback() {
                    @Override
                    public void onClicked(String text) {
                        Toast.makeText(ShowcaseActivity.this, "Clicked on " + text, Toast.LENGTH_LONG).show();
                    }
                })
                .build());
        matryoshka8.display();

        // Display "The true sign of intelligence is not knowledge but imagination. - Albert Einstein"
        MatryoshkaText matryoshka9 = (MatryoshkaText) findViewById(R.id.text9);
        matryoshka9.addPiece(new MatryoshkaText.Piece.Builder("The true sign of intelligence is not knowledge but imagination.\n")
                .build());
        matryoshka9.addPiece(new MatryoshkaText.Piece.Builder("- Albert Einstein")
                .typeface("", Typeface.createFromAsset(getAssets(), "DINRoundOT-Medium.ttf"))
                .build());
        matryoshka9.display();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MatryoshkaText.Piece aPiece = matryoshka1.getPiece(0);
                aPiece.setText("  9.9  ");
                matryoshka1.display();
            }
        });
    }

}
