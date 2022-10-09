package dev.lchang.fragmentsdpa.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import dev.lchang.fragmentsdpa.R

class RegistroFragment : Fragment() {
       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_registro, container, false)

        val spnCountry: Spinner = view.findViewById(R.id.spnCountry)
        val etFullName: EditText = view.findViewById(R.id.etFullName)
        val etEmail: EditText = view.findViewById(R.id.etEmail)
        val btnSave: Button = view.findViewById(R.id.btnSave)
        val rgGender: RadioGroup = view.findViewById(R.id.rgGender)
        val chkLicense: CheckBox = view.findViewById(R.id.chkLicense)
        val chkCar: CheckBox = view.findViewById(R.id.chkCar)

        ArrayAdapter.createFromResource(requireContext(),
            R.array.country_array,
            android.R.layout.simple_spinner_item).also {
                arrayAdapter -> arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            spnCountry.adapter = arrayAdapter
        }

           var spnCountryValue = ""

           spnCountry.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
               override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                   spnCountryValue = parent?.getItemAtPosition(position).toString()
               }

               override fun onNothingSelected(p0: AdapterView<*>?) {
                   TODO("Not yet implemented")
               }
           }

           btnSave.setOnClickListener{
               val fullNameValue= etFullName.text
               val emailValue = etEmail.text
               val selectedButton: Int = rgGender.checkedRadioButtonId
               val radioButton: RadioButton = view.findViewById(selectedButton)
               val genderValue = radioButton.text

               Toast.makeText(requireContext(),"Full Name is: $fullNameValue", Toast.LENGTH_LONG).show()
               Toast.makeText(requireContext(),"Email is: $emailValue", Toast.LENGTH_LONG).show()
               Toast.makeText(requireContext(),"Gender: $genderValue", Toast.LENGTH_LONG).show()
               Toast.makeText(requireContext(),"Country: $spnCountryValue", Toast.LENGTH_LONG).show()
               Toast.makeText(requireContext(),"License: ${chkLicense.isChecked}", Toast.LENGTH_LONG).show()
               Toast.makeText(requireContext(),"Car: ${chkCar.isChecked}", Toast.LENGTH_LONG).show()
           }


           return view
    }
}