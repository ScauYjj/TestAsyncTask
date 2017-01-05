package com.chinamobile.testasynctask;

/**
 * Created by yjj on 2017/1/4.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPause();

    void onCancled();
}
