package org.anyrtc.user.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;

import org.anyrtc.live_line.R;

/**
 * 类 名： org.anyrtc.user.fragment
 * 功 能：
 * 作 者： Administrator
 * 时 间： 2017/3/10 11 28
 * 邮 箱： yuhaikun19920202@gmail.com
 */
public class HosterFragment extends Fragment implements View.OnClickListener {


    private View view;
    private FragmentActivity context;
    private TextView mEditLiveTopicTv;
    private RadioButton mRbtnVideoHd;
    private RadioButton mRbtnVideoQhd;
    private RadioButton mRbtnVideoSd;
    private RadioButton mRbtnVideoLow;
    private Button mBtnVideoStart;
    private Button mBtnAudioStart;
    private LinearLayout mEmailLoginFormLl;
    private ScrollView mLoginForm;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_hoster, container, false);
        context = getActivity();
        initView(view);
        return view;
    }


    private void initView(View view) {
        mEditLiveTopicTv = (TextView) view.findViewById(R.id.edit_live_topic_tv);
        mRbtnVideoHd = (RadioButton) view.findViewById(R.id.rbtn_video_hd);
        mRbtnVideoQhd = (RadioButton) view.findViewById(R.id.rbtn_video_qhd);
        mRbtnVideoSd = (RadioButton) view.findViewById(R.id.rbtn_video_sd);
        mRbtnVideoLow = (RadioButton) view.findViewById(R.id.rbtn_video_low);
        mBtnVideoStart = (Button) view.findViewById(R.id.btn_video_start);
        mBtnAudioStart = (Button) view.findViewById(R.id.btn_audio_start);
        mEmailLoginFormLl = (LinearLayout) view.findViewById(R.id.email_login_form_ll);
        mLoginForm = (ScrollView) view.findViewById(R.id.login_form);
        mBtnVideoStart.setOnClickListener(this);
        mBtnAudioStart.setOnClickListener(this);
    }







    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_video_start:

                break;
            case R.id.btn_audio_start:

                break;
        }
    }
}
