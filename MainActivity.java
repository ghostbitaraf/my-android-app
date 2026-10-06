package com.roonik.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private View btnStartConversation;
    private View cardAiConversation;
    private View cardLessons;
    private View cardFlashcards;
    private View cardListening;
    private View cardCorrection;
    private View cardQuiz;

    private View navHome;
    private View navPractice;
    private View navWords;
    private View navProfile;
    private View navMore;

    private TextView tvLevel;
    private TextView tvStreak;
    private TextView tvDailyScore;
    private TextView tvTotalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupSystemBars();
        setContentView(R.layout.activity_main);

        initViews();
        setupClicks();
        loadDashboardData();
    }

    private void setupSystemBars() {
        Window window = getWindow();

        window.setStatusBarColor(Color.WHITE);
        window.setNavigationBarColor(Color.WHITE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int flags = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                flags |= View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
            }

            window.getDecorView().setSystemUiVisibility(flags);
        }
    }

    private void initViews() {
        btnStartConversation = findViewById(R.id.btnStartConversation);

        cardAiConversation = findViewById(R.id.cardAiConversation);
        cardLessons = findViewById(R.id.cardLessons);
        cardFlashcards = findViewById(R.id.cardFlashcards);
        cardListening = findViewById(R.id.cardListening);
        cardCorrection = findViewById(R.id.cardCorrection);
        cardQuiz = findViewById(R.id.cardQuiz);

        navHome = findViewById(R.id.navHome);
        navPractice = findViewById(R.id.navPractice);
        navWords = findViewById(R.id.navWords);
        navProfile = findViewById(R.id.navProfile);
        navMore = findViewById(R.id.navMore);

        tvLevel = findViewById(R.id.tvLevel);
        tvStreak = findViewById(R.id.tvStreak);
        tvDailyScore = findViewById(R.id.tvDailyScore);
        tvTotalScore = findViewById(R.id.tvTotalScore);
    }

    private void setupClicks() {
        btnStartConversation.setOnClickListener(v ->
                showMessage("شروع مکالمه با هوش مصنوعی"));

        cardAiConversation.setOnClickListener(v ->
                showMessage("مکالمه با هوش مصنوعی"));

        cardLessons.setOnClickListener(v ->
                showMessage("درس‌های موضوعی"));

        cardFlashcards.setOnClickListener(v ->
                showMessage("فلش‌کارت"));

        cardListening.setOnClickListener(v ->
                showMessage("تمرین شنیداری"));

        cardCorrection.setOnClickListener(v ->
                showMessage("اصلاح جمله"));

        cardQuiz.setOnClickListener(v ->
                showMessage("آزمون و تمرین"));

        navHome.setOnClickListener(v -> {
            // صفحه فعلی
        });

        navPractice.setOnClickListener(v ->
                showMessage("تمرین‌ها"));

        navWords.setOnClickListener(v ->
                showMessage("لغات من"));

        navProfile.setOnClickListener(v ->
                showMessage("پروفایل"));

        navMore.setOnClickListener(v ->
                showMessage("بیشتر"));
    }

    private void loadDashboardData() {
        tvLevel.setText("A2");
        tvStreak.setText("12");
        tvDailyScore.setText("48");
        tvTotalScore.setText("330");
    }

    private void showMessage(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
