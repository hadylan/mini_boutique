package com.example.mini_boutique

import java.text.SimpleDateFormat
import java.util.*

public class CreationBean () {
    var name: String = "";
    var price: Int = 0;
    var photo1: String = "";
    var photo2: String = "";

    // On génère la date du jour avec le pattern choisi
    private val datePattern = "dd/MM/yyyy"
    private val simpleDateFormat = SimpleDateFormat(datePattern)
    val dateCreation = simpleDateFormat.format(Date())
}