package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@zzme
public class zzdh {
    private final int zzyn;
    private final int zzyo;
    private final int zzyp;
    private final zzdg zzyq = new zzdj();

    class C05361 implements Comparator<com.google.android.gms.internal.zzdk.zza> {
        C05361(zzdh com_google_android_gms_internal_zzdh) {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return zza((com.google.android.gms.internal.zzdk.zza) obj, (com.google.android.gms.internal.zzdk.zza) obj2);
        }

        public int zza(com.google.android.gms.internal.zzdk.zza com_google_android_gms_internal_zzdk_zza, com.google.android.gms.internal.zzdk.zza com_google_android_gms_internal_zzdk_zza2) {
            int i = com_google_android_gms_internal_zzdk_zza.zzyv - com_google_android_gms_internal_zzdk_zza2.zzyv;
            return i != 0 ? i : (int) (com_google_android_gms_internal_zzdk_zza.value - com_google_android_gms_internal_zzdk_zza2.value);
        }
    }

    static class zza {
        ByteArrayOutputStream zzyr = new ByteArrayOutputStream(4096);
        Base64OutputStream zzys = new Base64OutputStream(this.zzyr, 10);

        public String toString() {
            String byteArrayOutputStream;
            try {
                this.zzys.close();
            } catch (Throwable e) {
                zzqf.zzb("HashManager: Unable to convert to Base64.", e);
            }
            try {
                this.zzyr.close();
                byteArrayOutputStream = this.zzyr.toString();
            } catch (Throwable e2) {
                zzqf.zzb("HashManager: Unable to convert to Base64.", e2);
                byteArrayOutputStream = "";
            } finally {
                this.zzyr = null;
                this.zzys = null;
            }
            return byteArrayOutputStream;
        }

        public void write(byte[] bArr) throws IOException {
            this.zzys.write(bArr);
        }
    }

    public zzdh(int i) {
        this.zzyo = i;
        this.zzyn = 6;
        this.zzyp = 0;
    }

    String zzG(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        zza zzeu = zzeu();
        PriorityQueue priorityQueue = new PriorityQueue(this.zzyo, new C05361(this));
        for (String zzI : split) {
            String[] zzI2 = zzdi.zzI(zzI);
            if (zzI2.length != 0) {
                zzdk.zza(zzI2, this.zzyo, this.zzyn, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzeu.write(this.zzyq.zzF(((com.google.android.gms.internal.zzdk.zza) it.next()).zzyu));
            } catch (Throwable e) {
                zzqf.zzb("Error while writing hash to byteStream", e);
            }
        }
        return zzeu.toString();
    }

    public String zza(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((String) it.next()).toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        return zzG(stringBuffer.toString());
    }

    zza zzeu() {
        return new zza();
    }
}
