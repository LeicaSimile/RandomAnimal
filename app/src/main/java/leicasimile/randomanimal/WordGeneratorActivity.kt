package leicasimile.randomanimal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_word_generator.*

class WordGeneratorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_generator)

        btn_fetch.setOnClickListener {
            fetchResult()
        }
    }

    private fun fetchResult() {
        
    }
}
