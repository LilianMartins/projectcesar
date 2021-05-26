package school.cesar.devapp20211.activities

import . . . 

private lateinit var binding : ActivityAddFruitsBinding 
private lateinit var fruit : Fruit
private lateinit var uri : String

companion object {
 const val REQUEST_CODE = 3
}

override fun OnCreate(savadInstanceState: Bundle?) {
   super.onCreat(savadInstanceState)
   binding = ActivityAddfruitsBinding.inflate(layoutInflater)
   setContentView(binding.root)
}

override fun OnResume() {
   super.onResume()

   binding.btnSave.setOnlickListener {
      getImageFromGalery()
}

binding.btnSave.setOnClickListener {
   val returnIntent = Intent () 
   fruit = Fruit(binding.etName.text.toString(), binding.etBenefits.text.toString(), uri)
   returnIntent.putExtra(MainActivitt.EXTRA_FRUIT, fruit)
   setResult(Activity.RESULT_OK, returnIntent)
   finish()
  }
}

override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
   super.onActivityResult(requestCode, resultode, data)
   if(resultCode == Activity.RESULT_OK &&requestCode == REQUEST_CODE) {
   uri = data?.data.toString()
  }
}

override fun onTouchEvent(event: MotionEvent?: Boolean {
   hideKeyBoardAndClearFocus()
   return super.onTouchEvent(event)
}

private fun hideKeyboardAndClearFocus() {
   Utils.hideKeyBoard( context:this, binding.etName)
   Utils.hideKeyBoard( context:this, binding.etBenefits)
   binding.etName.clearFocus()
}

private fun getImageFromGallery() {
   val intent = Intent(Intent.ACTION_PICK)
   intent.type = "image/*"
   startActivityForResult(intent, REQUEST_CODE)
   }
}
   


