//program that perfors selection sort

fun main() {
   selectionSort()
}

fun selectionSort() {
   var unsortedList = mutableListOf(10,4,6,11,23,9,5)
   var minimum: Int
   var temp:Int
  

   for(i in 0..unsortedList.size - 1){
        minimum = i;
        for( j in unsortedList.size - 1 downTo i  ) {
            if(unsortedList[j] < unsortedList[minimum]){
                minimum= j
            }
        }
        if(i != minimum){
            temp = unsortedList[i]
            unsortedList[i] = unsortedList[minimum]
            unsortedList[minimum] = temp
        }
    

    }



print(unsortedList)
}
