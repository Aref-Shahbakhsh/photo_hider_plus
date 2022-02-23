package com.shahbakhsh.aref.photohider.jadid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import p000a.p006b.p046h.p047a.C0495m;

public class Signup extends C0495m {

    /* renamed from: p */
    public EditText f4992p;

    /* renamed from: q */
    public EditText f4993q;

    /* renamed from: r */
    public EditText f4994r;

    /* renamed from: s */
    public String f4995s;

    /* renamed from: t */
    public String f4996t;

    /* renamed from: u */
    public String f4997u;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_signup);
        SharedPreferences.Editor edit = getSharedPreferences("mysharead", 0).edit();
        edit.putInt("number", 2);
        this.f4992p = (EditText) findViewById(R.id.edt_password);
        this.f4993q = (EditText) findViewById(R.id.edt_confirm_password);
        this.f4994r = (EditText) findViewById(R.id.edt_keyword);
        ((Button) findViewById(R.id.btn_signup_submit)).setOnClickListener(new C1419u(this, edit));
    }
}
