package cn.misection.stubapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.graphics.*;
import android.os.Bundle;

import cn.misection.stubapp.databinding.ActivityMainBinding;

/**
 * @author JavaMan
 */
public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding mBinding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    init();
  }

  private void init() {
    initBinding();
  }

  private void initBinding() {
    mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
  }
}
