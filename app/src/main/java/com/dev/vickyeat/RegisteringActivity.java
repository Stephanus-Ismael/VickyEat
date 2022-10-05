package com.dev.vickyeat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisteringActivity extends AppCompatActivity {

    EditText inputFirstName, inputLastName, inputEmail,inputPhone, inputPassword, inputConfirmPassword;
    Button btnSignUp;
    TextView btnAlreadyHaveAccount;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    ProgressDialog progressDialog;

    FirebaseAuth myAuth;
    FirebaseUser myUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registering);

        inputFirstName=findViewById(R.id.inputFirstName);
        inputLastName=findViewById(R.id.inputLastName);
        inputEmail=findViewById(R.id.inputEmail);
        inputPhone=findViewById(R.id.inputPhone);
        inputPassword=findViewById(R.id.inputPassword);
        inputConfirmPassword=findViewById(R.id.inputConfirmPassword);
        btnSignUp=findViewById(R.id.btnSignUp);
        btnAlreadyHaveAccount=findViewById(R.id.txtAlreadyHaveAccount);
        progressDialog=new ProgressDialog(this);
        myAuth=FirebaseAuth.getInstance();
        myUser=myAuth.getCurrentUser();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AuthRegistration();
            }
        });

        btnAlreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisteringActivity.this, LoginActivity.class));
            }
        });
    }

    private void AuthRegistration() {
        String firstName=inputFirstName.getText().toString();
        String lastName=inputLastName.getText().toString();
        String email=inputEmail.getText().toString();
        String cellphone=inputPhone.getText().toString();
        String password=inputPassword.getText().toString();
        String comfirmPassword=inputConfirmPassword.getText().toString();

        if (firstName.isEmpty()){
            showError(inputFirstName, "Enter first Name");
        }
        else if (lastName.isEmpty()){
            showError(inputLastName, "Enter last Name");
        }
        else if (email.isEmpty() || !email.matches(emailPattern)){
            showError(inputEmail, "Invalid email");
        }
        else if (cellphone.isEmpty()){
            showError(inputPhone, "Enter cellphone number");
        }
        else if (password.isEmpty() || password.length() < 8){
            showError(inputPassword, "Password should 8 character or more");
        }
        else if (comfirmPassword.isEmpty() || !password.equals(comfirmPassword)){
            showError(inputConfirmPassword, "Password does not match");
        }
        else {
            progressDialog.setMessage("Please wait while Registration...");
            progressDialog.setTitle("Registration");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            myAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        progressDialog.dismiss();
                        sendUserToNextActivity();
                        Toast.makeText(RegisteringActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        progressDialog.dismiss();
                        Toast.makeText(RegisteringActivity.this, ""+task.getException(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void showError(EditText input, String s) {
        input.setError(s);
        input.requestFocus();
    }

    private void sendUserToNextActivity() {
        Intent intent=new Intent(RegisteringActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}