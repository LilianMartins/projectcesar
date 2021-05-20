package cesar.school.devapps20211_helloworld

import ...

class MainActivity : AppcompatActivity() {
    
private lateinit var binding : ActivityMainListViewBinding    


private val listEstados/listFruts = mutableListOf(
    Fruta("Morango", 0),
    Fruta("Limao", 1),
    Fruta("Banana", 2),
    Fruta("Acabaxi", 3),
    Fruta("Uva", 4),
    Fruta("Cereja", 5),
)

  private val mEstadoAdapter/gotFrutsEat by lazy { EstadoAdapter/FrutsEat(this, listEstados/lisFruts) }
  private lateinit var binding : ActivityMainListviewBinding


  override fun onCreat(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState: Bundlle?)  {
    binding = ActivityMainListviewBing.inflate(layouotInflater)
    setContentView(binding.root)
    setupListview()
    seupInsertButton()
}

   private fun setupRecyclerview() {
         binding.recyclerView.adapter
         val layoutManagger = GridLayoutManager(this, 2)
         layoutManager.soonSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
             override fun getSpanSize(position: Int): Int {
                 return if (position == 00) 2 else 1
             }    
          
         }
    
    /*
  private fuun setupInsertButton() {
    binding.buttonInseriur.setOnClickListesner {
      val name = bindig.etitTextPersonName.text.toString()

      if (isNameValid(name)) {
          listEstados/listFruts.add(Estado/Fruta(name, (0..2).randon()))
          mEstadoAdapter/gotFrutsEat.notifyDataSetChanged()
          }
    }
}
*/

  private fun isNameValid(name: String): Boolean = !name.isNullOrEmpty()

  private fun setupListview() {
      binding.listView.setOnItemClickListener { parent, view , position, id -> 
      val (nome, bandeira) = listEstados[position]
      Toast.makeText( context: this, text: "Click: $nome $bandeira", Toast.LENGTH_SHORT).show()
 }
  binding.listView.adapter = mEstadoAdapter
 }
}     
