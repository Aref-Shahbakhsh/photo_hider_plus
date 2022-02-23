package com.shahbakhsh.aref.photohider.jadid;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import p000a.p006b.p029g.p030a.C0292b;
import p000a.p006b.p029g.p031b.C0338a;
import p000a.p006b.p046h.p047a.C0495m;

public class Play extends C0495m {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_play);
        if (Build.VERSION.SDK_INT >= 23) {
            if (C0338a.m907a((Context) this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                C0292b.m705a(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            } else if (C0338a.m907a((Context) this, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                C0292b.m705a(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            }
        }
        ((Button) findViewById(R.id.btn_Start)).setOnClickListener(new C1412n(this));
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str;
        this.f1068c.mo892c();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a = this.f1077l.mo1259a(i3);
            this.f1077l.mo1265c(i3);
            if (a == null) {
                str = "Activity result delivered for unknown Fragment.";
            } else if (this.f1068c.mo889a(a) == null) {
                str = "Activity result no fragment exists for who: " + a;
            }
            Log.w("FragmentActivity", str);
        }
        if (i == 1) {
            if (iArr.length < 2 || iArr[0] != 0 || iArr[1] != 0) {
                Toast.makeText(getApplicationContext(), R.string.Permission, 1).show();
                finish();
            }
        }
    }
}
