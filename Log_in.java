package com.shahbakhsh.aref.photohider.jadid;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import p000a.p006b.p046h.p047a.C0495m;
import p063c.p099d.p100a.C1326a;
import p063c.p099d.p100a.C1328c;

public class Log_in extends C0495m implements C1326a {

    /* renamed from: p */
    public static String f4985p = "";

    /* renamed from: q */
    public static String f4986q = "";

    /* renamed from: r */
    public String f4987r;

    /* renamed from: s */
    public EditText f4988s;

    /* renamed from: t */
    public C1328c f4989t;

    /* renamed from: u */
    public String f4990u;

    /* renamed from: v */
    public TextView f4991v;

    public void SUBMIT(View view) {
        this.f4987r = this.f4988s.getText().toString();
        if (this.f4987r.equals(this.f4990u)) {
            Toast.makeText(this, f4985p, 0).show();
            startActivity(new Intent(this, Basic_photo.class), ActivityOptions.makeCustomAnimation(getApplicationContext(), 17432578, 17432579).toBundle());
            finish();
            return;
        }
        this.f4991v.setVisibility(0);
        Toast.makeText(this, f4986q, 0).show();
        this.f4991v.setOnClickListener(new C1411m(this));
    }

    /* renamed from: a */
    public void mo4657a(int i, String str) {
    }

    /* renamed from: a */
    public void mo4658a(FingerprintManager.CryptoObject cryptoObject) {
        startActivity(new Intent(this, Basic_photo.class));
        finish();
    }

    /* renamed from: c */
    public void mo4659c() {
        Toast.makeText(getApplicationContext(), " your diecive has no support finger print ", 1).show();
    }

    /* renamed from: e */
    public void mo4660e() {
        Toast.makeText(getApplicationContext(), " you have not choose a finger print plz choose a one finger print ", 1).show();
    }

