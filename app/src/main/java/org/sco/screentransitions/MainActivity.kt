package org.sco.screentransitions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityOptionsCompat
import org.sco.screentransitions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.activityTwoButton.setOnClickListener {
            startActivityTwo()
        }

        binding.activityThreeButton.setOnClickListener {
            startActivityThree()
        }

        binding.fragmentOneButton.setOnClickListener {
            startFragmentOne()
        }
    }

    private fun startFragmentOne() {
        Intent(this, FragmentActivity::class.java).also {
            startActivity(it)
        }
    }

    private fun startActivityTwo() {
        Intent(this, SecondActivity::class.java).also {
            startActivity(it)
        }
//        Intent(this, SecondActivity::class.java).also {
//            startActivity(it, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle())
//        }
    }

    private fun startActivityThree() {
        Intent(this, ThirdActivity::class.java).also {
            startActivity(it)
        }
//        Intent(this, ThirdActivity::class.java).also {
//            startActivity(it, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle())
//        }
    }

    private fun startFragmentActivity() {

//        Intent(this, ThirdActivity::class.java).also {
//            startActivity(it, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle())
//        }
    }
}