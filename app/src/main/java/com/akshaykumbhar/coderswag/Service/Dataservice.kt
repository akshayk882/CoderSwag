package com.akshaykumbhar.coderswag.Service

import com.akshaykumbhar.coderswag.Model.Category
import com.akshaykumbhar.coderswag.Model.Product

object Dataservice {
    val category = listOf(
            Category("DIGITAL","digital good imsge"),
            Category("HAT","hatimage"),
            Category("HOODIE","hoodieimage"),
            Category("SHIRT","shirtimage")
    )

    val product = listOf(
            Product("Devslopes graphic beanie","18$","hat1"),
            Product("Devslopes Hat Black","20$","hat2"),
            Product("Devslopes Hat White","25$","hat3"),
            Product("Devslopes Hat snapback","16$","hat4")
    )

    val hoodies = listOf(
      Product("Devslopes Hoodie Grey","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$27","hoodie2"),
            Product("Devslopes Hoodie White","$30","hoodie3"),
            Product("Devslopes Hoodie Black","$35","hoodie4")
    )

    val shirt = listOf(
            Product("Devslopes Shirt Black","$13","shirt1"),
            Product("Devslopes Badge grey","$12","shirt2"),
            Product("Devslopes Logo Shirt red","$10","shirt3"),
            Product("Devslopes Hustle","$15","shirt4"),
            Product("Kickflip Studios","$21","shirt5")
            )
}