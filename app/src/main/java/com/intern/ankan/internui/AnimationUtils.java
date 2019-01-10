package com.intern.ankan.internui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

public class AnimationUtils {

//    public static void fade(RecyclerView.ViewHolder holder, boolean goesdown){
//
//        //Fade IN or OUT
//        ObjectAnimator alpha = ObjectAnimator.ofFloat(holder.itemView,"alpha",0f,1f);
//        alpha.setDuration(1000);
//        alpha.setInterpolator(new FastOutSlowInInterpolator());
//        alpha.start();
//
//    }
//    public static void slide_from_bottom(RecyclerView.ViewHolder holder,boolean goesdown){
//
//        //Slide from Bottom
//        AnimatorSet animatorSet = new AnimatorSet();
//        ObjectAnimator objectAnimatorY = ObjectAnimator.ofFloat(holder.itemView,"translationY",goesdown?600:-600,0);
//        ObjectAnimator alpha = ObjectAnimator.ofFloat(holder.itemView,"alpha",0.1f,1f);
//        objectAnimatorY.setDuration(1000);
//        alpha.setDuration(500);
//        animatorSet.playTogether(objectAnimatorY,alpha);
//        animatorSet.setInterpolator(new OvershootInterpolator(2.7f));
//        animatorSet.start();
//
//    }
//    public static void slide_from_left_and_right(RecyclerView.ViewHolder holder,boolean goesdown){
//
//        //Slide From Right or Left
//        AnimatorSet animatorSet = new AnimatorSet();
//        ObjectAnimator alpha = ObjectAnimator.ofFloat(holder.itemView,"alpha",0.1f,1f);
//        ObjectAnimator objectAnimatorX2 = ObjectAnimator.ofFloat(holder.itemView,"translationX",goesdown?500:-500,0);
//        alpha.setDuration(1000);
//        objectAnimatorX2.setDuration(1000);
//        animatorSet.playTogether(alpha,objectAnimatorX2);
//        animatorSet.setInterpolator(new OvershootInterpolator(2.0f));
//        animatorSet.start();
//
//    }
//
//    public static void slide_right_to_left(RecyclerView.ViewHolder holder){
//
//        //Slide From Right to Left
//        AnimatorSet animatorSet = new AnimatorSet();
//        ObjectAnimator alpha = ObjectAnimator.ofFloat(holder.itemView,"alpha",0.1f,1f);
//        ObjectAnimator objectAnimatorX2 = ObjectAnimator.ofFloat(holder.itemView,"translationX",500,0);
//        alpha.setDuration(1000);
//        objectAnimatorX2.setDuration(1000);
//        animatorSet.playTogether(alpha,objectAnimatorX2);
//        animatorSet.setInterpolator(new OvershootInterpolator(2.0f));
//        animatorSet.start();
//
//    }
//
//    public static void slide_left_to_right(RecyclerView.ViewHolder holder){
//
//        //Slide From Left to Right
//        AnimatorSet animatorSet = new AnimatorSet();
//        ObjectAnimator alpha = ObjectAnimator.ofFloat(holder.itemView,"alpha",0.1f,1f);
//        ObjectAnimator objectAnimatorX2 = ObjectAnimator.ofFloat(holder.itemView,"translationX",-500,0);
//        alpha.setDuration(1000);
//        objectAnimatorX2.setDuration(1000);
//        animatorSet.playTogether(alpha,objectAnimatorX2);
//        animatorSet.setInterpolator(new OvershootInterpolator(2.0f));
//        animatorSet.start();
//
//    }

    public static void wave(RecyclerView.ViewHolder holder,boolean goesdown){

        //Scale and Attach(Wave)
        AnimatorSet animatorSet = new AnimatorSet();
        //ObjectAnimator objectAnimatorY = ObjectAnimator.ofFloat(holder.itemView,"translationY",goesdown?100:-100,0);
        //ObjectAnimator scaleY = ObjectAnimator.ofFloat(holder.itemView,"scaleY",0.1f,1f);
        //ObjectAnimator scaleX = ObjectAnimator.ofFloat(holder.itemView,"scaleX",0.1f,1f);
        //scaleX.setDuration(500);
        //scaleY.setDuration(500);
        //objectAnimatorY.setDuration(500);

//        page.setScaleX(0.8f - 0.02f * position);
//
//        page.setScaleY(0.8f);
//
//        page.setTranslationX(- page.getWidth()*position);
//
//        page.setTranslationY(30 * position);

        ObjectAnimator scaleX = ObjectAnimator.ofFloat(holder.itemView,"scaleX",0.8f);
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(holder.itemView,"scaleY",0.8f);
        ObjectAnimator translateX = ObjectAnimator.ofFloat(holder.itemView,"translationY",-holder.itemView.getWidth());
        ObjectAnimator translateY = ObjectAnimator.ofFloat(holder.itemView,"translationY",30);
        scaleX.setDuration(1000);
        scaleY.setDuration(1000);
        translateX.setDuration(1000);
        translateY.setDuration(1000);
        animatorSet.playTogether(scaleX,scaleY,translateX,translateY);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.start();


//        ObjectAnimator objectAnimatorY = ObjectAnimator.ofFloat(holder.itemView,"translationY",goesdown?700:-700,0);
//        ObjectAnimator alpha = ObjectAnimator.ofFloat(holder.itemView,"alpha",0f,1f);
//        objectAnimatorY.setDuration(1000);
//        alpha.setDuration(1500);
//        animatorSet.playTogether(objectAnimatorY,alpha);
//        animatorSet.setInterpolator(new AccelerateInterpolator(2.0f));
//        animatorSet.start();
    }


}