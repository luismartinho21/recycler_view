package ipvc.estg.optionmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<dataimg>
    lateinit var imgId: Array<Int>
    lateinit var nameList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgId = arrayOf(
            R.drawable.slb,
            R.drawable.pvl,
            R.drawable.vegas,
            R.drawable.fifa23,
            R.drawable.ipvcestg,
            R.drawable.mustang21,
            R.drawable.amsterdam,

        )

        nameList = arrayOf(
        "Sport Lisboa e Benfica",
        "Povoa De Lanhoso",
        "Las Vegas",
        "Fifa 23",
        "IPVC-ESTG",
        "Ford Mustang 2021",
        "Amsterdam city"
        )

        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf()
        getUserData()
    }

    private fun getUserData() {
        for (i in imgId.indices){
            val data = dataimg(imgId[i],nameList[i])
            newArrayList.add(data)
        }
        newRecyclerView.adapter = Adapter(newArrayList)
    }
}