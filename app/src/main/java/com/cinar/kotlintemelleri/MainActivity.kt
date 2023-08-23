package com.cinar.kotlintemelleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //lateinit kullanmalısın
    lateinit var text:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //lateinitden sonra değer ekle değişkene
        text = findViewById(R.id.text)

        println("Hello kotlin")
        text.text="Heloo kotlin"

        //Variables değişken sonradan değişir   const sabit sonradan değişmez
        /*
        * Byte 8 bit  -128 +127
        * Short 16 bit -32768 +32767
        * Int 32 bit -2,147,483,648 +lısı
        * Long 64 bit -9,223,372,036,854,775
        * */
        //Integer
        var x = 5
        var y = 4
        println(x*y)
        text.text = " ${x*y}"

        var age = 35
        println(age /7 *5 )
        text.text = "${age /7 *5}"

        val result = age / 7 *5
        println(result)
        text.text = "${result}"

        // Integer
        //Defining
        var myInteger : Int
        //Initilaize
        myInteger = 10
        myInteger = 20
        text.text = "${myInteger}"

        val a : Int = 5
        text.text = "${a}"
        println(a/2)

        val b : Long = 1456161
        text.text ="{b}"
        println(b/2)
        //Double & Float
        //Float 32 bit 6-7 decimal digits
        //Double 64 bit 15-16 deciaml digits

        val pi = 3.14
        println(pi * 2.0)
        text.text = "${pi*2.1}"

        val myFloat = 3.14f
        println(myFloat *2)

        var myAge:Double
        myAge = 23.6
        println(myAge/2)

        //camelCase
        //snake_case


        //String
        println("-------String-------")
        val myString = "SelimCinar"
        val name= "Yusuf can"
        val surname="Çınar"
        val fullName= name+ " "+surname
        println(fullName)
        text.text = "${fullName}"

        val larsName : String = "lars"
        println(myString.capitalize()) //ilk harfi büyütür
        text.text = "${myString.capitalize()}"

        // Boolean
        println("-------Boolean------")

        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true
        /*
        * <,>,<=,>=,==,!=,&& and,|| or
        * */

        //Conversion
        println("-------Conversion-----")
        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)
        text.text = "${myLongNumber}"

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger*2)
        text.text = "${inputInteger*2}"

        //Collections

        //Array  size belirleniyor
        println("-------Array-------")
        val myArray = arrayOf("James","Kirk","Rob","Lars")

        println(myArray[0])
        text.text="${myArray[0]}"
        myArray[0] = "James Hetfield"
        println(myArray[0])
        text.text="${myArray[0]}"
        println(myArray)
        text.text="${myArray}"
        myArray.set(2,"Rob holding")
        text.text ="${myArray}"
        println(myArray)

        myArray[3] = "Selim"
        println(myArray[3])
        text.text = "${myArray[3]}"

        val numberArray = arrayOf(1,2,3,4,5,6)
        println(numberArray[3])

        val mixedArray= arrayOf("Selim",5)
        println(mixedArray[0])
        println(mixedArray[1])
        myArray.set(0,"Fenerbahçe")
        println(myArray)
        text.text="${mixedArray}"

        //List - ArrayList
        println("----List----")

        val myMusician = arrayListOf<String>("James","Kirk")
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])
        text.text="${myMusician}"

        val myArrayList = ArrayList<Int> ()
        myArrayList.add(1)
        myArrayList.add(200)
        println(myArrayList)
        text.text = "${myArrayList}"

        val myMixedArrayList = ArrayList <Any>()
        myMixedArrayList.add("Atil")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        text.text="${myMixedArrayList.get(0)}"


        //Set birden fazla aynı value olamaz
        println("-------Set------")

        var myExampleArray = arrayOf(1,1,1,2,3)

        println("First element : ${myExampleArray[0]}")
        println("Second element : ${myExampleArray[1]}")
        text.text = "First element : ${myExampleArray[0]}"
        text.text = "Second element : ${myExampleArray[1]}"

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size) //Eleman boyutu
        text.text = "${mySet.size}"

        //For Each
        mySet.forEach {
            println(it)
        }

        val myStringSet = HashSet<String> ()
        myStringSet.add("Atil")
        myStringSet.add("Atil")
        println(myStringSet.size)
        text.text ="${myStringSet.size}"

        //Map - HashMap

        println("--------Map-------")

        //Key - value
        val fruitArray = arrayOf("Apple","Banana")
        val categoriesArray = arrayOf(100,150)

        println("${fruitArray[0]} : ${categoriesArray[0]}")
        text.text = "${fruitArray[0]}: ${categoriesArray[0]}"


        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"])
        println(fruitCalorieMap["Banana"])

        text.text = "${fruitCalorieMap["Apple"]}"
        text.text = "${fruitCalorieMap["Banana"]}"

        val myHashMap = HashMap<String,String> ()
        myHashMap.put("a","Fenerbahçe")
        text.text = "${myHashMap["a"]}"

        val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)
        println(myNewMap["C"])


        //Operatorler
        println("------Operatorler------")

        var m = 5
        println(m)
        text.text="${m}"

        m = m+1
        println(m)
        text.text = "${m}"

        m++
        println(m)
        text.text = "${m}"

        m--
        println(m)
        text.text = "${m}"

        var n = 7
        println(n>m)
        text.text = "${n>m}"

        //&&  ve her ikisi doğru || veya herhangi biri doğru
        println(n>m && 1>2)
        text.text = "${n>m && 1>2}"

        println(n>m || 1>2)
        text.text = "${n>m || 1>2}"

        println(10+2)
        text.text="${10+2}"
        println(10-2)
        text.text = "${10-2}"
        println(10*2)
        text.text = "${10*2}"
        println(10/2)
        text.text = "${10/2}"

        //Remainder kalan
        println(10%4)
        text.text = "${10%4}"

        //If eğer , else if değilse eğer, else değilse
        println("-----------If Control ---------")

        val myNumberAge = 52

        if (myNumberAge<30) {
            println("<30")
            text.text = "<30"
        }
        else if (myNumberAge>=30 && myNumberAge<40){
            println(" 30 - 40 ")
            text.text = " 30 -40 "
        }
        else if (myNumberAge >= 40 && myNumberAge<50) {
            println("40-50")
            text.text = "40-50"
        }
        else{
            println(">=50")
            text.text = ">=50"
        }

        //Switch = When
        println("-------Switch--------")

        val day : Int = 3
        var dayString : String = ""

        if (day == 1) {
            dayString = "Monday"
        }
        else if (day ==2) {
            dayString = "Tuesday"
        }
        else if (day ==3) {
            dayString = "Wednesday"
        }
        println(dayString)
        text.text = "${dayString}"


        when(day) {
            1-> dayString = "Monday"
            2-> dayString = "Tuesday"
            3-> dayString = "Wednesday"
            else -> dayString = ""
        }
        println(dayString)
        text.text=dayString


        //Loops döngüler 1 işlemi birden fazla kez yaptırır
        //For loop
        val myArrayOfNumbers = arrayOf(1,2,3,4,5,6,7,8)

        for (number in myArrayOfNumbers){
            val z = number / 3 *5
            println(z)
            text.text = "${z}"
        }

        for (i in myArrayOfNumbers.indices){
            val qz = myArrayOfNumbers[i] / 3 *5
            println(qz)
            text.text = "${qz}"
        }
        for (b in 0..9) {
            println(b)
            text.text="${b}"
        }
            val myStringArrayList = ArrayList<String> ()
            myStringArrayList.add("Selim")
            myStringArrayList.add("Çınar")
            myStringArrayList.add("fenerbahçe")

            for (str in myStringArrayList){
                println(str)
                text.text="${str}"
            }
            myStringArrayList.forEach {
                println(it)
                text.text = "${it}"
            }

            //While loop
            println("----------While-------")
            var j = 0
            while (j<10){
            println(j)
            j = j+1

            }


    }

}