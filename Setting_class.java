package com.shahbakhsh.aref.photohider.jadid;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import p000a.p006b.p046h.p047a.C0495m;

public class Setting_class extends C0495m {
    /* renamed from: o */
    public void mo5022o() {
        Dialog dialog = new Dialog(this);
        dialog.setTitle(R.string.Enter_new_keyword);
        dialog.setContentView(R.layout.dialog_change_keyword);
        ((Button) dialog.findViewById(R.id.btn_save_dialog_change_keyword)).setOnClickListener(new C1418t(this, (EditText) dialog.findViewById(R.id.edt_change_keyword_dialog_change_keyword), dialog));
        dialog.create();
        dialog.show();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_setting_class);
        ((TextView) findViewById(R.id.tv_activity_setting_change_numpic)).setOnClickListener(new C1413o(this));
        ((TextView) findViewById(R.id.tv_activity_setting_change_password)).setOnClickListener(new C1414p(this));
        ((TextView) findViewById(R.id.tv_activity_setting_change_keyword)).setOnClickListener(new C1415q(this));
    }

    /* renamed from: p */
    public void mo5023p() {
        Dialog dialog = new Dialog(this);
        dialog.setTitle(R.string.change_numpic);
        dialog.setContentView(R.layout.numperpicker);
        NumberPicker numberPicker = (NumberPicker) dialog.findViewById(R.id.np);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(6);
        ((Button) dialog.findViewById(R.id.btn_numberpicker_save)).setOnClickListener(new C1416r(this, numberPicker, dialog));
        dialog.create();
        dialog.show();
    }

    /* renamed from: q */
    public void mo5024q() {
        Dialog dialog = new Dialog(this);
        dialog.setTitle(R.string.Enter_new_passowrd);
        dialog.setContentView(R.layout.dialog_change_password);
        ((Button) dialog.findViewById(R.id.btn_save_dialog_change_password)).setOnClickListener(new C1417s(this, (EditText) dialog.findViewById(R.id.edt_change_keyword_dialog_change_password), dialog));
        dialog.create();
        dialog.show();
    }
}
