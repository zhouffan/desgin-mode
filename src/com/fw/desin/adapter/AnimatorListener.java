package com.fw.desin.adapter;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 20:36
 * @Description:
 */
public interface AnimatorListener {
    void onAnimationCancel();
    void onAnimationEnd();
    void onAnimationRepeat();
    void onAnimationStart();
    void onAnimationPause();
}
