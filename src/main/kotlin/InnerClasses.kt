fun main(){
val listView = ListView(arrayOf("arr1", "arr3", "gh", "jhs", "7tr"))
    val show = listView.ListViewItems().displayItem(3)

    println(show)
}
class ListView(var items: Array<String>){
    inner class ListViewItems(){
        fun displayItem(position: Int){
            println(items[position])
        }
    }
}