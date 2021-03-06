package com.anangkur.wallpaper.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.widget.Toolbar
import com.anangkur.wallpaper.BuildConfig
import com.anangkur.wallpaper.base.BaseActivity
import com.anangkur.wallpaper.databinding.ActivitySplashBinding

class SplashActivity: BaseActivity<ActivitySplashBinding, Nothing>(){

    override val mLayout: ActivitySplashBinding
        get() = ActivitySplashBinding.inflate(layoutInflater)
    override val mViewModel: Nothing?
        get() = null
    override val mToolbar: Toolbar?
        get() = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        openActivity()
    }

    private fun openActivity(){
        val handler = Handler()
        handler.postDelayed({
            val intent = Intent()
            intent.setClassName(BuildConfig.APPLICATION_ID, "com.anangkur.wallpaper.wallpaper.HomeActivity")
            startActivity(intent)
            finish()
        }, 3000)
    }

}
