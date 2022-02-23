package com.shahbakhsh.aref.photohider.jadid;

import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.nightonke.boommenu.BoomMenuButton;
import java.util.ArrayList;
import p000a.p006b.p046h.p047a.C0495m;
import p063c.p101e.p102a.C1389y;
import p063c.p101e.p102a.p104b.C1344f;
import p063c.p101e.p102a.p104b.C1349k;

public class Basic_photo extends C0495m {

    /* renamed from: p */
    public static String f4980p = "HIDE_DB";

    /* renamed from: q */
    public static int f4981q = 1;

    /* renamed from: r */
    public static String f4982r = "";

    /* renamed from: s */
    public static Bitmap f4983s;

    /* renamed from: t */
    public int f4984t = 1;

    public void LIST_PHOTO(View view) {
        startActivity(new Intent(this, rv_photo.class));
    }

    public void OPEN_PIc(View view) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.setAction("android.intent.action.GET_CONTENT");
        Context applicationContext = getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), this.f4984t, ActivityOptions.makeCustomAnimation(applicationContext, 17432576, 17432577).toBundle());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Button button;
        View.OnClickListener kVar;
        super.onActivityResult(i, i2, intent);
        try {
            if (i == this.f4984t && i2 == -1 && intent != null) {
                if (intent.getData() != null) {
                    Uri data = intent.getData();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(data);
                    Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.dialog_view);
                    dialog.create();
                    dialog.show();
                    button = (Button) dialog.findViewById(R.id.dialog_view_btn_ok);
                    kVar = new C1406h(this, (EditText) dialog.findViewById(R.id.dialog_view_edt_name), dialog, arrayList);
                } else if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        arrayList2.add(clipData.getItemAt(i3).getUri());
                    }
                    Dialog dialog2 = new Dialog(this);
                    dialog2.setContentView(R.layout.dialog_view);
                    dialog2.create();
                    dialog2.show();
                    button = (Button) dialog2.findViewById(R.id.dialog_view_btn_ok);
                    kVar = new C1409k(this, (EditText) dialog2.findViewById(R.id.dialog_view_edt_name), dialog2, arrayList2);
                } else {
                    return;
                }
                button.setOnClickListener(kVar);
            }
        } catch (Exception unused) {
            Toast.makeText(this, "Something went wrong", 1).show();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_basic_photo);
        f4982r = getResources().getString(R.string.The_picture_not_saved_plz_enter_the_name);
        BoomMenuButton boomMenuButton = (BoomMenuButton) findViewById(R.id.bmb);
        C1349k.C1350a aVar = new C1349k.C1350a();
        aVar.mo4755b((int) R.drawable.setting_new);
        C1349k.C1350a aVar2 = aVar;
        aVar2.mo4756c(R.string.settings);
        C1349k.C1350a aVar3 = aVar2;
        aVar3.mo4757d(R.string.Sub_setting);
        boomMenuButton.mo4852a((C1344f) aVar3);
        C1349k.C1350a aVar4 = new C1349k.C1350a();
        aVar4.mo4755b((int) R.drawable.rate_new);
        C1349k.C1350a aVar5 = aVar4;
        aVar5.mo4756c(R.string.Rate_us);
        C1349k.C1350a aVar6 = aVar5;
        aVar6.mo4757d(R.string.Sub_rate_us);
        boomMenuButton.mo4852a((C1344f) aVar6);
        C1349k.C1350a aVar7 = new C1349k.C1350a();
        aVar7.mo4755b((int) R.drawable.add_pic);
        C1349k.C1350a aVar8 = aVar7;
        aVar8.mo4756c(R.string.introduce);
        C1349k.C1350a aVar9 = aVar8;
        aVar9.mo4757d(R.string.sub_introduce);
        boomMenuButton.mo4852a((C1344f) aVar9);
        C1349k.C1350a aVar10 = new C1349k.C1350a();
        aVar10.mo4755b((int) R.drawable.about_new);
        C1349k.C1350a aVar11 = aVar10;
        aVar11.mo4756c(R.string.About_us);
        C1349k.C1350a aVar12 = aVar11;
        aVar12.mo4757d(R.string.About_us);
        boomMenuButton.mo4852a((C1344f) aVar12);
        boomMenuButton.setOnBoomListener(new C1403e(this));
        boomMenuButton.setShadowEffect(true);
        boomMenuButton.setShadowOffsetX(10);
        boomMenuButton.setShadowOffsetY(0);
        boomMenuButton.setShadowRadius(C1389y.m4187a(20.0f));
        boomMenuButton.setPieceCornerRadius((float) C1389y.m4187a(5.0f));
        boomMenuButton.setShadowColor(Color.parseColor("#ee000000"));
        boomMenuButton.setShowDelay(500);
        boomMenuButton.setShowDuration(1000);
        boomMenuButton.setHideDelay(500);
        boomMenuButton.setHideDuration(1000);
    }
}
