package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zze;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzaty extends zzauh {

    @WorkerThread
    interface zza {
        void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map);
    }

    @WorkerThread
    private static class zzb implements Runnable {
        private final int zzJO;
        private final String zzRg;
        private final Throwable zzZa;
        private final zza zzbsT;
        private final byte[] zzbsU;
        private final Map<String, List<String>> zzbsV;

        private zzb(String str, zza com_google_android_gms_internal_zzaty_zza, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
            zzac.zzw(com_google_android_gms_internal_zzaty_zza);
            this.zzbsT = com_google_android_gms_internal_zzaty_zza;
            this.zzJO = i;
            this.zzZa = th;
            this.zzbsU = bArr;
            this.zzRg = str;
            this.zzbsV = map;
        }

        public void run() {
            this.zzbsT.zza(this.zzRg, this.zzJO, this.zzZa, this.zzbsU, this.zzbsV);
        }
    }

    @WorkerThread
    private class zzc implements Runnable {
        private final URL zzIe;
        private final String zzRg;
        private final byte[] zzaIQ;
        private final zza zzbsW;
        private final Map<String, String> zzbsX;
        final /* synthetic */ zzaty zzbsY;

        public zzc(zzaty com_google_android_gms_internal_zzaty, String str, URL url, byte[] bArr, Map<String, String> map, zza com_google_android_gms_internal_zzaty_zza) {
            this.zzbsY = com_google_android_gms_internal_zzaty;
            zzac.zzdr(str);
            zzac.zzw(url);
            zzac.zzw(com_google_android_gms_internal_zzaty_zza);
            this.zzIe = url;
            this.zzaIQ = bArr;
            this.zzbsW = com_google_android_gms_internal_zzaty_zza;
            this.zzRg = str;
            this.zzbsX = map;
        }

        public void run() {
            HttpURLConnection zzc;
            OutputStream outputStream;
            Throwable e;
            Map map;
            int i;
            HttpURLConnection httpURLConnection;
            Throwable th;
            Map map2;
            this.zzbsY.zzJW();
            int i2 = 0;
            try {
                zzc = this.zzbsY.zzc(this.zzIe);
                try {
                    if (this.zzbsX != null) {
                        for (Entry entry : this.zzbsX.entrySet()) {
                            zzc.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    if (this.zzaIQ != null) {
                        byte[] zzk = this.zzbsY.zzKg().zzk(this.zzaIQ);
                        this.zzbsY.zzKk().zzMd().zzj("Uploading data. size", Integer.valueOf(zzk.length));
                        zzc.setDoOutput(true);
                        zzc.addRequestProperty(HttpRequest.HEADER_CONTENT_ENCODING, HttpRequest.ENCODING_GZIP);
                        zzc.setFixedLengthStreamingMode(zzk.length);
                        zzc.connect();
                        outputStream = zzc.getOutputStream();
                        try {
                            outputStream.write(zzk);
                            outputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            map = null;
                            i = 0;
                            httpURLConnection = zzc;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e3) {
                                    this.zzbsY.zzKk().zzLX().zze("Error closing HTTP compressed POST connection output stream. appId", zzatx.zzfE(this.zzRg), e3);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.zzbsY.zzKj().zzm(new zzb(this.zzRg, this.zzbsW, i, e, null, map));
                        } catch (Throwable th2) {
                            th = th2;
                            map2 = null;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e32) {
                                    this.zzbsY.zzKk().zzLX().zze("Error closing HTTP compressed POST connection output stream. appId", zzatx.zzfE(this.zzRg), e32);
                                }
                            }
                            if (zzc != null) {
                                zzc.disconnect();
                            }
                            this.zzbsY.zzKj().zzm(new zzb(this.zzRg, this.zzbsW, i2, null, null, map2));
                            throw th;
                        }
                    }
                    i2 = zzc.getResponseCode();
                    map2 = zzc.getHeaderFields();
                } catch (IOException e4) {
                    e = e4;
                    map = null;
                    i = i2;
                    outputStream = null;
                    httpURLConnection = zzc;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zzbsY.zzKj().zzm(new zzb(this.zzRg, this.zzbsW, i, e, null, map));
                } catch (Throwable th3) {
                    th = th3;
                    map2 = null;
                    outputStream = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (zzc != null) {
                        zzc.disconnect();
                    }
                    this.zzbsY.zzKj().zzm(new zzb(this.zzRg, this.zzbsW, i2, null, null, map2));
                    throw th;
                }
                try {
                    byte[] zza = this.zzbsY.zzc(zzc);
                    if (zzc != null) {
                        zzc.disconnect();
                    }
                    this.zzbsY.zzKj().zzm(new zzb(this.zzRg, this.zzbsW, i2, null, zza, map2));
                } catch (IOException e5) {
                    e = e5;
                    map = map2;
                    i = i2;
                    outputStream = null;
                    httpURLConnection = zzc;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zzbsY.zzKj().zzm(new zzb(this.zzRg, this.zzbsW, i, e, null, map));
                } catch (Throwable th32) {
                    th = th32;
                    outputStream = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (zzc != null) {
                        zzc.disconnect();
                    }
                    this.zzbsY.zzKj().zzm(new zzb(this.zzRg, this.zzbsW, i2, null, null, map2));
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                map = null;
                i = 0;
                outputStream = null;
                httpURLConnection = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                this.zzbsY.zzKj().zzm(new zzb(this.zzRg, this.zzbsW, i, e, null, map));
            } catch (Throwable th322) {
                th = th322;
                map2 = null;
                zzc = null;
                outputStream = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (zzc != null) {
                    zzc.disconnect();
                }
                this.zzbsY.zzKj().zzm(new zzb(this.zzRg, this.zzbsW, i2, null, null, map2));
                throw th;
            }
        }
    }

    public zzaty(zzaue com_google_android_gms_internal_zzaue) {
        super(com_google_android_gms_internal_zzaue);
    }

    @WorkerThread
    private byte[] zzc(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            return toByteArray;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public /* bridge */ /* synthetic */ void zzJU() {
        super.zzJU();
    }

    public /* bridge */ /* synthetic */ void zzJV() {
        super.zzJV();
    }

    public /* bridge */ /* synthetic */ void zzJW() {
        super.zzJW();
    }

    public /* bridge */ /* synthetic */ zzatb zzJX() {
        return super.zzJX();
    }

    public /* bridge */ /* synthetic */ zzatf zzJY() {
        return super.zzJY();
    }

    public /* bridge */ /* synthetic */ zzauj zzJZ() {
        return super.zzJZ();
    }

    public /* bridge */ /* synthetic */ zzatu zzKa() {
        return super.zzKa();
    }

    public /* bridge */ /* synthetic */ zzatl zzKb() {
        return super.zzKb();
    }

    public /* bridge */ /* synthetic */ zzaul zzKc() {
        return super.zzKc();
    }

    public /* bridge */ /* synthetic */ zzauk zzKd() {
        return super.zzKd();
    }

    public /* bridge */ /* synthetic */ zzatv zzKe() {
        return super.zzKe();
    }

    public /* bridge */ /* synthetic */ zzatj zzKf() {
        return super.zzKf();
    }

    public /* bridge */ /* synthetic */ zzaut zzKg() {
        return super.zzKg();
    }

    public /* bridge */ /* synthetic */ zzauc zzKh() {
        return super.zzKh();
    }

    public /* bridge */ /* synthetic */ zzaun zzKi() {
        return super.zzKi();
    }

    public /* bridge */ /* synthetic */ zzaud zzKj() {
        return super.zzKj();
    }

    public /* bridge */ /* synthetic */ zzatx zzKk() {
        return super.zzKk();
    }

    public /* bridge */ /* synthetic */ zzaua zzKl() {
        return super.zzKl();
    }

    public /* bridge */ /* synthetic */ zzati zzKm() {
        return super.zzKm();
    }

    @WorkerThread
    public void zza(String str, URL url, Map<String, String> map, zza com_google_android_gms_internal_zzaty_zza) {
        zzmR();
        zzob();
        zzac.zzw(url);
        zzac.zzw(com_google_android_gms_internal_zzaty_zza);
        zzKj().zzn(new zzc(this, str, url, null, map, com_google_android_gms_internal_zzaty_zza));
    }

    @WorkerThread
    public void zza(String str, URL url, byte[] bArr, Map<String, String> map, zza com_google_android_gms_internal_zzaty_zza) {
        zzmR();
        zzob();
        zzac.zzw(url);
        zzac.zzw(bArr);
        zzac.zzw(com_google_android_gms_internal_zzaty_zza);
        zzKj().zzn(new zzc(this, str, url, bArr, map, com_google_android_gms_internal_zzaty_zza));
    }

    @WorkerThread
    protected HttpURLConnection zzc(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzKm().zzLc();
            httpURLConnection.setConnectTimeout(60000);
            zzKm().zzLd();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    public /* bridge */ /* synthetic */ void zzmR() {
        super.zzmR();
    }

    protected void zzmS() {
    }

    public /* bridge */ /* synthetic */ zze zznR() {
        return super.zznR();
    }

    public boolean zzqa() {
        NetworkInfo activeNetworkInfo;
        zzob();
        try {
            activeNetworkInfo = ((ConnectivityManager) getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
