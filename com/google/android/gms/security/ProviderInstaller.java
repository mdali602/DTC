package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.zze;
import com.google.android.gms.common.zzg;
import java.lang.reflect.Method;

public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final zze zzbEg = zze.zzuY();
    private static Method zzbEh = null;
    private static final Object zztX = new Object();

    class C06901 extends AsyncTask<Void, Void, Integer> {
        final /* synthetic */ ProviderInstallListener zzbEi;
        final /* synthetic */ Context zztf;

        C06901(Context context, ProviderInstallListener providerInstallListener) {
            this.zztf = context;
            this.zzbEi = providerInstallListener;
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return zzb((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            zzg((Integer) obj);
        }

        protected Integer zzb(Void... voidArr) {
            try {
                ProviderInstaller.installIfNeeded(this.zztf);
                return Integer.valueOf(0);
            } catch (GooglePlayServicesRepairableException e) {
                return Integer.valueOf(e.getConnectionStatusCode());
            } catch (GooglePlayServicesNotAvailableException e2) {
                return Integer.valueOf(e2.errorCode);
            }
        }

        protected void zzg(Integer num) {
            if (num.intValue() == 0) {
                this.zzbEi.onProviderInstalled();
                return;
            }
            this.zzbEi.onProviderInstallFailed(num.intValue(), ProviderInstaller.zzbEg.zzb(this.zztf, num.intValue(), "pi"));
        }
    }

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, Intent intent);

        void onProviderInstalled();
    }

    public static void installIfNeeded(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        zzac.zzb((Object) context, (Object) "Context must not be null");
        zzbEg.zzaE(context);
        Context remoteContext = zzg.getRemoteContext(context);
        if (remoteContext == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new GooglePlayServicesNotAvailableException(8);
        }
        synchronized (zztX) {
            try {
                if (zzbEh == null) {
                    zzbR(remoteContext);
                }
                zzbEh.invoke(null, new Object[]{remoteContext});
            } catch (Exception e) {
                String str = "ProviderInstaller";
                String str2 = "Failed to install provider: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerInstallListener) {
        zzac.zzb((Object) context, (Object) "Context must not be null");
        zzac.zzb((Object) providerInstallListener, (Object) "Listener must not be null");
        zzac.zzdj("Must be called on the UI thread");
        new C06901(context, providerInstallListener).execute(new Void[0]);
    }

    private static void zzbR(Context context) throws ClassNotFoundException, NoSuchMethodException {
        zzbEh = context.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
    }
}
