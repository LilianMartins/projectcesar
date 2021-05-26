package school.cesar.devapp20211.activities

import ... 

class MainActivity :  ApppCompatActivity( ) {

private lateinit var binding : ActivityMainBinding 
private var fruits = mutableListOf(
   Fruit ( name: " ", description: " " ), 
   Fruit ( name: " ", description: " " ), 
   Fruit ( name: " ", description: " " ), 
   Fruit ( name: " ", description: " " ), 
)

companion object {
   const val REQUEST_CODE = 1
   const val EXTRA_FRUIT = "EXTRA_FRUIT"
   const val EXTRA_FRUIT_LIST = " EXTRA_FRUIT_LIST"
   var fruitsImages: TypedArray? = null
}

private lateinit var fruitAdapter: FruitsRecycleViewAdapter

override fun onCreate(savedInstanceState: Buncle?) {
   super.onCreate(savedInstanceState)
   binding = ActivityMainBinding.inflate(layoutInflater)
   setContentView(binding.root)

   if (savedInstanceState != null) {
      fruits = savedInstanceState.getParcelableArrayList<Fruit>(EXTRA_FRUIT_LIST) 
  }
}

override fun onResume( )  {
      super.onResume( )

       fruitAdapter = FruitsRecyclerViewAdapter (context: this, fruits, this: :onItemClickListener)
       fruitImages = resources.obtainTypedArray(R.array.fruits)

       binding.recyclerViewFruits.adapter = fruitAdapter
       binding.recyclerViewFruits.layoutManager = LinearLayoutManager (context: this)
}

private fun onIitemClickListner(fruit: Fruit) {
       val fruitDesc = Intent(packageContext: this, DescriptionFruitsActivity::class.java)
       fruitDesc.putExtra( EXTRA_FRUIT, fruit)
       startActivity(fruitDesc)
}

fun onClickAddFruits(view: View)  {
       val addFruitsActivity = Intent(packageContext: this, AddFruitsActivity::class.java)
       startActivityForResult(addFruitsActivity, REQUEST_CODE)
}


override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == REQUEST)CODE) {
        data?.getParcelableExtra<Fruit>(EXTRA_FRUIT)?.let { it: Fruit
            fruits.add(it)
            fruitAdapter.nodifyItemInserted(fruits.lastIndex)
        }
  }
}

override fun onSaveInstanceState(outState: Bundle) {
            super onSaveInstaneState(OutState)         
            outState.putParcelableArrayList(EXTRA_FRUIT_LIST, ArrayList(fruits))
  }
}


     

