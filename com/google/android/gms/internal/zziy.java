package com.google.android.gms.internal;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.ads.internal.zzw;
import java.util.Random;

@zzme
class zziy {
    @Nullable
    zzev zzIV;
    @Nullable
    zzle zzIW;
    @Nullable
    zzgp zzIX;
    @Nullable
    zzeo zzIY;
    @Nullable
    zznw zzIZ;
    @Nullable
    zzep zztk;

    private static class zza extends com.google.android.gms.internal.zzep.zza {
        private final zzep zzJa;

        class C05561 implements Runnable {
            C05561(zza com_google_android_gms_internal_zziy_zza) {
            }

            public void run() {
                zzw.zzdb().zzgv();
            }
        }

        zza(zzep com_google_android_gms_internal_zzep) {
            this.zzJa = com_google_android_gms_internal_zzep;
        }

        public void onAdClosed() throws RemoteException {
            zzjc zzgC = zzjc.zzgC();
            float floatValue = ((Float) zzgd.zzDm.get()).floatValue();
            if (((float) (zzgC.zzgI() + zzgC.zzgH())) <= ((float) zzgC.zzgJ()) * floatValue || Float.isNaN(floatValue)) {
                int intValue = ((Integer) zzgd.zzDk.get()).intValue();
                int intValue2 = ((Integer) zzgd.zzDl.get()).intValue();
                if (intValue <= 0 || intValue2 < 0) {
                    zzw.zzdb().zzgv();
                } else {
                    zzpo.zzXC.postDelayed(new C05561(this), (long) (new Random().nextInt(intValue2 + 1) + intValue));
                }
            }
            this.zzJa.onAdClosed();
        }

        public void onAdFailedToLoad(int i) throws RemoteException {
            this.zzJa.onAdFailedToLoad(i);
        }

        public void onAdLeftApplication() throws RemoteException {
            this.zzJa.onAdLeftApplication();
        }

        public void onAdLoaded() throws RemoteException {
            this.zzJa.onAdLoaded();
        }

        public void onAdOpened() throws RemoteException {
            this.zzJa.onAdOpened();
        }
    }

    zziy() {
    }

    void zzc(zzm com_google_android_gms_ads_internal_zzm) {
        if (this.zztk != null) {
            com_google_android_gms_ads_internal_zzm.zza(new zza(this.zztk));
        }
        if (this.zzIV != null) {
            com_google_android_gms_ads_internal_zzm.zza(this.zzIV);
        }
        if (this.zzIW != null) {
            com_google_android_gms_ads_internal_zzm.zza(this.zzIW);
        }
        if (this.zzIX != null) {
            com_google_android_gms_ads_internal_zzm.zza(this.zzIX);
        }
        if (this.zzIY != null) {
            com_google_android_gms_ads_internal_zzm.zza(this.zzIY);
        }
        if (this.zzIZ != null) {
            com_google_android_gms_ads_internal_zzm.zza(this.zzIZ);
        }
    }
}
