//
// Decompiled by Jadx - 551ms
//
package com.github.catvod.spider.merge;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.OkHttpClient;

public class Vf {
    private static OkHttpClient B;
    private static OkHttpClient u;
    private static final Object ue = new Object();

    public static OkHttpClient B() {
        OkHttpClient okHttpClient;
        synchronized (ue) {
            if (u == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder retryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = dA.B;
                u = retryOnConnectionFailure.sslSocketFactory(new dA(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = u;
        }
        return okHttpClient;
    }

    public static String Pd(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        if (map.containsKey("location")) {
            return map.get("location").get(0);
        }
        if (map.containsKey("Location")) {
            return map.get("Location").get(0);
        }
        return null;
    }

    public static void T(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, Ok ok) {
        new g6("POST", str, str2, map, ok).ue(okHttpClient);
    }

    public static void W(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, Ok ok) {
        new g6("GET", str, map, map2, ok).ue(okHttpClient);
    }

    public static String ZL(String str, String str2, Map<String, String> map) {
        return cF(B(), str, str2, null, map, null);
    }

    public static void b(OkHttpClient okHttpClient, String str, Map<String, String> map, Ok ok) {
        w(okHttpClient, str, map, null, ok);
    }

    public static String cF(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        vE vEVar = new vE(map3);
        g6 g6Var = new g6("GET", str, map, map2, vEVar);
        g6Var.u6(str2);
        g6Var.ue(okHttpClient);
        return (String) vEVar.getResult();
    }

    public static String h(String str, Map<String, String> map) {
        return cF(B(), str, null, null, map, null);
    }

    public static void jw(OkHttpClient okHttpClient, String str, Ok ok) {
        b(okHttpClient, str, null, ok);
    }

    public static String p(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return cF(u6(), str, null, null, map, map2);
    }

    public static void u(OkHttpClient okHttpClient, Object obj) {
        if (!(okHttpClient == null || obj == null)) {
            for (Call call : okHttpClient.dispatcher().queuedCalls()) {
                if (obj.equals(call.request().tag())) {
                    call.cancel();
                }
            }
            for (Call call2 : okHttpClient.dispatcher().runningCalls()) {
                if (obj.equals(call2.request().tag())) {
                    call2.cancel();
                }
            }
        }
    }

    public static OkHttpClient u6() {
        OkHttpClient okHttpClient;
        synchronized (ue) {
            if (B == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder retryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = dA.B;
                B = retryOnConnectionFailure.sslSocketFactory(new dA(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = B;
        }
        return okHttpClient;
    }

    public static void ue(Object obj) {
        u(B(), obj);
    }

    public static void w(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, Ok ok) {
        new g6("POST", str, map, map2, ok).ue(okHttpClient);
    }
}
