package com.sunilpaulmathew.debloater.utils;

import android.app.Activity;
import android.content.Context;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 * Created by sunilpaulmathew <sunil.kde@gmail.com> on January 26, 2021
 */

public class UAD {

    private static List<String> getGoogle() {
        List<String> mData = new ArrayList<>();
        mData.add("com.android.hotwordenrollment.okgoogle");
        mData.add("com.android.hotwordenrollment.xgoogle");
        mData.add("com.android.partnerbrowsercustomizations.chromeHomepage");
        mData.add("com.android.chrome");
        mData.add("com.chrome.beta");
        mData.add("com.chrome.canary");
        mData.add("com.chrome.dev");
        mData.add("com.google.android.apps.access.wifi.consumer");
        mData.add("com.google.android.apps.adm");
        mData.add("com.google.android.apps.ads.publisher");
        mData.add("com.google.android.apps.adwords");
        mData.add("com.google.android.apps.authenticator2");
        mData.add("com.google.android.apps.blogger");
        mData.add("com.google.android.apps.books");
        mData.add("com.google.android.apps.chromecast.app");
        mData.add("com.google.android.apps.cloudprint");
        mData.add("com.google.android.apps.cultural");
        mData.add("com.google.android.apps.currents");
        mData.add("com.google.android.apps.docs");
        mData.add("com.google.android.apps.docs.editors.docs");
        mData.add("com.google.android.apps.docs.editors.sheets");
        mData.add("com.google.android.apps.docs.editors.slides");
        mData.add("com.google.android.apps.dynamite");
        mData.add("com.google.android.apps.enterprise.cpanel");
        mData.add("com.google.android.apps.enterprise.dmagent");
        mData.add("com.google.android.apps.fireball");
        mData.add("com.google.android.apps.fitness");
        mData.add("com.google.android.apps.freighter");
        mData.add("com.google.android.apps.giant");
        mData.add("com.google.android.apps.googleassistant");
        mData.add("com.google.android.apps.handwriting.ime");
        mData.add("com.google.android.apps.hangoutsdialer");
        mData.add("com.google.android.apps.inbox");
        mData.add("com.google.android.apps.kids.familylink");
        mData.add("com.google.android.apps.kids.familylinkhelper");
        mData.add("com.google.android.apps.m4b");
        mData.add("com.google.android.apps.magazines");
        mData.add("com.google.android.apps.mapslite");
        mData.add("com.google.android.apps.meetings");
        mData.add("com.google.android.apps.messaging");
        mData.add("com.google.android.apps.navlite");
        mData.add("com.google.android.apps.nbu.files");
        mData.add("com.google.android.apps.paidtasks");
        mData.add("com.google.android.apps.pdfviewer");
        mData.add("com.google.android.apps.photos");
        mData.add("com.google.android.apps.photos.scanner");
        mData.add("com.google.android.apps.plus");
        mData.add("com.google.android.apps.podcasts");
        mData.add("com.google.android.apps.restore");
        mData.add("com.google.android.apps.recorder");
        mData.add("com.google.android.apps.setupwizard.searchselector");
        mData.add("com.google.android.apps.santatracker");
        mData.add("com.google.android.apps.subscriptions.red");
        mData.add("com.google.android.apps.tachyon");
        mData.add("com.google.android.apps.tasks");
        mData.add("com.google.android.apps.translate");
        mData.add("com.google.android.apps.travel.onthego");
        mData.add("com.google.android.apps.uploader");
        mData.add("com.google.android.apps.vega");
        mData.add("com.google.android.apps.walletnfcrel");
        mData.add("com.google.android.apps.wallpaper");
        mData.add("com.google.android.apps.wellbeing");
        mData.add("com.google.android.apps.youtube.creator");
        mData.add("com.google.android.apps.youtube.gaming");
        mData.add("com.google.android.apps.youtube.kids");
        mData.add("com.google.android.apps.youtube.music");
        mData.add("com.google.android.apps.youtube.vr");
        mData.add("com.google.android.backup");
        mData.add("com.google.android.backuptransport");
        mData.add("com.google.android.calculator");
        mData.add("com.google.android.calendar");
        mData.add("com.google.android.configupdater");
        mData.add("com.google.android.feedback");
        mData.add("com.google.android.googlequicksearchbox");
        mData.add("com.google.android.instantapps.supervisor");
        mData.add("com.google.android.keep");
        mData.add("com.google.android.markup");
        mData.add("com.google.android.marvin.talkback");
        mData.add("com.google.android.onetimeinitializer");
        mData.add("com.google.android.play.games");
        mData.add("com.google.android.printservice.recommendation");
        mData.add("com.google.android.projection.gearhead");
        mData.add("com.google.android.setupwizard");
        mData.add("com.google.android.setupwizard.a_overlay");
        mData.add("com.google.android.pixel.setupwizard");
        mData.add("com.google.android.soundpicker");
        mData.add("com.google.android.street");
        mData.add("com.google.android.syncadapters.bookmarks");
        mData.add("com.google.android.syncadapters.calendar");
        mData.add("com.google.android.syncadapters.contacts");
        mData.add("com.google.android.talk");
        mData.add("com.google.android.tts");
        mData.add("com.google.android.tv.remote");
        mData.add("com.google.android.videoeditor");
        mData.add("com.google.android.videos");
        mData.add("com.google.android.voicesearch");
        mData.add("com.google.android.vr.home");
        mData.add("com.google.android.vr.inputmethod");
        mData.add("com.google.android.wearable.app");
        mData.add("com.google.android.youtube");
        mData.add("com.google.ar.core");
        mData.add("com.google.ar.lens");
        mData.add("com.google.chromeremotedesktop");
        mData.add("com.google.earth");
        mData.add("com.google.marvin.talkback");
        mData.add("com.google.samples.apps.cardboarddemo");
        mData.add("com.google.tango.measure");
        mData.add("com.google.vr.cyclops");
        mData.add("com.google.vr.expeditions");
        mData.add("com.google.vr.vrcore");
        mData.add("com.google.zxing.client.android");
        return mData;
    }

