package by.ivpo.budgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MyCompositeView extends LinearLayout {

    private Button mPreviousButton;
    private Button mNextButton;

    private ImageView imageView;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;



    public MyCompositeView(Context context) {
        super(context);
        initializeViews(context);
    }

    public MyCompositeView(Context context, AttributeSet attrs) {
        super(context);
        initializeViews(context);
    }

    private void initializeViews(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.composite, this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();



        //Настраиваем для обоих кнопок изображения.
        //Будем использовать стандартные изображения:



//        mPreviousButton = (Button) this
//                .findViewById(R.id.btn1);
//        mPreviousButton
//                .setBackgroundResource(android.R.drawable.ic_media_previous);
//
//        mNextButton = (Button) this
//                .findViewById(R.id.btn2);
//        mNextButton
//                .setBackgroundResource(android.R.drawable.ic_media_next);
    }
}

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_composite_view);
//    }