    /* renamed from: f */
    public void mo4661f() {
        Toast.makeText(getApplicationContext(), " your android version is lower than 6 ", 1).show();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_log_in);
        SharedPreferences sharedPreferences = getSharedPreferences("mysharead", 0);
        this.f4988s = (EditText) findViewById(R.id.Log_in_edt_password);
        this.f4990u = sharedPreferences.getString("password_key", (String) null);
        this.f4991v = (TextView) findViewById(R.id.login_tv_forget_password);
        f4985p = getResources().getString(R.string.Welcome);
        f4986q = getResources().getString(R.string.Wrong_user_name_or_password);
        this.f4989t = C1328c.m4060a(this, this);
    }

    public void onPause() {
        super.onPause();
        C1328c cVar = this.f4989t;
        CancellationSignal cancellationSignal = cVar.f4369f;
        if (cancellationSignal != null) {
            cVar.f4370g = true;
            cancellationSignal.cancel();
            cVar.f4369f = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r2 = p000a.p006b.p029g.p035d.p036a.C0367a.m969a(r1);
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[ExcHandler: KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:31:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r12 = this;
            super.onResume()
            c.d.a.c r0 = r12.f4989t
            boolean r1 = r0.f4370g
            if (r1 == 0) goto L_0x000c
            r0.mo4666a()
        L_0x000c:
            android.content.Context r1 = r0.f4367d
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            r4 = 0
            r5 = 1
            if (r2 < r3) goto L_0x004c
            if (r2 < r3) goto L_0x0026
            android.hardware.fingerprint.FingerprintManager r2 = p000a.p006b.p029g.p035d.p036a.C0367a.m969a(r1)
            if (r2 == 0) goto L_0x0026
            boolean r2 = r2.isHardwareDetected()
            if (r2 == 0) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            if (r2 != 0) goto L_0x002f
            c.d.a.a r1 = r0.f4368e
            r1.mo4659c()
            goto L_0x0051
        L_0x002f:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x0041
            android.hardware.fingerprint.FingerprintManager r1 = p000a.p006b.p029g.p035d.p036a.C0367a.m969a(r1)
            if (r1 == 0) goto L_0x0041
            boolean r1 = r1.hasEnrolledFingerprints()
            if (r1 == 0) goto L_0x0041
            r1 = 1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 != 0) goto L_0x004a
            c.d.a.a r1 = r0.f4368e
            r1.mo4660e()
            goto L_0x0051
        L_0x004a:
            r1 = 1
            goto L_0x0052
        L_0x004c:
            c.d.a.a r1 = r0.f4368e
            r1.mo4661f()
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r1 != 0) goto L_0x0056
            goto L_0x00fd
        L_0x0056:
            android.content.Context r1 = r0.f4367d
            java.lang.String r2 = "fingerprint"
            java.lang.Object r1 = r1.getSystemService(r2)
            r6 = r1
            android.hardware.fingerprint.FingerprintManager r6 = (android.hardware.fingerprint.FingerprintManager) r6
            java.lang.String r1 = "AndroidKeyStore"
            r2 = 0
            r0.f4365b = r2
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r1)     // Catch:{  }
            r0.f4365b = r3     // Catch:{  }
            java.lang.String r3 = "AES"
            javax.crypto.KeyGenerator r1 = javax.crypto.KeyGenerator.getInstance(r3, r1)     // Catch:{  }
            java.security.KeyStore r3 = r0.f4365b     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            r3.load(r2)     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            java.lang.String r7 = p063c.p099d.p100a.C1328c.f4364a     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            r8 = 3
            r3.<init>(r7, r8)     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            java.lang.String r7 = "CBC"
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setBlockModes(r7)     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setUserAuthenticationRequired(r5)     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            java.lang.String r7 = "PKCS7Padding"
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setEncryptionPaddings(r7)     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            android.security.keystore.KeyGenParameterSpec r3 = r3.build()     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            r1.init(r3)     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            r1.generateKey()     // Catch:{ KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3, KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x00a3 }
            r1 = 1
            goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            r3 = 566(0x236, float:7.93E-43)
            java.lang.String r7 = "Failed to generate cipher key for authentication."
            if (r1 != 0) goto L_0x00ab
            goto L_0x00cf
        L_0x00ab:
            java.lang.String r1 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch:{ NoSuchAlgorithmException | NoSuchPaddingException -> 0x00cf }
            r0.f4366c = r1     // Catch:{ NoSuchAlgorithmException | NoSuchPaddingException -> 0x00cf }
            java.security.KeyStore r1 = r0.f4365b     // Catch:{ KeyPermanentlyInvalidatedException | IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException -> 0x00c9 }
            r1.load(r2)     // Catch:{ KeyPermanentlyInvalidatedException | IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException -> 0x00c9 }
            java.security.KeyStore r1 = r0.f4365b     // Catch:{ KeyPermanentlyInvalidatedException | IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException -> 0x00c9 }
            java.lang.String r8 = p063c.p099d.p100a.C1328c.f4364a     // Catch:{ KeyPermanentlyInvalidatedException | IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException -> 0x00c9 }
            java.security.Key r1 = r1.getKey(r8, r2)     // Catch:{ KeyPermanentlyInvalidatedException | IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException -> 0x00c9 }
            javax.crypto.SecretKey r1 = (javax.crypto.SecretKey) r1     // Catch:{ KeyPermanentlyInvalidatedException | IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException -> 0x00c9 }
            javax.crypto.Cipher r8 = r0.f4366c     // Catch:{ KeyPermanentlyInvalidatedException | IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException -> 0x00c9 }
            r8.init(r5, r1)     // Catch:{ KeyPermanentlyInvalidatedException | IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException -> 0x00c9 }
            r4 = 1
            goto L_0x00d6
        L_0x00c9:
            c.d.a.a r1 = r0.f4368e
            r1.mo4657a(r3, r7)
            goto L_0x00d6
        L_0x00cf:
            c.d.a.a r1 = r0.f4368e
            java.lang.String r5 = "Failed to generate secrete key for authentication."
            r1.mo4657a(r3, r5)
        L_0x00d6:
            if (r4 == 0) goto L_0x00e0
            android.hardware.fingerprint.FingerprintManager$CryptoObject r1 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
            javax.crypto.Cipher r2 = r0.f4366c
            r1.<init>(r2)
            goto L_0x00e1
        L_0x00e0:
            r1 = r2
        L_0x00e1:
            if (r1 != 0) goto L_0x00e9
            c.d.a.a r0 = r0.f4368e
            r0.mo4657a(r3, r7)
            goto L_0x00fd
        L_0x00e9:
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            r0.f4369f = r2
            android.os.CancellationSignal r8 = r0.f4369f
            r9 = 0
            c.d.a.b r10 = new c.d.a.b
            r10.<init>(r0)
            r11 = 0
            r7 = r1
            r6.authenticate(r7, r8, r9, r10, r11)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shahbakhsh.aref.photohider.jadid.Log_in.onResume():void");
    }
}
