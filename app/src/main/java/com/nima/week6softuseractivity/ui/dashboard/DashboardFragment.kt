package com.nima.week6softuseractivity.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.nima.week6softuseractivity.Class.Person
import com.nima.week6softuseractivity.Class.a
import com.nima.week6softuseractivity.Class.adapter
import com.nima.week6softuseractivity.Class.person
import com.nima.week6softuseractivity.R



class DashboardFragment : Fragment() {

    lateinit var fname: EditText
    lateinit var lname: EditText
    lateinit var address: EditText
    lateinit var batch: Spinner
    lateinit var male: RadioButton
    lateinit var female: RadioButton
    lateinit var others: RadioButton
    lateinit var add: Button



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        initialize(view)
        add.setOnClickListener() {
            insert(view)
        }
        return view

    }

    fun initialize(view:View)
    {
        fname = view.findViewById(R.id.txtfirstname)
        lname = view.findViewById(R.id.txtlastname)
        address = view.findViewById(R.id.txtaddress)
        batch = view.findViewById(R.id.sp)
        male = view.findViewById(R.id.male)
        female = view.findViewById(R.id.female)
        others = view.findViewById(R.id.others)
        add= view.findViewById(R.id.button)
        val adapters = ArrayAdapter(this.requireContext(),android.R.layout.simple_list_item_1, a)
        batch.adapter =adapters


    }

    fun insert(view:View){
        var gender = "M"
        var img =""
        if(male.isChecked)
        {
            gender ="M"
            img="https://cdn2.iconfinder.com/data/icons/ios-7-icons/50/user_male2-512.png"
            female.isChecked=false
            others.isChecked=false

        }
        if(female.isChecked)
        {
            gender="F"
            img="https://img.pngio.com/female-png-clipart-images-gallery-for-free-download-myreal-clip-female-png-612_710.png"
            male.isChecked=false
            others.isChecked=false
        }
        if(others.isChecked)
        {
            gender="0"
            female.isChecked=false
            male.isChecked=false
        }

        person.add(person.size, Person(fname.text.toString(),lname.text.toString(),batch.selectedItem.toString(),gender,address.text.toString(),img))
        adapter.notifyDataSetChanged()
        Toast.makeText(view.context, "Inserted", Toast.LENGTH_SHORT).show()

    }
}