//
// Decompiled by Jadx - 847ms
//
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.RSA;
import com.github.catvod.spider.merge.Vf;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class SP293 extends Spider {
    public static String l = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAK2J1rk9jLpIk/la\nJ3rv5ngMac7CTJT2QTyL2jKnazj6Nrlp4DbBt6mhsY/nJ0/KTPE8gJN2+oSpuG3J\nCPLN/i3BvO2K7492lvSV5s325EdNTVMLPr0I/6CT6Jsq33uQm2bJr+mOTC9ahdWF\nyj+x1pEqf1NQokF8M8JHhmZyBn35AgMBAAECgYAfQk3wThr0TzCAYPHtnhr4ktvY\nR31986Gqo1Jpf2i7+a4z1dNyaZCIuLyAPFYDdGBJr+lFJtBXZy72b5jyC5L2JQ7H\nMgkQxTXTbxw53JlypJ5P4dONesjHP84A/FnqbiuXPnGUXsoqP8iw2KV2Rp5Dr4UA\nSHqdT5G7a7u2jmlOUQJBANn6Lco8MOf1p3iCxwvDDjQRJLgqg7NTlEgS2jkJkvEZ\nG3tu+ipnLQiSeYknF0eGphpSBvWjJnxQBrQNO7G0STUCQQDLzzwJpVI70jBGMF9K\nphCF7MdWBNIJycG6YiFD1NnPU1XoxK4QloyccUDDk1Q3/VUW4ncQ4H1iO8FbJw79\npr41AkEAwSv8LnAfK0HBk4PaH+tRiAT1VJygsGhOTX0flVKNvUpx13anDrL27tTY\nDhrtf36tbz/oWQGoFpzZA/GCSF6sTQJBAKlMtGqu0eivaTpk5EN2PzOAxPVHe9J1\nrl/NNCTMo0H9z9dTyeQtqxApY8sSj1sTLaOc65sxX/ZB/RRjFajO4iECQQDH2wPG\nt1U66bMdb1ueAXk0Mmxv0UGxX+f2ry2EMbMkucE0Q+YceFFc50Fjv3rh0UOajNpt\nSUgisHIdtjIiobQZ";
    public static String qb = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC9KE7n2qFTfDHkiQpIquVT4RZq\nfNOzF93qfgAxuRlNORfBiOuPCOLyPyEGBgfmztKmvyck2429Mp3fVt9WR7NIq39v\nUOJeaQjsrjeg9MnGFH6o0W+pZ99eMqKd95ErUONBvjE0o1Tc906QSHGN7HXxTACv\nWqaIrj+RUB62I4AMLwIDAQAB";
    public static String zC = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBALSxFoXcb8EvbnF6\n+vpEARgSWZmHKCw+ymhySh07ndLkHwRc9YPYv0Zep//TOy+gz4ULa8xWlnaXF3yJ\nupHbv3XbYXGys9ibHNi71QdjAiwhH/AJMLFh2cdkKVWwJTBdHUXiVYvBxR238QqK\n2eaaxiFGn0rqgEK0INKfaT98H7h5AgMBAAECgYBHloWy4UQRiOY75Zp7/udkDxka\nn5bF+NaejPFaJZ2AyUqUovPOmdgmXCg5Tgn7871kG8NIwOF5+KCggby+Pw7aSnl0\nhFNCzkT/x/bHcoMXiTwkcNhAmTIJ9MtPYO++nfwce0pJrtlUfOiiBz/agW1Hh4nr\nGn/y6XTuCmRkqeU81QJBAO91+6IOJsu+aO1WJ7OSQHxzY9P+aZOEhZb4tSwnUS3Q\nTHeyMRW3cy9EmQe59g7GoFkBYjoRu/pcMHJtvDfDPKMCQQDBK/s6hb0nK0QNBMA4\nk5TgiKSSELv+snTqGFx7rdFTOKO5bVMl4tzxWZXddT7tMcR1Cp9cSnde2xurlUUc\nQQwzAkBA4YnNjeILIEtTyx00tXLNhYJN5Uf71VNQ5ZBJJ1oCfMbLQ7ey96K48vA3\nvLYjqMO3ef2AWF/DZQknZ/4wabDbAkB697tysqYJpCIqw2Z13YS9Nl7E2MBDz2hb\niOx+ktSYzIp0xKJUkMkjHmsnUbagGbk85Gkzv/ejO4muvVQEO2g/AkAmUUNkhKOh\nXxwYiiD+iSgm0D9q3kUppbWxgLkHN9noO1WQXzfxeKUzncvr35yKlhx/M+Hag/Iz\n9wDTb9FE34mK";
    private String n8 = "";
    private Map<String, Set<String>> ug = new HashMap();
    private String v = "1.2.9";
    private String in = "10000";
    private String I4 = "";

    private String l(String str) {
        return RSA.l(str, qb);
    }

    private HashMap<String, String> n8() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 10; PBEM00 Build/QKQ1.190918.001)");
        return hashMap;
    }

    private String qb(String str, String str2) {
        return RSA.qb(str, str2);
    }

    private String zC() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            String str3 = this.n8 + "api.php/Videonew/video?class=";
            if (hashMap.containsKey("class")) {
                str3 = str3 + hashMap.get("class");
            }
            String str4 = str3 + "&area=";
            if (hashMap.containsKey("area")) {
                str4 = str4 + hashMap.get("area");
            }
            String str5 = str4 + "&year=";
            if (hashMap.containsKey("year")) {
                str5 = str5 + hashMap.get("year");
            }
            JSONArray jSONArray = new JSONObject(qb(Vf.h(str5 + "&tid=" + str + "&pg=" + str2 + "&limit=20&csrf=" + URLEncoder.encode(l(zC())), n8()), l)).getJSONArray("data");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", jSONObject2.getString("vod_id"));
                jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                jSONArray2.put(jSONObject3);
            }
            int parseInt = Integer.parseInt(str2);
            jSONObject.put("page", parseInt);
            if (jSONArray2.length() == 12) {
                parseInt++;
            }
            jSONObject.put("pagecount", parseInt);
            jSONObject.put("limit", 12);
            jSONObject.put("total", Integer.MAX_VALUE);
            jSONObject.put("list", jSONArray2);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public String detailContent(List<String> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String zC2 = zC();
            String l2 = l(zC2);
            jSONObject2.put("time", zC2);
            String str = new String(RSA.l(l2, qb));
            JSONObject optJSONObject = new JSONObject(qb(Vf.h(this.n8 + "api.php/Videonew/videoDetail?id=" + list.get(0) + "&ck=" + URLEncoder.encode(str) + "&csrf=" + URLEncoder.encode(l2), n8()), l)).optJSONObject("data").optJSONObject("vod_info");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("vod_id", optJSONObject.getString("vod_id"));
            jSONObject3.put("vod_name", optJSONObject.getString("vod_name"));
            jSONObject3.put("vod_pic", optJSONObject.getString("vod_pic"));
            jSONObject3.put("type_name", optJSONObject.optString("vod_class"));
            jSONObject3.put("vod_year", optJSONObject.optString("vod_year"));
            jSONObject3.put("vod_area", optJSONObject.optString("vod_area"));
            jSONObject3.put("vod_remarks", optJSONObject.optString("vod_remarks"));
            jSONObject3.put("vod_actor", optJSONObject.optString("vod_actor"));
            jSONObject3.put("vod_content", optJSONObject.optString("vod_content").trim());
            JSONArray jSONArray = optJSONObject.getJSONArray("vod_url_with_player");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                String string = jSONObject4.getString("code");
                linkedHashMap.put(string, jSONObject4.optString("url"));
                JSONArray optJSONArray = jSONObject4.optJSONArray("parse_api");
                if (!this.ug.containsKey(string)) {
                    HashSet hashSet = new HashSet();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        hashSet.add(optJSONArray.optString(i2));
                    }
                    this.ug.put(string, hashSet);
                } else {
                    Set<String> set = this.ug.get(string);
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        set.add(optJSONArray.optString(i3));
                    }
                }
            }
            String join = TextUtils.join("$$$", linkedHashMap.keySet());
            String join2 = TextUtils.join("$$$", linkedHashMap.values());
            jSONObject3.put("vod_play_from", join);
            jSONObject3.put("vod_play_url", join2);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject3);
            jSONObject.put("list", jSONArray2);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public String homeContent(boolean z) {
        String str = "type_id";
        String str2 = "type_name";
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONObject(qb(Vf.h(this.n8 + "api.php/Videonew/nav?csrf=" + URLEncoder.encode(l(zC())), (Map) null), l)).getJSONArray("data");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString(str2);
                String string2 = jSONObject2.getString(str);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(str, string2);
                jSONObject3.put(str2, string);
                JSONObject optJSONObject = jSONObject2.optJSONObject("type_extend");
                if (!z || optJSONObject == null) {
                    str = str;
                    str2 = str2;
                    jSONArray = jSONArray;
                } else {
                    JSONArray jSONArray3 = new JSONArray();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("class", "剧情");
                    linkedHashMap.put("area", "地区");
                    linkedHashMap.put("lang", "语言");
                    linkedHashMap.put("year", "年份");
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String string3 = optJSONObject.getString((String) entry.getKey());
                        if (!TextUtils.isEmpty(string3)) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("key", entry.getKey());
                            jSONObject4.put("name", entry.getValue());
                            jSONArray3.put(jSONObject4);
                            String[] split = string3.split(",");
                            JSONArray jSONArray4 = new JSONArray();
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("n", "全部");
                            jSONObject5.put("v", "");
                            jSONArray4.put(jSONObject5);
                            int length = split.length;
                            int i2 = 0;
                            while (i2 < length) {
                                String str3 = split[i2];
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("n", str3);
                                jSONObject6.put("v", str3);
                                jSONArray4.put(jSONObject6);
                                i2++;
                                jSONArray = jSONArray;
                                split = split;
                            }
                            jSONObject4.put("value", jSONArray4);
                            it = it;
                            str = str;
                            str2 = str2;
                            jSONArray = jSONArray;
                        }
                    }
                    str = str;
                    str2 = str2;
                    jSONArray = jSONArray;
                    if (!jSONObject.has("filters")) {
                        jSONObject.put("filters", new JSONObject());
                    }
                    jSONObject.getJSONObject("filters").put(string2, jSONArray3);
                }
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("class", jSONArray2);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public String homeVideoContent() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(qb(Vf.h(this.n8 + "api.php/Videonew/indexVideo?csrf=" + URLEncoder.encode(l(zC())), n8()), l)).getJSONArray("data");
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i).getJSONArray("vlist");
                for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray3.getJSONObject(i2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", jSONObject2.getString("vod_id"));
                    jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                    jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                    jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                    jSONArray.put(jSONObject3);
                }
            }
            jSONObject.put("list", jSONArray);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public void init(Context context) {
        SP293.super.init(context);
    }

    public boolean isVideoFormat(String str) {
        return SP293.super.isVideoFormat(str);
    }

    public boolean manualVideoCheck() {
        return SP293.super.manualVideoCheck();
    }

    public String playerContent(String str, String str2, List<String> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("parse", "0");
            jSONObject.put("playUrl", "");
            SpiderDebug.log(new JSONObject(this.ug).toString());
            if (this.ug.containsKey(str)) {
                Iterator<String> it = this.ug.get(str).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("User-Agent", this.I4);
                    JSONObject jSONObject2 = new JSONObject(Vf.h(it.next() + str2 + "&appId=" + this.in + "&version=" + this.v, hashMap));
                    String optString = jSONObject2.optString("data");
                    Integer valueOf = Integer.valueOf(jSONObject2.optInt("encryption"));
                    if (Integer.valueOf(jSONObject2.optInt("code")).intValue() == 1 || (!optString.equals("") && valueOf.intValue() >= 0)) {
                        if (valueOf.intValue() == 1) {
                            JSONObject jSONObject3 = new JSONObject(qb(optString, zC));
                            String optString2 = jSONObject3.optString("url");
                            String optString3 = jSONObject3.optString("header");
                            if (!TextUtils.isEmpty(optString2)) {
                                jSONObject.put("url", optString2);
                                if (!TextUtils.isEmpty(optString3) && optString2.contains("weiyun")) {
                                    jSONObject.put("header", optString3);
                                }
                            }
                        } else if (valueOf.intValue() == 0) {
                            String optString4 = new JSONObject(optString).optString("url");
                            if (!TextUtils.isEmpty(optString4)) {
                                jSONObject.put("url", optString4);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public String searchContent(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray optJSONArray = new JSONObject(qb(Vf.h(this.n8 + "api.php/Videonew/search?pg=1&text=" + URLEncoder.encode(str) + "&pg=1&csrf=" + URLEncoder.encode(l(zC())), n8()), l)).optJSONArray("data");
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", jSONObject2.getString("vod_id"));
                jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("list", jSONArray);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public void init(Context context, String str) {
        try {
            this.n8 = new JSONObject(qb(Vf.h("https://alogin.oss-cn-beijing.aliyuncs.com/iphone.json", n8()), l)).optJSONObject("data").optString("url");
            JSONObject jSONObject = new JSONObject(Vf.h("https://agit.ai/ceshi01/TVBox01/raw/branch/main/293.txt", (Map) null));
            this.in = jSONObject.optString("appid");
            this.v = jSONObject.optString("version");
            this.I4 = jSONObject.optJSONObject("headers").optString("User-Agent");
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }
}
