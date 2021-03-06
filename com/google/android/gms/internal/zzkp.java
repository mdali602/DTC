package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzh;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.zzgr.zza;

@zzme
public class zzkp implements MediationInterstitialAdapter {
    private Uri mUri;
    private Activity zzLO;
    private zzgr zzLP;
    private MediationInterstitialListener zzLQ;

    class C10921 implements zza {
        C10921(zzkp com_google_android_gms_internal_zzkp) {
        }

        public void zzfJ() {
            zzqf.zzbf("Hinting CustomTabsService for the load of the new url.");
        }

        public void zzfK() {
            zzqf.zzbf("Disconnecting from CustomTabs service.");
        }
    }

    class C10932 implements zzh {
        final /* synthetic */ zzkp zzLR;

        C10932(zzkp com_google_android_gms_internal_zzkp) {
            this.zzLR = com_google_android_gms_internal_zzkp;
        }

        public void onPause() {
            zzqf.zzbf("AdMobCustomTabsAdapter overlay is paused.");
        }

        public void onResume() {
            zzqf.zzbf("AdMobCustomTabsAdapter overlay is resumed.");
        }

        public void zzbN() {
            zzqf.zzbf("AdMobCustomTabsAdapter overlay is closed.");
            this.zzLR.zzLQ.onAdClosed(this.zzLR);
            try {
                this.zzLR.zzLP.zzd(this.zzLR.zzLO);
            } catch (Throwable e) {
                zzqf.zzb("Exception while unbinding from CustomTabsService.", e);
            }
        }

        public void zzbO() {
            zzqf.zzbf("Opening AdMobCustomTabsAdapter overlay.");
            this.zzLR.zzLQ.onAdOpened(this.zzLR);
        }
    }

    public static boolean zzr(Context context) {
        return zzgr.zzo(context);
    }

    public void onDestroy() {
        zzqf.zzbf("Destroying AdMobCustomTabsAdapter adapter.");
        try {
            this.zzLP.zzd(this.zzLO);
        } catch (Throwable e) {
            zzqf.zzb("Exception while unbinding from CustomTabsService.", e);
        }
    }

    public void onPause() {
        zzqf.zzbf("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public void onResume() {
        zzqf.zzbf("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzLQ = mediationInterstitialListener;
        if (this.zzLQ == null) {
            zzqf.zzbh("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zzqf.zzbh("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzLQ.onAdFailedToLoad(this, 0);
        } else if (zzr(context)) {
            Object string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzqf.zzbh("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzLQ.onAdFailedToLoad(this, 0);
                return;
            }
            this.zzLO = (Activity) context;
            this.mUri = Uri.parse(string);
            this.zzLP = new zzgr();
            this.zzLP.zza(new C10921(this));
            this.zzLP.zze(this.zzLO);
            this.zzLQ.onAdLoaded(this);
        } else {
            zzqf.zzbh("Default browser does not support custom tabs. Bailing out.");
            this.zzLQ.onAdFailedToLoad(this, 0);
        }
    }

    public void showInterstitial() {
        CustomTabsIntent build = new Builder(this.zzLP.zzfH()).build();
        build.intent.setData(this.mUri);
        final AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new zzc(build.intent), null, new C10932(this), null, new zzqh(0, 0, false));
        zzpo.zzXC.post(new Runnable(this) {
            final /* synthetic */ zzkp zzLR;

            public void run() {
                zzw.zzcK().zza(this.zzLR.zzLO, adOverlayInfoParcel);
            }
        });
        zzw.zzcQ().zzH(false);
    }
}
