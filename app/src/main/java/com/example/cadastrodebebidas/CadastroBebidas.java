package com.example.cadastrodebebidas;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;



public class CadastroBebidas extends MainActivity  {


        FirebaseDatabase database;
        DatabaseReference myRef;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cadastro_bebidas);
            iniciarFirebase();
        }

        private void iniciarFirebase() {
            database = FirebaseDatabase.getInstance();
            myRef = database.getReference();
        }
        public void salvarBebida(View view) {
            EditText txtNomeBebida = findViewById(R.id.idNomeBebida);
            EditText txtPrecoBebida = findViewById(R.id.idPrecoBebida);
            String UID = UUID.randomUUID().toString();
            String nomeBebida = txtNomeBebida.getText().toString();
            String precoBebida = txtPrecoBebida.getText().toString();
            Bebidas bebida = new Bebidas(UID, nomeBebida, precoBebida);
            myRef.child("bebida").child(UID).setValue(bebida);
            txtNomeBebida.setText(null);
            txtPrecoBebida.setText(null);
            Toast.makeText( this, "Operação feita com sucesso", Toast.LENGTH_SHORT).show();

        }

}


