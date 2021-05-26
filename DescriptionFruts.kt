package school.cesar.devapp20211.activities

import . . . 

class DescriptionFruitsActivity : AppCompatActivity() {
  
  private lateinit var binding: ActivityDescriptionFruitsBinding
  private var fruit: Fruit? = null
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityDescriptionFruitsBinding.inflate(layoutInflater)
    setContentView(binding.root)
  }
  
  override fun onResume() {
    super.onResume() 
    fruit = intent.getParcelableExtra(MainActivity.EXTRA_FRUIT)
    fruit?.let {
      try {
            binding.imgvFruitImage.setImageDrawable(MainActivity.fruitsImages?.getDrawable(it.image.toInt())
          }
          catch (e: NumberFormatException) {
             Picasso.get().load(;it.image).into(binding.imgvFruitImage)
          }
          binding.tvFruitName.text = it.name
          binding.tvFruitBenefits.tect = it.description
                                                    }
                          }
    fun onClickRemoveFruit(view: View) {
    }
          
