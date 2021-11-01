
fun main() {
    bubbleSort()
}
fun bubbleSort(){
    var unsortedList = mutableListOf(10,4,6,11,23,9,5)
   var temp:Int
  

   for(i in 0..unsortedList.size - 1){
        for( j in i + 1 ..unsortedList.size - 1  ) {
            if(unsortedList[i] > unsortedList[j]){
                temp = unsortedList[j]
                unsortedList[j] = unsortedList[i]
                unsortedList[i] = temp
            }
        }
    }



print(unsortedList)
}