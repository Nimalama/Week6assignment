package com.nima.week6softuseractivity.Class

import androidx.fragment.app.Fragment
import com.nima.week6softuseractivity.Adapter.Adapter
import com.nima.week6softuseractivity.R
import com.nima.week6softuseractivity.ui.home.HomeFragment

var person:ArrayList<Person> = ArrayList()
var adapter = Adapter(person, HomeFragment())
var icons = ArrayList<Int>();
var st: ArrayList<Fragment> = ArrayList()
var a = arrayOf("25a","25b","25c")


fun add(){

    st.add(HomeFragment())

    icons.add(R.drawable.ic_baseline_home_24)

    person.add(Person("Nima","Lama","25c","M","Jorpati, Kathmandu","https://cdn2.iconfinder.com/data/icons/ios-7-icons/50/user_male2-512.png"))
    person.add(Person("Sita","Shrestha","25a","F","Boudha, Kathmandu","https://img.pngio.com/female-png-clipart-images-gallery-for-free-download-myreal-clip-female-png-612_710.png"))
    person.add(Person("Shubham","Gupta","25c","M","Balaju, Kathmandu","https://cdn2.iconfinder.com/data/icons/ios-7-icons/50/user_male2-512.png"))


}

