package com.shahbakhsh.aref.photohider.jadid.model_photo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.p060v7.widget.AppCompatImageView;
import android.support.p060v7.widget.AppCompatTextView;
import android.widget.ImageView;
import com.shahbakhsh.aref.photohider.jadid.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import p000a.p006b.p029g.p030a.C0308l;
import p000a.p006b.p046h.p047a.C0495m;
import p063c.p067b.p068a.C0894c;

public class Show_photo_adapter extends C0495m {
    public void onCreate(Bundle bundle) {
        Bitmap bitmap;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_show_photo_adapter);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.image);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.name);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("path");
        String stringExtra2 = intent.getStringExtra("key_name");
        File file = new File(stringExtra, "profile.jpg");
        try {
            bitmap = BitmapFactory.decodeStream(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            bitmap = null;
        }
        C0894c.m3142c(this).mo4485a((C0308l) this).mo4642a(bitmap).mo4636a((ImageView) appCompatImageView);
        appCompatTextView.setText(stringExtra2);
        file.delete();
    }
}