    public static String getGoogleList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] google = getGoogle().toString().substring(1, getGoogle().toString().length() - 1).split(", ");
        for (String s : google) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableGoogle(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getGoogle().toString().substring(1, getGoogle().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_google");
            }
        }
    }

    private static void disableGoogle() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_google").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_google");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getOnePlus() {
        List<String> mData = new ArrayList<>();
        mData.add("cn.oneplus.photos");
        mData.add("com.example.wifirftest");
        mData.add("com.fingerprints.fingerprintsensortest");
        mData.add("com.oem.autotest");
        mData.add("com.oem.logkitsdservice");
        mData.add("com.oem.nfc");
        mData.add("com.oem.oemlogkit");
        mData.add("com.oneplus.backuprestore");
        mData.add("com.oneplus.brickmode");
        mData.add("com.oneplus.bttestmode");
        mData.add("com.oneplus.card");
        mData.add("com.oneplus.factorymode");
        mData.add("com.oneplus.factorymode.specialtest");
        mData.add("com.oneplus.gamespace");
        mData.add("com.oneplus.note");
        mData.add("com.oneplus.opbugreportlite");
        mData.add("com.oneplus.soundrecorder");
        mData.add("com.tencent.soter.soterserver");
        mData.add("com.wapi.wapicertmanage");
        mData.add("net.oneplus.commonlogtool");
        mData.add("net.oneplus.forums");
        mData.add("com.oneplus.opsports");
        mData.add("net.oneplus.odm");
        mData.add("net.oneplus.odm.provider");
        mData.add("net.oneplus.provider.appcategoryprovider");
        mData.add("net.oneplus.push");
        mData.add("net.oneplus.weather");
        mData.add("net.oneplus.widget");
        return mData;
    }

    public static String getOnePlusList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getOnePlus().toString().substring(1, getOnePlus().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableOnePlus(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getOnePlus().toString().substring(1, getOnePlus().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_oneplus");
            }
        }
    }

    private static void disableOnePlus() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_oneplus").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_oneplus");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getAOSP() {
        List<String> mData = new ArrayList<>();
        mData.add("com.android.bips");
        mData.add("com.android.bluetoothmidiservice");
        mData.add("com.android.bookmarkprovider");
        mData.add("com.android.carrierdefaultapp");
        mData.add("com.android.dreams.basic");
        mData.add("com.android.dreams.phototable");
        mData.add("com.android.dreams.phototable.overlay");
        mData.add("com.android.egg");
        mData.add("com.android.galaxy4");
        mData.add("com.android.htmlviewer");
        mData.add("com.android.magicsmoke");
        mData.add("com.android.managedprovisioning");
        mData.add("com.android.musicvis");
        mData.add("com.android.noisefield");
        mData.add("com.android.phasebeam");
        mData.add("com.android.email.partnerprovider");
        mData.add("com.android.email.partnerprovider.overlay");
        mData.add("com.android.providers.partnerbookmarks");
        mData.add("com.android.runintest.ddrtest");
        mData.add("com.android.simappdialog");
        mData.add("com.android.soundrecorder");
        mData.add("com.android.stk");
        mData.add("com.android.stk2");
        mData.add("com.android.traceur");
        mData.add("com.android.wallpaper.holospiral");
        mData.add("com.android.wallpaper.livepicker");
        mData.add("com.android.wallpaper.livepicker.overlay");
        mData.add("com.android.wallpapercropper");
        mData.add("com.example.android.notepad");
        mData.add("com.android.apps.tag");
        mData.add("com.android.browser");
        mData.add("com.android.browser.provider");
        return mData;
    }

    public static String getAOSPList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getAOSP().toString().substring(1, getAOSP().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableAOSP(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getAOSP().toString().substring(1, getAOSP().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_aosp");
            }
        }
    }

    private static void disableAOSP() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_aosp").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_aosp");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getASUS() {
        List<String> mData = new ArrayList<>();
        mData.add("com.asus.calculator");
        mData.add("com.asus.ia.asusapp");
        mData.add("com.asus.soundrecorder");
        return mData;
    }

    public static String getASUSList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getASUS().toString().substring(1, getASUS().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableASUS(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getASUS().toString().substring(1, getASUS().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_asus");
            }
        }
    }

    private static void disableASUS() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_asus").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_asus");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getCarrier() {
        List<String> mData = new ArrayList<>();
        mData.add("com.mobitv.client.tmobiletvhd");
        mData.add("com.tmobile.pr.adapt");
        mData.add("com.tmobile.pr.mytmobile");
        mData.add("com.tmobile.services.nameid");
        mData.add("com.tmobile.simlock");
        mData.add("com.tmobile.vvm.application");
        mData.add("com.whitepages.nameid.tmobile");
        mData.add("us.com.dt.iq.appsource.tmobile");
        mData.add("com.asurion.android.verizon.vms");
        mData.add("com.customermobile.preload.vzw");
        mData.add("com.LogiaGroup.LogiaDeck");
        mData.add("com.motricity.verizon.ssodownloadable");
        mData.add("com.securityandprivacy.android.verizon.vms");
        mData.add("com.telecomsys.directedsms.android.SCg");
        mData.add("com.vcast.mediamanager");
        mData.add("com.verizon.llkagent");
        mData.add("com.verizon.loginengine.unbranded");
        mData.add("com.verizon.messaging.vzmsgs");
        mData.add("com.verizon.mips.services");
        mData.add("com.verizon.obdm");
        mData.add("com.verizon.obdm_permissions");
        mData.add("com.verizon.permissions.appdirectedsms");
        mData.add("com.verizon.permissions.vzwappapn");
        mData.add("com.verizon.vzwavs");
        mData.add("com.verizontelematics.verizonhum");
        mData.add("com.vznavigator.Generic");
        mData.add("com.vzw.apnlib");
        mData.add("com.vzw.apnservice");
        mData.add("com.vzw.ecid");
        mData.add("com.vzw.hss.myverizon");
        mData.add("com.vzw.hss.widgets.infozone.large");
        mData.add("com.vzw.qualitydatalog");
        mData.add("com.motorola.mot5gmod");
        mData.add("com.motorola.vzw.mot5gmod");
        mData.add("com.motorola.vzw.pco.extensions.pcoreceiver");
        mData.add("com.motorola.vzw.phone.extensions");
        mData.add("com.motorola.vzw.cloudsetup");
        mData.add("com.motorola.ltebroadcastservices_vzw");
        mData.add("com.motorola.vzw.loader");
        mData.add("com.motorola.omadm.vzw");
        mData.add("com.motorola.vzw.provider");
        mData.add("com.motorola.visualvoicemail");
        mData.add("com.android.sprint.hiddenmenuapp");
        mData.add("com.asurion.home.sprint.vpl");
        mData.add("com.asurion.android.mobilerecovery.sprint.vpl");
        mData.add("com.asurion.android.mobilerecovery.sprint");
        mData.add("com.asurion.home.sprint");
        mData.add("com.hyperlync.Sprint.Backup");
        mData.add("com.hyperlync.Sprint.CloudBinder");
        mData.add("com.locationlabs.finder.sprint.vpl");
        mData.add("com.locationlabs.finder.sprint");
        mData.add("com.mobitv.client.sprinttvng");
        mData.add("com.mobolize.sprint.securewifi");
        mData.add("com.motorola.omadm.sprint");
        mData.add("com.sprint.android.musicplus2033");
        mData.add("com.sprint.android.musicplus2033.vpl");
        mData.add("com.sprint.ecid");
        mData.add("com.sprint.care");
        mData.add("com.sprint.ce.updater");
        mData.add("com.sprint.fng");
        mData.add("com.sprint.international.message");
        mData.add("com.sprint.psdg.sw");
        mData.add("com.sprint.ms.cdm");
        mData.add("com.sprint.ms.cnap");
        mData.add("com.sprint.safefound");
        mData.add("com.sprint.safefound.vpl");
        mData.add("com.sprint.topup");
        mData.add("com.sprint.w.installer");
        mData.add("com.sprint.w.v8");
        mData.add("com.aetherpal.attdh.se");
        mData.add("com.aetherpal.attdh.zte");
        mData.add("net.aetherpal.device");
        mData.add("com.asurion.android.mobilerecovery.att");
        mData.add("com.asurion.android.protech.att");
        mData.add("com.att.android.attsmartwifi");
        mData.add("com.att.callprotect");
        mData.add("com.att.dh");
        mData.add("com.att.dtv.shaderemote");
        mData.add("com.att.iqi");
        mData.add("com.att.mobiletransfer");
        mData.add("com.att.myWireless");
        mData.add("com.att.mobilesecurity");
        mData.add("com.att.mobile.android.vvm");
        mData.add("com.att.tv");
        mData.add("com.att.tv.watchtv");
        mData.add("com.dti.att");
        mData.add("com.locationlabs.cni.att");
        mData.add("com.matchboxmobile.wisp");
        mData.add("com.motorola.att.phone.extensions");
        mData.add("com.motorola.attvowifi");
        mData.add("com.wavemarket.waplauncher");
        mData.add("com.samsung.attvvm");
        mData.add("com.synchronoss.dcs.att.r2g");
        mData.add("com.orange.aura.oobe");
        mData.add("com.orange.mail.fr");
        mData.add("com.orange.miorange");
        mData.add("com.orange.mylivebox.fr");
        mData.add("com.orange.mysosh");
        mData.add("com.orange.orangeetmoi");
        mData.add("com.orange.owtv");
        mData.add("com.orange.tdd");
        mData.add("com.orange.update");
        mData.add("com.orange.update.OrangeUpdateApplication");
        mData.add("com.orange.vvm");
        mData.add("com.orange.wifiorange");
        mData.add("fr.orange.cineday");
        mData.add("com.sfr.android.moncompte");
        mData.add("com.sfr.android.sfrcloud");
        mData.add("com.sfr.android.sfrmail");
        mData.add("com.sfr.android.sfrplay");
        mData.add("com.sfr.android.vvm");
        mData.add("de.telekom.tsc");
        return mData;
    }

    public static String getCarrierList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getCarrier().toString().substring(1, getCarrier().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableCarrier(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getCarrier().toString().substring(1, getCarrier().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_carrier");
            }
        }
    }

    private static void disableCarrier() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_carrier").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_carrier");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getHuawei() {
        List<String> mData = new ArrayList<>();
        mData.add("com.android.keyguard");
        mData.add("com.android.hwmirror");
        mData.add("com.baidu.input_huawei");
        mData.add("com.hicloud.android.clone");
        mData.add("com.huawei.android.chr");
        mData.add("com.huawei.android.FloatTasks");
        mData.add("com.huawei.android.hsf");
        mData.add("com.huawei.android.hwpay");
        mData.add("com.huawei.android.instantonline");
        mData.add("com.huawei.android.instantshare");
        mData.add("com.huawei.android.karaoke");
        mData.add("com.huawei.android.mirrorshare");
        mData.add("com.huawei.android.pushagent");
        mData.add("com.huawei.android.remotecontroller");
        mData.add("com.huawei.android.tips");
        mData.add("com.huawei.android.totemweather");
        mData.add("com.huawei.android.totemweatherapp");
        mData.add("com.huawei.android.totemweatherwidget");
        mData.add("com.huawei.android.wfdft");
        mData.add("com.huawei.android.wfdirect");
        mData.add("com.huawei.appmarket");
        mData.add("com.huawei.arengine.service");
        mData.add("com.huawei.bd");
        mData.add("com.huawei.bluetooth");
        mData.add("com.huawei.browser");
        mData.add("com.huawei.browserhomepage");
        mData.add("com.huawei.compass");
        mData.add("com.huawei.contactscamcard");
        mData.add("com.huawei.contacts.sync");
        mData.add("com.huawei.desktop.explorer");
        mData.add("com.huawei.email");
        mData.add("com.huawei.fido.uafclient");
        mData.add("com.huawei.game.kitserver");
        mData.add("com.huawei.gameassistant");
        mData.add("com.huawei.geofence");
        mData.add("com.huawei.hwsearch");
        mData.add("com.huawei.hwid");
        mData.add("com.huawei.hiaction");
        mData.add("com.huawei.hiai");
        mData.add("com.huawei.hiassistantoversea");
        mData.add("com.huawei.hicard");
        mData.add("com.huawei.hicloud");
        mData.add("com.huawei.hifolder");
        mData.add("com.huawei.himovie.overseas");
        mData.add("com.huawei.hitouch");
        mData.add("com.huawei.hwasm");
        mData.add("com.huawei.hwblockchain");
        mData.add("com.huawei.hwdetectrepair");
        mData.add("com.huawei.hwstartupguide");
        mData.add("com.huawei.hwvoipservice");
        mData.add("com.huawei.iaware");
        mData.add("com.huawei.ihealth");
        mData.add("com.huawei.intelligent");
        mData.add("com.huawei.health");
        mData.add("com.huawei.livewallpaper.paradise");
        mData.add("com.huawei.livewallpaper.artflower");
        mData.add("com.huawei.livewallpaper.flowersbloom");
        mData.add("com.huawei.livewallpaper.mountaincloud");
        mData.add("com.huawei.livewallpaper.naturalgarden");
        mData.add("com.huawei.livewallpaper.ripplestone");
        mData.add("com.huawei.magazine");
        mData.add("com.huawei.mirror");
        mData.add("com.huawei.mirrorlink");
        mData.add("com.huawei.music");
        mData.add("com.huawei.parentcontrol");
        mData.add("com.huawei.pcassistant");
        mData.add("com.huawei.phoneservice");
        mData.add("com.huawei.scanner");
        mData.add("com.huawei.stylus.floatmenu");
        mData.add("com.huawei.synergy");
        mData.add("com.huawei.tips");
        mData.add("com.huawei.trustagent");
        mData.add("com.huawei.vassistant");
        mData.add("com.huawei.videoeditor");
        mData.add("com.huawei.vassistant");
        mData.add("com.huawei.wallet");
        mData.add("com.huawei.watch.sync");
        mData.add("com.iflytek.speechsuite");
        mData.add("com.nuance.swype.emui");
        return mData;
    }

    public static String getHuaweiList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getHuawei().toString().substring(1, getHuawei().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableHuawei(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getHuawei().toString().substring(1, getHuawei().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_huawei");
            }
        }
    }

    private static void disableHuawei() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_huawei").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_huawei");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getLG() {
        List<String> mData = new ArrayList<>();
        mData.add("com.android.LGSetupWizard");
        mData.add("com.lge.appbox.client");
        mData.add("com.lge.bnr");
        mData.add("com.lge.cic.eden.service");
        mData.add("com.lge.cloudhub");
        mData.add("com.lge.drmservice");
        mData.add("com.lge.easyhome");
        mData.add("com.lge.eltest");
        mData.add("com.lge.email");
        mData.add("com.lge.eula");
        mData.add("com.lge.eulaprovider");
        mData.add("com.lge.fmradio");
        mData.add("com.lge.friendsmanager");
        mData.add("com.lge.gallery.collagewallpaper");
        mData.add("com.lge.gallery.vr.wallpaper");
        mData.add("com.lge.gcuv");
        mData.add("com.lge.gestureanswering");
        mData.add("com.lge.gnss.airtest");
        mData.add("com.lge.gnsslogcat");
        mData.add("com.lge.gnsspostest");
        mData.add("com.lge.gnsstest");
        mData.add("com.lge.hifirecorder");
        mData.add("com.lge.hotspotlauncher");
        mData.add("com.lge.ia.task.incalagent");
        mData.add("com.lge.ia.task.smartcare");
        mData.add("com.lge.ia.task.smartsetting");
        mData.add("com.lge.iftttmanager");
        mData.add("com.lge.ime.solution.handwriting");
        mData.add("com.lge.ime.solution.text");
        mData.add("com.lge.launcher2.theme.optimus");
        mData.add("com.lge.leccp");
        mData.add("com.lge.lgaccount");
        mData.add("com.lge.lgdrm.permission");
        mData.add("com.lge.lginstallservies");
        mData.add("com.lge.lgmapui");
        mData.add("com.lge.lgsetupview");
        mData.add("com.lge.LGSetupView");
        mData.add("com.lge.lgworld");
        mData.add("com.lge.lifetracker");
        mData.add("com.lge.mirrorlink");
        mData.add("com.lge.mlt");
        mData.add("com.lge.mtalk.sf");
        mData.add("com.lge.musicshare");
        mData.add("com.lge.myplace");
        mData.add("com.lge.myplace.engine");
        mData.add("com.lge.phonemanagement");
        mData.add("com.lge.privacylock");
        mData.add("com.lge.qhelp");
        mData.add("com.lge.qhelp.application");
        mData.add("com.lge.qmemoplus");
        mData.add("com.lge.remote.lgairdrive");
        mData.add("com.lge.remote.setting");
        mData.add("com.lge.sizechangable.musicwidget.widget");
        mData.add("com.lge.sizechangable.weather");
        mData.add("com.lge.sizechangable.weather.platform");
        mData.add("com.lge.sizechangable.weather.theme.optimus");
        mData.add("com.lge.smartdoctor.webview");
        mData.add("com.lge.smartshare");
        mData.add("com.lge.smartshare.provider");
        mData.add("com.lge.smartsharepush");
        mData.add("com.lge.snappage");
        mData.add("com.lge.springcleaning");
        mData.add("com.lge.sync");
        mData.add("com.lge.video.vr.wallpaper");
        mData.add("com.lge.videoplayer");
        mData.add("com.lge.videostudio");
        mData.add("com.lge.voicecare");
        mData.add("com.lge.vrplayer");
        mData.add("com.lge.wernicke");
        mData.add("com.lge.wernicke.nlp");
        mData.add("com.lge.wfd.spmirroring.source");
        mData.add("com.lge.wfds.service.v3");
        mData.add("com.lge.wifi.p2p");
        mData.add("com.lge.wifihotspotwidget");
        mData.add("com.lge.appwidget.dualsimstatus");
        mData.add("com.lge.hiddenpersomenu");
        mData.add("com.lge.hiddenmenu");
        mData.add("com.lge.operator.hiddenmenu");
        mData.add("com.lge.servicemenu");
        mData.add("com.rsupport.rs.activity.lge.allinone");
        mData.add("com.lge.laot");
        mData.add("com.lge.lgfmservice");
        mData.add("com.lge.bnr.launcher");
        mData.add("com.lge.homeselector");
        mData.add("com.lge.music");
        mData.add("com.lge.floatingbar");
        return mData;
    }

    public static String getLGList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getLG().toString().substring(1, getLG().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableLG(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getLG().toString().substring(1, getLG().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_lg");
            }
        }
    }

    private static void disableLG() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_lg").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_lg");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getSamsung() {
        List<String> mData = new ArrayList<>();
        mData.add("android.autoinstalls.config.samsung");
        mData.add("com.aura.oobe.samsung");
        mData.add("com.cnn.mobile.android.phone.edgepanel");
        mData.add("com.enhance.gameservice");
        mData.add("com.hiya.star");
        mData.add("com.knox.vpn.proxyhandler");
        mData.add("com.mygalaxy");
        mData.add("com.mobeam.barcodeService");
        mData.add("com.samsung.app.jansky");
        mData.add("com.samsung.aasaservice");
        mData.add("com.samsung.accessory");
        mData.add("com.samsung.accessory.beansmgr");
        mData.add("com.samsung.accessory.safiletransfer");
        mData.add("com.samsung.android.aircommandmanager");
        mData.add("com.samsung.android.airtel.stubapp");
        mData.add("com.samsung.android.allshare.service.mediashare");
        mData.add("com.samsung.android.app.accesscontrol");
        mData.add("com.samsung.android.app.advsounddetector");
        mData.add("com.samsung.android.app.appsedge");
        mData.add("com.samsung.android.app.assistantmenu");
        mData.add("com.samsung.android.app.camera.sticker.facear.preload");
        mData.add("com.samsung.android.app.camera.sticker.facearframe.preload");
        mData.add("com.samsung.android.app.camera.sticker.facearavatar.preload");
        mData.add("com.samsung.android.app.clipboardedge");
        mData.add("com.samsung.android.app.cocktailbarservice");
        mData.add("com.samsung.android.app.color");
        mData.add("com.samsung.android.app.dressroom");
        mData.add("com.samsung.android.app.episodes");
        mData.add("com.samsung.android.app.filterinstaller");
        mData.add("com.samsung.app.highlightplayer");
        mData.add("com.samsung.android.app.interactivepanoramaviewer");
        mData.add("com.samsung.android.app.ledbackcover");
        mData.add("com.samsung.android.app.ledcoverdream");
        mData.add("com.samsung.android.app.omcagent");
        mData.add("com.samsung.android.app.memo");
        mData.add("com.samsung.android.app.mhswrappertmo");
        mData.add("com.samsung.android.app.mirrorlink");
        mData.add("com.samsung.android.app.news");
        mData.add("com.samsung.android.app.notes");
        mData.add("com.samsung.android.app.panel.naver.v");
        mData.add("com.samsung.android.app.pinboard");
        mData.add("com.samsung.android.app.reminder");
        mData.add("com.samsung.android.app.routines");
        mData.add("com.samsung.android.app.sbrowseredge");
        mData.add("com.samsung.android.app.settings.bixby");
        mData.add("com.samsung.android.app.simplesharing");
        mData.add("com.samsung.android.app.social");
        mData.add("com.samsung.android.app.spage");
        mData.add("com.samsung.android.app.storyalbumwidget");
        mData.add("com.samsung.android.app.talkback");
        mData.add("com.samsung.android.app.taskedge");
        mData.add("com.samsung.android.app.tips");
        mData.add("com.samsung.android.app.vrsetupwizards");
        mData.add("com.samsung.android.app.vrsetupwizardstub");
        mData.add("com.samsung.android.app.watchmanager");
        mData.add("com.samsung.android.app.watchmanagerstub");
        mData.add("com.samsung.android.app.withtv");
        mData.add("com.samsung.android.ardrawing");
        mData.add("com.samsung.android.arzone");
        mData.add("com.samsung.android.aremoji");
        mData.add("com.samsung.android.aremojieditor");
        mData.add("com.samsung.android.asksmanager");
        mData.add("com.samsung.android.authfw");
        mData.add("com.samsung.android.bbc.bbcagent");
        mData.add("com.samsung.android.bbc.fileprovider");
        mData.add("com.samsung.android.beaconmanager");
        mData.add("com.samsung.android.bixby.agent");
        mData.add("com.samsung.android.bixby.agent.dummy");
        mData.add("com.samsung.android.bixby.es.globalaction");
        mData.add("com.samsung.android.bixby.plmsync");
        mData.add("com.samsung.android.bixby.service");
        mData.add("com.samsung.android.bixby.voiceinput");
        mData.add("com.samsung.android.bixby.wakeup");
        mData.add("com.samsung.android.bixbyvision.framework");
        mData.add("com.samsung.android.calendar");
        mData.add("com.samsung.android.coreapps");
        mData.add("com.samsung.android.da.daagent");
        mData.add("com.samsung.android.dlp.service");
        mData.add("com.samsung.android.dqagent");
        mData.add("com.samsung.android.drivelink.stub");
        mData.add("com.samsung.android.dynamiclock");
        mData.add("com.samsung.android.gearoplugin");
        mData.add("com.samsung.android.easysetup");
        mData.add("com.samsung.android.email.provider");
        mData.add("com.samsung.android.emojiupdater");
        mData.add("com.samsung.android.fast");
        mData.add("com.samsung.android.fmm");
        mData.add("com.samsung.android.game.gamehome");
        mData.add("com.samsung.android.game.gametools");
        mData.add("com.samsung.android.game.gos");
        mData.add("com.samsung.android.gametuner.thin");
        mData.add("com.samsung.android.hmt.vrshell");
        mData.add("com.samsung.android.hmt.vrsvc");
        mData.add("com.samsung.android.intelligenceservice2");
        mData.add("com.samsung.android.keyguardwallpaperupdator");
        mData.add("com.samsung.android.kidsinstaller");
        mData.add("com.samsung.android.knox.attestation");
        mData.add("com.samsung.android.knox.containeragent");
        mData.add("com.samsung.android.knox.containercore");
        mData.add("com.samsung.android.knox.containerdesktop");
        mData.add("com.samsung.android.livestickers");
        mData.add("com.samsung.android.location");
        mData.add("com.samsung.android.mateagent");
        mData.add("com.samsung.android.mdecservice");
        mData.add("com.samsung.android.mdm");
        mData.add("com.samsung.android.mdx");
        mData.add("com.samsung.android.mobileservice");
        mData.add("com.samsung.android.net.wifi.wifiguider");
        mData.add("com.samsung.android.networkdiagnostic");
        mData.add("com.samsung.android.oneconnect");
        mData.add("com.samsung.android.personalpage.service");
        mData.add("com.samsung.android.providers.context");
        mData.add("com.samsung.android.rubin.app");
        mData.add("com.samsung.android.samsungpass");
        mData.add("com.samsung.android.samsungpassautofill");
        mData.add("com.samsung.android.samsungpositioning");
        mData.add("com.samsung.android.sdk.handwriting");
        mData.add("com.samsung.android.sdk.professionalaudio.utility.jammonitor");
        mData.add("com.samsung.android.sdk.professionalaudio.app.audioconnectionservice");
        mData.add("com.samsung.android.shortcutbackupservice");
        mData.add("com.samsung.android.slinkcloud");
        mData.add("com.samsung.android.smartface");
        mData.add("com.samsung.android.smartswitchassistant");
        mData.add("com.samsung.android.stickerplugin");
        mData.add("com.samsung.android.sm");
        mData.add("com.samsung.android.scloud");
        mData.add("com.samsung.android.scloud.auth");
        mData.add("com.samsung.android.scloud.sync");
        mData.add("com.samsung.android.sconnect");
        mData.add("com.samsung.android.securitylogagent");
        mData.add("com.samsung.android.service.livedrawing");
        mData.add("com.samsung.android.mfi");
        mData.add("com.samsung.android.service.peoplestripe");
        mData.add("com.samsung.android.service.travel");
        mData.add("com.samsung.android.smartcallprovider");
        mData.add("com.samsung.android.smartmirroring");
        mData.add("com.samsung.android.spayfw");
        mData.add("com.samsung.android.spay");
        mData.add("com.samsung.android.spaymini");
        mData.add("com.samsung.android.spdfnote");
        mData.add("com.samsung.android.stickercenter");
        mData.add("com.samsung.android.ststub");
        mData.add("com.samsung.android.svcagent");
        mData.add("com.samsung.android.svoice");
        mData.add("com.samsung.android.svoiceime");
        mData.add("com.samsung.android.themecenter");
        mData.add("com.samsung.android.themestore");
        mData.add("com.samsung.android.tripwidget");
        mData.add("com.samsung.android.unifiedprofile");
        mData.add("com.samsung.android.universalswitch");
        mData.add("com.samsung.android.visionarapps");
        mData.add("com.samsung.android.visioncloudagent");
        mData.add("com.samsung.android.visionintelligence");
        mData.add("com.samsung.android.voc");
        mData.add("com.samsung.android.voicewakeup");
        mData.add("com.samsung.android.weather");
        mData.add("com.samsung.android.wellbeing");
        mData.add("com.samsung.android.widgetapp.yahooedge.finance");
        mData.add("com.samsung.android.widgetapp.yahooedge.sport");
        mData.add("com.samsung.crane");
        mData.add("com.samsung.daydream.customization");
        mData.add("com.samsung.desktopsystemui");
        mData.add("com.samsung.ecomm");
        mData.add("com.samsung.enhanceservice");
        mData.add("com.samsung.faceservice");
        mData.add("com.samsung.fresco.logging");
        mData.add("com.samsung.groupcast");
        mData.add("com.samsung.helphub");
        mData.add("com.samsung.hiddennetworksetting");
        mData.add("com.samsung.ipservice");
        mData.add("com.samsung.klmsagent");
        mData.add("com.samsung.android.knox.analytics.uploader");
        mData.add("com.samsung.knox.knoxtrustagent");
        mData.add("com.samsung.knox.kss");
        mData.add("com.samsung.knox.securefolder");
        mData.add("com.samsung.knox.securefolder.setuppage");
        mData.add("com.samsung.logwriter");
        mData.add("com.samsung.mdl.radio");
        mData.add("com.samsung.mlp");
        mData.add("com.samsung.mdl.radio.radiostub");
        mData.add("com.samsung.oh");
        mData.add("com.samsung.rcs");
        mData.add("com.samsung.safetyinformation");
        mData.add("com.samsung.SMt");
        mData.add("com.samsung.storyservice");
        mData.add("com.samsung.svoice.sync");
        mData.add("com.samsung.systemui.bixby");
        mData.add("com.samsung.systemui.bixby2");
        mData.add("com.samsung.tmovvm");
        mData.add("com.samsung.ucs.agent.boot");
        mData.add("com.samsung.ucs.agent.ese");
        mData.add("com.samsung.visionprovider");
        mData.add("com.samsung.voiceserviceplatform");
        mData.add("com.samsung.vvm");
        mData.add("com.samsung.vvm.se");
        mData.add("com.sec.allsharecastplayer");
        mData.add("com.sec.android.app.apex");
        mData.add("com.sec.android.app.applinker");
        mData.add("com.sec.android.app.billing");
        mData.add("com.sec.android.app.bluetoothtest");
        mData.add("com.sec.android.app.chromecustomizations");
        mData.add("com.sec.android.app.DataCreate");
        mData.add("com.sec.android.app.desktoplauncher");
        mData.add("com.sec.android.diagmonagent");
        mData.add("com.sec.android.app.dictionary");
        mData.add("com.sec.android.app.easysetup");
        mData.add("com.sec.android.app.factorykeystring");
        mData.add("com.sec.android.app.gamehub");
        mData.add("com.sec.android.app.hwmoduletest");
        mData.add("com.sec.android.app.magnifier");
        mData.add("com.sec.android.app.mt");
        mData.add("com.sec.android.app.ocr");
        mData.add("com.sec.android.app.parser");
        mData.add("com.sec.android.app.quicktool");
        mData.add("com.sec.android.app.ringtoneBr");
        mData.add("com.sec.android.app.samsungapps");
        mData.add("com.sec.android.app.safetyassurance");
        mData.add("com.sec.android.app.sbrowser");
        mData.add("com.sec.android.app.scloud");
        mData.add("com.sec.android.app.SecSetupWizard");
        mData.add("com.sec.android.app.servicemodeapp");
        mData.add("com.sec.android.app.setupwizardlegalprovider");
        mData.add("com.sec.android.app.shealth");
        mData.add("com.sec.android.app.sns3");
        mData.add("com.sec.android.app.setupwizard");
        mData.add("com.sec.android.app.suwscriptplayer");
        mData.add("com.sec.android.app.sysscope");
        mData.add("com.sec.android.app.translator");
        mData.add("com.sec.android.app.voicenote");
        mData.add("com.sec.android.app.withtv");
        mData.add("com.sec.android.app.wlantest");
        mData.add("com.sec.android.AutoPreconfig");
        mData.add("com.sec.android.cover.ledcover");
        mData.add("com.sec.android.daemonapp");
        mData.add("com.sec.android.desktopcommunity");
        mData.add("com.sec.android.app.dexonpc");
        mData.add("com.sec.android.desktopmode.uiservice");
        mData.add("com.sec.android.easyMover");
        mData.add("com.sec.android.easyMover.Agent");
        mData.add("com.sec.android.easyonehand");
        mData.add("com.sec.android.fido.uaf.asm");
        mData.add("com.sec.android.fido.uaf.client");
        mData.add("com.sec.android.game.gamehome");
        mData.add("com.sec.android.mimage.avatarstickers");
        mData.add("com.sec.android.mimage.gear360editor");
        mData.add("com.sec.android.preloadinstaller");
        mData.add("com.sec.android.providers.security");
        mData.add("com.sec.android.provider.snote");
        mData.add("com.sec.android.RilServiceModeApp");
        mData.add("com.sec.android.service.health");
        mData.add("com.sec.android.sidesync30");
        mData.add("com.sec.android.splitsound");
        mData.add("com.sec.android.uibcvirtualsoftkey");
        mData.add("com.sec.android.widgetapp.diotek.smemo");
        mData.add("com.sec.android.widgetapp.easymodecontactswidget");
        mData.add("com.sec.android.widgetapp.samsungapps");
        mData.add("com.sec.android.widgetapp.webmanual");
        mData.add("com.sec.app.RilErrorNotifier");
        mData.add("com.sec.bcservice");
        mData.add("com.sec.downloadablekeystore");
        mData.add("com.sec.enterprise.knox.attestation");
        mData.add("com.sec.enterprise.knox.cloudmdm.smdms");
        mData.add("com.sec.enterprise.knox.shareddevice.keyguard");
        mData.add("com.sec.enterprise.mdm.services.simpin");
        mData.add("com.sec.enterprise.mdm.vpn");
        mData.add("com.sec.epdgtestapp");
        mData.add("com.sec.everglades");
        mData.add("com.sec.everglades.update");
        mData.add("com.sec.factory");
        mData.add("com.sec.factory.camera");
        mData.add("com.sec.factory.iris.usercamera");
        mData.add("com.sec.hiddenmenu");
        mData.add("com.sec.imslogger");
        mData.add("com.sec.kidsplat.installer");
        mData.add("com.sec.knox.bluetooth");
        mData.add("com.sec.knox.bridge");
        mData.add("com.sec.knox.containeragent2");
        mData.add("com.sec.knox.foldercontainer");
        mData.add("com.sec.knox.knoxsetupwizardclient");
        mData.add("com.sec.knox.packageverifier");
        mData.add("com.sec.knox.shortcutsms");
        mData.add("com.sec.knox.switcher");
        mData.add("com.sec.knox.switchknoxi");
        mData.add("com.sec.knox.switchknoxIi");
        mData.add("com.sec.location.nsflp2");
        mData.add("com.sec.mldapchecker");
        mData.add("com.sec.modem.settings");
        mData.add("com.sec.phone");
        mData.add("com.sec.readershub");
        mData.add("com.sec.smartcard.manager");
        mData.add("com.sec.spp.push");
        mData.add("com.sec.sve");
        mData.add("com.sec.yosemite.phone");
        mData.add("com.skms.android.agent");
        mData.add("com.sec.usbsettings");
        mData.add("com.monotype.android.font.samsungone");
        mData.add("com.vlingo.midas");
        mData.add("com.wsomacp");
        mData.add("com.wssnps");
        mData.add("tv.peel.samsung.app");
        return mData;
    }

    public static String getSamsungList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getSamsung().toString().substring(1, getSamsung().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableSamsung(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getSamsung().toString().substring(1, getSamsung().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_samsung");
            }
        }
    }

    private static void disableSamsung() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_samsung").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_samsung");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getMotorola() {
        List<String> mData = new ArrayList<>();
        mData.add("android.autoinstalls.config.motorola.layout");
        mData.add("com.lenovo.lsf.user");
        mData.add("com.lmi.motorola.rescuesecurity");
        mData.add("com.motorola.android.fmradio");
        mData.add("com.motorola.android.jvtcmd");
        mData.add("com.motorola.android.nativedropboxagent");
        mData.add("com.motorola.android.providers.chromehomepage");
        mData.add("com.motorola.android.provisioning");
        mData.add("com.motorola.android.settings.diag_mdlog");
        mData.add("com.motorola.android.settings.modemdebug");
        mData.add("com.motorola.appdirectedsmsproxy");
        mData.add("com.motorola.bach.modemstats");
        mData.add("com.motorola.brapps");
        mData.add("com.motorola.bug2go");
        mData.add("com.motorola.ccc.devicemanagement");
        mData.add("com.motorola.ccc.mainplm");
        mData.add("com.motorola.ccc.notification");
        mData.add("com.motorola.contacts.preloadcontacts");
        mData.add("com.motorola.demo");
        mData.add("com.motorola.demo.env");
        mData.add("com.motorola.easyprefix");
        mData.add("com.motorola.email");
        mData.add("com.motorola.fmplayer");
        mData.add("com.motorola.frameworks.singlehand");
        mData.add("com.motorola.genie");
        mData.add("com.motorola.gesture");
        mData.add("com.motorola.help");
        mData.add("com.motorola.lifetimedata");
        mData.add("com.motorola.hiddenmenuapp");
        mData.add("com.motorola.moto");
        mData.add("com.motorola.motocare");
        mData.add("com.motorola.motocare.internal");
        mData.add("com.motorola.motocit");
        mData.add("com.motorola.motodisplay");
        mData.add("com.motorola.paks");
        mData.add("com.motorola.programmenu");
        mData.add("com.motorola.ptt.prip");
        mData.add("com.motorola.setup");
        mData.add("com.motorola.slpc_sys");
        mData.add("com.motorola.timeweatherwidget");
        return mData;
    }

    public static String getMotorolaList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getMotorola().toString().substring(1, getMotorola().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableMotorola(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getMotorola().toString().substring(1, getMotorola().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_motorola");
            }
        }
    }

    private static void disableMotorola() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_motorola").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_motorola");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getNokia() {
        List<String> mData = new ArrayList<>();
        mData.add("com.android.partnerbrowsercustomizations.btl.s600ww.overlay");
        mData.add("com.android.providers.calendar.overlay.base.s600ww");
        mData.add("com.android.providers.settings.btl.s600ww.overlay");
        mData.add("com.android.providers.settings.overlay.base.s600ww");
        mData.add("com.android.retaildemo.overlay.base.s600ww");
        mData.add("com.data.overlay.base.s600ww");
        mData.add("com.evenwell.apnwidget.overlay.base.s600ww");
        mData.add("com.evenwell.AprUploadService");
        mData.add("com.evenwell.AprUploadService.data.overlay.base");
        mData.add("com.evenwell.AprUploadService.data.overlay.base.s600ww");
        mData.add("com.evenwell.AprUploadService.data.overlay.base.s600id");
        mData.add("com.evenwell.autoregistration");
        mData.add("com.evenwell.autoregistration.overlay.base");
        mData.add("com.evenwell.autoregistration.overlay.base.s600id");
        mData.add("com.evenwell.autoregistration.overlay.base.s600ww");
        mData.add("com.evenwell.autoregistration.overlay.base.s600ww");
        mData.add("com.evenwell.autoregistration.overlay.d.base.s600id");
        mData.add("com.evenwell.autoregistration.overlay.d.base.s600ww");
        mData.add("com.evenwell.batteryprotect");
        mData.add("com.evenwell.batteryprotect.overlay.base");
        mData.add("com.evenwell.batteryprotect.overlay.base.s600id");
        mData.add("com.evenwell.batteryprotect.overlay.base.s600ww");
        mData.add("com.evenwell.batteryprotect.overlay.d.base.s600e0");
        mData.add("com.evenwell.bboxsbox");
        mData.add("com.evenwell.bboxsbox.app");
        mData.add("com.evenwell.bokeheditor");
        mData.add("com.evenwell.bokeheditor.overlay.base.s600ww");
        mData.add("com.evenwell.CPClient");
        mData.add("com.evenwell.CPClient.overlay.base");
        mData.add("com.evenwell.CPClient.overlay.base.s600id");
        mData.add("com.evenwell.CPClient.overlay.base.s600ww");
        mData.add("com.evenwell.custmanager");
        mData.add("com.evenwell.custmanager.data.overlay.base");
        mData.add("com.evenwell.custmanager.data.overlay.base.s600id");
        mData.add("com.evenwell.custmanager.data.overlay.base.s600ww");
        mData.add("com.evenwell.customerfeedback.overlay.base.s600ww");
        mData.add("com.evenwell.dataagent");
        mData.add("com.evenwell.dataagent.overlay.base");
        mData.add("com.evenwell.dataagent.overlay.base.s600id");
        mData.add("com.evenwell.dataagent.overlay.base.s600ww");
        mData.add("com.evenwell.DbgCfgTool");
        mData.add("com.evenwell.DbgCfgTool.overlay.base");
        mData.add("com.evenwell.DbgCfgTool.overlay.base.s600id");
        mData.add("com.evenwell.DbgCfgTool.overlay.base.s600ww");
        mData.add("com.evenwell.defaultappconfigure.overlay.base.s600ww");
        mData.add("com.evenwell.DeviceMonitorControl");
        mData.add("com.evenwell.DeviceMonitorControl.data.overlay.base");
        mData.add("com.evenwell.DeviceMonitorControl.data.overlay.base.s600id");
        mData.add("com.evenwell.DeviceMonitorControl.data.overlay.base.s600ww");
        mData.add("com.evenwell.email.data.overlay.base.s600ww");
        mData.add("com.evenwell.factorywizard");
        mData.add("com.evenwell.factorywizard.overlay.base");
        mData.add("com.evenwell.factorywizard.overlay.base.s600ww");
        mData.add("com.evenwell.foxlauncher.partner");
        mData.add("com.evenwell.fqc");
        mData.add("com.evenwell.legalterm");
        mData.add("com.evenwell.legalterm.overlay.base.s600ww");
        mData.add("com.evenwell.managedprovisioning");
        mData.add("com.evenwell.managedprovisioning.overlay.base");
        mData.add("com.evenwell.managedprovisioning.overlay.base.s600id");
        mData.add("com.evenwell.managedprovisioning.overlay.base.s600ww");
        mData.add("com.evenwell.mappartner");
        mData.add("com.evenwell.nps");
        mData.add("com.evenwell.nps.overlay.base");
        mData.add("com.evenwell.nps.overlay.base.s600id");
        mData.add("com.evenwell.nps.overlay.base.s600ww");
        mData.add("com.evenwell.pandorasbox");
        mData.add("com.evenwell.pandorasbox.app");
        mData.add("com.evenwell.partnerbrowsercustomizations");
        mData.add("com.evenwell.partnerbrowsercustomizations.overlay.base");
        mData.add("com.evenwell.partnerbrowsercustomizations.overlay.base.s600id");
        mData.add("com.evenwell.partnerbrowsercustomizations.overlay.base.s600ww");
        mData.add("com.evenwell.permissiondetection");
        mData.add("com.evenwell.permissiondetection.overlay.base.s600ww");
        mData.add("com.evenwell.phone.overlay.base.s600ww");
        mData.add("com.evenwell.phone.overlay.base");
        mData.add("com.evenwell.PowerMonitor");
        mData.add("com.evenwell.PowerMonitor.overlay.base");
        mData.add("com.evenwell.PowerMonitor.overlay.base.s600id");
        mData.add("com.evenwell.PowerMonitor.overlay.base.s600ww");
        mData.add("com.evenwell.providers.downloads.overlay.base.s600ww");
        mData.add("com.evenwell.providers.downloads.ui.overlay.base.s600ww");
        mData.add("com.evenwell.providers.partnerbookmarks.overlay.base.s600ww");
        mData.add("com.evenwell.providers.weather");
        mData.add("com.evenwell.providers.weather.overlay.base.s600ww");
        mData.add("com.evenwell.pushagent");
        mData.add("com.evenwell.pushagent.overlay.base");
        mData.add("com.evenwell.pushagent.overlay.base.s600id");
        mData.add("com.evenwell.pushagent.overlay.base.s600ww");
        mData.add("com.evenwell.retaildemoapp");
        mData.add("com.evenwell.retaildemoapp.overlay.base");
        mData.add("com.evenwell.retaildemoapp.overlay.base.s600id");
        mData.add("com.evenwell.retaildemoapp.overlay.base.s600ww");
        mData.add("com.evenwell.screenlock.overlay.base.s600ww");
        mData.add("com.evenwell.settings.data.overlay.base");
        mData.add("com.evenwell.settings.data.overlay.base.s600ww");
        mData.add("com.evenwell.SettingsUtils");
        mData.add("com.evenwell.SettingsUtils.overlay.base.s600ww");
        mData.add("com.evenwell.SetupWizard");
        mData.add("com.evenwell.SetupWizard.overlay.base");
        mData.add("com.evenwell.setupwizard.btl.s600ww.overlay");
        mData.add("com.evenwell.SetupWizard.overlay.d.base.s600ww");
        mData.add("com.evenwell.SetupWizard.overlay.base.s600ww");
        mData.add("com.evenwell.stbmonitor");
        mData.add("com.evenwell.stbmonitor.data.overlay.base");
        mData.add("com.evenwell.stbmonitor.data.overlay.base.s600id");
        mData.add("com.evenwell.stbmonitor.data.overlay.base.s600ww");
        mData.add("com.evenwell.telecom.data.overlay.base");
        mData.add("com.evenwell.telecom.data.overlay.base.s600id");
        mData.add("com.evenwell.telecom.data.overlay.base.s600ww");
        mData.add("com.evenwell.UsageStatsLogReceiver");
        mData.add("com.evenwell.UsageStatsLogReceiver.data.overlay.back.s600id");
        mData.add("com.evenwell.UsageStatsLogReceiver.data.overlay.base.s600ww");
        mData.add("com.evenwell.weather.overlay.base.s600ww");
        mData.add("com.evenwell.weatherservice");
        mData.add("com.evenwell.weatherservice.overlay.base.s600ww");
        mData.add("com.fih.infodisplay");
        mData.add("com.fih.StatsdLogger");
        mData.add("com.foxconn.ifaa");
        mData.add("com.hmdglobal.datago");
        mData.add("com.hmdglobal.datago.overlay.base");
        mData.add("com.hmdglobal.datago.overlay.base.s600ww");
        mData.add("com.hmdglobal.support");
        return mData;
    }

    public static String getNokiaList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getNokia().toString().substring(1, getNokia().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableNokia(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getNokia().toString().substring(1, getNokia().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_nokia");
            }
        }
    }

    private static void disableNokia() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_nokia").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_nokia");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getOppo() {
        List<String> mData = new ArrayList<>();
        mData.add("com.coloros.appmanager");
        mData.add("com.coloros.assistantscreen");
        mData.add("com.coloros.backuprestore");
        mData.add("com.coloros.childrenspace");
        mData.add("com.coloros.cloud");
        mData.add("com.coloros.directui");
        mData.add("com.coloros.findmyphone");
        mData.add("com.coloros.gamespace");
        mData.add("com.coloros.healthcheck");
        mData.add("com.coloros.mcs");
        mData.add("com.coloros.ocrscanner");
        mData.add("com.coloros.oppomultiapp");
        mData.add("com.coloros.phonenoareainquire");
        mData.add("com.coloros.smartdrive");
        mData.add("com.coloros.soundrecorder");
        mData.add("com.coloros.speechassist");
        mData.add("com.coloros.weather.service");
        mData.add("com.coloros.widget.smallweather");
        mData.add("com.heytap.cloud");
        mData.add("com.mobiletools.systemhelper");
        mData.add("com.nearme.atlas");
        mData.add("com.nearme.browser");
        mData.add("com.nearme.instant.platform");
        mData.add("com.nearme.themestore");
        mData.add("com.oppo.fingerprints.fingerprintsensortest");
        mData.add("com.oppo.logkitservice");
        mData.add("com.oppo.logkit");
        mData.add("com.oppo.market");
        mData.add("com.oppo.music");
        mData.add("com.oppo.ovoicemanager");
        mData.add("com.oppo.oppopowermonitor");
        mData.add("com.oppo.quicksearchbox");
        mData.add("com.oppo.securepay");
        mData.add("com.coloros.wallet");
        mData.add("com.realme.findphone.client2");
        return mData;
    }

    public static String getOppoList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getOppo().toString().substring(1, getOppo().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableOppo(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getOppo().toString().substring(1, getOppo().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_oppo");
            }
        }
    }

    private static void disableOppo() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_oppo").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_oppo");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getSony() {
        List<String> mData = new ArrayList<>();
        mData.add("com.sony.tvsideview.videoph");
        mData.add("com.sonyericsson.android.addoncamera.artfilter");
        mData.add("com.sonyericsson.android.omacp");
        mData.add("com.sonyericsson.conversations.res.overlay_305");
        mData.add("com.sonyericsson.conversations.res.overlay");
        mData.add("com.sonyericsson.idd.agent");
        mData.add("com.sonyericsson.mtp.extension.backuprestore");
        mData.add("com.sonyericsson.mtp.extension.update");
        mData.add("com.sonyericsson.music");
        mData.add("com.sonyericsson.settings.res.overlay_305");
        mData.add("com.sonyericsson.startupflagservice");
        mData.add("com.sonyericsson.textinput.chinese");
        mData.add("com.sonyericsson.trackid.res.overlay");
        mData.add("com.sonyericsson.trackid.res.overlay_305");
        mData.add("com.sonyericsson.unsupportedheadsetnotifier");
        mData.add("com.sonyericsson.wappush");
        mData.add("com.sonyericsson.warrantytime");
        mData.add("com.sonyericsson.xhs");
        mData.add("com.sonymobile.advancedlogging");
        mData.add("com.sonymobile.advancedwidget.topcontacts");
        mData.add("com.sonymobile.android.addoncamera.soundphoto");
        mData.add("com.sonymobile.androidapp.cameraaddon.areffect");
        mData.add("com.sonymobile.android.externalkeyboard");
        mData.add("com.sonymobile.android.contacts.res.overlay_305");
        mData.add("com.sonymobile.android.externalkeyboardjp");
        mData.add("com.sonymobile.anondata");
        mData.add("com.sonymobile.aptx.notifier");
        mData.add("com.sonymobile.assist");
        mData.add("com.sonymobile.assist.persistent");
        mData.add("com.sonymobile.cameracommon.wearablebridge");
        mData.add("com.sonymobile.coverapp2");
        mData.add("com.sonymobile.demoappchecker");
        mData.add("com.sonymobile.deviceconfigtool");
        mData.add("com.sonymobile.dualshockmanager");
        mData.add("com.sonymobile.email");
        mData.add("com.sonymobile.entrance");
        mData.add("com.sonymobile.getmore.client");
        mData.add("com.sonymobile.getset");
        mData.add("com.sonymobile.getset.priv");
        mData.add("com.sonymobile.gettoknowit");
        mData.add("com.sonymobile.glovemode");
        mData.add("com.sonymobile.googleanalyticsproxy");
        mData.add("com.sonymobile.intelligent.backlight");
        mData.add("com.sonymobile.indeviceintelligence");
        mData.add("com.sonymobile.intelligent.gesture");
        mData.add("com.sonymobile.intelligent.iengine");
        mData.add("com.sonymobile.intelligent.observer");
        mData.add("com.sonymobile.lifelog");
        mData.add("com.sonymobile.moviecreator.rmm");
        mData.add("com.sonymobile.mtp.extension.fotaupdate");
        mData.add("com.sonymobile.music.googlelyricsplugin");
        mData.add("com.sonymobile.music.wikipediaplugin");
        mData.add("com.sonymobile.music.youtubekaraokeplugin");
        mData.add("com.sonymobile.music.youtubeplugin");
        mData.add("com.sonymobile.pip");
        mData.add("com.sonymobile.pobox");
        mData.add("com.sonymobile.prediction");
        mData.add("com.sonymobile.retaildemo");
        mData.add("com.sonymobile.scan3d");
        mData.add("com.sonymobile.simlockunlockapp");
        mData.add("com.sonymobile.smartcharger");
        mData.add("com.sonymobile.support");
        mData.add("com.sonymobile.synchub");
        mData.add("com.sonymobile.themes.sou.cid18.black");
        mData.add("com.sonymobile.themes.sou.cid19.silver");
        mData.add("com.sonymobile.themes.sou.cid20.blue");
        mData.add("com.sonymobile.themes.sou.cid21.pink");
        mData.add("com.sonymobile.themes.xperialoops2");
        mData.add("com.sonymobile.xperialounge.services");
        mData.add("com.sonymobile.xperiaxlivewallpaper");
        mData.add("com.sonymobile.xperiaxlivewallpaper.product.res.overlay");
        mData.add("com.sonymobile.xperiaservices");
        mData.add("com.sonymobile.xperiatransfermobile");
        mData.add("com.sonymobile.xperiaweather");
        return mData;
    }

    public static String getSonyList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getSony().toString().substring(1, getSony().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableSony(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getSony().toString().substring(1, getSony().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_sony");
            }
        }
    }

    private static void disableSony() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_sony").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_sony");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getXiaomi() {
        List<String> mData = new ArrayList<>();
        mData.add("android.autoinstalls.config.Xiaomi.cepheus");
        mData.add("android.autoinstalls.config.Xiaomi.dipper");
        mData.add("android.autoinstalls.config.Xiaomi.daisy");
        mData.add("android.autoinstalls.config.Xiaomi.cactus");
        mData.add("android.romstats");
        mData.add("cn.wps.xiaomi.abroad.lite");
        mData.add("com.android.backup");
        mData.add("com.android.midrive");
        mData.add("com.autonavi.minimap");
        mData.add("com.baidu.duersdk.opensdk");
        mData.add("com.baidu.input_mi");
        mData.add("com.baidu.searchbox");
        mData.add("com.bsp.catchlog");
        mData.add("com.duokan.phone.remotecontroller");
        mData.add("com.duokan.phone.remotecontroller.peel.plugin");
        mData.add("com.facemoji.lite.xiaomi.gp");
        mData.add("com.factory.mmigroup");
        mData.add("com.fingerprints.sensortesttool");
        mData.add("com.huaqin.diaglogger");
        mData.add("com.huaqin.factory");
        mData.add("com.huaqin.sar");
        mData.add("com.milink.service");
        mData.add("com.mipay.wallet");
        mData.add("com.mipay.wallet.id");
        mData.add("com.mipay.wallet.in");
        mData.add("com.miui.accessibility");
        mData.add("com.miui.audioeffect");
        mData.add("com.miui.cit");
        mData.add("com.miui.cloudservice");
        mData.add("com.miui.huanji");
        mData.add("com.miui.enbbs");
        mData.add("com.miui.greenguard");
        mData.add("com.miui.hybrid");
        mData.add("com.miui.hybrid.accessory");
        mData.add("com.miui.micloudsync");
        mData.add("com.miui.miwallpaper");
        mData.add("com.miui.nextpay");
        mData.add("com.miui.qr");
        mData.add("com.miui.smsextra");
        mData.add("com.miui.touchassistant");
        mData.add("com.miui.translation.xmcloud");
        mData.add("com.miui.translationservice");
        mData.add("com.miui.userguide");
        mData.add("com.miui.analytics");
        mData.add("com.miui.android.fashiongallery");
        mData.add("com.miui.antispam");
        mData.add("com.miui.bugreport");
        mData.add("com.miui.cleanmaster");
        mData.add("com.miui.cloudbackup");
        mData.add("com.miui.cloudservice");
        mData.add("com.miui.cloudservice.sysbase");
        mData.add("com.miui.compass");
        mData.add("com.miui.contentcatcher");
        mData.add("com.miui.daemon");
        mData.add("com.miui.fm");
        mData.add("com.miui.fmservice");
        mData.add("com.miui.gallery");
        mData.add("com.miui.klo.bugreport");
        mData.add("com.miui.miservice");
        mData.add("com.miui.msa.global");
        mData.add("com.miui.notes");
        mData.add("com.miui.personalassistant");
        mData.add("com.miui.phrase");
        mData.add("com.miui.player");
        mData.add("com.miui.providers.weather");
        mData.add("com.miui.screenrecorder");
        mData.add("com.miui.spock");
        mData.add("com.miui.systemAdSolution");
        mData.add("com.miui.sysopt");
        mData.add("com.miui.translation.kingsoft");
        mData.add("com.miui.translation.youdao");
        mData.add("com.miui.video");
        mData.add("com.miui.videoplayer");
        mData.add("com.miui.videoplayer.overlay");
        mData.add("com.miui.virtualsim");
        mData.add("com.miui.vsimcore");
        mData.add("com.miui.miwallpaper.earth");
        mData.add("com.miui.miwallpaper.mars");
        mData.add("com.miui.newmidrive");
        mData.add("com.wapi.wapicertmanager");
        mData.add("com.miui.weather2");
        mData.add("com.miui.yellowpage");
        mData.add("com.mfashiongallery.emag");
        mData.add("com.mi.android.globalpersonalassistant");
        mData.add("com.mi.android.globalminusscreen");
        mData.add("com.mi.AutoTest");
        mData.add("com.xiaomi.mi_connect_service");
        mData.add("com.mi.global.bbs");
        mData.add("com.mi.global.shop");
        mData.add("com.mi.globalTrendNews");
        mData.add("com.mi.health");
        mData.add("com.mi.liveassistant");
        mData.add("com.mi.setupwizardoverlay");
        mData.add("com.mi.webkit.core");
        mData.add("com.qiyi.video");
        mData.add("com.sohu.inputmethod.sogou.xiaomi");
        mData.add("com.wt.secret_code_manager");
        mData.add("com.xiaomi.ab");
        mData.add("com.xiaomi.account");
        mData.add("com.xiaomi.channel");
        mData.add("com.xiaomi.gamecenter.sdk.service");
        mData.add("com.xiaomi.joyose");
        mData.add("com.xiaomi.jr");
        mData.add("com.xiaomi.lens");
        mData.add("com.xiaomi.midrop");
        mData.add("com.xiaomi.midrop.overlay");
        mData.add("com.xiaomi.mipicks");
        mData.add("com.xiaomi.o2o");
        mData.add("com.xiaomi.pass");
        mData.add("com.xiaomi.payment");
        mData.add("com.xiaomi.scanner");
        mData.add("com.xiaomi.shop");
        mData.add("com.xiaomi.vipaccount");
        mData.add("com.xiaomi.glgm");
        mData.add("com.xiaomi.micloud.sdk");
        mData.add("com.xiaomi.mirecycle");
        mData.add("com.xiaomi.oversea.ecom");
        mData.add("com.xiaomi.providers.appindex");
        mData.add("com.xiaomi.upnp");
        mData.add("com.xiaomi.simactivate.service");
        mData.add("com.xiaomi.smarthome");
        mData.add("com.xiaomi.xmsfkeeper");
        return mData;
    }

    public static String getXiaomiList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getXiaomi().toString().substring(1, getXiaomi().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableXiaomi(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getXiaomi().toString().substring(1, getXiaomi().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_xiaomi");
            }
        }
    }

    private static void disableXiaomi() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_xiaomi").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_xiaomi");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getZTE() {
        List<String> mData = new ArrayList<>();
        mData.add("com.zte.assistant");
        mData.add("com.zte.weather");
        return mData;
    }

    public static String getZTEList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getZTE().toString().substring(1, getZTE().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableZTE(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getZTE().toString().substring(1, getZTE().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_zte");
            }
        }
    }

    private static void disableZTE() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_zte").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_zte");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static List<String> getMiscellaneous() {
        List<String> mData = new ArrayList<>();
        mData.add("com.amazon.appmanager");
        mData.add("com.amazon.avod.thirdpartyclient");
        mData.add("com.amazon.mShop.android");
        mData.add("com.amazon.fv");
        mData.add("com.amazon.kindle");
        mData.add("com.amazon.mp3");
        mData.add("com.amazon.venezia");
        mData.add("com.amazon.aa");
        mData.add("com.amazon.aa.attribution");
        mData.add("com.amazon.mShop.android.shopping");
        mData.add("com.amazon.mShop.android.shopping.vpl");
        mData.add("com.amazon.clouddrive.photos");
        mData.add("in.amazon.mShop.android.shopping");
        mData.add("com.facebook.katana");
        mData.add("com.facebook.system");
        mData.add("com.facebook.appmanager");
        mData.add("com.facebook.services");
        mData.add("com.facebook.orca");
        mData.add("com.instagram.android");
        mData.add("com.whatsapp");
        mData.add("com.microsoft.skydrive");
        mData.add("com.skype.raider");
        mData.add("com.microsoft.office.excel");
        mData.add("com.microsoft.office.word");
        mData.add("com.microsoft.office.outlook");
        mData.add("com.microsoft.office.powerpoint");
        mData.add("com.skype.m2");
        mData.add("com.microsoft.office.officehubhl");
        mData.add("com.microsoft.office.officehub");
        mData.add("com.microsoft.office.officehubrow");
        mData.add("com.microsoft.appmanager");
        mData.add("com.microsoft.translator");
        mData.add("com.caf.fmradio");
        mData.add("org.codeaurora.gps.gpslogsave");
        mData.add("com.qti.qualcomm.datastatusnotification");
        mData.add("com.qti.service.colorservice");
        mData.add("com.qti.confuridialer");
        mData.add("com.qti.snapdragon.qdcm_ff");
        mData.add("com.qualcomm.atfwd");
        mData.add("com.qualcomm.embms");
        mData.add("com.qualcomm.location");
        mData.add("com.qualcomm.simcontacts");
        mData.add("com.qualcomm.qti.auth.fidocryptoservice");
        mData.add("com.qualcomm.qti.autoregistration");
        mData.add("com.qualcomm.qti.callfeaturessetting");
        mData.add("com.qualcomm.qti.confdialer");
        mData.add("com.qti.dpmserviceapp");
        mData.add("com.qualcomm.qti.networksetting");
        mData.add("com.qualcomm.qti.optinoverlay");
        mData.add("com.qualcomm.qti.perfdump");
        mData.add("com.qualcomm.qti.qms.service.connectionsecurity");
        mData.add("com.qualcomm.qti.qms.service.telemetry");
        mData.add("com.qualcomm.qti.qtisystemservice");
        mData.add("com.qualcomm.qti.roamingsettings");
        mData.add("com.qualcomm.qti.rcsbootstraputil");
        mData.add("com.qualcomm.qti.rcsimsbootstraputil");
        mData.add("com.qualcomm.qti.uceshimservice");
        mData.add("com.qti.xdivert");
        mData.add("com.quicinc.cne.CNEService");
        mData.add("com.qti.qualcomm.datastatusnotification");
        mData.add("com.qualcomm.qti.dynamicddsservice");
        mData.add("com.qualcomm.qti.lpa");
        mData.add("com.qualcomm.qti.remoteSimlockAuth");
        mData.add("com.qualcomm.qti.uim");
        mData.add("com.quicinc.fmradio");
        mData.add("com.qualcomm.qti.qmmi");
        mData.add("com.qti.confuridialer");
        mData.add("cci.usage");
        mData.add("com.aaa.android.discounts");
        mData.add("com.aaa.android.discounts.vpl");
        mData.add("com.aspiro.tidal.vpl");
        mData.add("com.aspiro.tidal");
        mData.add("com.audible.application");
        mData.add("com.bleacherreport.android.teamstream");
        mData.add("com.blurb.checkout");
        mData.add("com.booking");
        mData.add("com.cequint.ecid");
        mData.add("com.cnn.mobile.android.phone");
        mData.add("com.contextlogic.wish");
        mData.add("com.cootek.smartinputv5.language.englishgb");
        mData.add("com.cootek.smartinputv5.language.spanishus");
        mData.add("com.crowdcare.agent.k");
        mData.add("com.devhd.feedly");
        mData.add("com.diotek.sec.lookup.dictionary");
        mData.add("com.directv.dvrscheduler");
        mData.add("com.discoveryscreen");
        mData.add("com.dna.solitaireapp");
        mData.add("com.draftkings.dknativermgGP.vpl");
        mData.add("com.drivemode");
        mData.add("com.ebay.mobile");
        mData.add("com.ebay.carrier");
        mData.add("com.ehernandez.radiolainolvidable");
        mData.add("com.emoji.keyboard.touchpal");
        mData.add("com.eterno");
        mData.add("com.evernote");
        mData.add("com.galaxyfirsatlari");
        mData.add("com.generalmobi.go2pay");
        mData.add("com.gotv.nflgamecenter.us.lite");
        mData.add("com.groupon");
        mData.add("com.hancom.office.editor.hidden");
        mData.add("com.handmark.expressweather");
        mData.add("com.handmark.expressweather.vpl");
        mData.add("com.hulu.plus");
        mData.add("com.ideashower.readitlater.pro");
        mData.add("com.imdb.mobile");
        mData.add("com.infraware.polarisoffice5");
        mData.add("com.ironsource.appcloud.oobe");
        mData.add("com.ironsource.appcloud.oobe.huawei");
        mData.add("com.king.candycrush4");
        mData.add("com.king.candycrushsodasaga");
        mData.add("com.king.candycrushsaga");
        mData.add("com.linkedin.android");
        mData.add("com.lookout");
        mData.add("com.micredit.in");
        mData.add("com.netflix.mediaclient");
        mData.add("com.netflix.partner.activation");
        mData.add("com.niksoftware.snapseed");
        mData.add("com.nuance.swype.input");
        mData.add("com.opera.branding");
        mData.add("com.opera.branding.news");
        mData.add("com.opera.mini.native");
        mData.add("com.opera.preinstall");
        mData.add("com.opera.max.oem");
        mData.add("com.opera.max.preinstall");
        mData.add("com.particlenews.newsbreak");
        mData.add("com.phonepe.app");
        mData.add("com.pinsight.v1");
        mData.add("com.playphone.gamestore");
        mData.add("com.playphone.gamestore.loot");
        mData.add("com.pure.indosat.care");
        mData.add("com.huaqin.Fm");
        mData.add("com.nextradioapp.nextradio");
        mData.add("com.pinsight.dw");
        mData.add("com.realvnc.android.remote");
        mData.add("com.remotefairy4");
        mData.add("com.republicwireless.tel");
        mData.add("com.rhapsody");
        mData.add("com.rhapsody.vpl");
        mData.add("com.roaming.android.gsimbase");
        mData.add("com.roaming.android.gsimcontentprovider");
        mData.add("com.sem.factoryapp");
        mData.add("com.servicemagic.consumer");
        mData.add("com.setk.widget");
        mData.add("com.sharecare.askmd");
        mData.add("com.slacker.radio");
        mData.add("com.shopee.id");
        mData.add("com.smithmicro.netwise.director.comcast.oem");
        mData.add("com.spotify.music");
        mData.add("com.swiftkey.swiftkeyconfigurator");
        mData.add("com.synchronoss.dcs.att.r2g");
        mData.add("com.s.antivirus");
        mData.add("com.telenav.app.android.cingular");
        mData.add("com.telenav.app.android.scout_us");
        mData.add("com.til.timesnews");
        mData.add("com.tracker.t");
        mData.add("com.turner.cnvideoapp");
        mData.add("com.tripadvisor.tripadvisor");
        mData.add("com.ubercab");
        mData.add("com.ubercab.driver");
        mData.add("com.ubercab.eats");
        mData.add("com.UCMobile.intl");
        mData.add("com.ume.browser.northamerica");
        mData.add("com.vlingo.midas");
        mData.add("com.wb.goog.got.conquest");
        mData.add("com.yahoo.mobile.client.android.liveweather");
        mData.add("com.yellowpages.android.ypmobile");
        mData.add("com.yelp.android");
        mData.add("com.zhiliaoapp.musically");
        mData.add("de.axelspringer.yana.zeropage");
        mData.add("flipboard.app");
        mData.add("flipboard.boxer.app");
        mData.add("id.co.babe");
        mData.add("in.mohalla.sharechat");
        mData.add("in.playsimple.wordtrip");
        mData.add("jp.co.omronsoft.openwnn");
        mData.add("jp.gocro.smartnews.android");
        mData.add("msgplus.jibe.sca.vpl");
        mData.add("net.sharewire.parkmobilev2");
        mData.add("pl.zdunex25.updater");
        mData.add("tv.fubo.mobile.vpl");
        mData.add("tv.peel.app");
        mData.add("zpub.res");
        mData.add("com.monotype.android.font.chococooky");
        mData.add("com.monotype.android.font.cooljazz");
        mData.add("com.monotype.android.font.foundation");
        mData.add("com.monotype.android.font.rosemary");
        mData.add("com.dsi.ant.plugins.antplus");
        mData.add("com.dsi.ant.sample.acquirechannels");
        mData.add("com.dsi.ant.server");
        mData.add("com.dsi.ant.service.socket");
        mData.add("co.sitic.pp");
        mData.add("com.mediatek.atmwifimeta");
        mData.add("com.mediatek.engineermode");
        mData.add("com.mediatek.mdmconfig");
        mData.add("com.mediatek.mtklogger");
        mData.add("com.mediatek.providers.drm");
        mData.add("com.mediatek.wfo.impl");
        return mData;
    }

    public static String getMiscellaneousList(Context context) {
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getMiscellaneous().toString().substring(1, getMiscellaneous().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                mAppList.append(PackageTasks.getAppName(s, context)).append("\n");
            }
        }
        return mAppList.toString();
    }

    private static void enableMiscellaneous(Context context) {
        PackageTasks.initializeModule();
        StringBuilder mAppList = new StringBuilder();
        String[] apps = getMiscellaneous().toString().substring(1, getMiscellaneous().toString().length() - 1).split(", ");
        for (String s : apps) {
            if (Utils.isPackageInstalled(s, context) && isSystemApp(PackageTasks.getAPKPath(s, context))) {
                PackageTasks.setToDelete(PackageTasks.getAPKPath(s, context), new File(PackageTasks.getAPKPath(s, context)).getName(), context);
                mAppList.append(PackageTasks.getAPKPath(s, context)).append("\n");
                Utils.create(mAppList.toString(), PackageTasks.getModulePath() + "/uad_misc");
            }
        }
    }

    private static void disableMiscellaneous() {
        try {
            for (String line : Utils.read(PackageTasks.getModulePath() + "/uad_misc").split("\\r?\\n")) {
                if (line.startsWith("/system/") && Utils.exist(PackageTasks.getModulePath() + line)) {
                    PackageTasks.revertDelete(line);
                    Utils.delete(PackageTasks.getModulePath() + "/uad_misc");
                }
            }
        } catch (Exception ignored) {
        }
    }

    private static boolean isSystemApp(String apkPath) {
        return apkPath.startsWith("/system/app") || apkPath.startsWith("/system/priv-app")
                || apkPath.startsWith("/system/product/app") || apkPath.startsWith("/system/vendor/app")
                || apkPath.startsWith("/system/vendor/overlay") || apkPath.startsWith("/system/product/overlay");
    }

    public static void applyScript(String path, Activity activity) {
        String script = Utils.getString("setDefault", null, activity);
        if (Utils.exist(path)) {
            switch (script) {
                case "aosp":
                    disableAOSP();
                    break;
                case "oneplus":
                    disableOnePlus();
                    break;
                case "asus":
                    disableASUS();
                    break;
                case "carrier":
                    disableCarrier();
                    break;
                case "huawei":
                    disableHuawei();
                    break;
                case "lg":
                    disableLG();
                    break;
                case "samsung":
                    disableSamsung();
                    break;
                case "motorola":
                    disableMotorola();
                    break;
                case "nokia":
                    disableNokia();
                    break;
                case "oppo":
                    disableOppo();
                    break;
                case "sony":
                    disableSony();
                    break;
                case "xiaomi":
                    disableXiaomi();
                    break;
                case "zte":
                    disableZTE();
                    break;
                case "misc":
                    disableMiscellaneous();
                    break;
                default:
                    disableGoogle();
                    break;
            }
        } else {
            switch (script) {
                case "aosp":
                    enableAOSP(activity);
                    break;
                case "oneplus":
                    enableOnePlus(activity);
                    break;
                case "asus":
                    enableASUS(activity);
                    break;
                case "carrier":
                    enableCarrier(activity);
                    break;
                case "huawei":
                    enableHuawei(activity);
                    break;
                case "lg":
                    enableLG(activity);
                    break;
                case "samsung":
                    enableSamsung(activity);
                    break;
                case "motorola":
                    enableMotorola(activity);
                    break;
                case "nokia":
                    enableNokia(activity);
                    break;
                case "oppo":
                    enableOppo(activity);
                    break;
                case "sony":
                    enableSony(activity);
                    break;
                case "xiaomi":
                    enableXiaomi(activity);
                    break;
                case "zte":
                    enableZTE(activity);
                    break;
                case "misc":
                    enableMiscellaneous(activity);
                    break;
                default:
                    enableGoogle(activity);
                    break;
            }
        }
    }

}