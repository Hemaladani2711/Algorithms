class Keywords {
    fun Keyword(){
        val list= ArrayList<String?>()
        list.add(null)
        list.add(1,"Hello")
        println("${list.get(1)}")
        /*list.let {
            list.add(1,"Hello")
            println(list.get(1))
        }*/


    }
}