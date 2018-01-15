package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzc extends zzam {
    private static final String ID = zzah.ADVERTISING_TRACKING_ENABLED.toString();
    private final zza zzbEP;

    public zzc(Context context) {
        this(zza.zzbS(context));
    }

    zzc(zza com_google_android_gms_tagmanager_zza) {
        super(ID, new String[0]);
        this.zzbEP = com_google_android_gms_tagmanager_zza;
    }

    public boolean zzQa() {
        return false;
    }

    public zza zzZ(Map<String, zza> map) {
        return zzdl.zzR(Boolean.valueOf(!this.zzbEP.isLimitAdTrackingEnabled()));
    }
}
