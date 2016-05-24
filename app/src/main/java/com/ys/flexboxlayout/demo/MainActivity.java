package com.ys.flexboxlayout.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.flexbox.FlexboxLayout;

public class MainActivity extends AppCompatActivity {

    private FlexboxLayout mFlexboxLayout;
    private int flag;
    private int[] flexDirections = new int[]{FlexboxLayout.FLEX_DIRECTION_ROW, FlexboxLayout.FLEX_DIRECTION_COLUMN, FlexboxLayout.FLEX_DIRECTION_ROW_REVERSE, FlexboxLayout.FLEX_DIRECTION_COLUMN_REVERSE};
    private int[] flexWraps = new int[]{FlexboxLayout.FLEX_WRAP_WRAP, FlexboxLayout.FLEX_WRAP_NOWRAP, FlexboxLayout.FLEX_WRAP_WRAP_REVERSE};
    private int[] justifyContent = new int[]{FlexboxLayout.JUSTIFY_CONTENT_CENTER, FlexboxLayout.JUSTIFY_CONTENT_FLEX_END, FlexboxLayout.JUSTIFY_CONTENT_FLEX_START, FlexboxLayout.JUSTIFY_CONTENT_SPACE_AROUND, FlexboxLayout.JUSTIFY_CONTENT_SPACE_BETWEEN};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFlexboxLayout = (FlexboxLayout) findViewById(R.id.flexbox_layout);
//        View view = mFlexboxLayout.getChildAt(0);
//        FlexboxLayout.LayoutParams layoutParams = (FlexboxLayout.LayoutParams) view.getLayoutParams();
//        layoutParams.order = -1;
//        layoutParams.flexGrow = 2;
//        view.setLayoutParams(layoutParams);

        mFlexboxLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int index = flag % 4;
//                flag++;
//                mFlexboxLayout.setFlexDirection(flexDirections[index]);

//                int index = flag % 3;
//                flag++;
//                mFlexboxLayout.setFlexWrap(flexWraps[index]);

                int index = flag % 5;
                flag++;
                mFlexboxLayout.setJustifyContent(justifyContent[index]);
            }
        });
    }
}

