package com.shahbakhsh.aref.photohider.jadid;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import p000a.p006b.p046h.p047a.C0495m;

public class Dialog_forget_password_activity extends C0495m {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_dialog_forget_password_activity);
        SharedPreferences sharedPreferences = getSharedPreferences("mysharead", 0);
        sharedPreferences.getString("username_key", (String) null);
        String string = sharedPreferences.getString("password_key", (String) null);
        String string2 = sharedPreferences.getString("keyword", (String) null);
        String string3 = getResources().getString(R.string.Wrong_Email);
        String string4 = getResources().getString(R.string.password);
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.forget_dialog);
        dialog.create();
        dialog.show();
        ((Button) dialog.findViewById(R.id.fgt_dialog_btn_ok)).setOnClickListener(new C1410l(this, (EditText) dialog.findViewById(R.id.fgt_dialog_edt_name), string2, string4, string, string3));
    }
}
