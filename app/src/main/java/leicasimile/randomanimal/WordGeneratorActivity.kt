package leicasimile.randomanimal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_word_generator.*
import org.jetbrains.anko.db.*

class WordGeneratorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_generator)

        btn_fetch.setOnClickListener {
            fetchResult()
        }
    }

    private fun fetchResult() {
        val result = database.use {
                        select(AnimalsTable.TABLE_NAME)
                                .column(AnimalsTable.NAME)
                                .limit(1)
                                .exec { parseSingle(StringParser) }
                    }

        txt_result.text = result
    }
}
