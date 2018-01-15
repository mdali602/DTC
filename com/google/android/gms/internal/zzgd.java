package com.google.android.gms.internal;

import android.content.Context;
import android.support.v4.view.GravityCompat;
import com.google.android.gms.ads.internal.zzw;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@zzme
public final class zzgd {
    public static final zzfz<Long> zzBA = zzfz.zza(1, "gads:video_stream_cache:limit_time_sec", 300);
    public static final zzfz<Long> zzBB = zzfz.zza(1, "gads:video_stream_cache:notify_interval_millis", 1000);
    public static final zzfz<Integer> zzBC = zzfz.zza(1, "gads:video_stream_cache:connect_timeout_millis", (int) AbstractSpiCall.DEFAULT_TIMEOUT);
    public static final zzfz<Boolean> zzBD = zzfz.zza(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    public static final zzfz<String> zzBE = zzfz.zza(1, "gads:video:metric_frame_hash_times", "");
    public static final zzfz<Long> zzBF = zzfz.zza(1, "gads:video:metric_frame_hash_time_leniency", 500);
    public static final zzfz<Boolean> zzBG = zzfz.zza(1, "gads:video:force_watermark", Boolean.valueOf(false));
    public static final zzfz<Long> zzBH = zzfz.zza(1, "gads:video:surface_update_min_spacing_ms", 1000);
    public static final zzfz<Boolean> zzBI = zzfz.zza(1, "gads:video:spinner:enabled", Boolean.valueOf(false));
    public static final zzfz<Integer> zzBJ = zzfz.zza(1, "gads:video:spinner:scale", 4);
    public static final zzfz<Long> zzBK = zzfz.zza(1, "gads:video:spinner:jank_threshold_ms", 50);
    public static final zzfz<Boolean> zzBL = zzfz.zza(1, "gads:memory_bundle:debug_info", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzBM = zzfz.zza(1, "gads:memory_bundle:runtime_info", Boolean.valueOf(true));
    public static final zzfz<String> zzBN = zzfz.zzb(0, "gads:spam_ad_id_decorator:experiment_id");
    public static final zzfz<Boolean> zzBO = zzfz.zza(0, "gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzBP = zzfz.zza(0, "gads:ad_id_app_context:enabled", Boolean.valueOf(false));
    public static final zzfz<Float> zzBQ = zzfz.zza(0, "gads:ad_id_app_context:ping_ratio", 0.0f);
    public static final zzfz<String> zzBR = zzfz.zza(0, "gads:ad_id_app_context:experiment_id");
    public static final zzfz<String> zzBS = zzfz.zzb(0, "gads:looper_for_gms_client:experiment_id");
    public static final zzfz<Boolean> zzBT = zzfz.zza(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzBU = zzfz.zza(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzBV = zzfz.zza(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));
    public static final zzfz<String> zzBW = zzfz.zza(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final zzfz<String> zzBX = zzfz.zza(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final zzfz<String> zzBY = zzfz.zza(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final zzfz<Boolean> zzBZ = zzfz.zza(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final zzfz<String> zzBg = zzfz.zza(0, "gads:sdk_core_experiment_id");
    public static final zzfz<String> zzBh = zzfz.zza(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final zzfz<Boolean> zzBi = zzfz.zza(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final zzfz<String> zzBj = zzfz.zza(0, "gads:request_builder:singleton_webview_experiment_id");
    public static final zzfz<Boolean> zzBk = zzfz.zza(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));
    public static final zzfz<String> zzBl = zzfz.zza(0, "gads:sdk_use_dynamic_module_experiment_id");
    public static final zzfz<Boolean> zzBm = zzfz.zza(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzBn = zzfz.zza(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final zzfz<String> zzBo = zzfz.zza(0, "gads:sdk_crash_report_class_prefix", "com.google.");
    public static final zzfz<Boolean> zzBp = zzfz.zza(0, "gads:block_autoclicks", Boolean.valueOf(false));
    public static final zzfz<String> zzBq = zzfz.zza(0, "gads:block_autoclicks_experiment_id");
    public static final zzfz<String> zzBr = zzfz.zza(0, "gads:spam_app_context:experiment_id");
    public static final zzfz<Boolean> zzBs = zzfz.zza(1, "gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final zzfz<Integer> zzBt = zzfz.zza(1, "gads:http_url_connection_factory:timeout_millis", (int) AbstractSpiCall.DEFAULT_TIMEOUT);
    public static final zzfz<String> zzBu = zzfz.zza(1, "gads:video_exo_player:version", "1");
    public static final zzfz<String> zzBv = zzfz.zza(0, "gads:video_stream_cache:experiment_id");
    public static final zzfz<Integer> zzBw = zzfz.zza(1, "gads:video_stream_cache:limit_count", 5);
    public static final zzfz<Integer> zzBx = zzfz.zza(1, "gads:video_stream_cache:limit_space", (int) GravityCompat.RELATIVE_LAYOUT_DIRECTION);
    public static final zzfz<Integer> zzBy = zzfz.zza(1, "gads:video_stream_exo_allocator:segment_size", 65536);
    public static final zzfz<Integer> zzBz = zzfz.zza(1, "gads:video_stream_exo_cache:buffer_size", (int) GravityCompat.RELATIVE_LAYOUT_DIRECTION);
    public static final zzfz<Boolean> zzCA = zzfz.zza(1, "gads:sai:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzCB = zzfz.zza(1, "gads:sai:banner_ad_enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzCC = zzfz.zza(1, "gads:sai:native_ad_enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzCD = zzfz.zza(1, "gads:sai:interstitial_ad_enabled", Boolean.valueOf(true));
    public static final zzfz<String> zzCE = zzfz.zza(1, "gads:sai:click_ping_schema", "[\"/aclk\",\"/pcs/click\"]");
    public static final zzfz<String> zzCF = zzfz.zza(1, "gads:sai:impression_ping_schema", "[\"/adview\"]");
    public static final zzfz<Boolean> zzCG = zzfz.zza(1, "gads:sai:click_gmsg_enabled", Boolean.valueOf(true));
    public static final zzfz<Integer> zzCH = zzfz.zza(0, "gads:webview_cache_version", 0);
    public static final zzfz<Boolean> zzCI = zzfz.zza(1, "gads:webview_recycle:enabled", Boolean.valueOf(false));
    public static final zzfz<String> zzCJ = zzfz.zza(1, "gads:webview_recycle:experiment_id");
    public static final zzfz<Boolean> zzCK = zzfz.zza(1, "gads:webview:ignore_over_scroll", Boolean.valueOf(true));
    public static final zzfz<String> zzCL = zzfz.zzb(0, "gads:pan:experiment_id");
    public static final zzfz<String> zzCM = zzfz.zza(1, "gads:rewarded:experiment_id");
    public static final zzfz<Boolean> zzCN = zzfz.zza(1, "gads:rewarded:adapter_initialization_enabled", Boolean.valueOf(false));
    public static final zzfz<Long> zzCO = zzfz.zza(1, "gads:rewarded:adapter_timeout_ms", 20000);
    public static final zzfz<Boolean> zzCP = zzfz.zza(1, "gads:app_activity_tracker:enabled", Boolean.valueOf(true));
    public static final zzfz<Long> zzCQ = zzfz.zza(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);
    public static final zzfz<Long> zzCR = zzfz.zza(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));
    public static final zzfz<Boolean> zzCS = zzfz.zza(1, "gads:adid_values_in_adrequest:enabled", Boolean.valueOf(false));
    public static final zzfz<Long> zzCT = zzfz.zza(1, "gads:adid_values_in_adrequest:timeout", 2000);
    public static final zzfz<Boolean> zzCU = zzfz.zza(1, "gads:disable_adid_values_in_ms", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzCV = zzfz.zza(0, "gads:ad_serving:enabled", Boolean.valueOf(true));
    public static final zzfz<String> zzCW = zzfz.zza(1, "gads:ad_manager_enforce_arp_invariant:experiment_id");
    public static final zzfz<Boolean> zzCX = zzfz.zza(1, "gads:ad_manager_enforce_arp_invariant:enabled", Boolean.valueOf(false));
    public static final zzfz<Long> zzCY = zzfz.zza(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);
    public static final zzfz<String> zzCZ = zzfz.zza(1, "gads:banner_ad_pool:schema", "customTargeting");
    public static final zzfz<String> zzCa = zzfz.zza(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final zzfz<Boolean> zzCb = zzfz.zza(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzCc = zzfz.zza(0, "gads:enable_content_fetching", Boolean.valueOf(true));
    public static final zzfz<Integer> zzCd = zzfz.zza(0, "gads:content_length_weight", 1);
    public static final zzfz<Integer> zzCe = zzfz.zza(0, "gads:content_age_weight", 1);
    public static final zzfz<Integer> zzCf = zzfz.zza(0, "gads:min_content_len", 11);
    public static final zzfz<Integer> zzCg = zzfz.zza(0, "gads:fingerprint_number", 10);
    public static final zzfz<Integer> zzCh = zzfz.zza(0, "gads:sleep_sec", 10);
    public static final zzfz<Boolean> zzCi = zzfz.zza(1, "gads:enable_content_url_hash", Boolean.valueOf(true));
    public static final zzfz<Integer> zzCj = zzfz.zza(1, "gads:content_vertical_fingerprint_number", 100);
    public static final zzfz<Boolean> zzCk = zzfz.zza(1, "gads:enable_content_vertical_hash", Boolean.valueOf(true));
    public static final zzfz<Integer> zzCl = zzfz.zza(1, "gads:content_vertical_fingerprint_bits", 23);
    public static final zzfz<Integer> zzCm = zzfz.zza(1, "gads:content_vertical_fingerprint_ngram", 3);
    public static final zzfz<String> zzCn = zzfz.zza(1, "gads:content_fetch_view_tag_id", "googlebot");
    public static final zzfz<String> zzCo = zzfz.zza(1, "gads:content_fetch_exclude_view_tag", "none");
    public static final zzfz<Boolean> zzCp = zzfz.zza(0, "gad:app_index_enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzCq = zzfz.zza(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));
    public static final zzfz<Long> zzCr = zzfz.zza(0, "gads:app_index:timeout_ms", 1000);
    public static final zzfz<String> zzCs = zzfz.zza(0, "gads:app_index:experiment_id");
    public static final zzfz<String> zzCt = zzfz.zza(0, "gads:kitkat_interstitial_workaround:experiment_id");
    public static final zzfz<Boolean> zzCu = zzfz.zza(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzCv = zzfz.zza(0, "gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzCw = zzfz.zza(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final zzfz<String> zzCx = zzfz.zza(0, "gads:interstitial_follow_url:experiment_id");
    public static final zzfz<Boolean> zzCy = zzfz.zza(0, "gads:analytics_enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzCz = zzfz.zza(0, "gads:ad_key_enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDA = zzfz.zza(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDB = zzfz.zza(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDC = zzfz.zza(0, "gads:request_pkg:enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzDD = zzfz.zza(1, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzDE = zzfz.zza(0, "gads:gmsg:video_meta:enabled", Boolean.valueOf(true));
    public static final zzfz<String> zzDF = zzfz.zza(0, "gads:gmsg:video_meta:experiment_id");
    public static final zzfz<Long> zzDG = zzfz.zza(1, "gads:network:cache_prediction_duration_s", 300);
    public static final zzfz<Long> zzDH = zzfz.zza(1, "gads:network:network_prediction_timeout_ms", 2000);
    public static final zzfz<Boolean> zzDI = zzfz.zza(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzDJ = zzfz.zza(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzDK = zzfz.zza(1, "gads:bypass_adrequest_service_for_inlined_mediation", Boolean.valueOf(true));
    public static final zzfz<Long> zzDL = zzfz.zza(0, "gads:ad_loader:timeout_ms", 60000);
    public static final zzfz<Long> zzDM = zzfz.zza(0, "gads:rendering:timeout_ms", 60000);
    public static final zzfz<Boolean> zzDN = zzfz.zza(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
    public static final zzfz<Long> zzDO = zzfz.zza(1, "gads:gestures:task_timeout", 2000);
    public static final zzfz<Boolean> zzDP = zzfz.zza(1, "gads:gestures:encrypt_size_limit:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDQ = zzfz.zza(1, "gads:gestures:adb_query:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDR = zzfz.zza(1, "gads:gestures:adb_click:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDS = zzfz.zza(1, "gads:gestures:visibility:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDT = zzfz.zza(1, "gads:gestures:check_initialization_thread:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDU = zzfz.zza(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzDV = zzfz.zza(0, "gass:client:enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzDW = zzfz.zza(0, "gass:enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzDX = zzfz.zza(0, "gass:enable_int_signal", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzDY = zzfz.zza(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzDZ = zzfz.zza(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));
    public static final zzfz<Integer> zzDa = zzfz.zza(1, "gads:banner_ad_pool:max_queues", 3);
    public static final zzfz<Integer> zzDb = zzfz.zza(1, "gads:banner_ad_pool:max_pools", 3);
    public static final zzfz<Boolean> zzDc = zzfz.zza(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDd = zzfz.zza(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));
    public static final zzfz<String> zzDe = zzfz.zza(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    public static final zzfz<String> zzDf = zzfz.zza(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    public static final zzfz<Integer> zzDg = zzfz.zza(1, "gads:interstitial_ad_pool:max_pools", 3);
    public static final zzfz<Integer> zzDh = zzfz.zza(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    public static final zzfz<Integer> zzDi = zzfz.zza(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    public static final zzfz<String> zzDj = zzfz.zza(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    public static final zzfz<Integer> zzDk = zzfz.zza(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
    public static final zzfz<Integer> zzDl = zzfz.zza(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
    public static final zzfz<Float> zzDm = zzfz.zza(1, "gads:interstitial_ad_pool:discard_threshold", Float.NaN);
    public static final zzfz<Integer> zzDn = zzfz.zza(1, "gads:heap_wastage:bytes", 0);
    public static final zzfz<String> zzDo = zzfz.zza(1, "gads:spherical_video:vertex_shader", "");
    public static final zzfz<String> zzDp = zzfz.zza(1, "gads:spherical_video:fragment_shader", "");
    public static final zzfz<String> zzDq = zzfz.zza(1, "gads:spherical_video:experiment_id");
    public static final zzfz<Boolean> zzDr = zzfz.zza(0, "gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDs = zzfz.zza(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));
    public static final zzfz<String> zzDt = zzfz.zza(1, "gads:include_local_global_rectangles:experiment_id");
    public static final zzfz<Long> zzDu = zzfz.zza(1, "gads:position_watcher:throttle_ms", 200);
    public static final zzfz<Boolean> zzDv = zzfz.zza(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final zzfz<Long> zzDw = zzfz.zza(0, "gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final zzfz<Boolean> zzDx = zzfz.zza(0, "gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDy = zzfz.zza(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzDz = zzfz.zza(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));
    public static final zzfz<Long> zzEA = zzfz.zza(0, "gads:method_tracing:duration_ms", 30000);
    public static final zzfz<Integer> zzEB = zzfz.zza(0, "gads:method_tracing:count", 5);
    public static final zzfz<Integer> zzEC = zzfz.zza(0, "gads:method_tracing:filesize", 134217728);
    public static final zzfz<Boolean> zzED = zzfz.zza(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));
    public static final zzfz<String> zzEE = zzfz.zzb(1, "gads:auto_location_for_coarse_permission:experiment_id");
    public static final zzfz<Long> zzEF = zzfz.zza(1, "gads:auto_location_timeout", 2000);
    public static final zzfz<String> zzEG = zzfz.zzb(1, "gads:auto_location_timeout:experiment_id");
    public static final zzfz<Long> zzEH = zzfz.zza(1, "gads:auto_location_interval", -1);
    public static final zzfz<String> zzEI = zzfz.zzb(1, "gads:auto_location_interval:experiment_id");
    public static final zzfz<Boolean> zzEJ = zzfz.zza(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));
    public static final zzfz<String> zzEK = zzfz.zza(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
    public static final zzfz<Long> zzEL = zzfz.zza(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);
    public static final zzfz<String> zzEM = zzfz.zza(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms:experiment_id");
    public static final zzfz<String> zzEN = zzfz.zza(0, "gads:afs:csa:experiment_id");
    public static final zzfz<String> zzEO = zzfz.zza(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
    public static final zzfz<String> zzEP = zzfz.zza(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
    public static final zzfz<String> zzEQ = zzfz.zza(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
    public static final zzfz<String> zzER = zzfz.zza(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    public static final zzfz<String> zzES = zzfz.zza(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
    public static final zzfz<Long> zzET = zzfz.zza(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);
    public static final zzfz<Boolean> zzEU = zzfz.zza(0, "gads:afs:csa_ad_manager_enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzEV = zzfz.zza(1, "gads:parental_controls:send_from_client", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzEW = zzfz.zza(1, "gads:parental_controls:cache_results", Boolean.valueOf(true));
    public static final zzfz<Long> zzEX = zzfz.zza(1, "gads:parental_controls:timeout", 2000);
    public static final zzfz<String> zzEY = zzfz.zza(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
    public static final zzfz<Long> zzEZ = zzfz.zza(0, "gads:safe_browsing:safety_net:delay_ms", 2000);
    public static final zzfz<Boolean> zzEa = zzfz.zza(0, "gads:support_screen_shot", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzEb = zzfz.zza(0, "gads:use_get_drawing_cache_for_screenshot:enabled", Boolean.valueOf(true));
    public static final zzfz<String> zzEc = zzfz.zza(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");
    public static final zzfz<String> zzEd = zzfz.zza(1, "gads:sdk_core_constants:experiment_id");
    public static final zzfz<String> zzEe = zzfz.zza(1, "gads:sdk_core_constants:caps", "");
    public static final zzfz<Long> zzEf = zzfz.zza(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));
    public static final zzfz<Boolean> zzEg = zzfz.zza(0, "gads:js_flags:mf", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzEh = zzfz.zza(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));
    public static final zzfz<String> zzEi = zzfz.zza(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final zzfz<String> zzEj = zzfz.zza(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final zzfz<String> zzEk = zzfz.zza(1, "gads:native:video_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_video_ads.html");
    public static final zzfz<String> zzEl = zzfz.zza(1, "gads:native:video_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_video_ads.html");
    public static final zzfz<Boolean> zzEm = zzfz.zza(1, "gads:singleton_webview_native", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzEn = zzfz.zza(1, "gads:native_initialize_Webview_request_time", Boolean.valueOf(false));
    public static final zzfz<String> zzEo = zzfz.zza(1, "gads:singleton_webview_native:experiment_id");
    public static final zzfz<Boolean> zzEp = zzfz.zza(1, "gads:enable_untrack_view_native", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzEq = zzfz.zza(1, "gads:ignore_untrack_view_google_native", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzEr = zzfz.zza(1, "gads:reset_listeners_preparead_native", Boolean.valueOf(true));
    public static final zzfz<Integer> zzEs = zzfz.zza(1, "gads:native_video_load_timeout", 10);
    public static final zzfz<String> zzEt = zzfz.zza(1, "gads:native_video_load_timeout:experiment_id");
    public static final zzfz<String> zzEu = zzfz.zza(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    public static final zzfz<Boolean> zzEv = zzfz.zza(1, "gads:clamp_native_video_player_dimensions", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzEw = zzfz.zza(1, "gads:enable_tracking_for_native_ad_views", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzEx = zzfz.zza(1, "gads:use_new_json_for_native_view_tracking", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzEy = zzfz.zza(1, "gads:fluid_ad:use_wrap_content_height", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzEz = zzfz.zza(0, "gads:method_tracing:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzFa = zzfz.zza(0, "gads:safe_browsing:debug", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzFb = zzfz.zza(0, "gads:webview_cookie:enabled", Boolean.valueOf(true));
    public static final zzfz<Integer> zzFc = zzfz.zza(1, "gads:cache:max_concurrent_downloads", 10);
    public static final zzfz<Long> zzFd = zzfz.zza(1, "gads:cache:javascript_timeout_millis", 5000);
    public static final zzfz<Boolean> zzFe = zzfz.zza(1, "gads:cache:bind_on_foreground", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzFf = zzfz.zza(1, "gads:cache:bind_on_init", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzFg = zzfz.zza(1, "gads:cache:bind_on_request", Boolean.valueOf(false));
    public static final zzfz<Long> zzFh = zzfz.zza(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
    public static final zzfz<Boolean> zzFi = zzfz.zza(1, "gads:cache:use_cache_data_source", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzFj = zzfz.zza(1, "gads:chrome_custom_tabs:enabled", Boolean.valueOf(true));
    public static final zzfz<Boolean> zzFk = zzfz.zza(1, "gads:chrome_custom_tabs:disabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzFl = zzfz.zza(1, "gads:drx_in_app_preview:enabled", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzFm = zzfz.zza(1, "gads:drx_debug_signals:enabled", Boolean.valueOf(false));
    public static final zzfz<String> zzFn = zzfz.zza(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
    public static final zzfz<String> zzFo = zzfz.zza(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
    public static final zzfz<String> zzFp = zzfz.zza(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
    public static final zzfz<String> zzFq = zzfz.zza(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
    public static final zzfz<Integer> zzFr = zzfz.zza(1, "gads:drx_debug:timeout_ms", 5000);
    public static final zzfz<Integer> zzFs = zzfz.zza(1, "gad:pixel_dp_comparision_multiplier", 1);
    public static final zzfz<Boolean> zzFt = zzfz.zza(1, "gad:interstitial_for_multi_window", Boolean.valueOf(false));
    public static final zzfz<Boolean> zzFu = zzfz.zza(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.valueOf(false));
    public static final zzfz<Integer> zzFv = zzfz.zza(1, "gad:interstitial:close_button_padding_dip", 0);
    private static byte[] zzFw;

    class C05461 implements Callable<Void> {
        final /* synthetic */ Context zztf;

        C05461(Context context) {
            this.zztf = context;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzbk();
        }

        public Void zzbk() {
            zzw.zzcY().initialize(this.zztf);
            return null;
        }
    }

    public static void initialize(Context context) {
        zzqb.zzb(new C05461(context));
        int intValue = ((Integer) zzDn.get()).intValue();
        if (intValue > 0 && zzFw == null) {
            zzFw = new byte[intValue];
        }
    }

    public static List<String> zzfs() {
        return zzw.zzcX().zzfs();
    }

    public static List<String> zzft() {
        return zzw.zzcX().zzft();
    }
}
