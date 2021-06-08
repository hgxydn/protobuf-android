package com.fty.protobuf;

import android.os.Bundle;
import android.util.Log;

import com.fty.utils.Out;
import com.fty.utils.RtcmUtil;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String TAG = getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStruct();
        sendObj();
    }

    private void sendObj() {
        Out.Card card = Out.Card.newBuilder()
                .setId(62170025)
                .setCash(10)
                .setSign("CCB")
                .setFoo(1)
                .build();
        Out.User fty = Out.User.newBuilder()
                .setCard(card)
                .setName("fty")
                .setAge(22)
                .setHasCar(false)
                .addLikeNums(8).build();

        byte[] buf = fty.toByteArray();
        int i = RtcmUtil.passObjToNative(buf, buf.length);
        Log.i(TAG, "sendObj: res is: "+i);
    }

    private void getStruct() {
        Out.User user = RtcmUtil.parseBuf(Out.User.class, RtcmUtil.passStructToJava());
        Log.i(TAG, "getStruct: user is: "+user);
    }
}
