package com.google.android.gms.internal;

import com.google.android.gms.internal.zzag.zza;
import java.lang.reflect.InvocationTargetException;

public class zzbw extends zzca {
    private static final Object zzqS = new Object();
    private static volatile Long zzra = null;

    public zzbw(zzbd com_google_android_gms_internal_zzbd, String str, String str2, zza com_google_android_gms_internal_zzag_zza, int i, int i2) {
        super(com_google_android_gms_internal_zzbd, str, str2, com_google_android_gms_internal_zzag_zza, i, i2);
    }

    protected void zzbd() throws IllegalAccessException, InvocationTargetException {
        if (zzra == null) {
            synchronized (zzqS) {
                if (zzra == null) {
                    zzra = (Long) this.zzre.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzqV) {
            this.zzqV.zzbz = zzra;
        }
    }
}
