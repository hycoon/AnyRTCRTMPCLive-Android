package org.anyrtc.user;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import org.anyrtc.live_line.R;


/**
 * 类 名： 界面底部导航栏
 * 功 能： 用于底部切换按钮
 * 作 者： Administrator
 * 时 间： 2016/3/17 13 06
 * 邮 箱： yuhaikun19920202@gmail.com
 */
public class TabView extends LinearLayout implements View.OnClickListener {
    private OnTabChangeListener mOnTabChangedListener;
    private int mState = -1;
    private final LinearLayout mStateButton1;
    private final LinearLayout mStateButton2;


    public TabView(Context context) {
        this(context, null);
    }

    public TabView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TabView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        inflate(context, R.layout.view_tab, this);
        mStateButton1 = (LinearLayout) findViewById(R.id.button_state1);
        mStateButton2 = (LinearLayout) findViewById(R.id.button_state2);

        mStateButton1.setOnClickListener(this);
        mStateButton2.setOnClickListener(this);

    }

    public void setOnTabChangeListener(OnTabChangeListener listener) {
        mOnTabChangedListener = listener;
    }

    public void setCurrentTab(int index) {
        switchState(index);
    }

    private void switchState(int state) {
        if (mState == state) {
            return;
        } // else continue

        mState = state;
        mStateButton1.setSelected(false);
        mStateButton2.setSelected(false);


        Object tag = null;

        switch (mState) {
            case 0:
                mStateButton1.setSelected(true);
                tag = mStateButton1.getTag();
                break;

            case 1:
                mStateButton2.setSelected(true);
                tag = mStateButton2.getTag();
                break;


            default:
                break;
        }

        if (mOnTabChangedListener != null) {
            if (tag != null && mOnTabChangedListener != null) {
                mOnTabChangedListener.onTabChange(tag.toString());
            } else {
                mOnTabChangedListener.onTabChange(null);
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_state1:
                switchState(0);
                break;

            case R.id.button_state2:
                switchState(1);
                break;

            default:
                break;
        }
    }

    public static interface OnTabChangeListener {
        public void onTabChange(String tag);
    }

}
